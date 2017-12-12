package PackageLO02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import com.modeliosoft.modelio.javadesigner.annotations.objid;


//@objid ("41188578-bd74-4c19-8591-97c2ac12d444")
public class Pioche {
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
    }

    public void distribuerCartesDebut(Variante variante) {
    	for(int i = 0; i<this.manche.joueur.size(); i++){
    		this.distribuerCarte(variante.getNombreCarteDebut(), this.manche.joueur.get(i));
    	}
    	
    	// Distribution premiere carte du tatamis
    	
    	this.manche.tatamis.carte.add(this.carte.get(0));
    	this.carte.remove(0);
    }

    public void distribuerCarte(int nombre, Joueur joueur) {
    	for(int i = 0; i<nombre; i++){
    		if(this.carte.size()==0) {
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