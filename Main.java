import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		
	Partie P = new Partie();
	Variante V = new Variante(1, TypVariante.Minimale);
	Tatamis T = new Tatamis();
	Manche M = new Manche(0, V, P, T);
	Scanner sc = new Scanner(System.in);
	int i=1;
	Joueur J = new Joueur("IA",1, null,M);
	Hand H = new Hand(J);
	Pioche Pi = new Pioche(M);
	//Joueur[] Joueurs = {J};
	
	boolean avance=true;
	
	while(avance==true){
	
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
	//TypVariante V.nom=TypVariante.var;
	System.out.println("Entrez le nombre de joueurs");
	String var2=sc.nextLine();
	int nbj=Integer.parseInt(var2);
	Joueur Joueurs[] = new Joueur[nbj];
	
	
	P.setNbJoueurs(nbj);
		for (i=0;i<P.getNbJoueurs();i++){
			int ind=i+1;
			System.out.println("entrer le nom du joueur "+ ind);
			String var3=sc.nextLine();
			Hand Main = new Hand(Joueurs[i]);
			Joueurs[i] = new Joueur(var3,i,Main, M);
			//Joueurs[i].nom=var;
			//Joueurs[i].numeroJoueur=i;
			//Joueurs[i].nbPoints=0;
				if(i==0){Joueurs[i].setTypePhysique(true);
					}
				
				else{Joueurs[i].setTypePhysique(false);
					}
		}
		
		for (i=0;i<P.getNbJoueurs();i++){
			M.joueur.add(Joueurs[i]);  //Copie de la liste des joueurs
			}
		
		Pi.setCarte(V.genererJeuCartes());
		//Pi.carte.shuffle();
		Pi.distribuerCartesDebut(V);
		System.out.println(Pi.carte);
		System.out.println("Liste joueurs : "+Pi.manche.joueur);
		for (i=0;i<P.getNbJoueurs();i++){
		System.out.println("Main joueur " + Joueurs[i].getNom() + " : " + Joueurs[i].hand.getCarte());
		}
		
		while(P.verifierFinPartie(V)==false && Pi.carte.size()>30)
		{
			int i1=0;
			for (i=0;i<P.getNbJoueurs();i++){
				if(M.joueur.get(i).isEtatActif()==true || M.joueur.get(i).isTypePhysique()==true){i1=i;}
			}
			System.out.println("Le joueur "+ M.joueur.get(i1).getNom() +" joue.");
			System.out.println("Num random : "+ (int)Math.random()*(0 - M.joueur.get(i1).hand.carte.size()));
			M.joueur.get(i1).jouerCarte(M.joueur.get(i1).hand.carte.get((int)Math.random()*(0 - M.joueur.get(i1).hand.carte.size()))); //(int)Math.random()*(0 - M.joueur.get(i1).hand.carte.size()))
			System.out.println("Main joueur "+ M.joueur.get(i1).getNom() +" : " + M.joueur.get(i1).hand.getCarte());
			//System.out.println(T.carte.get(0));
			//M.joueurSuivant(T.carte.get(0));
			//Pi.distribuerCarte(1, M.joueur.get(i1));
			System.out.println("Tatamis :" + T.getCarte());
			//Tatamis.verifierValiditeCarte(V);
			//C.appliquerPouvoir();
			//Pioche.reconstituer();
			P.verifierFinPartie(V);
			//i=i+1;
		}
		
		
			//	System.out.println("Le joueur"& i & "joue.");
			//	System.out.println("Vérification carte.");
			//	System.out.println("Effets et pénalités.");1
		//	System.out.println("Vérifications finales.");
		//	System.out.println("Le joueur suivant joue.");
			if (Pi.carte.size()==0){Pi.reconstituer();}
}
}
