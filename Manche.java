package PackageLO02;

import java.util.List;
import java.util.ArrayList;

public class Manche {
    private int nbJoueurs;

    private boolean sensJeuPos;

    private Variante variante;

    public List<Joueur> joueur;

    public Tatamis tatamis;

    public Pioche pioche;

    public Partie partie;
    
    public Manche(int n, Variante variante, Partie partie) {
    	    this.nbJoueurs = n;
    		this.sensJeuPos = true;
            this.joueur = new ArrayList<Joueur>();
            this.tatamis = new Tatamis();
            this.pioche = new Pioche();
            this.variante = variante;
            this.partie = partie;
    }

    public String toString(){
    	String s;
    	s="[Manche]";
    	return s;
    }
    
    protected void finalize() {
    }

    public void penaliserJoueur() {
    }

    Partie getPartie() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.partie;
    }

    void setPartie(Partie value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.partie = value;
    }

    List<Joueur> getJoueur() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.joueur;
    }

    void setJoueur(List<Joueur> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.joueur = value;
    }

    int getNbJoueurs() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbJoueurs;
    }

    void setNbJoueurs(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbJoueurs = value;
    }

    boolean isSensJeuPos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.sensJeuPos;
    }

    void setSensJeuPos(boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.sensJeuPos = value;
    }

    Variante getVariante() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.variante;
    }

    void setVariante(Variante value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.variante = value;
    }
    
	public static void main(String[] args ) {
    	
    }

    

}
