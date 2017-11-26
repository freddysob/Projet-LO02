public class Piocheur4 extends Carte {
	
	public Piocheur4(NumeroCarte num, TypCarte typ) {
		super(num, typ, 25);
		// TODO Auto-generated constructor stub
	}

	public void appliquerPouvoir(Manche manche) {
		manche.pioche.distribuerCarte(4, manche.joueurSuivant(this)); 
	 }
	
	public static void main(String[] args ) {
    	
    }
}