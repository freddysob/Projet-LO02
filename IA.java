import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ce110b50-f8ea-48ea-8017-a2104bc861e8")
public class IA {
    @objid ("9dc00c79-ce71-45b1-84b2-6186938b3244")
    public String situation;

    @objid ("eb467e72-172b-4013-b7f4-c5022868e87a")
    public Joueur joueur;

    @objid ("3ce5ca07-26e2-49b1-86f3-210856435573")
    public void prioriserCartes() {
    }

    @objid ("24fe93d9-1fa5-4ccf-9d3c-f2f7cd3b0005")
    public void jouer() {
    }

    @objid ("f628ab36-a009-47c2-b9f6-efdfb85d129a")
    String getSituation() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.situation;
    }

    @objid ("c4c7cb26-955a-44cd-8d4d-cc160922fc6c")
    void setSituation(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.situation = value;
    }

    @objid ("894fb480-3d1a-4dca-88a2-4db3b06eabe0")
    Joueur getJoueur() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.joueur;
    }

    @objid ("391bf492-7263-471a-895b-c7a9abcfa16f")
    void setJoueur(Joueur value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.joueur = value;
    }

}
