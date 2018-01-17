package Modele;

import java.util.*;

public class Carte extends Observable {
	
	private NumeroCarte numero;

	private TypCarte type;

	// Valeur utilis� pour l'IA lorsqu'elle joue, elle joue le poids le plus �lev�
	private int poids;

	// O� se trouve la carte
	private LocalisationCarte localisation;

	// Constructeur d'une carte classique
	public Carte(NumeroCarte num, TypCarte typ) {
		this.poids = 5;
		this.numero = num;
		this.type = typ;
		this.localisation = LocalisationCarte.Pioche;
	}

	// Constructeur d'une carte avec pouvoir utilis� par les classes pouvoirs
	public Carte(NumeroCarte num, TypCarte typ, int poids) {
		this.numero = num;
		this.type = typ;
		this.poids = poids;
		this.localisation = LocalisationCarte.Pioche;
	}

	public String toString() {
		String s;
		s = "[" + this.getType() + "," + this.getNumero() + "]";
		return s;
	}

	// Permet de d�finir quel est le pouvoir de la carte
	public void appliquerPouvoir(Manche manche, Joueur J) {

		manche.tatamis.setType(manche.tatamis.carte.get(0).getType());
		manche.tatamis.setNumero(manche.tatamis.carte.get(0).getNumero());

	}

	// Getter/Setter
	public NumeroCarte getNumero() {
		return this.numero;
	}

	void setNumero(NumeroCarte value) {
		this.numero = value;
	}

	LocalisationCarte getLocalisation() {
		return this.localisation;
	}

	void setLocalisation(LocalisationCarte value) {
		this.localisation = value;
	}

	public TypCarte getType() {
		return this.type;
	}

	void setType(TypCarte value) {

		this.type = value;
	}

	public int getPoids() {
		return this.poids;
	}

	void setPoids(int value) {
		this.poids = value;
	}

}