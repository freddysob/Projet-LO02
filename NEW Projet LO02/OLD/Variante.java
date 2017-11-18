import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("13fb79e4-c248-4e81-8baf-bddb4c4f4b1a")
public class Variante {
    @objid ("6e8b6ac1-e09e-497f-9fd5-821f554c587c")
    private int nbJeuDeCartes;

    @objid ("fcfb94d8-e310-468f-a3f9-7ab727361459")
    private typVariante nom;

    @objid ("5b9273cf-6a6f-4215-a1db-0ac1d9b0091b")
    public List<Carte> carte = new ArrayList<Carte> ();
    
    @objid ("d61ad526-226d-4650-ab08-6ee425d1d67a")
    public Variante(int nbCartes, String nom) {
    	this.nbCartes = nbCartes;
        this.nom = nom;
        this.carte = carte;
    }
    
    public String toString(){
    	String s;
    	s="[ Variante: "+this.nom+"]";         // Affiche seulement le nom de la variante
    	return s;
    }

    @objid ("8baf9c35-cec6-4486-9814-664a11b68306")
    public void changerPouvoirCarte() {
    }

    @objid ("d7988178-0c04-4e08-a169-5fc18a2f41f6")
    int getNbCartes() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbCartes;
    }

    @objid ("b7165d88-b9b2-4a8e-a1d8-21aafa36b941")
    void setNbCartes(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbCartes = value;
    }

    @objid ("38942509-883f-49b9-a5ad-763880ee0aaa")
    String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    @objid ("5cd91ef6-4df9-4ad9-ad25-8dc8ac9d8146")
    void setNom(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

    @objid ("edac1072-6daf-45d2-a4d0-bfa833579332")
    List<Carte> getCarte() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.carte;
    }

    @objid ("2dfb196e-189d-4fdd-b9f7-a3248e242b2b")
    void setCarte(List<Carte> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.carte = value;
    }
    
	public static void main(String[] args ) {
    	
    }

    
}
