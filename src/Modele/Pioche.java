package Modele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;
//import com.modeliosoft.modelio.javadesigner.annotations.objid;


//@objid ("41188578-bd74-4c19-8591-97c2ac12d444")
public class Pioche extends Observable {
    //@objid ("ffa064a3-1995-4c33-9249-fd8f2ea61be7")
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

    //@objid ("ae48e544-0168-4f70-90ba-c750754013cf")
    protected void finalize() {
    }
    
    public List<Carte> getCarte() {
    	return this.carte;
    }
    
    public void setCarte(List<Carte> C) {
    	this.carte = C;
    }

    public void reconstituer() {
    	
    	this.carte.addAll(this.manche.tatamis.carte);
    	this.carte.remove(0);
        for(int i =1; i<this.manche.tatamis.carte.size(); i++) {
        	this.manche.tatamis.carte.remove(i);
        }
        Collections.shuffle(this.getCarte());
        System.out.println("Re 1");
        List<Object> Obs = new ArrayList<Object> ();
		Obs.add(2);
		Obs.add(this.carte);
		this.setChanged();
		this.notifyObservers(Obs);
        
    }

    public void distribuerCartesDebut(Variante variante) {
    	for(int i=0; i<this.manche.joueur.size(); i++){
    		this.distribuer(variante.getNombreCarteDebut(), this.manche.joueur.get(i));
    	}
    	
    	// Distribution premiere carte du tatamis
    	
    	this.manche.tatamis.carte.add(this.carte.get(0));
    	this.carte.remove(0);
    }

    public void distribuer(int nombre, Joueur joueur) {
    	for(int i = 0; i<nombre; i++){
    		joueur.hand.carte.add(this.carte.get(0));
    		System.out.println("Carte distribuee par la pioche"+this.carte.get(0)+"�"+joueur.getNom()+ "/nvelle taille de sa main: "+joueur.hand.carte.size());
    		this.carte.remove(0);
    	}
    }
    
    public void distribuerCarte(int nombre, Joueur joueur) {
    	
    	for(int i = 0; i<nombre; i++){
    		System.out.println("Taille pioche modele : " + this.carte.size());
    		if(this.carte.size()<1) {
    			this.reconstituer();
    			System.out.println("Entre dans le if");
    		}
    		joueur.hand.carte.add(this.carte.get(0));
    		System.out.println("Carte distribuee par la pioche"+this.carte.get(0)+"�"+joueur.getNom()+ "/nvelle taille de sa main: "+joueur.hand.carte.size());
    		
    		List<Object> Obs = new ArrayList<Object> ();
    		Obs.add(1);
    		Obs.add(joueur);
    		this.carte.remove(0);
    		this.setChanged();
    		this.notifyObservers(Obs);
    		
    	}
    }
    
	public static void main(String[] args ) {
    	
    }

    

}