import java.util.Collections;


public class Main {
	public static void main(String[] args){

		Partie P = new Partie();
		Affichage A = new Affichage();
		boolean fini = false;
		int nbj=0;
		nbj=A.saisieNombreDejoueurs(fini);

		Joueur Joueurs[] = new Joueur[nbj];           
		P.setNbJoueurs(nbj);                      // Mise à jour de l'attribut nombre joueurs dans la partie

		A.creationJoueurs(P, Joueurs);     // Creation des joueurs                        

		//Copie de la liste des joueurs dans la Partie

		for (int i=0;i<P.getNbJoueurs();i++){
			P.joueur.add(Joueurs[i]);
		}

		while(P.verifierFinPartie()) { 
			Variante V = new Variante(1, TypVariante.Minimale);
			Tatamis T = new Tatamis();
			Manche M = new Manche(0, V, P, T);
			int i=1;
			Pioche Pi = new Pioche(M);



			// Choix Variante
			A.choisirVariante(V);


			// Creation d'un tableau à la taille du nombre de joueurs

			M.setNbJoueurs(nbj);


			//Copie de la liste des joueurs dans la Manche

			for (i=0;i<P.getNbJoueurs();i++){
				M.joueur.add(P.joueur.get(i));
				P.joueur.get(i).setManche(M);
				Hand Main = new Hand(Joueurs[i]);
				P.joueur.get(i).setHand(Main);
			}

			Pi.setCarte(V.genererJeuCartes());  			//Generation du jeu de cartes dans la pioche
			Collections.shuffle(Pi.getCarte());				//Melange des cartes de la pioche
			M.setPioche(Pi);
			M.getPioche().distribuerCartesDebut(V);					// Distribution des cartes aux joueurs

			//Affichages: Pioche et liste de joueurs
			System.out.println(M.getPioche().carte);
			System.out.println("Liste joueurs : "+M.getPioche().manche.joueur);
			for (i=0;i<P.getNbJoueurs();i++){
				System.out.println("Main joueur " + Joueurs[i].getNom() + " : " + Joueurs[i].hand.getCarte());
			}

			//System.out.println("Pioche : " + M.getPioche().getCarte());

			System.out.println("Tatamis :" + T.getCarte());

			//Boucle pour un tour de jeu qui se repète jusqu'à la fin

			int i1=0;
			while(/*P.verifierFinPartie(M)==false && Pi.carte.size()>10*/ P.joueur.get(i1).hand.mainVide())
			{


				// Recherche du joueur actif
				for (i=0;i<P.joueur.size();i++){
					if(P.joueur.get(i).isEtatActif()==true || P.joueur.get(i).isTypePhysique()==true){
						i1=i;
					}
				}

				// Le joueur joue

				System.out.println("Le joueur "+ P.joueur.get(i1).getNom() +" joue.");

				if (P.joueur.get(i1).isTypePhysique()){                                   // Cas du joueur physique
					P.joueur.get(i1).setEtatActif(true);
					A.tourJeuJoueurPhysique(P, M, i1);

				}


				else {                                                                    // Cas de l'IA
					P.joueur.get(i1).jouer();
				}

				System.out.println("Historique" + M.getHistorique());
				T.verifierValiditeCarte(0); 
				System.out.println("Main joueur "+ M.joueur.get(i1).getNom() +" : " + M.joueur.get(i1).hand.getCarte());


				System.out.println("Tatamis :" + T.getCarte());

				// A ajouter : 

				// Possibilité de signaler Mauvaise carte/Derniere carte



				System.out.println("Liste de Gagnants :" + M.getGagnants());




				M.joueurSuivant(T.carte.get(0),M.joueur.get(i1));

				System.out.println("");

				//System.out.println(M.joueur);
				System.out.println(P.joueur);

				System.out.println("");
				/*M.verifierFinManche();

			P.verifierFinPartie(M);
			System.out.println(M.joueur);
			System.out.println(P.joueur);*/
				M.compteARebours();

			}
			M.initialiserJoueur();
		}
	}

	//sc.close();
}