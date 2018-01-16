package Modele;

import java.util.*;
import java.util.ArrayList;

public class Partie extends Observable {
	private Statut statut;

	private boolean text;

	public boolean isText() {
		return text;
	}

	public void setText(boolean text) {
		this.text = text;
	}

	private int nbJoueurs;

	private int pointsMax;

	public List<Joueur> joueur = new ArrayList<Joueur>();

	public Partie() {
		this.statut = Statut.Encours;
		this.nbJoueurs = 0;
		this.pointsMax = 500;
		this.joueur = new ArrayList<Joueur>();
	}

	public String toString() {
		String s;
		s = "[ Partie -" + this.getStatut() + " - " + this.getNbJoueurs() + " joueurs]"; // Affiche par exemple : "
																							// [Partie en cours - 5
																							// joueurs] "
		return s;
	}

	public boolean verifierFinPartie() {
		boolean s = true;
		int i = 0;
		for (i = 0; i < this.joueur.size(); i++) {
			if (this.joueur.get(i).getNbPoints() >= this.pointsMax) {
				System.out.println("Partie Terminée! Gagnant : " + this.joueur.get(i).getNom());
				this.setChanged();
				this.notifyObservers(this.joueur.get(i).getNom());
				s = false;
			}
		}

		return s;
	}

	Statut getStatut() {
		return this.statut;
	}

	void setStatut(Statut value) {
		this.statut = value;
	}

	public List<Joueur> getJoueur() {
		return this.joueur;
	}

	void setJoueur(List<Joueur> value) {
		this.joueur = value;
	}

	public int getNbJoueurs() {
		return this.nbJoueurs;
	}

	public void setNbJoueurs(int value) {
		this.nbJoueurs = value;
	}

	int getPointsMax() {
		return this.pointsMax;
	}

	public void setPointsMax(int value) {

		this.pointsMax = value;
	}

	public static void main(String[] args) {

	}

}