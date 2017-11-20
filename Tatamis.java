import java.util.ArrayList;
import java.util.List;


public class Tatamis {
  
    public List<Carte> carte = new ArrayList<Carte> ();
    
   
    public Tatamis() {
    	this.carte = new ArrayList<Carte> ();
    }

    public String toString(){
    	String s;
    	s=""+this.carte.get(0);     // Affichage de la carte de dessus
    	return s;
    }
    
   
    protected void finalize() {
    }

    
    public boolean[] verifierValiditeCarte(Variante Variante) {
    	boolean s[]={true,true};
    	return s;
    }


    public void setCarte(List<Carte> value) {
        
        this.carte = value;
    }

   
    public List<Carte> getCarte() {
       
        return this.carte;
    }
    
	public static void main(String[] args ) {
    	
    }

   

}
