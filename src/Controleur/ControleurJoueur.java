package Controleur;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import Modele.*;
import Vue.*;

public class ControleurJoueur {
	
	final boolean aFini=false;
	
	public JButton SignalerDerniereCarte; 
	public JButton DenoncerDerniereCarte; 
	public JButton DenoncerMauvaiseCarte; 
	public JLayeredPane Tatamis; 
	public JLayeredPane Pioche; 
	public JTabbedPane Joueur;
	public int iA=0;
	Manche M;

	public ControleurJoueur(JButton SignalerDerniereCarte, JButton DenoncerDerniereCarte, JButton DenoncerMauvaiseCarte, final JLayeredPane Tatamis, final JLayeredPane Pioche, final JTabbedPane Joueur, final Manche M){
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
				
				JButton J = (CarteG) Pioche.getComponent(0);
				Joueur.add(J);
				Joueur.repaint();
				Pioche.remove(J);
				Pioche.repaint();
				((CarteG) Joueur.getComponent(Joueur.getComponents().length-1)).retourner();
				System.out.println("Component to remove in Pioche: " + J);
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
					JButton J = (CarteG) Pioche.getComponent(j);
					
					Joueur.add(J);
					Joueur.repaint();
					Pioche.remove(J);
					Pioche.repaint();
					((CarteG) Joueur.getComponent(Joueur.getComponents().length-1)).retourner();
					System.out.println("Component to remove in Pioche: " + J);
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
					JButton J = (CarteG) Pioche.getComponent(j);
					Joueur.add(J);
					Joueur.repaint();
					Pioche.remove(J);
					Pioche.repaint();
					((CarteG) Joueur.getComponent(Joueur.getComponents().length-1)).retourner();
					System.out.println("Component to remove in Pioche: " + J);
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
		if(M.partie.joueur.get(i).isEtatActif()==true /*|| M.partie.joueur.get(i).isTypePhysique()==true*/){
			iA=i;
		}
		
		System.out.println("Joueur actif : " + M.joueur.get(iA));
		
	if(M.joueur.get(iA) instanceof IA){				// Cas IA Actif
		
		
		int poids = -100;
		Carte carteajouer=null;
		int i11=0;
		
		//if(M.getHistorique().size()!=0){M.joueur.get(iA).jouer();}

		int n = M.joueur.get(iA).hand.carte.size();     // Comptage du nombre de cartes initial

		M.joueur.get(iA).signalerDerniereCarte(); // Signale DCarte en background si 1 restante
		
		
		if(!M.joueur.get(iA).getAnnonceDerniereCarte()==true){  // Execution graphique si changement de lattribut annoncederniereCarte dans le modele
		}
		
		else {
			System.out.println(""+M.joueur.get(i).getNom()+" Signale derniere carte");
			JOptionPane jop1 = new JOptionPane();
			jop1.showMessageDialog(null, " Derniere Carte joueur " + M.joueur.get(iA).getNom() + "", "Information", JOptionPane.INFORMATION_MESSAGE);
			}
		
		n = M.joueur.get(iA).hand.carte.size();
		
		
	
		if(Math.random()>0.2 && M.getHistorique().size()!=0){		// 20% de chance de denoncer Mauvaise carte


		M.joueur.get(iA).denoncerMCarte(M.joueur.get(iA).manche.getHistorique().get(0)); // Ligne Modele executee
			
		if(M.joueur.get(iA).hand.carte.size()>n){
			for(int j=0;j<3;j++){
				JButton J = (CarteG) Pioche.getComponent(j);
				if(M.getHistorique().get(0).getNumeroJoueur()!=0){M.getHistorique().get(0).panel.add(J);}
				else{Joueur.add(J);
				Joueur.repaint();}
				Pioche.remove(J);
				Pioche.repaint();
				System.out.println("Component to remove in Pioche: " + J);
				//Boîte du message d'information
				}
				JOptionPane jop1 = new JOptionPane();
				jop1.showMessageDialog(null, "Bien Vu " + M.joueur.get(iA) + " !", "Bravo", JOptionPane.INFORMATION_MESSAGE);
				}
			
			else {
				}
	}
		ArrayList<Carte> carteJouable = new ArrayList<Carte>();
		for(i11=0; i11<M.joueur.get(iA).hand.carte.size();i11++) {
			if(M.tatamis.getType()==M.joueur.get(iA).hand.carte.get(i11).getType()||M.tatamis.getNumero()==M.joueur.get(iA).hand.carte.get(i11).getNumero()||M.joueur.get(iA).hand.carte.get(i11) instanceof Commande || (M.tatamis.getType()==TypCarte.Pique && M.joueur.get(iA).hand.carte.get(i11).getType()==TypCarte.JN) || (M.tatamis.getType()==TypCarte.Trefle && M.joueur.get(iA).hand.carte.get(i11).getType()==TypCarte.JN) || (M.tatamis.getType()==TypCarte.Coeur && M.joueur.get(iA).hand.carte.get(i11).getType()==TypCarte.JR) || (M.tatamis.getType()==TypCarte.Carreau && M.joueur.get(iA).hand.carte.get(i11).getType()==TypCarte.JR)) {
				carteJouable.add(M.joueur.get(iA).hand.carte.get(i11));
			}
		}
		if(!carteJouable.isEmpty()) {				// Jouer une carte jouable Si possibilité de jouer
			for(i11=0; i11<carteJouable.size();i11++) {
				if(poids<carteJouable.get(i11).getPoids()) {
					poids = carteJouable.get(i11).getPoids();
					carteajouer=carteJouable.get(i11);
				}
			}
			M.joueur.get(iA).jouerCarte(carteajouer);	// Modele
			
			// Graphique :
			
			//JButton J = (CarteG) new CarteG(carteajouer.getNumero(),carteajouer.getType(),M.joueur.get(iA).panel);
			JButton J = (CarteG) M.joueur.get(iA).panel.getComponent(i11);
			M.joueur.get(iA).panel.remove(J);
			M.joueur.get(iA).panel.repaint();
			Tatamis.add(J, 0);
			((CarteG) Tatamis.getComponent(0)).retourner();
			Tatamis.repaint();
	
	}

		else{
			if(Math.random()<0.2) {			// 20% de chance de bluffer
				for(i11=0; i11<M.joueur.get(iA).hand.carte.size();i11++) {
					if(poids<M.joueur.get(iA).hand.carte.get(i11).getPoids()) {
						poids = M.joueur.get(iA).hand.carte.get(i11).getPoids();
						carteajouer=M.joueur.get(iA).hand.carte.get(i11);
					}
				}
				M.joueur.get(iA).jouerCarte(carteajouer);  // Modele
				System.out.println("Carte à jouer de " +M.joueur.get(iA)+" : " +carteajouer+"");
				//Graphique :
				
				//JButton J = (CarteG) new CarteG(carteajouer.getNumero(),carteajouer.getType(),M.joueur.get(iA).panel);
				JButton J = (CarteG) M.joueur.get(iA).panel.getComponent(i11);
				M.joueur.get(iA).panel.remove(J);
				M.joueur.get(iA).panel.repaint();
				Tatamis.add(J, 0);
				((CarteG) Tatamis.getComponent(0)).retourner();
				Tatamis.repaint();

			}else {					// Sinon pioche
				M.joueur.get(iA).manche.pioche.distribuerCarte(1, M.joueur.get(iA)); // Modele
				
				//Graphique : 
				JButton J = (CarteG) Pioche.getComponent(0);
				M.joueur.get(iA).panel.add(J);
				M.joueur.get(iA).panel.repaint();
				Pioche.remove(J);
				Pioche.repaint();
			}
		}
		
		
		M.joueurSuivant(M.joueur.get(iA).manche.tatamis.carte.get(0),M.joueur.get(iA));  // Passage au joueur suivant
		
		int iB=0;
		int iC=0;
		for (iC=0;iC<M.partie.joueur.size();iC++){
			if(M.partie.joueur.get(iC).isEtatActif()==true /*|| M.partie.joueur.get(i).isTypePhysique()==true*/){
				iB=iC;
			}
		}
		
		iA=iB;
			System.out.println("Joueur actif après tour "+M.joueur.get(iA)+" : " + M.joueur.get(iB));
	
		}
			
		
	
	else{											// Cas Joueur Physique Actif
		
		
		// Cas clique sur Pioche
		
		if(Pioche.getComponent(0) instanceof JButton){
			final JButton J = (CarteG) Pioche.getComponent(0);
			J.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				M.joueur.get(0).piocher();
				
				Joueur.add((CarteG) J);
				Joueur.repaint();
				Pioche.remove((CarteG) J);
				Pioche.repaint();
				if(M.joueur.get(0).hand.carte.size()>=1){((CarteG) Joueur.getComponent(Joueur.getComponents().length-1)).retourner();}
				System.out.println("Component to remove in Pioche: " + J);
				M.joueur.get(0).setaFini(true);
				if(M.joueur.get(0).isaFini()== true){M.joueurSuivant(M.tatamis.carte.get(0),M.joueur.get(0));}
				System.out.println("Tatamis : " + M.tatamis.carte);
				int iB=0;
				int iC=0;
				for (iC=0;iC<M.partie.joueur.size();iC++){
					if(M.partie.joueur.get(iC).isEtatActif()==true /*|| M.partie.joueur.get(i).isTypePhysique()==true*/){
						iB=iC;
					}
				}
				iA=iB;
					System.out.println("Joueur actif après Pioche JPhysique: " + M.joueur.get(iB));
			}
			
		});
	}
		// Cas clique sur un bouton de sa main
		
		for(int i2=0;i2<M.joueur.get(0).hand.carte.size();i2++){
		if(Joueur.getComponent(i2) instanceof JButton){
			final JButton J = (CarteG) Joueur.getComponent(i2);
			final Carte C = M.joueur.get(0).hand.carte.get(i2);
			J.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				M.joueur.get(0).jouerCarte(C);
				J.setBounds(20, 20, 80, 120);
				//Tatamis.remove(new CarteG(M.tatamis.carte.get(0).getNumero(),M.tatamis.carte.get(0).getType(), Tatamis));
				Tatamis.add(J, 0);
				Tatamis.repaint();
				//Tatamis.remove(Tatamis.getComponent(0));
				//System.out.println("Component to remove in Tatamis: " + Tatamis.getComponent(0));
				Joueur.remove(J);
				Joueur.repaint();
				M.joueur.get(0).setaFini(true);
				if(M.joueur.get(0).isaFini()== true){M.joueurSuivant(C,M.joueur.get(0));}
				System.out.println("Tatamis : " + M.tatamis.carte);
				int iB=0;
				int iC=0;
				for (iC=0;iC<M.partie.joueur.size();iC++){
					if(M.partie.joueur.get(iC).isEtatActif()==true /*|| M.partie.joueur.get(i).isTypePhysique()==true*/){
						iB=iC;
					}
				}
					iA=iB;
					System.out.println("Joueur actif après jeu JPhysique : " + M.joueur.get(iB));
			}
		});
	}

		}
		
		
	}
	
	}
}
	}
	