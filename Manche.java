package PackageLO02;

import java.util.List;
import java.util.ArrayList;

public class Manche {

    private boolean sensJeuPos;

    private Variante variante;

    public List<Joueur> joueur;

    public Tatamis tatamis;

    public Pioche pioche;

    public Partie partie;
    
    public Manche(int n, Variante variante, Partie partie) {
    	boolean partieFinie=false;
    	for(int i=0; i<this.joueur.size(); i++) {
    		if(this.joueur.get(i).getNbPoints()>=this.partie.getPointsMax()){
    			partieFinie=true;
    		}
    	}
    	if(!partieFinie) {
    		this.sensJeuPos = true;
            this.joueur = new ArrayList<Joueur>();
            this.tatamis = new Tatamis();
            this.pioche = new Pioche(this);
            this.variante = variante;
            this.partie = partie;
    	}
    }

    public String toString(){
    	String s;
    	s="[Manche]";
    	return s;
    }

    public void penaliserJoueur(int nombre, Joueur joueur) {
		pioche.distribuerCarte(nombre, joueur); 
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
    
    public Joueur joueurSuivant(Carte cartePose) {
    	if(cartePose instanceof Rejoueur) {
    		return;
    	}
    	if(this.sensJeuPos) {
	    	if(cartePose instanceof StopperSuivant) {
	    		for(int i=0; i<this.joueur.size();i++) {
	        		if(this.joueur.get(i).isEtatActif()) {
	        			this.joueur.get(i).setEtatActif(false);
	        			if(this.joueur.get(i+1)!= null) {
	        				if(this.joueur.get(i+2) != null) {
	        					this.joueur.get(i+2).setEtatActif(true);
	        				}
	        				this.joueur.get(1).setEtatActif(true);
	        			}else {
	        				this.joueur.get(0).setEtatActif(true);
	        			}
	        		}
	    		}
	    	}else {
	    		for(int i=0; i<this.joueur.size();i++) {
	        		if(this.joueur.get(i).isEtatActif()) {
	        			this.joueur.get(i).setEtatActif(false);
	        			if(this.joueur.get(i+1)!= null) {
	        				this.joueur.get(i+1).setEtatActif(true);
	        			}else {
	        				this.joueur.get(0).setEtatActif(true);
	        			}
	        		}
	    		}
	    	}
    	}else {
	    	if(cartePose instanceof StopperSuivant) {
	    		for(int i=0; i<this.joueur.size();i++) {
	        		if(this.joueur.get(i).isEtatActif()) {
	        			this.joueur.get(i).setEtatActif(false);
	        			if(this.joueur.get(i-1)!= null) {
	        				if(this.joueur.get(i-2) != null) {
	        					this.joueur.get(i-2).setEtatActif(true);
	        				}
	        				this.joueur.get(this.joueur.size()-1).setEtatActif(true);
	        			}else {
	        				this.joueur.get(this.joueur.size()).setEtatActif(true);
	        			}
	        		}
	    		}
	    	}else {
	    		for(int i=0; i<this.joueur.size();i++) {
	        		if(this.joueur.get(i).isEtatActif()) {
	        			this.joueur.get(i).setEtatActif(false);
	        			if(this.joueur.get(i-1)!= null) {
	        				this.joueur.get(i-1).setEtatActif(true);
	        			}else {
	        				this.joueur.get(this.joueur.size()).setEtatActif(true);
	        			}
	        		}
	    		}
	    	}
    	}
	    	
	    }
    
	public static void main(String[] args ) {
    	
    }

    

}
