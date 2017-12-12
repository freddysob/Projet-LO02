package PackageLO02;

public class Rejoueur extends Carte {
	
	public Rejoueur(NumeroCarte num, TypCarte typ) {
		super(num, typ, 27);
		// TODO Auto-generated constructor stub
	}

	public void appliquerPouvoir(Manche manche, Joueur J) {
		manche.setDerniereCarteEstRejouer(true);
	 }
	
	public static void main(String[] args ) {
    	
    }
}