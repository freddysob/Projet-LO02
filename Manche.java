import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a01dd153-c040-44b2-8be3-508863e3b0c0")
public class Manche {
    @objid ("82238392-8d75-4504-baaf-a0ae3c1615bb")
    private int nbJoueurs;

    @objid ("ba8d8d3f-7077-46fe-94db-e661fce0b9f9")
    private boolean sensJeuPos;

    @objid ("b670d549-6d2b-4b74-b7d9-6222c874f4b3")
    public List<Joueur> joueur = new ArrayList<Joueur> ();

    @objid ("2dd207a1-9c99-4fb6-893a-b5b54705fe49")
    public Tatamis tatamis;

    @objid ("df477dc4-0726-4777-ab5d-b3580e0dc9aa")
    public Pioche pioche;

    @objid ("a2dff585-f0b6-4cc8-b210-5e3d6d67aa82")
    public Variante variante;

    @objid ("f0af0d16-edef-44fe-8481-d43c4799219e")
    public Partie partie;

    @objid ("57446165-d680-43ad-b02c-8badf65fcc0b")
    public void penaliserJoueur() {
    }

    @objid ("0ebf09ea-8c2b-42b0-b67d-0573fb0ac77a")
    public void changerVariante() {
    }

    @objid ("b402d7c3-35cf-4db6-a02e-51dc4fd631a3")
    public void changerStatut() {
    }

    @objid ("69682896-ea71-4f20-95de-d74694a1418b")
    public void changerSens() {
    }

    @objid ("ccb6b1af-8648-4ff9-9754-6da718861634")
    int getNbJoueurs() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbJoueurs;
    }

    @objid ("99b7c47a-995e-4b6b-80f7-0b9e44769cfe")
    void setNbJoueurs(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbJoueurs = value;
    }

    @objid ("5954785d-bd4e-490f-b174-f90950a9ea74")
    boolean isSensJeuPos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.sensJeuPos;
    }

    @objid ("2f0a7668-8dbc-4be5-a880-faf3775da45a")
    void setSensJeuPos(boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.sensJeuPos = value;
    }

    @objid ("46c1d675-cf24-41c4-b7f9-9443b0826ee6")
    List<Joueur> getJoueur() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.joueur;
    }

    @objid ("755b70da-b1d0-4dd4-b60e-2e06c33239f7")
    void setJoueur(List<Joueur> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.joueur = value;
    }

    @objid ("f4b8d98b-4408-4989-a4b1-c356ee910711")
    Tatamis getTatamis() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.tatamis;
    }

    @objid ("0fa7687c-d92b-4a2c-b8cc-7be673660cd3")
    void setTatamis(Tatamis value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.tatamis = value;
    }

    @objid ("eb2ef258-31aa-485b-8a55-94790c681b66")
    Pioche getPioche() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.pioche;
    }

    @objid ("52ac3ccc-ad03-4f77-92c3-eb57ad20ea83")
    void setPioche(Pioche value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.pioche = value;
    }

    @objid ("61daf0c8-d546-40ab-bfb8-0e9bddfb088e")
    Variante getVariante() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.variante;
    }

    @objid ("a5c07820-ef11-4de2-82be-f8ee541d3ed4")
    void setVariante(Variante value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.variante = value;
    }

    @objid ("51298e0f-5076-4516-b261-6c85b6499f90")
    Partie getPartie() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.partie;
    }

    @objid ("b65bcdee-e873-4345-a480-65adc93abc15")
    void setPartie(Partie value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.partie = value;
    }

}
