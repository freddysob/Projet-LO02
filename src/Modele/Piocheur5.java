package Modele;

public class Piocheur5 extends Carte {

	public Piocheur5(NumeroCarte num,TypCarte typ){
		super(num, typ);
	}
	
	public void appliquerPouvoir(Manche manche, Joueur J) {
		Joueur precedent = null;
		for(int i=0; i<manche.joueur.size();i++) {
			if(manche.joueur.get(i).isEtatActif()) {
				precedent = manche.joueur.get(i);
			}
		}
		manche.pioche.distribuerCarte(5, manche.joueurSuivant(this,J));
		for(int i=0; i<manche.joueur.size();i++) {
			manche.joueur.get(i).setEtatActif(false);
		}
		precedent.setEtatActif(true);
	 }
	
	public static void main(String[] args ) {
    	
    }
}