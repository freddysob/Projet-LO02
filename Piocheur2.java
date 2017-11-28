public class Piocheur2 extends Carte {
	
	public Piocheur2(NumeroCarte num, TypCarte typ) {
		super(num, typ, 10);
		// TODO Auto-generated constructor stub
	}

	public void appliquerPouvoir(Manche manche, Joueur J) {
		manche.pioche.distribuerCarte(2, manche.joueurSuivant(this,J));   
	 }
	
	public static void main(String[] args ) {
    	
    }
}