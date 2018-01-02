package Controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import Modele.*;

public class ControleurPioche {

	public ControleurPioche(JButton Pioche, final Pioche i, Manche M) {

		Pioche.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("test");
				/*if (M.joueur.get(0).isEtatActif()) {
					M.joueur.get(0).piocher();
					M.joueurSuivant(null, M.joueur.get(0));
				}*/
			}

		});
	}
}
