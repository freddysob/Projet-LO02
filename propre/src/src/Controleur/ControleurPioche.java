package Controleur;

import javax.swing.*;

import Modele.*;
import Vue.*;

public class ControleurPioche {

	private int i=0;

	public ControleurPioche(JLayeredPane Pioche, JLayeredPane Tatamis, JTabbedPane Joueur, JLayeredPane IA1,
			JLayeredPane IA2, JLayeredPane IA3, JLayeredPane IA4, JLayeredPane IA5, JLayeredPane IA6, JLayeredPane IA7,
			FenetreJeu fenetre, Manche M) {

		if (fenetre.getEtatLancement() && i == 0) {

			M.pioche.distribuerCartesDebut(M.getVariante());

			if (M.joueur.size() == 2) {
				for (int i = 0; i < M.joueur.size(); i++) {
					for (int j = 0; j < M.joueur.get(i).hand.carte.size(); j++) {
						CarteG J = (CarteG) Pioche.getComponent(0);
						if (M.joueur.get(i) instanceof IA) {
							M.joueur.get(i).panel = IA1;
							M.joueur.get(i).panel.add(J);
							Pioche.remove(J);
						} else {
							Joueur.add(J);
							((CarteG) Joueur.getComponent(Joueur.getComponents().length - 1)).retourner();
							Pioche.remove(J);
						}
					}
				}
			} else if (M.joueur.size() == 3) {
				for (int i = 0; i < M.joueur.size(); i++) {
					for (int j = 0; j < M.joueur.get(i).hand.carte.size(); j++) {
						CarteG J = (CarteG) Pioche.getComponent(0);
						if (M.joueur.get(i) instanceof IA && i == 1) {

							M.joueur.get(i).panel = IA3;
							M.joueur.get(i).panel.add(J);
							Pioche.remove(J);
						} else if (M.joueur.get(i) instanceof IA && i == 2) {

							M.joueur.get(i).panel = IA6;
							M.joueur.get(i).panel.add(J);
							Pioche.remove(J);
						} else {
							Joueur.add(J);
							((CarteG) Joueur.getComponent(Joueur.getComponents().length - 1)).retourner();
							Pioche.remove(J);
						}
					}
				}
			} else if (M.joueur.size() == 4) {
				for (int i = 0; i < M.joueur.size(); i++) {
					for (int j = 0; j < M.joueur.get(i).hand.carte.size(); j++) {
						CarteG J = (CarteG) Pioche.getComponent(0);
						if (M.joueur.get(i) instanceof IA && i == 1) {

							M.joueur.get(i).panel = IA1;
							M.joueur.get(i).panel.add(J);
							Pioche.remove(J);
						} else if (M.joueur.get(i) instanceof IA && i == 2) {

							M.joueur.get(i).panel = IA3;
							M.joueur.get(i).panel.add(J);
							Pioche.remove(J);
						} else if (M.joueur.get(i) instanceof IA && i == 3) {

							M.joueur.get(i).panel = IA6;
							M.joueur.get(i).panel.add(J);
							Pioche.remove(J);
						} else {
							Joueur.add(J);
							((CarteG) Joueur.getComponent(Joueur.getComponents().length - 1)).retourner();
							Pioche.remove(J);
						}
					}
				}
			} else if (M.joueur.size() == 5) {
				for (int i = 0; i < M.joueur.size(); i++) {
					for (int j = 0; j < M.joueur.get(i).hand.carte.size(); j++) {
						CarteG J = (CarteG) Pioche.getComponent(0);
						if (M.joueur.get(i) instanceof IA && i == 1) {

							M.joueur.get(i).panel = IA2;
							M.joueur.get(i).panel.add(J);
							Pioche.remove(J);
						} else if (M.joueur.get(i) instanceof IA && i == 2) {

							M.joueur.get(i).panel = IA4;
							M.joueur.get(i).panel.add(J);
							Pioche.remove(J);
						} else if (M.joueur.get(i) instanceof IA && i == 3) {

							M.joueur.get(i).panel = IA5;
							M.joueur.get(i).panel.add(J);
							Pioche.remove(J);
						} else if (M.joueur.get(i) instanceof IA && i == 4) {

							M.joueur.get(i).panel = IA7;
							M.joueur.get(i).panel.add(J);
							Pioche.remove(J);
						} else {
							Joueur.add(J);
							((CarteG) Joueur.getComponent(Joueur.getComponents().length - 1)).retourner();
							Pioche.remove(J);
						}
					}
				}
			} else if (M.joueur.size() == 6) {
				for (int i = 0; i < M.joueur.size(); i++) {
					for (int j = 0; j < M.joueur.get(i).hand.carte.size(); j++) {
						CarteG J = (CarteG) Pioche.getComponent(0);
						if (M.joueur.get(i) instanceof IA && i == 1) {

							M.joueur.get(i).panel = IA1;
							M.joueur.get(i).panel.add(J);
							Pioche.remove(J);
						} else if (M.joueur.get(i) instanceof IA && i == 2) {

							M.joueur.get(i).panel = IA2;
							M.joueur.get(i).panel.add(J);
							Pioche.remove(J);
						} else if (M.joueur.get(i) instanceof IA && i == 3) {

							M.joueur.get(i).panel = IA4;
							M.joueur.get(i).panel.add(J);
							Pioche.remove(J);
						} else if (M.joueur.get(i) instanceof IA && i == 4) {

							M.joueur.get(i).panel = IA5;
							M.joueur.get(i).panel.add(J);
							Pioche.remove(J);
						} else if (M.joueur.get(i) instanceof IA && i == 5) {

							M.joueur.get(i).panel = IA7;
							M.joueur.get(i).panel.add(J);
							Pioche.remove(J);
						} else {
							Joueur.add(J);
							((CarteG) Joueur.getComponent(Joueur.getComponents().length - 1)).retourner();
							Pioche.remove(J);
						}
					}
				}
			}

			CarteG J = (CarteG) Pioche.getComponent(0);
			Tatamis.add(J);
			((CarteG) J).retourner();

			Pioche.remove(J);
			i = 1;
			fenetre.setEtatLancement(false);
		}
	}
}