package PackageLO02;

public class Piocheur2 extends Carte {
	
	public Piocheur2(NumerosCarte num, TypCarte typ) {
		super(num, typ, 10);
		// TODO Auto-generated constructor stub
	}

	public void appliquerPouvoir(Manche manche) {
		manche.pioche.distribuerCarte(2, manche.joueurSuivant(this));   
	 }
	
	public static void main(String[] args ) {
    	
    }
}