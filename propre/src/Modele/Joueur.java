package Modele;

import java.util.*;

import javax.swing.JLayeredPane;

public class Joueur extends Observable {
	private boolean etatActif;

	private boolean aFini;

	private String nom;

	private boolean typePhysique;

	private int numeroJoueur;

	private int nbPoints;

	private boolean annonceDerniereCarte;

	public Hand hand;

	public Manche manche;
	
	public JLayeredPane panel;

	public Joueur(String name, int num, Hand hand) {
		this.etatActif = false;
		this.typePhysique = false;
		this.numeroJoueur=num;
		this.nbPoints = 0;
		this.nom=name;
		this.hand=hand;
		this.annonceDerniereCarte=false;
		this.panel = new JLayeredPane();
	}

	public String toString(){
		String s;
		s="[Joueur "+this.getNom()+", numero "+this.getNumeroJoueur()+" , "+this.getNbPoints()+" points]";
		return s;
	}

	protected void finalize() {
	}


	public void signalerDerniereCarte() {
		if(this.hand.carte.size()==1) {
			this.annonceDerniereCarte=true;
		}else {
			this.manche.penaliserJoueur(1, this);
			this.annonceDerniereCarte=false;
		}
		List<Object> Obs = new ArrayList<Object> ();
		Obs.add(4);
		Obs.add(this);
		this.setChanged();
		this.notifyObservers(Obs);
	}

	public void jouerCarte(Carte carte) {
	
		List<Object> Obs = new ArrayList<Object> ();
		Obs.add(1);
		Obs.add(this);
		Obs.add(carte);
		this.setChanged();
		this.notifyObservers(Obs);
		
		this.hand.carte.remove(carte);
		this.manche.tatamis.ajouterCarte(carte);
		carte.appliquerPouvoir(this.manche, this);
		this.manche.getHistorique().add(0,this);
		
	}

	public void denoncerDCarte(Joueur joueur) {
		boolean vrai = false;
		if(this.hand.carte.size()==1 && this.annonceDerniereCarte==false) {
			this.manche.penaliserJoueur(2, joueur);
			vrai = true;
		}else {
			this.manche.penaliserJoueur(2, this);
		}
		List<Object> Obs = new ArrayList<Object> ();
		Obs.add(2);
		Obs.add(joueur);
		Obs.add(vrai);
		this.setChanged();
		this.notifyObservers(Obs);
	}

	public void ajoutPoints(int value) {
		this.nbPoints+= value;
	}

	public void denoncerMCarte(Joueur joueur) {
		if(this.manche.getHistorique().size()!=0){
		int i=0;
		boolean o=true;
		boolean vrai = false;
		while(o){
			
			if(joueur.getNom() == this.manche.getHistorique().get(i).getNom()){
				if(!this.manche.tatamis.verifierValiditeCarte(i)==true) {
					this.manche.penaliserJoueur(3, joueur);
					vrai = true;
					o=false;
				}
				else {this.manche.penaliserJoueur(3, this);o=false;}
			}
			else {
				o=false;}
			i++;
			if(i>this.manche.getHistorique().size()-1){o=false;} }
		List<Object> Obs = new ArrayList<Object> ();
		Obs.add(3);
		Obs.add(this);
		Obs.add(vrai);
		this.setChanged();
		this.notifyObservers(Obs);
		}
	}

	public void jouer() {

	}

	public void piocher() {
		System.out.println(this.getNom()+" a pioché");
		this.manche.pioche.distribuerCarte(1,this);
		this.manche.getHistorique().add(0,this);
		this.manche.joueurSuivant(null, this);
	}

	public boolean isEtatActif() {
		return this.etatActif;
	}

	public void setEtatActif(boolean value) {
		this.etatActif = value;
	}

	public void setManche(Manche M) {
		this.manche=M;
	}

	public Hand getHand() {
		return this.hand;
	}  
	
	public void setHand(Hand h) {
		this.hand=h;
	}    

	public String getNom() {
		return this.nom;
	}

	void setNom(String value) {
		this.nom = value;
	}

	public boolean isTypePhysique() {
		return this.typePhysique;
	}

	public void setTypePhysique(boolean value) {
		this.typePhysique = value;
	}

	public boolean isaFini() {
		return this.aFini;
	}

	public void setaFini(boolean value) {
		this.aFini = value;
	}

	public int getNumeroJoueur() {
		return this.numeroJoueur;
	}

	void setNumeroJoueur(int value) {
		this.numeroJoueur = value;
	}

	public boolean getAnnonceDerniereCarte() {

		return this.annonceDerniereCarte;
	}


	public void setAnnonceDerniereCarte(boolean value) {

		this.annonceDerniereCarte = value;
	}

	public int getNbPoints() {
		return this.nbPoints;
	}

	public void setNbPoints(int value) {
		this.nbPoints = value;
	}

}