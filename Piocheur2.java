public class Piocheur2 extends Carte {
	
	public Piocheur2(NumeroCarte num, TypCarte typ) {
		super(num, typ, 10);
		// TODO Auto-generated constructor stub
	}

	public void appliquerPouvoir(Joueur joueur, Pioche pioche) {
		pioche.distribuerCarte(2, joueur);   
	 }
	
	public static void main(String[] args ) {
    	
    }
}
