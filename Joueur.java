package PackageLO02;

public class Joueur {
    private boolean etatActif;

    private String nom;

    private boolean typePhysique;

    private int numeroJoueur;

    private int nbPoints;

    public Hand hand;
    
    public Joueur(String name, int num, Hand hand) {
    	this.etatActif = false;
    	this.typePhysique = false;
    	this.numeroJoueur=num;
    	this.nbPoints = 0;
    	this.nom=name;
    	this.hand=new Hand(this);
    }
    
    public String toString(){
    	String s;
    	s="[Joueur "+this.getNom()+", numero "+this.getNumeroJoueur()+" "+this.getNbPoints()+" points]";
    	return s;
    }

    protected void finalize() {
    }


    public void signalerDerniereCarte() {
    }

    public void jouerCarte() {
    }

    public void piocher() {
    }

    public void denoncerDCarte() {
    }

    public void denoncerMCarte() {
    }

    boolean isEtatActif() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.etatActif;
    }

    void setEtatActif(boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.etatActif = value;
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
    
	public static void main(String[] args ) {
    	
    }

    
}
