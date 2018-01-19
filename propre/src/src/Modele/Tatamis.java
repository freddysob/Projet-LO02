package Modele;

import java.util.ArrayList;
import java.util.*;

/** Tatamis ou défausse*/
public class Tatamis extends Observable{
   
	/** list de ses cartes*/
    public List<Carte> carte = new ArrayList<Carte> ();
    
    /** type de la carte que le tatamis accepte*/
    public TypCarte type;
    
    /** numéro de la carte que le tatamis accepte*/
    public NumeroCarte numero;
   
    /** constructeur*/
    public Tatamis() {
    	this.carte = new ArrayList<Carte> ();
    }

    public String toString(){
    	String s;
    	s=""+this.carte.get(0);     /** Affichage de la carte de dessus*/
    	return s;
    }

    /** Vérifie si la carte posé est valide*/
	public boolean verifierValiditeCarte(int i) {
		if (this.carte.size() <= 1) {
			return (true);
		} else if (this.carte.get(i).getType() == this.carte.get(i + 1).getType()
				|| ((this.carte.get(i).getType() == TypCarte.Pique || this.carte.get(i).getType() == TypCarte.Trefle)
						&& this.carte.get(i + 1).getType() == TypCarte.JN)
				|| ((this.carte.get(i).getType() == TypCarte.Carreau || this.carte.get(i).getType() == TypCarte.Coeur)
						&& this.carte.get(i + 1).getType() == TypCarte.JR)
				|| (this.carte.get(i).getType() == TypCarte.JN
						&& (this.carte.get(i + 1).getType() == TypCarte.Pique
								|| this.carte.get(i + 1).getType() == TypCarte.Trefle)
						|| (this.carte.get(i + 1) instanceof Commande
								&& (this.type == TypCarte.Trefle || this.type == TypCarte.Pique)))
				|| (this.carte.get(i + 1).getType() == TypCarte.JR
						&& (this.carte.get(i + 1).getType() == TypCarte.Coeur
								|| this.carte.get(i + 1).getType() == TypCarte.Carreau)
						|| (this.carte.get(i + 1) instanceof Commande
								&& (this.type == TypCarte.Coeur || this.type == TypCarte.Carreau)))
				|| this.carte.get(i).getNumero() == this.carte.get(i + 1).getNumero()
				|| this.carte.get(i) instanceof Commande
				|| (this.carte.get(i + 1) instanceof Commande && this.type == this.carte.get(i).getType())) {
			return (true);
		} else {
			return (false);
		}
	}
    
    
    public TypCarte getType() {
        return this.type;
    }
    
    
    public void setType(TypCarte value) {
        this.type = value;
    }
    
    /** Permet de changer le type de carte accepté par le tatamis*/
    public void changeType(TypCarte value) {
        this.type = value;
        this.setChanged();
		this.notifyObservers(value);
    }
    
    
    public NumeroCarte getNumero() {
        return this.numero;
    }
    
    
    public void setNumero(NumeroCarte value) {
        this.numero = value;
    }
    

    
    public void setCarte(List<Carte> value) {
        this.carte = value;
    }

   
    public List<Carte> getCarte() {
        return this.carte;
    }
    
    public void ajouterCarte(Carte carte) {
    	this.carte.add(0, carte);
    }   

   

}