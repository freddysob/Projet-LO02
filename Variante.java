package PackageLO02;

import java.util.ArrayList;
import java.util.List;

public class Variante {
    private int nbJeuDeCartes;

    private TypVariante nom;

    public List<Carte> carte = new ArrayList<Carte> ();
    
    public Variante(int nbCartes, TypVariante nom) {
    	this.nbJeuDeCartes = nbCartes;
        this.nom = nom;
        this.carte = carte; // ça sert à quoi ?
    }
    
    public String toString(){
    	String s;
    	s="[ Variante: "+this.nom+"]";         // Affiche seulement le nom de la variante
    	return s;
    }

    public void changerPouvoirCarte() {
    }

    int getNbJeuDeCartes() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbJeuDeCartes;
    }

    void setNbJeuDeCartes(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbJeuDeCartes = value;
    }

    TypVariante getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    void setNom(TypVariante value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
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
