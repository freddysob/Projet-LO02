package PackageLO02;

import java.util.ArrayList;
import java.util.List;

public class Pioche {
    public List<Carte> carte = new ArrayList<Carte> ();
    
    public Manche manche;
    
    public Pioche(Manche manche) {
    	this.carte=new ArrayList<Carte> ();
    	this.manche = manche;
    }
    
    public String toString(){
    	String s;
    	s="[ Pioche ]";       // Affiche le mot "Pioche"
    	return s;
    }
    
    public List<Carte> getCarte() {
    	return(this.carte);
    }
    
    public void reconstituer() {
    	this.carte.addAll(this.manche.tatamis.carte);
        for(int i =0; i<this.manche.tatamis.carte.size(); i++) {
        	this.manche.tatamis.carte.remove(i);
        }
    }

    public void distribuerCartesDebut(Variante variante) {
    	for(int i = 0; i<this.manche.joueur.size(); i++){
    		this.distribuerCarte(variante.getNombreCarteDebut(), this.manche.joueur.get(i));
    	}
    }

    public void distribuerCarte(int nombre, Joueur joueur) {
    	for(int i = 0; i<nombre; i++){
    		if(this.carte.isEmpty()) {
    			this.reconstituer();
    		}
    		Carte retire=this.carte.get(0);
    		this.carte.remove(0);
    		joueur.hand.carte.add(retire);
    	}
    }
    
	public static void main(String[] args ) {
    	
    }

    

}
