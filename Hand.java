package PackageLO02;
import java.util.ArrayList;
import java.util.List;

public class Hand {
    private int nbCartes; // pas utile
    
    public Joueur joueur;
    
    public Manche manche;

    public List<Carte> carte;
    
    public Hand(Joueur J, Manche manche) {
    	this.nbCartes=0;
    	this.joueur=J;
    	this.carte= new ArrayList<Carte> ();
    	this.manche = manche;
    }
    
    public String toString(){
    	String s;
    	s="["+this.getNbCartes()+","+this.joueur+"]";
    	return s;
    }

    int getNbCartes() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbCartes;
    }

    void setNbCartes(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbCartes = value;
    }

    List<Carte> getCarte() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.carte;
    }

    void setCarte(List<Carte> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.carte = value;
    }

	public static void main(String[] args ) {
    	
    }

}
