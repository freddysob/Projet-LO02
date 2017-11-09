import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("50a23012-b43d-47f5-b068-5836148a3eab")
public class Partie {
    @objid ("79e8229f-77de-4a75-97e1-fe3782043a6b")
    private String statut;

    @objid ("3aeb1c27-a90e-4339-bd9f-581cad54cf90")
    private int nbJoueurs;

    @objid ("6eb49448-5654-4cee-a87c-85f5c2848ab5")
    private int pointsMax;
	
    public Partie(int nbJoueurs, int pointsMax){
    	this.nbJoueurs = nbJoueurs
	this.pointsMax = pointsMax
	this.statut = "initialise"
    }

    @objid ("f8726706-c624-42b8-98c0-d271b7ba5ec2")
    public void changerNbManches() {
    }

    @objid ("2487c473-f257-4846-84e2-49c1bb4738a4")
    public void verifierFinPartie(Variante Variante) {
    }

    @objid ("bc882b0a-e085-4c2b-ac03-dad20d396aa6")
    public void changerPointMax() {
    }

    @objid ("4fa97aa3-f468-4134-abd5-ca54228d6fce")
    String getStatut() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.statut;
    }

    @objid ("ee0c5832-0f66-425a-873d-93188663f168")
    void setStatut(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.statut = value;
    }

    @objid ("7994ffd4-279b-47d9-b8c2-09943c5fd4e6")
    int getNbJoueurs() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbJoueurs;
    }

    @objid ("05edff90-3884-491f-a2be-bc4c1e3e6282")
    void setNbJoueurs(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbJoueurs = value;
    }


    @objid ("88af0ca6-8146-4642-8771-66bca899883f")
    int getPointsMax() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.pointsMax;
    }

    @objid ("039f1676-a0f0-4adc-9c2a-4111e69b5f8c")
    void setPointsMax(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.pointsMax = value;
    }

    public static void main(){
    	import java.util.Scanner;
    	Scanner sc = new Scanner(System.in);
    	int i=1;
    	Joueur[] Joueurs;
    	Variante V;
    	
    	System.out.println("Entrez la variante");
		int var=sc.nextLine();
		String v.nom=var;
    	System.out.println("Entrez le nombre de joueurs");
		int nbj=sc.nextLine();
		this.nbJoueurs=nbj;
			for (i=1;i<=this.nbJoueurs;i++){
				System.out.println("entrer le nom du joueur "& i);
				String Joueurs[i].nom=sc.nextLine;
				Joueurs[i].numeroJoueur=i;
				Joueurs[i].nbPoints=0;
					if(i=1){Joueur[i].typePhysique='True';}
					else {Joueur[i].typePhysique='False';}	
			}
    	
			Tatamis = New Tatamis;
			
			while this.verifierFinPartie="True";
			{
				System.out.println("Le joueur "& i &" joue.");
				Carte C=Joueur[i].jouerCarte();
				Tatamis.verifierValiditéCarte(normale);
				C.appliquerPouvoir();
				Pioche.reconstituer();
				this.verifierFinPartie(V);
				i=i+1;
			}
    		
    		
    		System.out.println("Le joueur"& i & "joue.");
    		System.out.println("Vérification carte.");
    		System.out.println("Effets et pénalités.");
    		System.out.println("Vérifications finales.");
    		System.out.println("Le joueur suivant joue.");
    	if (i<this.nbJoueurs){i=i+1;
    	}
    	else if (i=this.nbJoueurs){i=1;
    }
}
