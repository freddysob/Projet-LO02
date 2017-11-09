import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e552cddb-2d13-42de-8744-8d933700a4a5")
public class Carte {
    @objid ("2fdaee7f-bf98-439f-8929-907831018dcf")
    private String numero;

    @objid ("d8f4c5d5-f50e-4ced-b3c5-14abf51bc78a")
    private String type;

    @objid ("21f64c68-6feb-4d38-a211-20d3eae4718e")
    private String localisation;
    
    public Carte(string type, string numero){
        this.numero=numero;
        this.type=type;
    }

    @objid ("fb3544d3-93a5-4fb3-a317-fb7855a90a64")
    public void jouerCarte() {
    }

    @objid ("bb607436-5a85-4c20-ae05-1bc967a5a60d")
    public void appliquerPouvoir() {
    }

    @objid ("a2c1c4b8-686b-492d-83f3-07fe90735d7f")
    String getNumero() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.numero;
    }

    @objid ("21862fbd-8326-4f40-a549-d86608b1e545")
    void setNumero(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.numero = value;
    }

    @objid ("56154eaf-fbf3-421a-a299-e9b4a0653f30")
    String getType() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.type;
    }

    @objid ("d54c263d-cdec-496a-b283-79010115ff52")
    void setType(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.type = value;
    }

    @objid ("b770a8ed-c529-4576-9db7-d434d25b2dfa")
    String getLocalisation() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.localisation;
    }

    @objid ("2850f457-2ca5-41d1-be75-2e2fb62e769a")
    void setLocalisation(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.localisation = value;
    }

}
