package Modele;

import java.util.*;
import java.util.ArrayList;

public class Partie extends Observable {
	
	// Permet de connaitre le statut de la partie
	private Statut statut;

	// Permet de savoir si on joue en console (texte) ou en graphique
	private boolean text;

	public boolean isText() {
		return text;
	}

	public void setText(boolean text) {
		this.text = text;
	}

	// nombre de joueurs de la partie
	private int nbJoueurs;

	// nombre de points pour finir la partie
	private int pointsMax;

	// liste des joueurs jouant la partie
	public List<Joueur> joueur = new ArrayList<Joueur>();

	// constructeur
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

	// Permet de vérifier si la partie est finie
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
}