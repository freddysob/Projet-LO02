import javax.swing.JOptionPane;

public class Test {

public Test() {
		
	}
	
	public void creationJoueurs(Partie P, Joueur Joueurs[]){
	    JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
		for (int i=0;i<P.getNbJoueurs();i++){         // Creation des joueurs                        

			if(i==0){
			    String nom = jop.showInputDialog(null, "Entrez votre nom :", "Nom du joueur", JOptionPane.QUESTION_MESSAGE);

				Joueurs[i] = new Joueur(nom,i,null);
				Joueurs[i].setTypePhysique(true);
			}

			else{

				String nom= "";
				Joueurs[i] = new IA(nom,i,null);
				Joueurs[i].setTypePhysique(false);
			}

		}

	}
	
	public int saisieNombreDejoueurs() {
		int nombre=0;
		boolean o=false;

		while (o==false){
			JOptionPane jop = new JOptionPane();
		    String recu = jop.showInputDialog(null, "Entrez le nombre de joueurs", "Nombre de joueurs", JOptionPane.QUESTION_MESSAGE);
			try {
				
				nombre=Integer.parseInt(recu);
				if(nombre<=6 && nombre>=0){
				o=true;}
				else{

					jop.showMessageDialog(null, "Le nombre est trop grand ou trop petit", "Erreur", JOptionPane.ERROR_MESSAGE);
				}
				
			} catch (NumberFormatException nfe) {

				jop.showMessageDialog(null, "Veuillez rentrer un nombre", "Erreur", JOptionPane.ERROR_MESSAGE);
			}
		}
		


	    return nombre;
	}
	
	public int saisiePointMax(){
		int nombre=0;
		String[] pointsmax = {"250", "500"};

	    JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
		   
		    int rang = jop.showOptionDialog(null, 

		      "Entrez le nombre de points maximum",

		      "Points max",

		      JOptionPane.YES_NO_CANCEL_OPTION,

		      JOptionPane.QUESTION_MESSAGE,

		      null,

		      pointsmax,

		      pointsmax[1]);
		    if(rang==0) {
		    	nombre = 250;
		    }else {
		    	nombre = 500;
		    }
	
	return nombre;
	}
	
	public void choisirVariante(Variante V){
		String[] variante = {"basique", "Monclar","1","Carte et Maou", "Des Ulis", "4", "5", "6", "Courte Amicale", "Man et resta"};

	    JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
		   
		    int n = jop.showOptionDialog(null, 

		      "Selectionnez une variante",

		      "Choix variante",

		      JOptionPane.YES_NO_CANCEL_OPTION,

		      JOptionPane.QUESTION_MESSAGE,

		      null,

		      variante,

		      variante[9]);

				if (n==0){
					V.setNom(TypVariante.Minimale);
				}
				else if (n==1){
					V.setNom(TypVariante.Monclar);
				}
				else if(n==2){
					V.setNom(TypVariante.Variante_1);
				}
				else if(n==3){
					V.setNom(TypVariante.Carte_et_Maou);
				}
				else if(n==4){
					V.setNom(TypVariante.Des_Ulis);
				}
				else if(n==5){
					V.setNom(TypVariante.Variante_4);
				}
				else if(n==6){
					V.setNom(TypVariante.Variante_5);
				}
				else if(n==7){
					V.setNom(TypVariante.Variante_6);
				}
				else if(n==8){
					V.setNom(TypVariante.Variante_Courte_Amicale);
				}
				else if(n==9){
					V.setNom(TypVariante.Man_et_resta);
				}
	}

  public static void main(String[] args) {
	  Test T = new Test();
	  System.out.println(T.saisieNombreDejoueurs());
	  System.out.println(T.saisiePointMax());
	  Variante V = new Variante(1, TypVariante.Minimale);
	  T.choisirVariante(V);
	  System.out.println(V.getNom());
  }
  
}
