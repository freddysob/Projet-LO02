import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("39ddc4b7-4a06-46cc-9241-1d13d85ca06c")
public class Tatamis {
    @objid ("e2025e3e-4ae1-42d6-8b82-6d62d090d799")
    public List<Carte> carte = new ArrayList<Carte> ();

    @objid ("6775325f-3103-4b75-8638-b36c9712ae84")
    public void verifierValiditeCarte:(Variante Variante) {
    	Boolean results[][]={{'MauvaiseCarte','DerniereCarte'},{'Oui','Non'}};
    	
    }

    @objid ("cf7e2a4e-9aaf-4915-980e-6a6906efd6eb")
    static void setCarte(List<Carte> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        carte = value;
    }

    @objid ("fea85c9a-1dac-477b-a672-fa355ba74452")
    static List<Carte> getCarte() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return carte;
    }

}
