import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2dcc4c4b-2391-44bd-98b6-0db389694165")
public class Joueur {
    @objid ("644ad622-ff18-461c-91e3-6613837a8102")
    private boolean etatActif;

    @objid ("4e634eba-7033-4791-ac25-a34af8f5d0dc")
    private String nom;

    @objid ("b1ff98fd-3675-45a0-8abe-f99d8e4e6814")
    private boolean typePhysique;

    @objid ("fc5b9751-47b7-4e50-b1a0-ae2d1702b118")
    private int numeroJoueur;

    @objid ("b25383cd-f581-4d33-a1c5-44ba4b0b2f4a")
    private int nbPoints;

    @objid ("f6d36953-674e-46b7-879f-8c27393785f5")
    public Hand hand;
    
    @objid ("38eacb92-e7d6-4452-a9e5-5c6838d5e754")
    public Joueur(String name, int num, Hand hand) {
    	this.etatActif = false;
    	this.typePhysique = false;
    	this.numeroJoueur=num;
    	this.nbPoints = 0;
    	this.nom=name;
    	this.hand=new Hand(this);
    }
    
    public String toString(){
    	String s;
    	s="[Joueur "+this.getnom()+", numero "+this.getNumeroJoueur()+" "+this.getNbPoints()+" points"]";
    	return s;
    }

    @objid ("bfdeddd7-0068-4d05-89a1-c7b85cc8c54f")
    protected void finalize() {
    }


    @objid ("c0252c95-0978-40bb-bc14-40076292a884")
    public void signalerDerniereCarte() {
    }

    @objid ("8432d2c2-1b86-47f7-aad6-338c6efb0d6e")
    public void jouerCarte() {
    }

    @objid ("8a1180dc-f293-4922-aa03-eb2ed17e2f60")
    public void piocher() {
    }

    @objid ("26efe03f-f7a7-47ea-aed8-ef8930a958c5")
    public void denoncerDCarte() {
    }

    @objid ("62695e20-1bed-4f51-82eb-a990c2705124")
    public void denoncerMCarte() {
    }

    @objid ("ad53043c-fa56-4988-98e7-4b52306e1af4")
    boolean isEtatActif() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.etatActif;
    }

    @objid ("28403170-33bc-40a9-b504-5c3450abe974")
    void setEtatActif(boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.etatActif = value;
    }

    @objid ("32738ca0-c5a4-4bbf-a98d-984e129bfab9")
    String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    @objid ("aedae8e2-4cfe-4fcf-9941-4087c32d890c")
    void setNom(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

    @objid ("4152e987-036d-430c-898a-41cdfbcab303")
    boolean isTypePhysique() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.typePhysique;
    }

    @objid ("b29687ae-d766-42f0-8947-fbb5b3f54006")
    void setTypePhysique(boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.typePhysique = value;
    }

    @objid ("33b07d26-3623-4475-8768-46a1197b43e0")
    int getNumeroJoueur() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.numeroJoueur;
    }

    @objid ("bcb2af85-8bcb-4a95-9752-74cf5c962910")
    void setNumeroJoueur(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.numeroJoueur = value;
    }

    @objid ("99402ae3-7a52-40d4-9316-06744c865728")
    int getNbPoints() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbPoints;
    }

    @objid ("5ab852bd-9110-446b-a66b-957b1657542f")
    void setNbPoints(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbPoints = value;
    }
    
	public static void main(String[] args ) {
    	
    }

    
}
