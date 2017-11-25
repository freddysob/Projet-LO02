import java.util.ArrayList;
import java.util.List;
//import com.modeliosoft.modelio.javadesigner.annotations.objid;


//@objid ("15049204-cf0a-4f70-8165-1c314b15eb3c")
public class Hand {
    //@objid ("93daffc6-1024-4d73-898c-79abea8d32d4")
    private int nbCartes;
    
    public Joueur joueur;

    //@objid ("aacbce62-fcd5-49c5-9b64-7f4ef32ed7af")
    public List<Carte> carte = new ArrayList<Carte> ();
    
    //@objid ("f1764045-f4dc-4477-bb9f-43be5da9dde0")
    public Hand(Joueur J) {
    	this.nbCartes=0;
    	this.joueur=J;
    	this.carte= new ArrayList<Carte> ();
    }
    
    public String toString(){
    	String s;
    	s="["+this.getNbCartes()+","+this.joueur+"]";
    	return s;
    }

    //@objid ("4dac1e9c-baba-47d0-9786-c87dec2fce24")
    protected void finalize() {
    }

    //@objid ("24a3d8ab-a154-4a3e-b130-919b64291868")
    int getNbCartes() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbCartes;
    }

    //@objid ("67edb5a1-0891-4b63-bc7b-5fb228c03bf1")
    void setNbCartes(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbCartes = value;
    }

    //@objid ("c00d9a81-9258-4d10-a234-be9f791c3ef8")
    List<Carte> getCarte() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.carte;
    }

    //@objid ("7aae7e93-1625-4090-b585-6474b6baede1")
    void setCarte(List<Carte> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.carte = value;
    }

	public static void main(String[] args ) {
    	
    }

}
