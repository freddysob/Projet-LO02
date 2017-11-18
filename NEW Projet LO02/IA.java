import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ce110b50-f8ea-48ea-8017-a2104bc861e8")
public class IA {
    @objid ("9dc00c79-ce71-45b1-84b2-6186938b3244")
    private SituationIA situation;

    @objid ("eb467e72-172b-4013-b7f4-c5022868e87a")
    public Joueur joueur;

    @objid ("3ce5ca07-26e2-49b1-86f3-210856435573")
    public List<Integer> prioriserCartes() {
    }

    @objid ("24fe93d9-1fa5-4ccf-9d3c-f2f7cd3b0005")
    public void jouer() {
    }

    @objid ("5db48821-e1bb-4323-8520-b4a682114998")
    SituationIA getSituation() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.situation;
    }

    @objid ("5a3817a6-fdb1-454b-9824-e4122dbb2f86")
    void setSituation(SituationIA value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.situation = value;
    }

    @objid ("b95b7218-d770-490e-a1de-e48f4de5c815")
    public IA() {
    }

    @objid ("35398e5b-9731-402b-829e-bb09bce54f58")
    protected void finalize() {
    }
    
	public static void main(String[] args ) {
    	
    }

}
