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

    public int getNbCartes() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbCartes;
    }

    public void setNbCartes(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbCartes = value;
    }

    public List<Carte> getCarte() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.carte;
    }

    public void setCarte(List<Carte> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.carte = value;
    }
    
    public boolean mainVide() {
    	if(this.carte.isEmpty()) {
    		this.joueur.setaFini(true);
    		int compte = 0;
    		for(int i=0; i<this.manche.joueur.size(); i++) {
    			if(this.manche.joueur.get(i).isaFini()) {
    				compte+=1;
    			}
    		}
    		if(compte==0) {
    			this.joueur.ajoutPoints(50);
    		}else if(compte == 1) {
    			this.joueur.ajoutPoints(20);
    		}else if(compte == 2) {
    			this.joueur.ajoutPoints(10);
    			this.manche.partie.finManche();
    		}
    		return(true);
    	}else {
    		return(false);
    	}
    }

	public static void main(String[] args ) {
    	
    }

}
