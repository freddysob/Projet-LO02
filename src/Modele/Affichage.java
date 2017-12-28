package Modele;

import java.util.Scanner;


public class Affichage {
	Scanner sc = new Scanner(System.in);
	public Affichage(){

	}

	public int saisieNombreDejoueurs(boolean o){
		int nbj=0;

		while (o==false){
			System.out.println("Entrez le nombre de joueurs");
			String var2=sc.nextLine();
			try {
				
				nbj=Integer.parseInt(var2);
				if(nbj<=6 && nbj>=0){
				o=true;}
				else{
					System.out.println("Nombre invalide");
					o=false;
				}
				
			} catch (NumberFormatException nfe) {

				System.out.println("Votre saisie est invalide");
				o=false;
			}
		}
		return nbj;
	}
	
	public int saisiePointMax(boolean o1){
		int nbj=0;
		while (o1==false){
		System.out.println("Entrez le nombre de points max");
		String var3=sc.nextLine();
		try {
			if(nbj==500 || nbj==250){
			 nbj=Integer.parseInt(var3);
			o1=true;}
			else{
				System.out.println("Nombre invalide");
				o1=false;
			}
		} catch (NumberFormatException nfe) {

			System.out.println("Votre saisie est invalide");
			o1=false;
		}
	}
	return nbj;
	}


	public void creationJoueurs(Partie P, Joueur Joueurs[]){
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

	}
	public void choisirVariante(Variante V, int n){

		boolean avance=false;
		while(avance==false){


			try {
				if (n==1){
					V.setNom(TypVariante.Minimale);
					avance=true;
				}
				else if (n==2){
					V.setNom(TypVariante.Monclar);
					avance=true;
				}
				else if(n==3){
					V.setNom(TypVariante.Variante_1);
					avance=true;
				}
				else if(n==4){
					V.setNom(TypVariante.Carte_et_Maou);
					avance=true;
				}
				else if(n==5){
					V.setNom(TypVariante.Des_Ulis);
					avance=true;
				}
				else if(n==6){
					V.setNom(TypVariante.Variante_4);
					avance=true;
				}
				else if(n==7){
					V.setNom(TypVariante.Variante_5);
					avance=true;
				}
				else if(n==8){
					V.setNom(TypVariante.Variante_6);
					avance=true;
				}
				else if(n==9){
					V.setNom(TypVariante.Variante_Courte_Amicale);
					avance=true;
				}
				else if(n==10){
					V.setNom(TypVariante.Man_et_resta);
					avance=true;
				}
				else{
					System.out.println("Nombre pas dans la plage");
					avance=false;
				}

			}

			catch (NumberFormatException nfe){
				System.out.println("Votre saisie est invalide");
				avance=false; }
		}
	}
	public void tourJeuJoueurPhysique(Partie P, Manche M, int i1){
		int h=0;
		boolean forward=false;
		while(forward==false){
			System.out.println("Saisir l'indice de la carte que vous souhaitez jouer, ou P pour Piocher et D pour dénoncer une tricherie");
			String var4=sc.nextLine();

			try {
				int rand = Integer.parseInt(var4)-1;

				if(rand>=0 && rand<P.joueur.get(i1).hand.carte.size()){
					P.joueur.get(i1).jouerCarte(P.joueur.get(i1).hand.carte.get(rand));
					forward=true;}
				else {System.out.println("Nombre pas valide pour votre main");
				forward=false;		    }
			} catch (NumberFormatException nfe) {
				if(var4.equals("P")){
					P.joueur.get(i1).piocher();
					forward=true;}
				else if (var4.equals("D")){
					if(M.tatamis.carte.size()!=0){
						
						if(M.getHistorique().size()==0){System.out.println("Vous ne pouvzez pas dénoncer en début de partie");}
						
						else if(h==0){
					P.joueur.get(i1).denoncerMCarte(M.getHistorique().get(0));
					h=1;
					forward=false;}
				else {System.out.println("Vous avez déjà dénoncé");
					forward=false;}}
			}
				else{
					System.out.println("Votre saisie est invalide");
					forward=false;}
				// traitement à faire dans ce cas
			}
		}

	}

}
