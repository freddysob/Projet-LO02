package Controleur;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Modele.*;
import Vue.*;

public class ControleurPioche {

	private int i=0;
	public ControleurPioche(JPanel Pioche, JPanel Tatamis, JPanel Joueur, JPanel IA1, JPanel IA2, JPanel IA3, JPanel IA4, JPanel IA5, JPanel IA6, JPanel IA7, FenetreJeu fenetre, Manche M) {

//		Pioche.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("test");
//				/*if (M.joueur.get(0).isEtatActif()) {
//					M.joueur.get(0).piocher();
//					M.joueurSuivant(null, M.joueur.get(0));
//				}*/
//			}
//			
//			
//
//		});
		if(fenetre.getEtatLancement() && i==0){
			
			M.pioche.distribuerCartesDebut(M.getVariante());
			
			if(M.joueur.size()==2){
				for(int i=0;i<M.joueur.size();i++){
					for(int j=0;j<M.joueur.get(i).hand.carte.size();j++){
						JButton J = (JButton) Pioche.getComponent(0);
						if(M.joueur.get(i) instanceof IA){
						
						IA1.add(J);
						Pioche.remove(J);
						}
						else{
							Joueur.add(J);
							Pioche.remove(J);
						}
					}
				}
			}
			else if(M.joueur.size()==3){
				for(int i=0;i<M.joueur.size();i++){
					for(int j=0;j<M.joueur.get(i).hand.carte.size();j++){
						JButton J = (JButton) Pioche.getComponent(0);
						if(M.joueur.get(i) instanceof IA && i==1){
						
						IA3.add(J);
						Pioche.remove(J);
						}
						else if(M.joueur.get(i) instanceof IA && i==2){
							
							IA6.add(J);
							Pioche.remove(J);
							}
						else{
							Joueur.add(J);
							//CarteG C = (CarteG) Joueur.getComponent(0);
							//Graphics g = null;
							//C.paintComponent(g);
							Pioche.remove(J);
						}
					}
				}
			}
			else if(M.joueur.size()==4){
				for(int i=0;i<M.joueur.size();i++){
					for(int j=0;j<M.joueur.get(i).hand.carte.size();j++){
						JButton J = (JButton) Pioche.getComponent(0);
						if(M.joueur.get(i) instanceof IA && i==1){
						
						IA1.add(J);
						Pioche.remove(J);
						}
						else if(M.joueur.get(i) instanceof IA && i==2){
							
							IA3.add(J);
							Pioche.remove(J);
							}
						else if(M.joueur.get(i) instanceof IA && i==3){
							IA6.add(J);
							Pioche.remove(J);
						}
						else{
							Joueur.add(J);
//							CarteG C = (CarteG) Joueur.getComponent(0);
//							Graphics g = null;
							//C.paintComponent(g);
							Pioche.remove(J);
						}
					}
				}
			}
			else if(M.joueur.size()==5){
				for(int i=0;i<M.joueur.size();i++){
					for(int j=0;j<M.joueur.get(i).hand.carte.size();j++){
						JButton J = (JButton) Pioche.getComponent(0);
						if(M.joueur.get(i) instanceof IA && i==1){
						
						IA2.add(J);
						Pioche.remove(J);
						}
						else if(M.joueur.get(i) instanceof IA && i==2){
							
							IA4.add(J);
							Pioche.remove(J);
							}
						else if(M.joueur.get(i) instanceof IA && i==3){
							IA5.add(J);
							Pioche.remove(J);
						}
						else if(M.joueur.get(i) instanceof IA && i==4){
							IA7.add(J);
							Pioche.remove(J);
						}
						else{
							Joueur.add(J);
//							CarteG C = (CarteG) Joueur.getComponent(0);
//							Graphics g = null;
							//C.paintComponent(g);
							Pioche.remove(J);
						}
					}
				}
			}
			else if(M.joueur.size()==6){
				for(int i=0;i<M.joueur.size();i++){
					for(int j=0;j<M.joueur.get(i).hand.carte.size();j++){
						JButton J = (JButton) Pioche.getComponent(0);
						if(M.joueur.get(i) instanceof IA && i==1){
						
						IA1.add(J);
						Pioche.remove(J);
						}
						else if(M.joueur.get(i) instanceof IA && i==2){
							
							IA2.add(J);
							Pioche.remove(J);
							}
						else if(M.joueur.get(i) instanceof IA && i==3){
							IA4.add(J);
							Pioche.remove(J);
						}
						else if(M.joueur.get(i) instanceof IA && i==4){
							IA5.add(J);
							Pioche.remove(J);
						}
						else if(M.joueur.get(i) instanceof IA && i==5){
							IA7.add(J);
							Pioche.remove(J);
						}
						else{
							Joueur.add(J);
//							CarteG C = (CarteG) Joueur.getComponent(0);
//							Graphics g = null;
							//C.paintComponent(g);
							Pioche.remove(J);
						}
					}
				}
			}
			
			JButton J = (JButton) Pioche.getComponent(0);
			Tatamis.add(J);
			CarteG C = (CarteG) Tatamis.getComponent(0);
			Graphics g = null;
			//C.paintComponent(g);
			Pioche.remove(J);
			
			i=1;
			fenetre.setEtatLancement(false);
		}
	}
}