package Controleur;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
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
	
		
	SignalerDerniereCarte.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent arg0) {
			int n = M.joueur.get(0).hand.carte.size();
			M.joueur.get(0).signalerDerniereCarte();
			System.out.println(""+M.joueur.get(0).getNom()+" Signale derniere carte");
			if(M.joueur.get(0).hand.carte.size()>n){
				
				JButton J = (JButton) Pioche.getComponent(0);
				Joueur.add(J);
				Pioche.remove(J);
				System.out.println("Component to remove in Pioche: " + Pioche.getComponent(0));
				//Boîte du message d'information
				
				JOptionPane jop1 = new JOptionPane();
				jop1.showMessageDialog(null, "Plus d'une carte restante", "Attention", JOptionPane.INFORMATION_MESSAGE);
				}
			
			else {
				JOptionPane jop1 = new JOptionPane();
				jop1.showMessageDialog(null, " Derniere Carte joueur " + M.joueur.get(0).getNom() + "", "Information", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
	
	
	DenoncerDerniereCarte.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			if(M.getHistorique().size()!=0){
				
				int j = 0;
				int n = M.joueur.get(0).hand.carte.size();
				M.joueur.get(0).denoncerDCarte(M.getHistorique().get(0));
				System.out.println(""+M.joueur.get(0).getNom()+" dénonce "+M.getHistorique().get(0).getNom()+" (derniere carte)");
				if(M.joueur.get(0).hand.carte.size()>n){
					for(j=0;j<3;j++){
					JButton J = (JButton) Pioche.getComponent(j);
					Joueur.add(J);
					Pioche.remove(J);
					System.out.println("Component to remove in Pioche: " + Pioche.getComponent(0));
					//Boîte du message d'information
					}
					JOptionPane jop1 = new JOptionPane();
					jop1.showMessageDialog(null, "Mauvaise denonciation", "Attention", JOptionPane.INFORMATION_MESSAGE);
					}
				
				else {
					JOptionPane jop1 = new JOptionPane();
					jop1.showMessageDialog(null, " Bien vu ! " + M.joueur.get(0).getNom() + "", "Information", JOptionPane.INFORMATION_MESSAGE);
					}
				}
		}
	});
	
	DenoncerMauvaiseCarte.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			if(M.getHistorique().size()!=0){
				//M.joueur.get(0).denoncerMCarte(M.getHistorique().get(0));
				
				int j = 0;
				int n = M.joueur.get(0).hand.carte.size();
				M.joueur.get(0).denoncerMCarte(M.getHistorique().get(0));
				System.out.println(""+M.joueur.get(0).getNom()+" dénonce"+M.getHistorique().get(0).getNom()+" (Mauvaise carte)");
				if(M.joueur.get(0).hand.carte.size()>n){
					for(j=0;j<3;j++){
					JButton J = (JButton) Pioche.getComponent(j);
					Joueur.add(J);
					Pioche.remove(J);
					System.out.println("Component to remove in Pioche: " + Pioche.getComponent(0));
					//Boîte du message d'information
					}
					JOptionPane jop1 = new JOptionPane();
					jop1.showMessageDialog(null, "Mauvaise denonciation", "Attention", JOptionPane.INFORMATION_MESSAGE);
					}
				
				else {
					JOptionPane jop1 = new JOptionPane();
					jop1.showMessageDialog(null, " Bien vu ! " + M.joueur.get(0).getNom() + "", "Information", JOptionPane.INFORMATION_MESSAGE);
					}
				}
		}
	});
	
	for (int i=0;i<M.partie.joueur.size();i++){
		if(M.partie.joueur.get(i).isEtatActif()==true || M.partie.joueur.get(i).isTypePhysique()==true){
			int i1=i;
		}
		
	if(M.joueur.get(i) instanceof IA){				// Cas IA Actif
		//M.joueur.get(i).jouer();

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
				Joueur.add(new CarteG(M.joueur.get(0).hand.carte.get(M.joueur.get(0).hand.carte.size()-1).getNumero(),M.joueur.get(0).hand.carte.get(M.joueur.get(0).hand.carte.size()-1).getType(), Joueur));
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
				Tatamis.remove(new CarteG(M.tatamis.carte.get(0).getNumero(),M.tatamis.carte.get(0).getType(), Tatamis));
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
	