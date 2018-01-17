package Modele;

import java.util.ArrayList;
import java.util.List;

public class Hand { // Main du joueur
	
	// Nombre de cartes dans la main du joueur
	private int nbCartes;

	// Joueur à qui appartient la main
	public Joueur joueur;

	// Liste des cartes dans la main du joueur
	public List<Carte> carte = new ArrayList<Carte>();

	// Constructeur
	public Hand(Joueur J) {
		this.nbCartes = 0;
		this.joueur = J;
		this.carte = new ArrayList<Carte>();
	}

	public String toString() {
		String s;
		s = "[" + this.getNbCartes() + "," + this.joueur + "]";
		return s;
	}

	int getNbCartes() {

		return this.nbCartes;
	}

	void setNbCartes(int value) {

		this.nbCartes = value;
	}

	List<Carte> getCarte() {

		return this.carte;
	}

	void setCarte(List<Carte> value) {

		this.carte = value;
	}

	// Permet de vérifieer si la main est vide, et si c'est le cas gère l'attribution des points
	public boolean mainVide() {
		boolean fini = true;
		if (this.carte.isEmpty()) {
			this.joueur.setaFini(true);
			int compte = 0;
			for (int i = 0; i < this.joueur.manche.joueur.size(); i++) {
				if (this.joueur.manche.joueur.get(i).isaFini()) {
					compte += 1;
				}
			}
			if (compte == 1) {
				this.joueur.ajoutPoints(50);
				if (this.joueur.manche.joueur.size() == 2) {
					fini = false;
				}
			} else if (compte == 2) {
				this.joueur.ajoutPoints(20);
				if (this.joueur.manche.joueur.size() == 3) {
					fini = false;
				}
			} else if (compte == 3) {
				this.joueur.ajoutPoints(10);
				fini = false;
			}
		}
		return (fini);
	}

}