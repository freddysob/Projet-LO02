package Controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import Modele.*;




	public class ControleurPioche {
		
		public ControleurPioche(JButton Pioche, final Pioche i){
			
			Pioche.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					if(i.carte.isEmpty()){
						i.reconstituer();
					}
				}
				
			});
		}
	}

