package Modele;

import java.util.*;

//@objid ("a01dd153-c040-44b2-8be3-508863e3b0c0")
public class Manche extends Observable{
	//@objid ("82238392-8d75-4504-baaf-a0ae3c1615bb")
	private int nbJoueurs;

	//@objid ("ba8d8d3f-7077-46fe-94db-e661fce0b9f9")
	private boolean sensJeuPos;

	// @objid ("d17e671f-c88b-4620-8290-28c2e231268d")
	private Variante variante;

	//@objid ("b670d549-6d2b-4b74-b7d9-6222c874f4b3")
	public List<Joueur> joueur = new ArrayList<Joueur> ();

	public List<Joueur> gagnants = new ArrayList<Joueur> ();

	//@objid ("2dd207a1-9c99-4fb6-893a-b5b54705fe49")
	public Tatamis tatamis;

	//@objid ("df477dc4-0726-4777-ab5d-b3580e0dc9aa")
	public Pioche pioche;

	//@objid ("f0af0d16-edef-44fe-8481-d43c4799219e")
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

	//@objid ("5ae42cc0-d9b8-4d4a-948d-2631b9ab3a78")
	protected void finalize() {
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

	//@objid ("13f3387a-aee6-495e-bb3e-bb47d80b2711")
	Partie getPartie() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.partie;
	}

	//@objid ("92eaf32e-e2c7-4b39-9113-edd35505a102")
	void setPartie(Partie value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.partie = value;
	}

	//@objid ("3555bd57-33a6-4d25-acde-530e45dd5c6f")
	public List<Joueur> getJoueur() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.joueur;
	}

	//@objid ("9b54aa45-133c-4468-8cdc-513ac26380b6")
	public void setJoueur(List<Joueur> value) {
		// Automatically generated method. Please delete this comment before entering specific code.
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

	//@objid ("09fe90f9-552c-4d15-942c-b2de58609213")
	public int getNbJoueurs() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.nbJoueurs;
	}

	//@objid ("45392d85-647f-4207-9a07-27779e0ff918")
	public void setNbJoueurs(int value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.nbJoueurs = value;
	}

	//@objid ("094572e5-673b-43d9-80c2-32352519f8bf")
	boolean isSensJeuPos() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.sensJeuPos;
	}

	//@objid ("b84becd2-b633-49ac-95b3-13fc37a648c2")
	void setSensJeuPos(boolean value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.sensJeuPos = value;
	}

	Boolean getSensJeuPos() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.sensJeuPos;
	}

	//@objid ("9affe6e9-44c0-4fc7-acf6-9ce39674af2a")
	public Variante getVariante() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.variante;
	}

	//@objid ("e409e2ce-2222-4319-bbf8-e8959e2145be")
	public void setVariante(Variante value) {
		// Automatically generated method. Please delete this comment before entering specific code.
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
		int i=0;
		boolean o=false;
		int j=0;
		this.partie.joueur = this.joueur;
		//while(!o){
		if(this.gagnants.size()<=3){

			// Recherche et traitement de joueur avec main vide si moins de 3 personnes ont fini
			for(i=0; i<this.joueur.size(); i++){
				if (this.joueur.get(i).hand.carte.isEmpty() && !this.joueur.get(i).isaFini()){
					System.out.println(joueur.get(i)+" a fini");
					this.gagnants.add(this.joueur.get(i));
					System.out.println(" rang : "+this.gagnants.indexOf(joueur.get(i)));
					this.joueur.get(i).setaFini(true);
				}
			}

		}
		if(this.gagnants.size()==3 || (this.gagnants.size()==2 && this.joueur.size() == 3)|| (this.gagnants.size()==1 && this.joueur.size()==2)) {

			o=true;

			System.out.println("Manche terminée.");

			for(i=0; i<this.joueur.size(); i++){
				System.out.println(this.joueur.get(i)+" n'a plus fini");
				this.joueur.get(i).setaFini(false);
				/*    			for(j=0; j<=this.joueur.get(i).hand.carte.size(); j++){
    				this.pioche.carte.add(this.joueur.get(i).hand.carte.get(j));
    				this.joueur.get(i).hand.carte.remove(j);
    			}
				 */    		}

			// Attribution des points
			for(i=0; i<this.joueur.size(); i++){
				System.out.println("test"+this.gagnants.indexOf(this.joueur.get(i)));
				int r=0;
				if (this.gagnants.indexOf(this.joueur.get(i))==0){
					r=this.joueur.get(i).getNbPoints()+50;
					this.joueur.get(i).setNbPoints(r);
				}
				else if (this.gagnants.indexOf(this.joueur.get(i))==1){
					r=this.joueur.get(i).getNbPoints()+20;
					this.joueur.get(i).setNbPoints(r);
				}
				else if (this.gagnants.indexOf(this.joueur.get(i))==2){
					r=this.joueur.get(i).getNbPoints()+10;
					this.joueur.get(i).setNbPoints(r);
				}
				else {
					r=this.joueur.get(i).getNbPoints();
					this.joueur.get(i).setNbPoints(r);
				}
			}for(i=0; i<this.joueur.size(); i++) {
				this.gagnants.remove(this.joueur.get(i));
			}

			this.pioche.reconstituer();
			Collections.shuffle(this.pioche.carte);
			this.pioche.distribuerCartesDebut(this.variante);
			this.setChanged();
			this.notifyObservers("fini");
			this.partie.verifierFinPartie();
		}

		//}
		return o;
	}



}