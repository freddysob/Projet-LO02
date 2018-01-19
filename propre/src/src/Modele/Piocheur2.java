package Modele;

/** Pouvoir faire piocher 2 carte*/
public class Piocheur2 extends Carte {

	public Piocheur2(NumeroCarte num, TypCarte typ) {
		super(num, typ, 10);
	}

	public void appliquerPouvoir(Manche manche, Joueur J) {
		Joueur precedent = null;
		for (int i = 0; i < manche.joueur.size(); i++) {
			if (manche.joueur.get(i).isEtatActif()) {
				precedent = manche.joueur.get(i);
			}
		}
		manche.pioche.distribuerCarte(2, manche.joueurSuivant(this, J));
		for (int i = 0; i < manche.joueur.size(); i++) {
			manche.joueur.get(i).setEtatActif(false);
		}
		precedent.setEtatActif(true);
	}

}