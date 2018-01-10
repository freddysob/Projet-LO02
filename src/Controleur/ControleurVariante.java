package Controleur;

import javax.swing.*;
import java.awt.*;
import java.awt.List;
import java.util.*;

import Vue.*;
import Modele.*;


public class ControleurVariante {

	private int i1=0;
	public ControleurVariante(JLayeredPane Pioche, Manche M, JLayeredPane Tatamis, FenetreJeu fenetre){
		if(fenetre.getEtatLancement() && i1==0){
			
			M.pioche.setCarte(M.getVariante().genererJeuCartes());
			Collections.shuffle(M.pioche.carte);
			
			Pioche.removeAll();
			for(int i=0;i<M.pioche.carte.size();i++){
				System.out.println("TypCarte: "+ M.pioche.carte.get(i).getType());
				
				CarteG G = new	CarteG(M.pioche.carte.get(i).getNumero(),M.pioche.carte.get(i).getType(), Pioche);
				//G.setBounds(20, 20, 50, 50);
				G.retourner();

				Pioche.add(G);
				JButton C = (CarteG) Pioche.getComponent(0);
				//C.repaint();
				
			}
			i1=1;
		}
	}
}
