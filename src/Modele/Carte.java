package Modele;

import java.util.*;

public class Carte extends Observable {
	 private NumeroCarte numero;

	    private TypCarte type;
	    
	    private int poids;
	    
	    private LocalisationCarte localisation;
	    
	    public Carte(NumeroCarte num, TypCarte typ) {
	    	this.poids=5;
	    	this.numero=num;
	    	this.type=typ;
	    	this.localisation=LocalisationCarte.Pioche;
	    }    
	    
	    public Carte(NumeroCarte num, TypCarte typ, int poids) {
	    	this.numero=num;
	    	this.type=typ;
	    	this.poids=poids;
	    	this.localisation=LocalisationCarte.Pioche;
	    }
	    
    public String toString(){
    	String s;
    	s="["+this.getType()+","+this.getNumero()+"]";
    	return s;
    }

    //@objid ("e17c43a5-bd54-4afc-a26e-e7d0719b076c")
    protected void finalize() {
    }

    //@objid ("bb607436-5a85-4c20-ae05-1bc967a5a60d")
    public void appliquerPouvoir (Manche manche, Joueur J) {
    	
    	manche.tatamis.setType(manche.tatamis.carte.get(0).getType());
    	manche.tatamis.setNumero(manche.tatamis.carte.get(0).getNumero());
    	
    }

   // @objid ("9360b926-8b43-4610-9468-02bdf738200f")
    public NumeroCarte getNumero() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.numero;
    }

    //@objid ("2a8d3d50-82e5-4432-9c63-7e7332c97802")
    void setNumero(NumeroCarte value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.numero = value;
    }

    //@objid ("d7fa9fc5-ec52-43ec-afdb-57b88abf9caa")
    LocalisationCarte getLocalisation() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.localisation;
    }

    //@objid ("aedfbaf9-b188-48b5-a675-69b9d93eb553")
    void setLocalisation(LocalisationCarte value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.localisation = value;
    }

    //@objid ("cf5c77d7-2419-4582-9fce-9396f2d672a3")
    public TypCarte getType() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.type;
    }

    //@objid ("cea17c48-5cae-47cc-9a59-868a9dba7882")
    void setType(TypCarte value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.type = value;
    }
    
    int getPoids() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.poids;
    }

    void setPoids(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.poids = value;
    }

    public static void main(String[] args ) {
    	Carte Macabo = new Carte(NumeroCarte._10,TypCarte.Pique);
    	System.out.println(Macabo);
    }
    

}