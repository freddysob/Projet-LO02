import java.util.ArrayList;
import java.util.List;


public class Variante {
  
    private int nbJeuDeCartes;

    
    private TypVariante nom;

   
    public List<Carte> carte = new ArrayList<Carte> ();
    
   
    public Variante(int nbCartes, TypVariante nom) {
    	this.nbJeuDeCartes = nbCartes;
        this.nom = nom;
        this.carte = creerCartes(nom);
    }
    
    public String toString(){
    	String s;
    	s="[ Variante: "+this.nom+"]";         // Affiche seulement le nom de la variante
    	return s;
    }

    
    public void changerPouvoirCarte() {
    }
    
    public List<Carte> creerCartes(TypVariante n){
    	List<Carte> s=new ArrayList<Carte> ();
    	return s;
    }

    
    int getNbCartes() {
      
        return this.nbJeuDeCartes;
    }

    
    void setNbCartes(int value) {
        
        this.nbJeuDeCartes = value;
    }

    
    TypVariante getNom() {
        
        return this.nom;
    }

    
    void setNom(TypVariante value) {
       
        this.nom = value;
    }

    
    List<Carte> getCarte() {
        
        return this.carte;
    }

    
    void setCarte(List<Carte> value) {
        
        this.carte = value;
    }
    
	public static void main(String[] args ) {
    	
    }

    
}
