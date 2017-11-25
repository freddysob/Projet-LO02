package PackageLO02;

public class Partie {
    private Statut statut;

    private int nbJoueurs;

    private int pointsMax;
    
    public Partie() {
    	this.statut=Statut.Encours;
    	this.nbJoueurs=0;
    	this.pointsMax=500;
    }
    
    public String toString(){
    	String s;
    	s="[ Partie -"+this.getStatut()+" - "+this.getNbJoueurs()+" joueurs]";            // Affiche par exemple : " [Partie en cours - 5 joueurs] "
    	return s;
    }

    public void verifierFinPartie(Variante Variante) {
    }

    public Statut getStatut() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.statut;
    }

    public void setStatut(Statut value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.statut = value;
    }

    public int getNbJoueurs() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbJoueurs;
    }

    public void setNbJoueurs(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbJoueurs = value;
    }

    public int getPointsMax() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.pointsMax;
    }

    public void setPointsMax(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.pointsMax = value;
    }
    public void finManche() {
    	
    }

    public static void main(String[] args ) {
  /*  	Scanner sc = new Scanner(System.in);
    	int i=1;
    	Joueur[] Joueurs;
    	Variante V(52,"normale");
    	
    	System.out.println("Entrez la variante");
		int var=sc.nextLine();
		String v.nom=var;
    	System.out.println("Entrez le nombre de joueurs");
		int nbj=sc.nextLine();
		this.nbJoueurs=nbj;
			for (i=1;i<=this.nbJoueurs;i++){
				System.out.println("entrer le nom du joueur "& i);
				String Joueurs[i].nom=sc.nextLine;
				Joueurs[i].numeroJoueur=i;
				Joueurs[i].nbPoints=0;
					if(i=1){Joueur[i].typePhysique='True';}
					else {Joueur[i].typePhysique='False';}	
			}
    	
			Tatamis = New Tatamis();
			
			while(this.verifierFinPartie="True")
			{
				System.out.println("Le joueur "& i &" joue.");
				Carte C=Joueur[i].jouerCarte();
				Tatamis.verifierValiditéCarte(normale);
				C.appliquerPouvoir();
				Pioche.reconstituer();
				this.verifierFinPartie(V);
				i=i+1;
			}
    		
    		
    			//	System.out.println("Le joueur"& i & "joue.");
    			//	System.out.println("Vérification carte.");
    			//	System.out.println("Effets et pénalités.");
			//	System.out.println("Vérifications finales.");
			//	System.out.println("Le joueur suivant joue.");
    			if (i<this.nbJoueurs){i=i+1;
			}
			else if (i=this.nbJoueurs){i=1;
		    }
    	}*/

    }
}