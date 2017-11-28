package PackageLO02;
import java.util.ArrayList;
import java.util.List;
//import com.modeliosoft.modelio.javadesigner.annotations.objid;


//@objid ("39ddc4b7-4a06-46cc-9241-1d13d85ca06c")
public class Tatamis {
    //@objid ("e2025e3e-4ae1-42d6-8b82-6d62d090d799")
    public List<Carte> carte = new ArrayList<Carte> ();
    
    public TypCarte type;
    
    //@objid ("4df1b0b0-44af-47ce-898f-fa61b1f58332")
    public Tatamis() {
    	this.carte = new ArrayList<Carte> ();
    }

    public String toString(){
    	String s;
    	s=""+this.carte.get(0);     // Affichage de la carte de dessus
    	return s;
    }
    
    //@objid ("d61f72cf-3977-4030-a554-44a4d78f1cdb")
    protected void finalize() {
    }

    public boolean verifierValiditeCarte(/*Variante Variante*/) {
    	if(this.carte.size()==1) {
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
    

    //@objid ("cf7e2a4e-9aaf-4915-980e-6a6906efd6eb")
    public void setCarte(List<Carte> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.carte = value;
    }

    //@objid ("fea85c9a-1dac-477b-a672-fa355ba74452")
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
