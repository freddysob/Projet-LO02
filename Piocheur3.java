package PackageLO02;

public class Piocheur3 extends Carte {
	
	public Piocheur3(NumerosCarte num, TypCarte typ) {
		super(num, typ, 15);
		// TODO Auto-generated constructor stub
	}

	public void appliquerPouvoir(Manche manche) {
		manche.pioche.distribuerCarte(3, manche.joueurSuivant(this)); 
	 }
	
	public static void main(String[] args ) {
    	
    }
}