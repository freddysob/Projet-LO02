package PackageLO02;

public class Piocheur4 extends Carte {
	
	public Piocheur4(NumerosCarte num, TypCarte typ) {
		super(num, typ, 25);
		// TODO Auto-generated constructor stub
	}

	public void appliquerPouvoir(Joueur joueur, Pioche pioche) {
		pioche.distribuerCarte(4, joueur);   
	 }
	
	public static void main(String[] args ) {
    	
    }
}