package Modele;

public class Rejoueur extends Carte { // Pouvoir de rejouer

	public Rejoueur(NumeroCarte num, TypCarte typ) {
		super(num, typ, 27);
	}

	public void appliquerPouvoir(Manche manche, Joueur J) {
		manche.setDerniereCarteEstRejouer(true);
	}

}