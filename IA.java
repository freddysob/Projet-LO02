package PackageLO02;

import java.util.ArrayList;

public class IA {
    private SituationIA situation;

    public Joueur joueur;

 /*   public List<Integer> prioriserCartes() {
    } */

    public void jouer() {
    	int poids = -100;
    	Carte carteajouer=null;
    	ArrayList<Carte> carteJouable = new ArrayList<Carte>();
    	for(int i=0; i<this.joueur.hand.carte.size();i++) {
    		if(this.joueur.manche.pioche.carte.get(0).getType()==this.joueur.hand.carte.get(i).getType()||this.joueur.manche.pioche.carte.get(0).getNumero()==this.joueur.hand.carte.get(i).getNumero()||this.joueur.hand.carte.get(i) instanceof Commande) {
    			carteJouable.add(this.joueur.hand.carte.get(i));
    		}
    	}
    	if(!carteJouable.isEmpty()) {
        	for(int i=0; i<carteJouable.size();i++) {
        		if(poids<carteJouable.get(i).getPoids()) {
        			poids = carteJouable.get(i).getPoids();
        			carteajouer=carteJouable.get(i);
        		}
        	this.joueur.jouerCarte(carteajouer);
        	}
    	}else{
    		if(Math.random()<0.2) {
            	for(int i=0; i<carteJouable.size();i++) {
            		if(poids<carteJouable.get(i).getPoids()) {
            			poids = carteJouable.get(i).getPoids();
            			carteajouer=carteJouable.get(i);
            		}
            	this.joueur.jouerCarte(carteajouer);
            	}
    		}else {
    			this.joueur.manche.pioche.distribuerCarte(1, this.joueur);
    		}
    	}
    }

    SituationIA getSituation() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.situation;
    }

    void setSituation(SituationIA value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.situation = value;
    }

	public IA(Joueur joueur) {
		this.situation = SituationIA.Normale;
		this.joueur = joueur;
	}

	public static void main(String[] args ) {
    	
    }

}
