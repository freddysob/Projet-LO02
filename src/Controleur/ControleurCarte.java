package Controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Modele.*;


public class ControleurCarte {
	public ControleurCarte(JButton Carte, final Carte i, Manche M){
		
		Carte.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (M.joueur.get(0).isEtatActif()) {
					M.joueur.get(0).jouerCarte(i);
					M.joueurSuivant(i, M.joueur.get(0));
				}
			}
			
		});
	}
}
