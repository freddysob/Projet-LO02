package Modele;

public class Joueur {
	//@objid ("644ad622-ff18-461c-91e3-6613837a8102")
	private boolean etatActif;

	private boolean aFini;

	//@objid ("4e634eba-7033-4791-ac25-a34af8f5d0dc")
	private String nom;

	//@objid ("b1ff98fd-3675-45a0-8abe-f99d8e4e6814")
	private boolean typePhysique;

	//@objid ("fc5b9751-47b7-4e50-b1a0-ae2d1702b118")
	private int numeroJoueur;

	//@objid ("b25383cd-f581-4d33-a1c5-44ba4b0b2f4a")
	private int nbPoints;

	private boolean annonceDerniereCarte;

	public Hand hand;

	public Manche manche;

	public Joueur(String name, int num, Hand hand) {
		this.etatActif = false;
		this.typePhysique = false;
		this.numeroJoueur=num;
		this.nbPoints = 0;
		this.nom=name;
		this.hand=hand;
		this.annonceDerniereCarte=false;
	}

	public String toString(){
		String s;
		s="[Joueur "+this.getNom()+", numero "+this.getNumeroJoueur()+" , "+this.getNbPoints()+" points]";
		return s;
	}

	//@objid ("bfdeddd7-0068-4d05-89a1-c7b85cc8c54f")
	protected void finalize() {
	}


	public void signalerDerniereCarte() {
		if(this.hand.carte.size()==1) {
			this.annonceDerniereCarte=true;
		}else {
			this.manche.penaliserJoueur(1, this);
		}
	}

	public void jouerCarte(Carte carte) {
		this.hand.carte.remove(carte);
		this.manche.tatamis.ajouterCarte(carte);
		carte.appliquerPouvoir(this.manche, this);
		this.manche.getHistorique().add(0,this);
	}

	public void denoncerDCarte(Joueur joueur) {
		if(this.hand.carte.size()==1 && this.annonceDerniereCarte==false) {
			this.manche.penaliserJoueur(2, joueur);
		}else {
			this.manche.penaliserJoueur(2, this);
		}
	}

	public void ajoutPoints(int value) {
		this.nbPoints+= value;
	}

	public void denoncerMCarte(Joueur joueur) {
		if(this.manche.getHistorique().size()!=0){
		int i=0;
		boolean o=true;
		while(o){
			
			if(joueur.getNom() == this.manche.getHistorique().get(i).getNom()){
				if(!this.manche.tatamis.verifierValiditeCarte(i)==true) {
					this.manche.penaliserJoueur(3, joueur);
				}
				else {this.manche.penaliserJoueur(3, this);}
			}
			else {
				o=false;}
			i++;
			if(i>this.manche.getHistorique().size()-1){o=false;}}
		}
	}

	public void jouer() {

	}

	//@objid ("8a1180dc-f293-4922-aa03-eb2ed17e2f60")
	public void piocher() {
		this.manche.pioche.distribuerCarte(1,this);
		this.manche.getHistorique().add(0,this);
	}

	//@objid ("ad53043c-fa56-4988-98e7-4b52306e1af4")
	public boolean isEtatActif() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.etatActif;
	}

	//@objid ("28403170-33bc-40a9-b504-5c3450abe974")
	public void setEtatActif(boolean value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.etatActif = value;
	}

	public void setManche(Manche M) {
		this.manche=M;
	}

	public void setHand(Hand h) {
		this.hand=h;
	}    

	//@objid ("32738ca0-c5a4-4bbf-a98d-984e129bfab9")
	String getNom() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.nom;
	}

	//@objid ("aedae8e2-4cfe-4fcf-9941-4087c32d890c")
	void setNom(String value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.nom = value;
	}

	//@objid ("4152e987-036d-430c-898a-41cdfbcab303")
	boolean isTypePhysique() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.typePhysique;
	}

	//@objid ("b29687ae-d766-42f0-8947-fbb5b3f54006")
	void setTypePhysique(boolean value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.typePhysique = value;
	}

	boolean isaFini() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.aFini;
	}

	void setaFini(boolean value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.aFini = value;
	}

	//@objid ("33b07d26-3623-4475-8768-46a1197b43e0")
	int getNumeroJoueur() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.numeroJoueur;
	}

	//@objid ("bcb2af85-8bcb-4a95-9752-74cf5c962910")
	void setNumeroJoueur(int value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.numeroJoueur = value;
	}

	boolean getAnnonceDerniereCarte() {

		return this.annonceDerniereCarte;
	}


	void setAnnonceDerniereCarte(boolean value) {

		this.annonceDerniereCarte = value;
	}

	//@objid ("99402ae3-7a52-40d4-9316-06744c865728")
	int getNbPoints() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.nbPoints;
	}

	//@objid ("5ab852bd-9110-446b-a66b-957b1657542f")
	void setNbPoints(int value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.nbPoints = value;
	}

	public static void main(String[] args ) {

	}


}