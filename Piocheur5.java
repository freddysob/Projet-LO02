public class Piocheur5 extends Carte{
	
	public Piocheur5(NumeroCarte num, TypCarte typ) {
		super(num, typ, 30);
		// TODO Auto-generated constructor stub
	}

	public void appliquerPouvoir(Joueur joueur, Pioche pioche) {
		pioche.distribuerCarte(5, joueur);   
	 }
	
	public static void main(String[] args ) {
    	
    }
}
