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
    public int nbPoints;

    @objid ("f6d36953-674e-46b7-879f-8c27393785f5")
    public Main main;
    
    public Joueur(String nom, boolean type, int numero, Main main){
        this.etat = true;
        this.nom = nom;
        this.type = type;
        this.numero = numero;
        this.points = 0;
        this.main = main;
    }

    @objid ("c0252c95-0978-40bb-bc14-40076292a884")
    public void signalerDerniereCarte() {
    }

    @objid ("9eb218ab-3a12-4b4f-8b6b-c2d7c0c79878")
    public void ajouterPoints() {
    }

    @objid ("04b236c2-ecc6-4366-a6c2-69577b38a715")
    public void changerEtat() {
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

    @objid ("f4602fe4-a041-4f04-a2e2-326ba9729198")
    public void changerNom() {
    }

    @objid ("af1eb9de-d1fa-4eb4-b391-7f0d13a44146")
    boolean isEtatActif() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.etatActif;
    }

    @objid ("511e44ad-07b0-4e85-b275-10acadc1f459")
    void setEtatActif(boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.etatActif = value;
    }

    @objid ("c5e86206-f87e-4ae6-849b-927a6b86856f")
    String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    @objid ("bdcf6e2c-fbed-4c12-b1c5-dc21a0a37a70")
    void setNom(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

    @objid ("8d4eaf01-5cec-48ae-baeb-f50923fdc7ec")
    boolean isTypePhysique() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.typePhysique;
    }

    @objid ("5ea6c27b-be10-476b-a4b6-dd81a4e73432")
    void setTypePhysique(boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.typePhysique = value;
    }

    @objid ("802261d8-fea3-40d3-be17-cdc2ea73e238")
    int getNumeroJoueur() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.numeroJoueur;
    }

    @objid ("23ca29fb-65de-4f33-b431-3b637d701c65")
    void setNumeroJoueur(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.numeroJoueur = value;
    }

    @objid ("62f9c634-0b08-44c4-9e1a-c357783fc838")
    int getNbPoints() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbPoints;
    }

    @objid ("63138f52-8005-4f27-b3f4-87bed3d29f03")
    void setNbPoints(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbPoints = value;
    }

    @objid ("20cb3d26-4067-473e-a193-d37a9c844892")
    void setMain(Main value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.main = value;
    }

    @objid ("ac89fb7a-69f2-4134-8ded-e5b69b11c953")
    Main getMain() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.main;
    }

}
