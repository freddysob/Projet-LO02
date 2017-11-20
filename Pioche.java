import java.util.ArrayList;
import java.util.List;

public class Pioche {
    public List<Carte> carte = new ArrayList<Carte> ();
    
    public Pioche() {
    	this.carte=new ArrayList<Carte> ();
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
    	
    }

    public void distribuerCartesDebut(Variante variante) {
    }

    public void distribuerCarte(int nombre, Joueur joueur) {

    }
    
	public static void main(String[] args ) {
    	
    }

    

}
