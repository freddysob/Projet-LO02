package Modele;

import java.util.*;

public class Manche extends Observable{
	private int nbJoueurs;

	private boolean sensJeuPos;

	private Variante variante;

	public List<Joueur> joueur = new ArrayList<Joueur> ();

	public List<Joueur> gagnants = new ArrayList<Joueur> ();

	public Tatamis tatamis;

	public Pioche pioche;

	public Partie partie;
	
	public List<Joueur> historique = new ArrayList<Joueur> ();
	
	private boolean derniereCarteEstRejouer;
	


	

	public Manche( Variante variante, Partie partie) {
		boolean partieFinie=false;
		for(int i=0; i<this.joueur.size(); i++) {
			if(this.joueur.get(i).getNbPoints()>=this.partie.getPointsMax()){
				partieFinie=true;
			}
		}
		if(!partieFinie) {
			this.sensJeuPos = true;
			this.joueur = new ArrayList<Joueur>();
			this.nbJoueurs=this.joueur.size();
			this.tatamis = new Tatamis();
			this.pioche = new Pioche(this);
			this.variante = variante;
			this.partie = partie;
			this.derniereCarteEstRejouer=false;
		}
	}

	public String toString(){
		String s;
		s="[Manche]";
		return s;
	}

	public void penaliserJoueur(int nombre, Joueur joueur) {
		pioche.distribuerCarte(nombre, joueur); 
	}

	public void initialiserJoueur() {
		for(int i=0; i<this.joueur.size(); i++) {
			this.joueur.get(i).setEtatActif(false);
			this.joueur.get(i).setaFini(false);
		}
		this.joueur.get((int)(Math.random()*(this.joueur.size()))).setEtatActif(true);
	}

	Partie getPartie() {
		return this.partie;
	}

	void setPartie(Partie value) {
		this.partie = value;
	}

	public List<Joueur> getJoueur() {
		return this.joueur;
	}

	public void setJoueur(List<Joueur> value) {
		this.joueur = value;
	}

	Pioche getPioche() {
		return this.pioche;
	}

	void setPioche(Pioche Pi) {
		this.pioche = Pi;
	}

	List<Joueur> getGagnants() {
		return this.gagnants;
	}

	void setGagnants(List<Joueur> value) {
		this.gagnants = value;
	}

	public int getNbJoueurs() {
		return this.nbJoueurs;
	}

	public void setNbJoueurs(int value) {
		this.nbJoueurs = value;
	}

	boolean isSensJeuPos() {
		return this.sensJeuPos;
	}

	void setSensJeuPos(boolean value) {
		this.sensJeuPos = value;
	}

	Boolean getSensJeuPos() {
		return this.sensJeuPos;
	}

	public Variante getVariante() {
		return this.variante;
	}

	public void setVariante(Variante value) {
		this.variante = value;
	}
	
	public List<Joueur> getHistorique() {
		return historique;
	}

	public void setHistorique(List<Joueur> historique) {
		this.historique = historique;
	}
	
	public void setTatamis(Tatamis value) {
		
		this.tatamis = value;
	}
	
	public Tatamis getTatamis() {
		
		return this.tatamis;
	}
	
	public boolean isDerniereCarteEstRejouer() {
		return derniereCarteEstRejouer;
	}

	public void setDerniereCarteEstRejouer(boolean derniereCarteEstRejouer) {
		this.derniereCarteEstRejouer = derniereCarteEstRejouer;
	}
	
	
	 public Variante choisirVariante( int n){

		 Variante V = new Variante(1,this.getVariante().getNom());
			boolean avance=false;
			while(avance==false){

				

				try {
					if (n==1){
						this.getVariante().setNom(TypVariante.Minimale);
						avance=true;
					}
					else if (n==2){
						this.getVariante().setNom(TypVariante.Monclar);
						avance=true;
					}
					else if(n==3){
						this.getVariante().setNom(TypVariante.Variante_1);
						avance=true;
					}
					else if(n==4){
						this.getVariante().setNom(TypVariante.Carte_et_Maou);
						avance=true;
					}
					else if(n==5){
						this.getVariante().setNom(TypVariante.Des_Ulis);
						avance=true;
					}
					else if(n==6){
						this.getVariante().setNom(TypVariante.Variante_4);
						avance=true;
					}
					else if(n==7){
						this.getVariante().setNom(TypVariante.Variante_5);
						avance=true;
					}
					else if(n==8){
						this.getVariante().setNom(TypVariante.Variante_6);
						avance=true;
					}
					else if(n==9){
						this.getVariante().setNom(TypVariante.Variante_Courte_Amicale);
						avance=true;
					}
					else if(n==10){
						this.getVariante().setNom(TypVariante.Man_et_resta);
						avance=true;
					}
					else{
						System.out.println("Nombre pas dans la plage");
						avance=false;
					}

					V = new Variante(1,this.getVariante().getNom());
				}

				catch (NumberFormatException nfe){
					System.out.println("Saisie variante invalide");
					avance=false; }
			}
			return V;
		}
	
	

