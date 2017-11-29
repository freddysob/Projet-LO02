import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.List;
//import com.modeliosoft.modelio.javadesigner.annotations.objid;

//@objid ("a01dd153-c040-44b2-8be3-508863e3b0c0")
public class Manche {
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
    
    public Manche(int n, Variante variante, Partie partie, Tatamis t) {
    	boolean partieFinie=false;
    	for(int i=0; i<this.joueur.size(); i++) {
    		if(this.joueur.get(i).getNbPoints()>=this.partie.getPointsMax()){
    			partieFinie=true;
    		}
    	}
    	if(!partieFinie) {
    		this.sensJeuPos = true;
            this.joueur = new ArrayList<Joueur>();
            this.tatamis = t;
            this.pioche = new Pioche(this);
            this.variante = variante;
            this.partie = partie;
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
    List<Joueur> getJoueur() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.joueur;
    }

    //@objid ("9b54aa45-133c-4468-8cdc-513ac26380b6")
    void setJoueur(List<Joueur> value) {
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
    int getNbJoueurs() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbJoueurs;
    }

    //@objid ("45392d85-647f-4207-9a07-27779e0ff918")
    void setNbJoueurs(int value) {
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
    Variante getVariante() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.variante;
    }

    //@objid ("e409e2ce-2222-4319-bbf8-e8959e2145be")
    void setVariante(Variante value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.variante = value;
    }
    
    public Joueur joueurSuivant(Carte cartePose, Joueur actif) {
    	ArrayList<Joueur> temp = new ArrayList <Joueur>();
    	for(int i=0; i<this.joueur.size(); i++) {
    		temp.add(this.joueur.get(i));
    	}
    	ListIterator<Joueur> li= temp.listIterator();
    	Joueur joue = null;

    	if(cartePose instanceof Rejoueur && !actif.hand.carte.isEmpty()) {
    		while(li.hasNext()) {
    			joue = li.next();
    			if(joue.isEtatActif()) {
    				return(joue);
    			}
    		}
    	}
    	while(li.hasNext()) {
    		if(li.next().isaFini()) {
    			System.out.println("remove");
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
    	return(joue);
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
    		if (this.joueur.get(i).hand.carte.isEmpty()){
    			System.out.println("Un joueur a fini");
    			this.gagnants.add(this.joueur.get(i));
    			this.joueur.get(i).setaFini(true);
    			}
    	}
    			
    		}
    	else {
    		
    		o=true;
    		
    		System.out.println("Manche terminée.");

    		for(i=0; i<=this.joueur.size(); i++){
    			this.joueur.get(i).setaFini(false);
/*    			for(j=0; j<=this.joueur.get(i).hand.carte.size(); j++){
    				this.pioche.carte.add(this.joueur.get(i).hand.carte.get(j));
    				this.joueur.get(i).hand.carte.remove(j);
    			}
*/    		}
    		
    		// Attribution de points
        	for(i=0; i<=this.nbJoueurs; i++){
        		int r=0;
        		if (this.gagnants.indexOf(this.joueur.get(i))==1){
        			r=this.joueur.get(i).getNbPoints()+50;
        			this.joueur.get(i).setNbPoints(r);
        		}
        		else if (this.gagnants.indexOf(this.joueur.get(i))==1){
        			r=this.joueur.get(i).getNbPoints()+20;
        			this.joueur.get(i).setNbPoints(r);
        		}
        		else if (this.gagnants.indexOf(this.joueur.get(i))==1){
        			r=this.joueur.get(i).getNbPoints()+10;
        			this.joueur.get(i).setNbPoints(r);
        		}
        		else {
        			r=this.joueur.get(i).getNbPoints();
        			this.joueur.get(i).setNbPoints(r);
        		}
        	}
    		
    		this.pioche.reconstituer();
    		Collections.shuffle(this.pioche.carte);
    		this.pioche.distribuerCartesDebut(this.variante);
    	}
    	
    	//}
    	return o;
    }
    
    
	public static void main(String[] args ) {
    	
    }

    

}