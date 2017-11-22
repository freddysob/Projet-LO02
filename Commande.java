package PackageLO02;

public class Commande extends Carte {
	
	public Commande(NumerosCarte num, TypCarte typ) {
		super(num, typ, 23);
		// TODO Auto-generated constructor stub
	}

	public void appliquerPouvoir(Manche manche) {
	   // ajouter message et demander type
		manche.tatamis.setType(value);
	 }
	
	public static void main(String[] args ) {
    	
    }
}