	public Joueur joueurSuivant(Carte cartePose, Joueur actif) {
		ArrayList<Joueur> temp = new ArrayList <Joueur>();
		for(int i=0; i<this.joueur.size(); i++) {
			temp.add(this.joueur.get(i));
		}
		ListIterator<Joueur> li= temp.listIterator();
		Joueur joue = null;

		if(cartePose instanceof Rejoueur && this.isDerniereCarteEstRejouer() && !actif.hand.carte.isEmpty()) {
			this.setDerniereCarteEstRejouer(false);
			while(li.hasNext()) {
				joue = li.next();
				if(joue.isEtatActif()) {
					this.verifierFinManche();
					this.setChanged();
					this.notifyObservers(joue);
					return(joue);
				}
			}
		}
		while(li.hasNext()) {
			if(li.next().isaFini()) {
				li.remove();
			}
		}
		while(li.hasPrevious()) {
			li.previous();
			
		}
		if(this.sensJeuPos) {
			while(!li.next().isEtatActif()) {
			}
			if(cartePose instanceof StopperSuivant) {
				
				if(!li.hasNext()) {
					while(li.hasPrevious()) {
						li.previous();
					}
				}else {
					li.next();
				}
			}
			if(!li.hasNext()) {
				
				while(li.hasPrevious()) {
					li.previous();
				}
				li.next();
				joue = li.previous();
			}else {
				joue = li.next();
			}    		
		}else {
			while(!li.next().isEtatActif()) {
				li.next();
			}
			if(cartePose instanceof StopperSuivant) {
				if(!li.hasPrevious()) {
					while(li.hasNext()) {
						li.next();
					}
				}else {
					li.previous();
				}
			}
			if(!li.hasPrevious()) {
				while(li.hasNext()) {
					li.next();
				}
				li.previous();
				joue = li.next();
			}else {
				joue = li.previous();
			}    		

		}for(int i=0; i<joueur.size(); i++) {
			joueur.get(i).setEtatActif(false);
		}
		joue.setEtatActif(true);
		this.verifierFinManche();
		this.setChanged();
		this.notifyObservers(joue);
		System.out.println("Joueur actif"+joue);
		return(joue);
	}

	public void compteARebours(){
		int tempsTransit=1000;
		int it=0;
		for(it=1
				;it>=0;it--)
		{try {   Thread.sleep (tempsTransit);} 
		catch (InterruptedException e) { System.out.print("erreur");}
		System.out.println(" "+it+" sec");} 				// Compte à rebours
	}

	public boolean verifierFinManche() {
		int i = 0;
		boolean o = false;
		this.partie.joueur = this.joueur;

		if (this.gagnants.size() <= 3) {

			// Recherche et traitement de joueur avec main vide si moins de 3 personnes ont
			// fini
			for (i = 0; i < this.joueur.size(); i++) {
				if (this.joueur.get(i).hand.carte.isEmpty() && !this.joueur.get(i).isaFini()) {
					System.out.println(joueur.get(i) + " a fini");
					this.gagnants.add(this.joueur.get(i));
					System.out.println(" rang : " + this.gagnants.indexOf(joueur.get(i)));
					this.joueur.get(i).setaFini(true);
				}
			}

		}
		if (this.gagnants.size() == 3 || (this.gagnants.size() == 2 && this.joueur.size() == 3)
				|| (this.gagnants.size() == 1 && this.joueur.size() == 2)) {

			o = true;

			System.out.println("Manche terminée.");

			for (i = 0; i < this.joueur.size(); i++) {
				System.out.println(this.joueur.get(i) + " n'a plus fini");
				this.joueur.get(i).setaFini(false);
			}

			// Attribution des points
			for (i = 0; i < this.joueur.size(); i++) {
				System.out.println("test" + this.gagnants.indexOf(this.joueur.get(i)));
				int r = 0;
				if (this.gagnants.indexOf(this.joueur.get(i)) == 0) {
					r = this.joueur.get(i).getNbPoints() + 50;
					this.joueur.get(i).setNbPoints(r);
				} else if (this.gagnants.indexOf(this.joueur.get(i)) == 1) {
					r = this.joueur.get(i).getNbPoints() + 20;
					this.joueur.get(i).setNbPoints(r);
				} else if (this.gagnants.indexOf(this.joueur.get(i)) == 2) {
					r = this.joueur.get(i).getNbPoints() + 10;
					this.joueur.get(i).setNbPoints(r);
				} else {
					r = this.joueur.get(i).getNbPoints();
					this.joueur.get(i).setNbPoints(r);
				}
			}
			for (i = 0; i < this.joueur.size(); i++) {
				this.gagnants.remove(this.joueur.get(i));
			}

			this.pioche.reconstituer();
			Collections.shuffle(this.pioche.carte);
			this.pioche.distribuerCartesDebut(this.variante);
			this.setChanged();
			this.notifyObservers("fini");
			this.partie.verifierFinPartie();
		}

		return o;
	}



}