package Modele;

import java.util.*;
import java.util.ArrayList;


//import com.modeliosoft.modelio.javadesigner.annotations.objid;

//@objid ("50a23012-b43d-47f5-b068-5836148a3eab")
public class Partie extends Observable{
    //@objid ("79e8229f-77de-4a75-97e1-fe3782043a6b")
    private Statut statut;

    //@objid ("3aeb1c27-a90e-4339-bd9f-581cad54cf90")
    private int nbJoueurs;

    //@objid ("6eb49448-5654-4cee-a87c-85f5c2848ab5")
    private int pointsMax;
    
    public List<Joueur> joueur = new ArrayList<Joueur> ();
    
    //@objid ("3a6cc269-d3b0-4156-b152-448097b00722")
    public Partie() {
    	this.statut=Statut.Encours;
    	this.nbJoueurs=0;
    	this.pointsMax=500;
    	this.joueur = new ArrayList<Joueur>();
    }
    
    public String toString(){
    	String s;
    	s="[ Partie -"+this.getStatut()+" - "+this.getNbJoueurs()+" joueurs]";            // Affiche par exemple : " [Partie en cours - 5 joueurs] "
    	return s;
    }

    //@objid ("c79240bb-532b-46d1-b5e9-ea335d555e76")
    protected void finalize() {
    }

    //@objid ("2487c473-f257-4846-84e2-49c1bb4738a4")
    public boolean verifierFinPartie() {
    	boolean s=true;
    	int i=0;
    		for(i=0; i<this.joueur.size(); i++){
    			if (this.joueur.get(i).getNbPoints()>=this.pointsMax){
    				System.out.println("Partie Terminée! Gagnant : "+ this.joueur.get(i).getNom());
    				s=false;
    			}
    	}
    	return s;
    }

    //@objid ("da96b06f-5564-45d8-98f0-57c6ec0b5ecb")
    Statut getStatut() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.statut;
    }

    //@objid ("b6a0884d-029a-46b7-9127-fde871d0c7cc")
    void setStatut(Statut value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.statut = value;
    }
    
    public List<Joueur> getJoueur() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.joueur;
    }

    //@objid ("9b54aa45-133c-4468-8cdc-513ac26380b6")
    void setJoueur(List<Joueur> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.joueur = value;
    }

    //@objid ("75a5c5d5-3faf-44e0-a3b2-50320be51a78")
    public int getNbJoueurs() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbJoueurs;
    }

    //@objid ("4a2daa86-d786-445f-bb31-55c2cc0d733d")
    public void setNbJoueurs(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbJoueurs = value;
    }

    //@objid ("b4118ff2-716e-42c2-aca0-834317e95d71")
    int getPointsMax() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.pointsMax;
    }

    //@objid ("4fd05dca-8a1f-4d54-9eea-c1ecf281691b")
    public void setPointsMax(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.pointsMax = value;
    }

    public static void main(String[] args ) {
    	
    }

}