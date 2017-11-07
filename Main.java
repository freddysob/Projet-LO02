import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("15049204-cf0a-4f70-8165-1c314b15eb3c")
public class Main {
    @objid ("93daffc6-1024-4d73-898c-79abea8d32d4")
    private int nbCartes;

    @objid ("aacbce62-fcd5-49c5-9b64-7f4ef32ed7af")
    public List<Carte> carte = new ArrayList<Carte> ();

    @objid ("24a3d8ab-a154-4a3e-b130-919b64291868")
    int getNbCartes() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbCartes;
    }

    @objid ("67edb5a1-0891-4b63-bc7b-5fb228c03bf1")
    void setNbCartes(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbCartes = value;
    }

    @objid ("c00d9a81-9258-4d10-a234-be9f791c3ef8")
    List<Carte> getCarte() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.carte;
    }

    @objid ("7aae7e93-1625-4090-b585-6474b6baede1")
    void setCarte(List<Carte> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.carte = value;
    }

}
