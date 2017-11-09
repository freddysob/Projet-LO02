import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("41188578-bd74-4c19-8591-97c2ac12d444")
public class Pioche {
    @objid ("ffa064a3-1995-4c33-9249-fd8f2ea61be7")
    public List<Carte> carte = new ArrayList<Carte> ();
    
    public Pioche(List<Carte> carte){
        this.carte = carte;
    }

    @objid ("afd6a121-7cf8-4e34-86ab-30b1f743b039")
    public void reconstituer() {
    }

    @objid ("8ca2882d-213d-4ad3-93c7-fb7163d2a674")
    List<Carte> getCarte() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.carte;
    }

    @objid ("f7f24b1d-7e08-40cc-8830-606901cbbca7")
    void setCarte(List<Carte> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.carte = value;
    }

}
