package PackageLO02;

import java.util.ArrayList;
import java.util.List;

public class Tatamis {
    public List<Carte> carte;
    
    public TypCarte type;
    
    public Tatamis() {
    	this.carte = new ArrayList<Carte> ();
    }

    public String toString(){
    	String s;
    	s=""+this.carte.get(0);     // Affichage de la carte de dessus
    	return s;
    }

    public boolean verifierValiditeCarte(/*Variante Variante*/) {
    	if(this.carte.get(0).getType()==this.type||(type==TypCarte.JN &&(this.carte.get(0).getType()==TypCarte.Pique || this.carte.get(0).getType()==TypCarte.Trefle))||(type==TypCarte.JR &&(this.carte.get(0).getType()==TypCarte.Coeur || this.carte.get(0).getType()==TypCarte.Carreau))||this.carte.get(0).getNumero()==this.carte.get(1).getNumero()||this.carte.get(0) instanceof Commande)
    	{
    		return(true);
    	}else {
    		return(false);
    	}
    }

    public void setCarte(List<Carte> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.carte = value;
    }

    public List<Carte> getCarte() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return carte;
    }
    
    public void setType(TypCarte value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.type = value;
    }

    public TypCarte getType() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return type;
    }
    
	public static void main(String[] args ) {
    	
    }

   

}