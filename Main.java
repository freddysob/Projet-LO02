import java.util.Scanner;
import java.util.Collections;


public class Main {
	public static void main(String[] args){
		
	Partie P = new Partie();
	Variante V = new Variante(1, TypVariante.Minimale);
	Tatamis T = new Tatamis();
	Manche M = new Manche(0, V, P, T);
	Scanner sc = new Scanner(System.in);
	int i=1;
	Pioche Pi = new Pioche(M);
	
	
	boolean avance=true;
	
	// Choix Variante
	
	while(avance){
	
	System.out.println("Entrez une valeur de 1 à 9 pour sélectionner le type de variante:");
	System.out.println("1 pour la version basique");
	System.out.println("2 pour la variante Monclar");
	System.out.println("3 pour la variante 1");
	System.out.println("4 pour la variante Carte et Maou");
	System.out.println("5 pour la variante Des Ulis");
	System.out.println("6 pour la variante 4");
	System.out.println("7 pour la variante 5");
	System.out.println("8 pour la variante 6");
	System.out.println("9 pour la variante Courte Amicale");
	System.out.println("10 pour la variante Man et resta");
	String var=sc.nextLine();
	int n=Integer.parseInt(var);
	if (n==1){
		V.setNom(TypVariante.Minimale);
		avance=false;
	}
	if (n==2){
		V.setNom(TypVariante.Monclar);
		avance=false;
	}
	else if(n==3){
		V.setNom(TypVariante.Variante_1);
		avance=false;
	}
	else if(n==4){
		V.setNom(TypVariante.Carte_et_Maou);
		avance=false;
	}
	else if(n==5){
		V.setNom(TypVariante.Des_Ulis);
		avance=false;
	}
	else if(n==6){
		V.setNom(TypVariante.Variante_4);
		avance=false;
	}
	else if(n==7){
		V.setNom(TypVariante.Variante_5);
		avance=false;
	}
	else if(n==8){
		V.setNom(TypVariante.Variante_6);
		avance=false;
	}
	else if(n==9){
		V.setNom(TypVariante.Variante_Courte_Amicale);
		avance=false;
	}
	else if(n==10){
		V.setNom(TypVariante.Man_et_resta);
		avance=false;
	}
	
	}
	
	// Creation d'un tableau à la taille du nombre de joueurs
	
	System.out.println("Entrez le nombre de joueurs");
	String var2=sc.nextLine();
	int nbj=Integer.parseInt(var2);
	Joueur Joueurs[] = new Joueur[nbj];           
	
	
	P.setNbJoueurs(nbj);                          // Mise à jour de l'attribut nombre joueurs dans la partie
	M.setNbJoueurs(nbj);
	
		for (i=0;i<P.getNbJoueurs();i++){         // Creation des joueurs                        
			
			if(i==0){
				System.out.println("Entrer votre nom ");

				String var3=sc.nextLine();
				Hand Main = new Hand(Joueurs[i]);
				Joueurs[i] = new Joueur(var3,i,Main, M);
				Joueurs[i].setTypePhysique(true);
			}
		
		else{
			
			String var3= "";
			Hand Main = new Hand(Joueurs[i]);
			Joueurs[i] = new IA(var3,i,Main, M);
			Joueurs[i].setTypePhysique(false);
			}
			
		}
		
					//Copie de la liste des joueurs dans la Partie
		
		for (i=0;i<P.getNbJoueurs();i++){
			P.joueur.add(Joueurs[i]);  
			}
		
					//Copie de la liste des joueurs dans la Manche
		
		for (i=0;i<P.getNbJoueurs();i++){
			M.joueur.add(Joueurs[i]);  
			}
		
		Pi.setCarte(V.genererJeuCartes());  			//Generation du jeu de cartes dans la pioche
		Collections.shuffle(Pi.getCarte());				//Melange des cartes de la pioche
		
		Pi.distribuerCartesDebut(V);					// Distribution des cartes aux joueurs
		
				//Affichages: Pioche et liste de joueurs
		System.out.println(Pi.carte);
		System.out.println("Liste joueurs : "+Pi.manche.joueur);
		for (i=0;i<P.getNbJoueurs();i++){
		System.out.println("Main joueur " + Joueurs[i].getNom() + " : " + Joueurs[i].hand.getCarte());
		}
		
		System.out.println("Pioche : " + Pi.getCarte());
		
		System.out.println("Tatamis :" + T.getCarte());
		
		//Boucle pour un tour de jeu qui se repète jusqu'à la fin
		
		int i1=0;
		int rand=1;
		String var4 = "";
		while(P.verifierFinPartie(M)==false && Pi.carte.size()>10) // Le && est juste pour tester pour pas avoir de cas infini
		{
			
			
			// Recherche du joueur actif
			for (i=0;i<P.getNbJoueurs();i++){
				if(M.joueur.get(i).isEtatActif()==true || M.joueur.get(i).isTypePhysique()==true){i1=i;}
			}
			
			// Le joueur joue
				
			System.out.println("Le joueur "+ M.joueur.get(i1).getNom() +" joue.");
			
			if (M.joueur.get(i1).isTypePhysique()){                                   // Cas du joueur
			 M.joueur.get(i1).setEtatActif(true);
			
			 
			System.out.println("Saisir l'indice de la carte que vous souhaitez jouer");
			var4=sc.nextLine();
			rand = Integer.parseInt(var4)-1;
			M.joueur.get(i1).jouerCarte(M.joueur.get(i1).hand.carte.get(rand));}
			
			else {                                                                    // Cas de l'IA
				M.joueur.get(i1).jouer();
			}
			
			
			T.verifierValiditeCarte(); 
			System.out.println("Main joueur "+ M.joueur.get(i1).getNom() +" : " + M.joueur.get(i1).hand.getCarte());
			
			T.carte.get(0).appliquerPouvoir(M,M.joueur.get(i1));
			//System.out.println(T.carte.get(0));
			
			//Pi.distribuerCarte(1, M.joueur.get(i1));
			System.out.println("Pioche : " + Pi.getCarte());
			
			System.out.println("Tatamis :" + T.getCarte());
			
			// A ajouter : 
			
			// Possibilité de signaler Mauvaise carte/Derniere carte
			// Attribution de points et retenue des joueurs qui ont fini leur main
			// Verification fin de manche, si oui destruction et création de nouvelle manche
			// Verification fin de partie
			// Verification Pioche vide -> reconstitution
			

			System.out.println("Liste de Gagnants :" + M.getGagnants());
			
			//System.out.println("Nb joueurs restants :" + M.getNbJoueurs());
			
			//System.out.println("Nbj :" + nbj);
			
			i1=M.joueur.indexOf(M.joueurSuivant(T.carte.get(0)));
			
			M.verifierFinManche();
			P.verifierFinPartie(M);
			
			
			
		}
		
		//sc.close();
}
	
}
