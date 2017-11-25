public class Piocheur5 extends Carte {

	public Piocheur5(NumeroCarte num,TypCarte typ){
		super(num, typ);
	}
	
	public void appliquerPouvoir(Manche manche) {
		manche.pioche.distribuerCarte(5, manche.joueurSuivant(this));
	 }
	
	public static void main(String[] args ) {
    	
    }
}
