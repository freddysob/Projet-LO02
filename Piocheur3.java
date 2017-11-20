public class Piocheur3 extends Carte {
	
	public Piocheur3(NumeroCarte num, TypCarte typ) {
		super(num, typ, 15);
		// TODO Auto-generated constructor stub
	}

	public void appliquerPouvoir(Joueur joueur, Pioche pioche) {
		pioche.distribuerCarte(3, joueur);   
	 }
	
	public static void main(String[] args ) {
    	
    }
}
