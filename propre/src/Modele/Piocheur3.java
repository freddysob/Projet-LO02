package Modele;

public class Piocheur3 extends Carte {// Pouvoir faire piocher 3 cartes

	public Piocheur3(NumeroCarte num, TypCarte typ) {
		super(num, typ, 15);
	}

	public void appliquerPouvoir(Manche manche, Joueur J) {
		Joueur precedent = null;
		for (int i = 0; i < manche.joueur.size(); i++) {
			if (manche.joueur.get(i).isEtatActif()) {
				precedent = manche.joueur.get(i);
			}
		}
		manche.pioche.distribuerCarte(3, manche.joueurSuivant(this, J));
		for (int i = 0; i < manche.joueur.size(); i++) {
			manche.joueur.get(i).setEtatActif(false);
		}
		precedent.setEtatActif(true);
	}

}