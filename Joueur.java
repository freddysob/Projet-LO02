package PackageLO02;

public class Joueur {
    private boolean etatActif;
    
    private boolean aFini;

    private String nom;

    private boolean typePhysique;

    private int numeroJoueur;

    private int nbPoints;
    
    private boolean annonceDerniereCarte;

    public Hand hand;
    
    public Manche manche;
    
    public Joueur(String name, int num, Hand hand, Manche manche) {
    	this.etatActif = false;
    	this.typePhysique = false;
    	this.numeroJoueur=num;
    	this.nbPoints = 0;
    	this.nom=name;
    	this.hand=new Hand(this,manche);
    	this.annonceDerniereCarte=false;
    	this.aFini=false;
    }
    
    public String toString(){
    	String s;
    	s="[Joueur "+this.getNom()+", numero "+this.getNumeroJoueur()+" "+this.getNbPoints()+" points]";
    	return s;
    }

    public void signalerDerniereCarte() {
    	if(this.hand.carte.size()==1) {
    		this.annonceDerniereCarte=true;
    	}else {
    		this.manche.penaliserJoueur(1, this);
    	}
    }

    public void jouerCarte(Carte carte) {
    	this.hand.carte.remove(carte);
    	this.manche.tatamis.carte.add(0, carte);
    	carte.appliquerPouvoir(this.manche);
    }

    public void denoncerDCarte(Joueur joueur) {
    	if(this.hand.carte.size()==1 && this.annonceDerniereCarte==false) {
    		this.manche.penaliserJoueur(2, joueur);
    	}else {
    		this.manche.penaliserJoueur(2, this);
    	}
    }

    public void denoncerMCarte(Joueur joueur) {
    	if(!this.manche.tatamis.verifierValiditeCarte()) {
    		this.manche.penaliserJoueur(3, joueur);
    	}else {
    		this.manche.penaliserJoueur(3, this);
    	}
    }

    boolean isEtatActif() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.etatActif;
    }

    void setEtatActif(boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.etatActif = value;
    }
    
    boolean isaFini() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.aFini;
    }

    void setaFini(boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.aFini = value;
    }

    String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    void setNom(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

    boolean isTypePhysique() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.typePhysique;
    }

    void setTypePhysique(boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.typePhysique = value;
    }

    int getNumeroJoueur() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.numeroJoueur;
    }

    void setNumeroJoueur(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.numeroJoueur = value;
    }

    int getNbPoints() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbPoints;
    }

    void setNbPoints(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbPoints = value;
    }
    
    void ajoutPoints(int value) {
    	this.nbPoints+= value;
    }
    
	public static void main(String[] args ) {
    	
    }

    
}
