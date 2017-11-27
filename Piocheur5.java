
//import com.modeliosoft.modelio.javadesigner.annotations.objid;

//@objid ("53938d9b-bf54-4825-9e11-7fc012944174")
public class Piocheur5 extends Carte {

	public Piocheur5(NumeroCarte num,TypCarte typ){
		super(num, typ);
	}
	
	public void appliquerPouvoir(Manche manche, Joueur J) {
		manche.pioche.distribuerCarte(5, manche.joueurSuivant(this));
	 }
	
	public static void main(String[] args ) {
    	
    }
}
