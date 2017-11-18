import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("41188578-bd74-4c19-8591-97c2ac12d444")
public class Pioche {
    @objid ("ffa064a3-1995-4c33-9249-fd8f2ea61be7")
    public List<Carte> carte = new ArrayList<Carte> ();
    
    @objid ("5ee962dc-ef28-4ff9-912e-0bf8696e138c")
    public Pioche() {
    	this.carte=new ArrayList<Carte> ();
    }
    
    public String toString(){
    	String s;
    	s="[ Pioche ]";       // Affiche le mot "Pioche"
    	return s;
    }

    @objid ("ae48e544-0168-4f70-90ba-c750754013cf")
    protected void finalize() {
    }

    @objid ("afd6a121-7cf8-4e34-86ab-30b1f743b039")
    public void reconstituer() {
    }

    @objid ("38c62700-f8c0-47aa-b775-d6fb998014c0")
    public void distribuerCartesDebut() {
    }

    @objid ("eeae6efa-06c0-489c-995b-28e6a78fafe7")
    public void distribuerCarte() {
    }
    
	public static void main(String[] args ) {
    	
    }

    

}
