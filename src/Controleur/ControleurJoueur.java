package Controleur;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Modele.*;
import Vue.*;

public class ControleurJoueur {
	
	public boolean aFini=false;
	
	public JButton SignalerDerniereCarte; 
	public JButton DenoncerDerniereCarte; 
	public JButton DenoncerMauvaiseCarte; 
	public JPanel Tatamis; 
	public JPanel Pioche; 
	public JPanel Joueur;
	Manche M;

	public ControleurJoueur(JButton SignalerDerniereCarte, JButton DenoncerDerniereCarte, JButton DenoncerMauvaiseCarte, final JPanel Tatamis, final JPanel Pioche, final JPanel Joueur, final Manche M){
		this.SignalerDerniereCarte = SignalerDerniereCarte;
		this.DenoncerDerniereCarte = DenoncerDerniereCarte;
		this.DenoncerMauvaiseCarte = DenoncerMauvaiseCarte;
		this.Tatamis = Tatamis;
		this.Pioche = Pioche;
		this.Joueur = Joueur;
		this.M = M;
	}
	
	public void controle(){
		
	SignalerDerniereCarte.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent arg0) {
			M.joueur.get(0).signalerDerniereCarte();
			System.out.println("Signale");
		}
	});
	
	DenoncerDerniereCarte.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			M.joueur.get(0).denoncerDCarte(M.getHistorique().get(0));
		}
	});
	
	DenoncerMauvaiseCarte.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			M.joueur.get(0).denoncerMCarte(M.getHistorique().get(0));
		}
	});
	
	for (int i=0;i<M.partie.joueur.size();i++){
		if(M.partie.joueur.get(i).isEtatActif()==true || M.partie.joueur.get(i).isTypePhysique()==true){
			int i1=i;
		}
		
	if(M.joueur.get(i) instanceof IA){				// Cas IA Actif
		M.joueur.get(i).jouer();

		M.joueurSuivant(M.tatamis.carte.get(0),M.joueur.get(i));
		
		System.out.println(M.tatamis.carte);
		
		
		
	}
	else{											// Cas Joueur Physique Actif
		
		// Cas clique sur Pioche
		
		if(Pioche.getComponent(0) instanceof JButton){
			JButton J = (JButton) Pioche.getComponent(0);
			J.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				M.joueur.get(0).piocher();
				Joueur.add(new CarteG(M.joueur.get(0).hand.carte.get(M.joueur.get(0).hand.carte.size()-1).getNumero(),M.joueur.get(0).hand.carte.get(M.joueur.get(0).hand.carte.size()-1).getType()));
				Pioche.remove(Pioche.getComponent(0));
				System.out.println("Component to remove in Pioche: " + Pioche.getComponent(0));
			}
		});
	}
		// Cas clique sur un bouton de sa main
		
		for(int i2=0;i2<M.joueur.get(0).hand.carte.size();i2++){
		if(Joueur.getComponent(i) instanceof JButton){
			final JButton J = (JButton) Joueur.getComponent(i2);
			final Carte C = M.joueur.get(0).hand.carte.get(i2);
			J.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				M.joueur.get(0).jouerCarte(C);
				Tatamis.remove(new CarteG(M.tatamis.carte.get(0).getNumero(),M.tatamis.carte.get(0).getType()));
				Tatamis.add(J);
				Tatamis.remove(Tatamis.getComponent(0));
				System.out.println("Component to remove in Tatamis: " + Tatamis.getComponent(0));
				Joueur.remove(J);
				
			}
		});
	}
		}
		
		M.joueurSuivant(M.tatamis.carte.get(0),M.joueur.get(i));
	}
	
	}
}
	}
	