package Modele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;

public class Pioche extends Observable {
	/** liste des cartes de la pioche*/
	public List<Carte> carte = new ArrayList<Carte>();

	/** manche à laquelle la pioche appartient*/
	public Manche manche;

	/** constructeur*/
	public Pioche(Manche manche) {
		this.carte = new ArrayList<Carte>();
		this.manche = manche;
	}

	public List<Carte> getCarte() {
		return this.carte;
	}

	public void setCarte(List<Carte> C) {
		this.carte = C;
	}

	/** Permet de mettre les cartes du tatamis dans la pioche lorsqu'elle est vide*/
	public void reconstituer() {
		List<Carte> temporaire = new ArrayList<Carte>();
		this.carte.addAll(this.manche.tatamis.carte);
		this.carte.remove(0);
		Collections.shuffle(temporaire);
		this.carte.addAll(temporaire);
		for (int i = 1; i < this.manche.tatamis.carte.size(); i++) {
			this.manche.tatamis.carte.remove(i);
		}
		System.out.println("Re 1");
		List<Object> Obs = new ArrayList<Object>();
		Obs.add(2);
		Obs.add(this.carte);
		this.setChanged();
		this.notifyObservers(Obs);

	}

	/** permet de distribuer les cartes aux joueurs en début de manche*/
	public void distribuerCartesDebut(Variante variante) {
		for (int i = 0; i < this.manche.joueur.size(); i++) {
			this.distribuer(variante.getNombreCarteDebut(), this.manche.joueur.get(i));
		}

		// Distribution premiere carte du tatamis

		this.manche.tatamis.carte.add(this.carte.get(0));
		this.carte.remove(0);
	}

	/** est appelé par la méthode distribuer carte début*/
	public void distribuer(int nombre, Joueur joueur) {
		for (int i = 0; i < nombre; i++) {
			joueur.hand.carte.add(this.carte.get(0));
			System.out.println("Carte distribuee par la pioche" + this.carte.get(0) + "à" + joueur.getNom()
					+ "/nvelle taille de sa main: " + joueur.hand.carte.size());
			this.carte.remove(0);
		}
	}

	/** Permet de distribuer les cartes en cas de pioche ou de pénalisation*/
	public void distribuerCarte(int nombre, Joueur joueur) {

		for (int i = 0; i < nombre; i++) {
			System.out.println("Taille pioche modele : " + this.carte.size());
			if (this.carte.size() < 2) {
				this.reconstituer();
			}
			joueur.hand.carte.add(this.carte.get(0));
			System.out.println("Carte distribuee par la pioche" + this.carte.get(0) + "à" + joueur.getNom()
					+ "/nvelle taille de sa main: " + joueur.hand.carte.size());

			List<Object> Obs = new ArrayList<Object>();
			Obs.add(1);
			Obs.add(joueur);
			this.carte.remove(0);
			this.setChanged();
			this.notifyObservers(Obs);

		}
	}
}