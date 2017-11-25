package PackageLO02;

import java.util.List;
import java.util.ListIterator;
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
    
    

    public Partie getPartie() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.partie;
    }

    void setPartie(Partie value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.partie = value;
    }

    public List<Joueur> getJoueur() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.joueur;
    }

    public void setJoueur(List<Joueur> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.joueur = value;
    }

    public boolean isSensJeuPos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.sensJeuPos;
    }

    public void setSensJeuPos(boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.sensJeuPos = value;
    }

    public Variante getVariante() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.variante;
    }

    public void setVariante(Variante value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.variante = value;
    }
    
    public void initialiserJoueur() {
		for(int i=0; i<this.joueur.size(); i++) {
			this.joueur.get(i).setEtatActif(false);
			this.joueur.get(i).setaFini(false);
		}
		this.joueur.get((int)(Math.random()*(this.joueur.size()))).setEtatActif(true);
    }
    
    public Joueur joueurSuivant(Carte cartePose) {
    	ListIterator<Joueur> li= joueur.listIterator();
    	Joueur joue = null;
    	if(cartePose instanceof Rejoueur) {
    		while(li.hasNext()) {
    			joue = li.next();
    			if(joue.isEtatActif()) {
    				return(joue);
    			}
    		}
    	}
    	while(li.hasNext()) {
    		if(li.next().isaFini()) {
    			li.remove();
    		}
    	}
    	while(li.hasPrevious()) {
    		li.previous();
    	}
    	if(this.sensJeuPos) {
    		while(!li.next().isEtatActif()) {
    			li.next();
    		}
    		if(cartePose instanceof StopperSuivant) {
    			if(!li.hasNext()) {
    		    	while(li.hasPrevious()) {
    		    		li.previous();
    		    	}
    			}else {
    				li.next();
    			}
    		}
    		if(!li.hasNext()) {
    		    while(li.hasPrevious()) {
    		    	li.previous();
    		    }
    		    li.next();
    		    joue = li.previous();
    		}else {
    			joue = li.next();
    		}    		
    	}else {
       		while(!li.next().isEtatActif()) {
    			li.next();
    		}
    		if(cartePose instanceof StopperSuivant) {
    			if(!li.hasPrevious()) {
    		    	while(li.hasNext()) {
    		    		li.next();
    		    	}
    			}else {
    				li.previous();
    			}
    		}
    		if(!li.hasPrevious()) {
    		    while(li.hasNext()) {
    		    	li.next();
    		    }
    		    li.previous();
    		    joue = li.next();
    		}else {
    			joue = li.previous();
    		}    		

    	}for(int i=0; i<joueur.size(); i++) {
    		joueur.get(i).setEtatActif(false);
    	}
    	joue.setEtatActif(true);
    	return(joue);
	}
    
	public static void main(String[] args ) {

	}

    

}
