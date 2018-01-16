package Controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Modele.*;
import Vue.*;

public class ControleurJoueur {

	public JButton SignalerDerniereCarte;
	public JButton DenoncerDerniereCarte;
	public JButton DenoncerMauvaiseCarte;
	public JLayeredPane Tatamis;
	public JLayeredPane Pioche;
	public JTabbedPane Joueur;
	public int iA = 0;
	Manche M;

	public ControleurJoueur(JButton SignalerDerniereCarte, JButton DenoncerDerniereCarte, JButton DenoncerMauvaiseCarte,
			final JLayeredPane Tatamis, final JLayeredPane Pioche, final JTabbedPane Joueur, final Manche M) {
		this.SignalerDerniereCarte = SignalerDerniereCarte;
		this.DenoncerDerniereCarte = DenoncerDerniereCarte;
		this.DenoncerMauvaiseCarte = DenoncerMauvaiseCarte;
		this.Tatamis = Tatamis;
		this.Pioche = Pioche;
		this.Joueur = Joueur;
		this.M = M;

		SignalerDerniereCarte.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				M.joueur.get(0).signalerDerniereCarte();
				System.out.println("" + M.joueur.get(0).getNom() + " Signale derniere carte");
			}
		});

		DenoncerDerniereCarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (M.getHistorique().size() != 0) {
					M.joueur.get(0).denoncerDCarte(M.getHistorique().get(0));
					System.out.println("" + M.joueur.get(0).getNom() + " dénonce " + M.getHistorique().get(0).getNom()
							+ " (derniere carte)");
				}
			}
		});

		DenoncerMauvaiseCarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (M.getHistorique().size() != 0) {
					M.joueur.get(0).denoncerMCarte(M.getHistorique().get(0));
					System.out.println("" + M.joueur.get(0).getNom() + " dénonce" + M.getHistorique().get(0).getNom()
							+ " (Mauvaise carte)");
				}
			}
		});
		JButton J = (CarteG) Pioche.getComponent(0);
		for (ActionListener act : J.getActionListeners()) {
			J.removeActionListener(act);
		}
		J.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (M.joueur.get(0).isEtatActif()) {
					M.joueur.get(0).piocher();
				}
			}
		});
		int i2 = 0;
		for (i2 = 0; i2 < M.joueur.get(0).hand.carte.size(); i2++) {
			if (Joueur.getComponent(i2) instanceof JButton) {
				final JButton J2 = (CarteG) Joueur.getComponent(i2);
				for (ActionListener act : J2.getActionListeners()) {
					J2.removeActionListener(act);
				}
				final Carte C = M.joueur.get(0).hand.carte.get(i2);
				J2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (M.joueur.get(0).isEtatActif()) {
							M.joueur.get(0).jouerCarte(C);
							M.joueurSuivant(C, M.joueur.get(0));

						}
					}
				});
			}
		}
	}

	public void donnerListener() {

		int i2 = 0;
		for (i2 = 0; i2 < M.joueur.get(0).hand.carte.size(); i2++) {
			if (Joueur.getComponent(i2) instanceof JButton) {
				final JButton J2 = (CarteG) Joueur.getComponent(i2);
				for (ActionListener act : J2.getActionListeners()) {
					J2.removeActionListener(act);
				}
				final Carte C = M.joueur.get(0).hand.carte.get(i2);
				J2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (M.joueur.get(0).isEtatActif()) {
							M.joueur.get(0).jouerCarte(C);
							M.joueurSuivant(C, M.joueur.get(0));

						}
					}
				});
			}
		}
	}
}
