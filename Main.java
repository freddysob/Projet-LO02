import java.util.Scanner;
import java.util.Collections;


public class Main {
	public static void main(String[] args){
		
	Partie P = new Partie();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entrez le nombre de joueurs");
	String var2=sc.nextLine();
	int nbj=Integer.parseInt(var2);
	Joueur Joueurs[] = new Joueur[nbj];           
	boolean fini = true;
	
	P.setNbJoueurs(nbj);                      // Mise � jour de l'attribut nombre joueurs dans la partie
	for (int i=0;i<P.getNbJoueurs();i++){         // Creation des joueurs                        
		
		if(i==0){
			System.out.println("Entrer votre nom ");

			String var3=sc.nextLine();
			Joueurs[i] = new Joueur(var3,i,null);
			Joueurs[i].setTypePhysique(true);
		}
	
	else{
		
		String var3= "";
		Joueurs[i] = new IA(var3,i,null);
		Joueurs[i].setTypePhysique(false);
		}
		
	}
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
	
	
	boolean avance=true;
	
	// Choix Variante
	
	while(avance){
	
	System.out.println("Entrez une valeur de 1 � 9 pour s�lectionner le type de variante:");
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
	
	// Creation d'un tableau � la taille du nombre de joueurs
	
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
		
		//Boucle pour un tour de jeu qui se rep�te jusqu'� la fin
		
		int i1=0;
		int rand=1;
		String var4 = "";
		while(/*P.verifierFinPartie(M)==false && Pi.carte.size()>10*/ P.joueur.get(i1).hand.mainVide())
		{
			
			Scanner sc1 = new Scanner(System.in);
			
			// Recherche du joueur actif
			for (i=0;i<P.joueur.size();i++){
				if(P.joueur.get(i).isEtatActif()==true || P.joueur.get(i).isTypePhysique()==true){
					i1=i;
					}
			}
			
			// Le joueur joue
				
			System.out.println("Le joueur "+ P.joueur.get(i1).getNom() +" joue.");
			
			if (P.joueur.get(i1).isTypePhysique()){                                   // Cas du joueur
			 P.joueur.get(i1).setEtatActif(true);
			
			 
			System.out.println("Saisir l'indice de la carte que vous souhaitez jouer, ou P pour Piocher");
			var4=sc1.nextLine();
			if(var4=="P"){P.joueur.get(i1).piocher();}
			else{
			rand = Integer.parseInt(var4)-1;
			P.joueur.get(i1).jouerCarte(P.joueur.get(i1).hand.carte.get(rand));}}
			
			else {                                                                    // Cas de l'IA
				P.joueur.get(i1).jouer();
			}
			
			
			T.verifierValiditeCarte(); 
			System.out.println("Main joueur "+ M.joueur.get(i1).getNom() +" : " + M.joueur.get(i1).hand.getCarte());
			

			//System.out.println(T.carte.get(0));
			
			//Pi.distribuerCarte(1, M.joueur.get(i1));
			//System.out.println("Pioche : " + M.getPioche().getCarte());
			
			System.out.println("Tatamis :" + T.getCarte());
			
			// A ajouter : 
			
			// Possibilit� de signaler Mauvaise carte/Derniere carte
			// Attribution de points et retenue des joueurs qui ont fini leur main
			// Verification fin de manche, si oui destruction et cr�ation de nouvelle manche
			// Verification fin de partie
			// Verification Pioche vide -> reconstitution
			

			System.out.println("Liste de Gagnants :" + M.getGagnants());

			//System.out.println("Nb joueurs restants :" + M.getNbJoueurs());
			
			//System.out.println("Nbj :" + nbj);

			
			M.joueurSuivant(T.carte.get(0),M.joueur.get(i1));
			
			System.out.println("");
			
			//System.out.println(M.joueur);
			System.out.println(P.joueur);
			
			System.out.println("");
			/*M.verifierFinManche();
			
			P.verifierFinPartie(M);
			System.out.println(M.joueur);
			System.out.println(P.joueur);*/
					
		}
			M.initialiserJoueur();
		}
	}
		
		//sc.close();
}