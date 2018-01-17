package Vue;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.*;

import Modele.*;
import Controleur.*;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FenetreJeu implements Observer { // Fenetre de jeu

	private JFrame frame;
	private Partie Partie;
	private Manche Manche;
	private Variante Variante;
	// permet de savoir si la manche vient d'être lancé
	private boolean etatLancement = true;

	JButton DenoncerDerniereCarte;
	JButton DenoncerMauvaiseCarte;
	JButton SignalerDerniereCarte;
	JLabel Tatamis;

	JLayeredPane IA_7;
	JLayeredPane IA_6;
	JLayeredPane IA_5;
	JLayeredPane IA_4;
	JLayeredPane IA_3;
	JLayeredPane IA_2;
	JLayeredPane IA_1;
	JTabbedPane Joueur;
	private JLayeredPane tatamis;
	private JLayeredPane pioche;
	private JLabel lblTatamis;

	// controllers
	ControleurJoueur Cj;
	ControleurPioche Cpi;
	ControleurVariante Cv;

	public boolean getEtatLancement() {
		return this.etatLancement;
	}

	public void setEtatLancement(boolean o) {
		this.etatLancement = o;
	}

	public JFrame getFrame() {
		return this.frame;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Partie Partie = new Partie();
					Variante Variante = new Variante(1, TypVariante.Minimale);
					Manche Manche = new Manche(Variante, Partie);

					if (Manche.joueur.size() == 0) { // Creation Options par defaut

						Manche.joueur.add(new Joueur("Test", 1, null));
						Manche.joueur.add(new IA("Test", 2, null));

						Joueur[] Joueurs = new Joueur[2];
						Joueurs[0] = new Joueur("Test", 1, null);
						Joueurs[1] = new Joueur("Test", 1, null);

						Hand Main1 = new Hand(Joueurs[0]);
						Manche.joueur.get(0).setHand(Main1);
						Hand Main2 = new Hand(Joueurs[1]);
						Manche.joueur.get(1).setHand(Main2);

						Manche.setNbJoueurs(Manche.joueur.size());
						Manche.joueur.get(0).setEtatActif(true);
						Manche.joueur.get(0).setTypePhysique(true);
						Manche.joueur.get(0).setManche(Manche);

						Manche.joueur.get(1).setEtatActif(false);
						Manche.joueur.get(1).setTypePhysique(false);
						Manche.joueur.get(1).setManche(Manche);

					}

					FenetreJeu window = new FenetreJeu(Partie, Manche, Variante);
					window.frame.setVisible(true);

					window.update(Manche, window);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}

	/**
	 * Create the application.
	 */
	public FenetreJeu(Partie P, Manche M, Variante V) {
		initialize(P, M, V);

		// La fenêtre graphique Observe la Partie, la Manche et la Variante
		this.Partie = P;
		this.Manche = M;
		this.Variante = V;

		for (int i = 0; i < this.Manche.getJoueur().size(); i++) {
			this.Manche.joueur.get(i).addObserver(this);

		}
		this.Variante.addObserver(this);
		this.Manche.addObserver(this);
		this.Partie.addObserver(this);
		this.Manche.pioche.addObserver(this);
		this.Manche.tatamis.addObserver(this);

		Cv = new ControleurVariante(pioche, this.Manche, tatamis, this);
		Cpi = new ControleurPioche(pioche, tatamis, Joueur, IA_1, IA_2, IA_3, IA_4, IA_5, IA_6, IA_7, this,
				this.Manche);
		Cj = new ControleurJoueur(SignalerDerniereCarte, DenoncerDerniereCarte, DenoncerMauvaiseCarte, tatamis, pioche,
				Joueur, this.Manche);

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Partie P, Manche M, Variante V) {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 1400, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setLayout(null);

		Joueur = new JTabbedPane();
		Joueur.setBounds(374, 557, 453, 155);
		frame.getContentPane().add(Joueur);
		Joueur.setBackground(Color.WHITE);

		tatamis = new JLayeredPane();
		tatamis.setBounds(593, 268, 126, 147);
		frame.getContentPane().add(tatamis);

		lblTatamis = new JLabel("Tatamis");
		lblTatamis.setBounds(631, 426, 46, 14);
		frame.getContentPane().add(lblTatamis);

		pioche = new JLayeredPane();
		pioche.setBounds(443, 268, 126, 147);
		frame.getContentPane().add(pioche);

		JLabel lblPioche = new JLabel("Pioche");
		lblPioche.setBounds(497, 426, 46, 14);
		frame.getContentPane().add(lblPioche);

		frame.getContentPane().add(tatamis);

		SignalerDerniereCarte = new JButton("Signaler Derniere Carte");
		SignalerDerniereCarte.setBounds(510, 523, 151, 23);
		frame.getContentPane().add(SignalerDerniereCarte);

		DenoncerDerniereCarte = new JButton("Denoncer Derniere carte");
		DenoncerDerniereCarte.setBounds(855, 584, 182, 23);
		frame.getContentPane().add(DenoncerDerniereCarte);

		DenoncerMauvaiseCarte = new JButton("Denoncer Mauvaise carte");
		DenoncerMauvaiseCarte.setBounds(855, 610, 183, 23);
		frame.getContentPane().add(DenoncerMauvaiseCarte);

		if (M.joueur.size() == 2) {

			IA_1 = new JLayeredPane();
			IA_1.setBackground(Color.WHITE);
			IA_1.setBounds(480, 11, 406, 103);
			frame.getContentPane().add(IA_1);

		} else if (M.joueur.size() == 3) {

			IA_6 = new JLayeredPane();
			IA_6.setBackground(Color.WHITE);
			IA_6.setBounds(22, 219, 99, 192);
			frame.getContentPane().add(IA_6);

			IA_3 = new JLayeredPane();
			IA_3.setBackground(Color.WHITE);
			IA_3.setBounds(1236, 219, 99, 192);
			frame.getContentPane().add(IA_3);

		} else if (M.joueur.size() == 4) {
			IA_7 = new JLayeredPane();
			IA_7.setBackground(Color.WHITE);
			IA_7.setBounds(185, 422, 99, 192);
			frame.getContentPane().add(IA_7);

			IA_6 = new JLayeredPane();
			IA_6.setBackground(Color.WHITE);
			IA_6.setBounds(22, 219, 99, 192);
			frame.getContentPane().add(IA_6);

			IA_3 = new JLayeredPane();
			IA_3.setBackground(Color.WHITE);
			IA_3.setBounds(1236, 219, 99, 192);
			frame.getContentPane().add(IA_3);

			IA_1 = new JLayeredPane();
			IA_1.setBackground(Color.WHITE);
			IA_1.setBounds(480, 11, 406, 103);
			frame.getContentPane().add(IA_1);

		} else if (M.joueur.size() == 5) {
			IA_7 = new JLayeredPane();
			IA_7.setBackground(Color.WHITE);
			IA_7.setBounds(185, 422, 99, 192);
			frame.getContentPane().add(IA_7);

			IA_5 = new JLayeredPane();
			IA_5.setBackground(Color.WHITE);
			IA_5.setBounds(187, 26, 99, 192);
			frame.getContentPane().add(IA_5);

			IA_4 = new JLayeredPane();
			IA_4.setBackground(Color.WHITE);
			IA_4.setBounds(1084, 396, 99, 192);
			frame.getContentPane().add(IA_4);

			IA_2 = new JLayeredPane();
			IA_2.setBackground(Color.WHITE);
			IA_2.setBounds(1067, 11, 99, 192);
			frame.getContentPane().add(IA_2);

		} else if (M.joueur.size() == 6) {
			IA_7 = new JLayeredPane();
			IA_7.setBackground(Color.WHITE);
			IA_7.setBounds(185, 422, 99, 192);
			frame.getContentPane().add(IA_7);

			IA_5 = new JLayeredPane();
			IA_5.setBackground(Color.WHITE);
			IA_5.setBounds(187, 26, 99, 192);
			frame.getContentPane().add(IA_5);

			IA_4 = new JLayeredPane();
			IA_4.setBackground(Color.WHITE);
			IA_4.setBounds(1084, 396, 99, 192);
			frame.getContentPane().add(IA_4);

			IA_2 = new JLayeredPane();
			IA_2.setBackground(Color.WHITE);
			IA_2.setBounds(1067, 11, 99, 192);
			frame.getContentPane().add(IA_2);

			IA_1 = new JLayeredPane();
			IA_1.setBackground(Color.WHITE);
			IA_1.setBounds(480, 11, 406, 103);
			frame.getContentPane().add(IA_1);

		}

		else if (M.joueur.size() == 0) {
			IA_7 = new JLayeredPane();
			IA_7.setBackground(Color.WHITE);
			IA_7.setBounds(185, 422, 99, 192);
			frame.getContentPane().add(IA_7);

			IA_6 = new JLayeredPane();
			IA_6.setBackground(Color.WHITE);
			IA_6.setBounds(22, 219, 99, 192);
			frame.getContentPane().add(IA_6);

			IA_5 = new JLayeredPane();
			IA_5.setBackground(Color.WHITE);
			IA_5.setBounds(187, 26, 99, 192);
			frame.getContentPane().add(IA_5);

			IA_4 = new JLayeredPane();
			IA_4.setBackground(Color.WHITE);
			IA_4.setBounds(1084, 396, 99, 192);
			frame.getContentPane().add(IA_4);

			IA_3 = new JLayeredPane();
			IA_3.setBackground(Color.WHITE);
			IA_3.setBounds(1236, 219, 99, 192);
			frame.getContentPane().add(IA_3);

			IA_2 = new JLayeredPane();
			IA_2.setBackground(Color.WHITE);
			IA_2.setBounds(1067, 11, 99, 192);
			frame.getContentPane().add(IA_2);

			IA_1 = new JLayeredPane();
			IA_1.setBackground(Color.WHITE);
			IA_1.setBounds(480, 11, 406, 103);
			frame.getContentPane().add(IA_1);

		}

	}

	// update utilisé pour observer les éléments du modèle
	public void update(Observable instanceObservable, Object arg1) {

		if (instanceObservable instanceof Pioche) {

			List<Object> tab = (ArrayList<Object>) arg1;
			// action graphique en cas de pioche
			if ((int) tab.get(0) == 1) {
				JButton J = (CarteG) pioche.getComponent(0);
				Joueur joue = (Joueur) tab.get(1);

				if (joue.isTypePhysique()) {
					Joueur.add(J);
					Joueur.repaint();
					pioche.remove(J);
					pioche.repaint();
					((CarteG) Joueur.getComponent(Joueur.getComponents().length - 1)).retourner();
					for (ActionListener act : J.getActionListeners()) {
						J.removeActionListener(act);
					}
					Cj.donnerListener();

				} else {
					joue.panel.add(J);
					joue.panel.repaint();
					pioche.remove(J);
					pioche.repaint();

					for (ActionListener act : J.getActionListeners()) {
						J.removeActionListener(act);
					}
				}

				JButton J2 = (CarteG) pioche.getComponent(0);
				J2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (Manche.joueur.get(0).isEtatActif()) {
							Manche.joueur.get(0).piocher();
						}
					}
				});
			}
			// action graphique action en cas de reconsitution de la pioche
			if ((int) tab.get(0) == 2) {
				List<Carte> piocheRecup = (List<Carte>) tab.get(1);
				int i = 0;
				while (tatamis.getComponents().length > 1) {
					tatamis.remove(tatamis.getComponent(1));
					i++;
				}
				i = 0;
				while (i < piocheRecup.size()) {
					CarteG carteg = new CarteG(piocheRecup.get(i).getNumero(), piocheRecup.get(i).getType(), pioche);
					pioche.add(carteg, i + 1);
					pioche.repaint();
					((CarteG) pioche.getComponent(i + 1)).retourner();
					CarteG J2 = (CarteG) pioche.getComponent(i + 1);
					J2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (Manche.joueur.get(0).isEtatActif()) {
								Manche.joueur.get(0).piocher();
							}
						}
					});
					i++;
				}
			}
		}

		if (instanceObservable instanceof Joueur) {
			List<Object> tab = (ArrayList) arg1;
			// action graphique si une carte est joué
			if ((int) tab.get(0) == 1) {
				Carte carte = (Carte) tab.get(2);
				Joueur jouer = (Joueur) tab.get(1);

				int i = 0;
				int ic = 0;

				CarteG carteg = null;
				if (jouer instanceof IA) {
					for (i = 0; i < jouer.panel.getComponents().length; i++) {
					}
					for (i = 0; i < jouer.panel.getComponents().length; i++) {
						carteg = (CarteG) jouer.panel.getComponent(i);
						if (carte.getNumero() == carteg.getNumero() && carte.getType() == carteg.getType()) {
							ic = i;
						}
					}
					carteg = (CarteG) jouer.panel.getComponent(ic);
				} else {
					for (i = 0; i < jouer.hand.carte.size(); i++) {
						carteg = (CarteG) Joueur.getComponent(i);
						if (carte.getNumero() == carteg.getNumero() && carte.getType() == carteg.getType()) {
							ic = i;
						}
					}
					carteg = (CarteG) Joueur.getComponent(ic);
				}

				carteg.setBounds(20, 20, 80, 120);

				if (jouer.isTypePhysique()) {
					tatamis.add(carteg, 0);
					tatamis.repaint();
					Joueur.remove(carteg);
					Joueur.repaint();
					if (carte instanceof Commande) {
						String[] choix = { "Coeur", "Carreau", "Trèfle", "Pique" };
						int n = JOptionPane.showOptionDialog(null, "Selectionnez une couleur", "Choix couleur",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, choix, choix[3]);
						Commande com = (Commande) carte;
						com.appliquerPouvoir(Manche, n);
					}
				} else {
					tatamis.add(carteg, 0);
					((CarteG) tatamis.getComponent(0)).retourner();
					tatamis.repaint();
					jouer.panel.remove(carteg);
					jouer.panel.repaint();
				}

			}
			// action graphique si une dénonciation de dernière carte est faite
			if ((int) tab.get(0) == 2) {

				if ((boolean) tab.get(2)) {
					JOptionPane.showMessageDialog(null,
							"Bonne dénonciation de " + ((Joueur) tab.get(1)).getNom() + "(derniere carte)",
							"Information", JOptionPane.INFORMATION_MESSAGE);
				} else {
					if (((Joueur) tab.get(1)).isTypePhysique()) {
						JOptionPane.showMessageDialog(null,
								"Mauvaise dénonciation de " + ((Joueur) tab.get(1)).getNom() + "(derniere carte)",
								"Information", JOptionPane.INFORMATION_MESSAGE);
					} else {

					}
				}
			}
			// action graphique si une mauvaise carte est dénoncé
			if ((int) tab.get(0) == 3) {

				if ((boolean) tab.get(2)) {
					JOptionPane.showMessageDialog(null,
							"Bonne dénonciation de " + ((Joueur) tab.get(1)).getNom() + "mauvaise carte", "Information",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					if (((Joueur) tab.get(1)).isTypePhysique()) {
						JOptionPane.showMessageDialog(null,
								"Mauvaise dénonciation de " + ((Joueur) tab.get(1)).getNom() + "mauvaise carte",
								"Information", JOptionPane.INFORMATION_MESSAGE);
					} else {

					}
				}
			}
			// action graphique si il y a l'annonce d'une dernirèe carte
			if ((int) tab.get(0) == 4) {
				JOptionPane.showMessageDialog(null,
						((Joueur) tab.get(1)).getNom() + " annonce n'avoir plus qu'une carte", "Information",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}

		// action graphique lorsqu'une carte est commande est choisie, permettant de savoir qu'est-ce qui a été choisi
		if (instanceObservable instanceof Tatamis) {
			JOptionPane.showMessageDialog(null, arg1 + " a été choisi", "Information", JOptionPane.INFORMATION_MESSAGE);
		}
		
		if (instanceObservable instanceof Manche) {
			// action graphique quand un joueur doit jouer
			if (arg1 instanceof Joueur) {
				Joueur joue = (Joueur) arg1;
				if (!joue.isTypePhysique()) {
					joue.jouer();
				}
			}
			// action graphique quand une manche est finie
			if (arg1 instanceof String) {
				String message = "";
				for (int i = 0; i < Partie.joueur.size(); i++) {
					message = message + Partie.joueur.get(i).getNom() + " score : " + Partie.joueur.get(i).getNbPoints()
							+ "";
				}
				JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE);
				final Main M2 = new Main();

				M2.setP(Partie);
				String[] variante = { "basique", "Monclar", "1", "Carte et Maou", "Des Ulis", "4", "5", "6",
						"Courte Amicale", "Man et resta" };

				int n = JOptionPane.showOptionDialog(null, "Selectionnez une variante", "Choix variante",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, variante, variante[9])
						+ 1;
				M2.setV(new Variante(1, TypVariante.Minimale));
				M2.setM(new Manche(M2.getV(), M2.getP()));
				M2.setV(M2.getM().choisirVariante(n));
				M2.getM().setJoueur(Partie.joueur);
				M2.setPi(new Pioche(M2.getM()));
				M2.setT(new Tatamis());
				for (int i = 0; i < Partie.joueur.size(); i++) {
					M2.getM().joueur.get(i).setHand(new Hand(Partie.joueur.get(i)));
					M2.getM().joueur.get(i).setaFini(false);

				}

				frame.setVisible(false);
				FenetreJeu window = new FenetreJeu(M2.getP(), M2.getM(), M2.getV());
				window.getFrame().setVisible(true);
				window.update(Manche, window);
			}
			// action graphique quand une partie est finie
			if (instanceObservable instanceof Partie) {
				JOptionPane.showMessageDialog(null, arg1 + " est le gagnant", "Information",
						JOptionPane.INFORMATION_MESSAGE);
			}

		}

	}
}
