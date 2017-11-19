package PackageLO02;

import java.util.ArrayList;
import java.util.List;

public class Tatamis {
    public List<Carte> carte = new ArrayList<Carte> ();
    
    public Tatamis() {
    	this.carte = new ArrayList<Carte> ();
    }

    public String toString(){
    	String s;
    	s=""+this.carte.get(1);     // Affichage de la carte de dessus
    	return s;
    }

    public boolean verifierValiditeCarte(Variante Variante) {
    	return(true);
    }

    public void setCarte(List<Carte> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.carte = value;
    }

    public List<Carte> getCarte() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return carte;
    }
    
	public static void main(String[] args ) {
    	
    }

   

}