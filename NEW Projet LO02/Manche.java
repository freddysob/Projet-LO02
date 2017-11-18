import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a01dd153-c040-44b2-8be3-508863e3b0c0")
public class Manche {
    @objid ("82238392-8d75-4504-baaf-a0ae3c1615bb")
    private int nbJoueurs;

    @objid ("ba8d8d3f-7077-46fe-94db-e661fce0b9f9")
    private boolean sensJeuPos;

    @objid ("d17e671f-c88b-4620-8290-28c2e231268d")
    private Variante variante;

    @objid ("b670d549-6d2b-4b74-b7d9-6222c874f4b3")
    public List<Joueur> joueur = new ArrayList<Joueur> ();

    @objid ("2dd207a1-9c99-4fb6-893a-b5b54705fe49")
    public Tatamis tatamis;

    @objid ("df477dc4-0726-4777-ab5d-b3580e0dc9aa")
    public Pioche pioche;

    @objid ("f0af0d16-edef-44fe-8481-d43c4799219e")
    public Partie partie;
    
    @objid ("22260c28-e334-4af5-8b05-3b8a95e9aaa6")
    public Manche(int n, Variante variante, Partie partie) {
    	    this.nbJoueurs = n;
    		this.sensJeuPos = true;
            this.joueur = new ArrayList<Joueur> ();
            this.tatamis = new tatamis();
            this.pioche = new pioche();
            this.variante = variante;
            this.partie = partie;
    }

    public String toString(){
    	String s;
    	s="[Manche]";
    	return s;
    }
    
    @objid ("5ae42cc0-d9b8-4d4a-948d-2631b9ab3a78")
    protected void finalize() {
    }

    @objid ("57446165-d680-43ad-b02c-8badf65fcc0b")
    public void penaliserJoueur() {
    }

    @objid ("13f3387a-aee6-495e-bb3e-bb47d80b2711")
    Partie getPartie() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.partie;
    }

    @objid ("92eaf32e-e2c7-4b39-9113-edd35505a102")
    void setPartie(Partie value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.partie = value;
    }

    @objid ("3555bd57-33a6-4d25-acde-530e45dd5c6f")
    List<Joueur> getJoueur() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.joueur;
    }

    @objid ("9b54aa45-133c-4468-8cdc-513ac26380b6")
    void setJoueur(List<Joueur> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.joueur = value;
    }

    @objid ("09fe90f9-552c-4d15-942c-b2de58609213")
    int getNbJoueurs() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbJoueurs;
    }

    @objid ("45392d85-647f-4207-9a07-27779e0ff918")
    void setNbJoueurs(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbJoueurs = value;
    }

    @objid ("094572e5-673b-43d9-80c2-32352519f8bf")
    boolean isSensJeuPos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.sensJeuPos;
    }

    @objid ("b84becd2-b633-49ac-95b3-13fc37a648c2")
    void setSensJeuPos(boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.sensJeuPos = value;
    }

    @objid ("9affe6e9-44c0-4fc7-acf6-9ce39674af2a")
    Variante getVariante() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.variante;
    }

    @objid ("e409e2ce-2222-4319-bbf8-e8959e2145be")
    void setVariante(Variante value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.variante = value;
    }
    
	public static void main(String[] args ) {
    	
    }

    

}
