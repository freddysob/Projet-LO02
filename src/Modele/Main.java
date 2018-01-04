package Modele;

import java.util.Collections;



public class Main {
	
	Partie P;
	Variante V;
	Tatamis T;
	Manche M;
	Pioche Pi;
	
	
	
	public void setP(Partie p){
		this.P=p;
	}
	public Partie getP(){
		return this.P;
	}

	public void setM(Manche m){
		this.M=m;
	}
	public Manche getM(){
		return this.M;
	}

	public void setT(Tatamis t){
		this.T=t;
	}
	public Tatamis getT(){
		return this.T;
	}

	public void setV(Variante v){
		this.V=v;
	}
	public Variante getV(){
		return this.V;
	}

	public void setPi(Pioche Pi){
		this.Pi=Pi;
	}
	public Pioche getPi(){
		return this.Pi;
	}
	
	public static void main(String[] args){

		Main Ma = new Main();
		Ma.P = new Partie();
		Affichage A = new Affichage();
		boolean fini = false;
		int nbj=0;
		nbj=A.saisieNombreDejoueurs(fini);

		Joueur Joueurs[] = new Joueur[nbj];           
		Ma.P.setNbJoueurs(nbj);                      // Mise à jour de l'attribut nombre joueurs dans la partie

		A.creationJoueurs(Ma.P, Joueurs);     // Creation des joueurs                        

		//Copie de la liste des joueurs dans la Partie

		for (int i=0;i<Ma.P.getNbJoueurs();i++){
			Ma.P.joueur.add(Joueurs[i]);
		}

		while(Ma.P.verifierFinPartie()) { 
			Ma.V = new Variante(1, TypVariante.Minimale);
			Tatamis T = new Tatamis();
			Ma.M = new Manche( Ma.V, Ma.P);
			int i=1;
			Ma.Pi = new Pioche(Ma.M);



			// Choix Variante
			//A.choisirVariante(Ma.V);


			// Creation d'un tableau à la taille du nombre de joueurs

			Ma.M.setNbJoueurs(nbj);


			//Copie de la liste des joueurs dans la Manche

			for (i=0;i<Ma.P.getNbJoueurs();i++){
				Ma.M.joueur.add(Ma.P.joueur.get(i));
				Ma.P.joueur.get(i).setManche(Ma.M);
				Hand Main = new Hand(Joueurs[i]);
				Ma.P.joueur.get(i).setHand(Main);
			}

			Ma.Pi.setCarte(Ma.V.genererJeuCartes());  			//Generation du jeu de cartes dans la pioche
			Collections.shuffle(Ma.Pi.getCarte());				//Melange des cartes de la pioche
			Ma.M.setPioche(Ma.Pi);
			Ma.M.getPioche().distribuerCartesDebut(Ma.V);					// Distribution des cartes aux joueurs

			//Affichages: Pioche et liste de joueurs
			System.out.println(Ma.M.getPioche().carte);
			System.out.println("Liste joueurs : "+Ma.M.getPioche().manche.joueur);
			for (i=0;i<Ma.P.getNbJoueurs();i++){
				System.out.println("Main joueur " + Ma.M.joueur.get(i).getNom() + " : " + Joueurs[i].hand.getCarte());
			}

			//System.out.println("Pioche : " + M.getPioche().getCarte());

			System.out.println("Tatamis :" + T.getCarte());

			//Boucle pour un tour de jeu qui se repète jusqu'à la fin

			int i1=0;
			while(/*Ma.P.verifierFinPartie(M)==false && Pi.carte.size()>10*/ Ma.P.joueur.get(i1).hand.mainVide())
			{

				
				// Recherche du joueur actif
				for (i=0;i<Ma.P.joueur.size();i++){
					if(Ma.P.joueur.get(i).isEtatActif()==true || Ma.P.joueur.get(i).isTypePhysique()==true){
						i1=i;
					}
				}
				
				System.out.println("Main joueur "+ Ma.M.joueur.get(i1).getNom() +" : " + Ma.M.joueur.get(i1).hand.getCarte());

				// Le joueur joue

				System.out.println("Le joueur "+ Ma.P.joueur.get(i1).getNom() +" joue.");

				if (Ma.P.joueur.get(i1).isTypePhysique()){                                   // Cas du joueur physique
					Ma.P.joueur.get(i1).setEtatActif(true);
					A.tourJeuJoueurPhysique(Ma.P, Ma.M, i1);

				}


				else {                                                                    // Cas de l'IA
					Ma.P.joueur.get(i1).jouer();
				}

				System.out.println("Historique" + Ma.M.getHistorique());
				T.verifierValiditeCarte(0); 
				


				System.out.println("Tatamis :" + T.getCarte());

				// A ajouter : 

				// Possibilité de signaler Mauvaise carte/Derniere carte



				System.out.println("Liste de Gagnants :" + Ma.M.getGagnants());




				Ma.M.joueurSuivant(Ma.M.tatamis.carte.get(0),Ma.M.joueur.get(i1));

				System.out.println("");

				//System.out.println(M.joueur);
				System.out.println(Ma.P.joueur);

				System.out.println("");
				/*M.verifierFinManche();

			Ma.P.verifierFinPartie(M);
			System.out.println(M.joueur);
			System.out.println(Ma.P.joueur);*/
				Ma.M.compteARebours();

			}
			Ma.M.initialiserJoueur();
		}
	}

	//sc.close();
}