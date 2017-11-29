import java.util.ArrayList;
import java.util.List;




public class Tatamis {
   
    public List<Carte> carte = new ArrayList<Carte> ();
    
    public TypCarte type;
    
    public NumeroCarte numero;
   
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

    public boolean verifierValiditeCarte(/*Variante Variante*/) {
    	if(this.carte.size()<=1) {
    		return(true);
    	}
    	else if(this.carte.get(0).getType()==this.carte.get(1).getType()||((this.carte.get(0).getType()==TypCarte.Pique||this.carte.get(0).getType()==TypCarte.Trefle)&&this.carte.get(1).getType()==TypCarte.JN)||((this.carte.get(0).getType()==TypCarte.Carreau||this.carte.get(0).getType()==TypCarte.Coeur)&&this.carte.get(1).getType()==TypCarte.JR)||(this.carte.get(0).getType()==TypCarte.JN &&(this.carte.get(1).getType()==TypCarte.Pique || this.carte.get(1).getType()==TypCarte.Trefle)||(this.carte.get(1) instanceof Commande && (this.type == TypCarte.Trefle || this.type == TypCarte.Pique)))||(this.carte.get(1).getType()==TypCarte.JR &&(this.carte.get(1).getType()==TypCarte.Coeur || this.carte.get(1).getType()==TypCarte.Carreau)||(this.carte.get(1) instanceof Commande && (this.type == TypCarte.Coeur || this.type == TypCarte.Carreau)))||this.carte.get(0).getNumero()==this.carte.get(1).getNumero()||this.carte.get(0) instanceof Commande||(this.carte.get(1) instanceof Commande && this.type==this.carte.get(0).getType()))
    	{
    		return(true);
    	}else {
    		return(false);
    	}
    }
    
    
    public TypCarte getType() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.type;
    }
    
    
    public void setType(TypCarte value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.type = value;
    }
    
    public NumeroCarte getNumero() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.numero;
    }
    
    
    public void setNumero(NumeroCarte value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.numero = value;
    }
    

    
    public void setCarte(List<Carte> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.carte = value;
    }

   
    public List<Carte> getCarte() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.carte;
    }
    
    public void ajouterCarte(Carte carte) {
    	this.carte.add(0, carte);
    }   
    
	public static void main(String[] args ) {
    	
    }

   

}