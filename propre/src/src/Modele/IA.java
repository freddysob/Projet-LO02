package Modele;

import java.util.ArrayList;
import java.util.List;


public class IA extends Joueur{
	/** Situatuon de l'IA dans la partie*/
	private SituationIA situation;

	public Joueur joueur;

	public IA(String name, int num, Hand hand) {
		super("IA "+ num +"",num, hand);
	}

	/** Methode jouer de l'IA*/
	public void jouer() {
		int poids = -100;
		Carte carteajouer=null;

		this.signalerDerniereCarte();
		if(Math.random()>0.5 && !this.manche.getHistorique().isEmpty()){
			this.denoncerMCarte(this.manche.getHistorique().get(0));
			if(Math.random()>0.7 && this.manche.getHistorique().get(0).hand.carte.size()==1){
			this.denoncerDCarte(this.manche.getHistorique().get(0));}}

		ArrayList<Carte> carteJouable = new ArrayList<Carte>();
		for(int i=0; i<this.hand.carte.size();i++) {
			if(this.manche.tatamis.getType()==this.hand.carte.get(i).getType()||this.manche.tatamis.getNumero()==this.hand.carte.get(i).getNumero()||this.hand.carte.get(i) instanceof Commande || (this.manche.tatamis.getType()==TypCarte.Pique && this.hand.carte.get(i).getType()==TypCarte.JN) || (this.manche.tatamis.getType()==TypCarte.Trefle && this.hand.carte.get(i).getType()==TypCarte.JN) || (this.manche.tatamis.getType()==TypCarte.Coeur && this.hand.carte.get(i).getType()==TypCarte.JR) || (this.manche.tatamis.getType()==TypCarte.Carreau && this.hand.carte.get(i).getType()==TypCarte.JR)) {
				carteJouable.add(this.hand.carte.get(i));
			}
		}
		if(!carteJouable.isEmpty()) {
			for(int i=0; i<carteJouable.size();i++) {
				if(poids<carteJouable.get(i).getPoids()) {
					poids = carteJouable.get(i).getPoids();
					carteajouer=carteJouable.get(i);
				}
			}
			System.out.println(carteajouer);
			this.jouerCarte(carteajouer);
			this.manche.joueurSuivant(carteajouer, this);
		}else{
			if(Math.random()<0.2) {
				for(int i=0; i<this.hand.carte.size();i++) {
					if(poids<this.hand.carte.get(i).getPoids()) {
						poids = this.hand.carte.get(i).getPoids();
						carteajouer=this.hand.carte.get(i);
					}
				}
				this.jouerCarte(carteajouer);
				this.manche.joueurSuivant(carteajouer, this);
			}else {
				this.piocher();
			}
		}
		
	}

	SituationIA getSituation() {
		return this.situation;
	}

	void setSituation(SituationIA value) {
		this.situation = value;
	}

	
	/** Permet à l'IA d'annoncer qu'elle n'a qu'une carte*/
	public void signalerDerniereCarte() {
		if(this.hand.carte.size()==1) {
			this.setAnnonceDerniereCarte(true);
			List<Object> Obs = new ArrayList<Object> ();
			Obs.add(4);
			Obs.add(this);
			this.setChanged();
			this.notifyObservers(Obs);
		}else {
			this.setAnnonceDerniereCarte(false);
		}
	} 

	/** Permet à l'IA de dénoncer lorsqu'une mauvaise carte est posé*/
	public void denoncerMCarte(Joueur joueur) {
		if(this.manche.getHistorique().size()!=0){
		int i=0;
		boolean o=true;
		boolean vrai = false;
		while(o && i<this.manche.tatamis.carte.size() && i>=0){
			if(i==0 && joueur.getNom() == this.manche.getHistorique().get(i).getNom() || i!=0 && joueur.getNom() == this.manche.getHistorique().get(i).getNom() && joueur.getNom() != this.manche.getHistorique().get(i+1).getNom()){
				if(!this.manche.tatamis.verifierValiditeCarte(i)==true) {
					this.manche.penaliserJoueur(3, joueur);
					vrai=true;
					o=false;
				}
			}
			else {
				o=false;
			}
			
			i++;
			if(i>this.manche.getHistorique().size()-1){o=false;}}
		List<Object> Obs = new ArrayList<Object> ();
		Obs.add(3);
		Obs.add(this);
		Obs.add(vrai);
		this.setChanged();
		this.notifyObservers(Obs);
		}
		
	}

}