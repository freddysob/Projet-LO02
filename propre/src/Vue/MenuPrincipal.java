package Vue;

import java.awt.*;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import Modele.*;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class MenuPrincipal { // menu principal de l'application

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main Mi = new Main();
					MenuPrincipal window = new MenuPrincipal(Mi);
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuPrincipal(Main M) {
		M=initialize(M);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private Main initialize(final Main M) {
		frame = new JFrame();
		frame.setBounds(100, 100, 716, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle(" Menu principal ");
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 11, 680, 430);
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{261, 26, 161, 0, 162, 223, 0};
		gbl_panel.rowHeights = new int[]{66, 64, 25, -3, 60, 76, 73, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		final Main M2= new Main();

		M2.setP(new Partie());
		M2.setV(new Variante(1,TypVariante.Minimale));
		M2.setM(new Manche(M2.getV(),M2.getP()));
		M2.setPi(new Pioche(M2.getM()));
		M2.setT(new Tatamis());
		JButton btnNewButton = new JButton("     Jouer      ");
		btnNewButton.addActionListener(new ActionListener() {
			
		
			
			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							
							if(M2.getM().joueur.size()==0){  //Creation Options par defaut
								
								
								M2.getM().joueur.add(new Joueur("Test", 1, null));
								M2.getM().joueur.add(new IA("Test", 2, null));
								
								Joueur Joueur0 = new Joueur("Test", 1, null);
								
								Hand Main1 = new Hand(Joueur0);
								M2.getM().joueur.get(0).setHand(Main1);
								Hand Main2 = new Hand(Joueur0);
								M2.getM().joueur.get(1).setHand(Main2);
								
								M2.getM().setNbJoueurs(M2.getM().joueur.size());
								M2.getM().joueur.get(0).setEtatActif(true);
								M2.getM().joueur.get(0).setTypePhysique(true);
								M2.getM().joueur.get(0).setManche(M2.getM());
								
								M2.getM().joueur.get(1).setEtatActif(false);
								M2.getM().joueur.get(1).setTypePhysique(false);
								M2.getM().joueur.get(1).setManche(M2.getM());
								
								
								}
							
							
							
						
						
							 
							FenetreJeu window = new FenetreJeu(M2.getP(),M2.getM(),M2.getV());
							window.getFrame().setVisible(true);
							frame.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		
		JLabel lblPageDaccueil = new JLabel("Le 8 Americain");
		lblPageDaccueil.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPageDaccueil.setEnabled(false);
		GridBagConstraints gbc_lblPageDaccueil = new GridBagConstraints();
		gbc_lblPageDaccueil.fill = GridBagConstraints.BOTH;
		gbc_lblPageDaccueil.insets = new Insets(0, 0, 5, 5);
		gbc_lblPageDaccueil.gridx = 0;
		gbc_lblPageDaccueil.gridy = 0;
		panel.add(lblPageDaccueil, gbc_lblPageDaccueil);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridheight = 2;
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 0;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.BOTH;
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 5;
		gbc_label.gridy = 0;
		panel.add(label, gbc_label);
		
		JLabel label_1 = new JLabel("");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 0);
		gbc_label_1.fill = GridBagConstraints.BOTH;
		gbc_label_1.gridx = 5;
		gbc_label_1.gridy = 1;
		panel.add(label_1, gbc_label_1);
		
		JButton btnReglerOptionsPartie = new JButton("Regler Options Partie");
		btnReglerOptionsPartie.addActionListener(new ActionListener() {
		
		
			
			public void actionPerformed(ActionEvent arg0) {
				
				Main Ma = new Main();
				Ma.setP(new Partie());
				Ma.setV(new Variante(1, TypVariante.Minimale));
				Ma.setT( new Tatamis());
				Ma.setM( new Manche( Ma.getV(), Ma.getP()));
				
				JPanel panel_1 = new JPanel();
				panel_1.setBounds(37, 182, 159, 69);
				frame.getContentPane().add(panel_1);
				
				String[] pointsmax = {"250", "500"};
				   
				
				Ma.getP().setPointsMax( JOptionPane.showOptionDialog(null,  "Entrez le nombre de points maximum",  "Points max",  JOptionPane.YES_NO_CANCEL_OPTION,  JOptionPane.QUESTION_MESSAGE,  null,  pointsmax,  pointsmax[1]) );
				
				
				
				int nombre2=0;
				boolean o=false;

				while (o==false){
				    String recu = JOptionPane.showInputDialog(null, "Entrez le nombre de joueurs", "Nombre de joueurs", JOptionPane.QUESTION_MESSAGE);
					try {
						
						nombre2=Integer.parseInt(recu);
						if(nombre2<=6 && nombre2>=0){
						o=true;}
						else{

							JOptionPane.showMessageDialog(null, "Le nombre est trop grand ou trop petit", "Erreur", JOptionPane.ERROR_MESSAGE);
						}
						
					} catch (NumberFormatException nfe) {

						JOptionPane.showMessageDialog(null, "Veuillez rentrer un nombre", "Erreur", JOptionPane.ERROR_MESSAGE);
					}
				}
				
				Ma.getP().setNbJoueurs(nombre2);
				
				for (int i=0;i<Ma.getP().getNbJoueurs();i++){         // Creation des joueurs                        
		
					if(i==0){
					    String nom = JOptionPane.showInputDialog(null, "Entrez votre nom :", "Nom du joueur", JOptionPane.QUESTION_MESSAGE);
		
						Ma.getP().joueur.add(new Joueur(nom,i,null));
						Ma.getP().joueur.get(i).setTypePhysique(true);
						Ma.getP().joueur.get(i).setEtatActif(true);
					}
		
					else{
		
						String nom= "";
						Ma.getP().joueur.add(new IA(nom,i,null));
						Ma.getP().joueur.get(i).setTypePhysique(false);
						Ma.getP().joueur.get(i).setEtatActif(false);
						
					}
					

					Joueur joueur0 = new Joueur("Test", 1, null);
					
					Hand Main1 = new Hand(joueur0);
					Ma.getP().joueur.get(i).setHand(Main1);
		
				}
				
				
				
				String[] variante = {"basique", "Monclar","1","Carte et Maou", "Des Ulis", "4", "5", "6", "Courte Amicale", "Man et resta"};

				   
				    int n = JOptionPane.showOptionDialog(null,  "Selectionnez une variante", "Choix variante",  JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,  null,  variante,  variante[9]) + 1;
				    
				    M.setV(Ma.getM().choisirVariante(n));
				    
				    Ma.setM(new Manche(M.getV(),Ma.getP()));
				    Ma.getM().setNbJoueurs(Ma.getP().joueur.size());
				    Ma.getM().setJoueur(Ma.getP().getJoueur());
				    
				   
				    // Transmission des saisies dans une variable "final"
				    M.setM(Ma.getM());
				    M.setP(Ma.getP());
				    M.setV(Ma.getV());
				    M.getM().setNbJoueurs(M.getM().joueur.size());
				   
				    //Copie des saisies dans la variable Main "final" qui sera utilis�e pour construire la fen�tre de jeu
				    
				    M2.setM(M.getM());
				    M2.setP(M.getP());
				    M2.setV(M.getV());
				    M2.getM().setTatamis(new Tatamis());
				    
					 for (int i=0;i<M2.getP().getNbJoueurs();i++){
						 M2.getM().joueur.get(i).setManche(M2.getM());
						 M2.getM().joueur.get(i).manche.setTatamis(new Tatamis());
					 
					 }
					 
					 
			}
			
		});
		
		
		
		GridBagConstraints gbc_btnReglerOptionsPartie = new GridBagConstraints();
		gbc_btnReglerOptionsPartie.gridheight = 3;
		gbc_btnReglerOptionsPartie.gridwidth = 2;
		gbc_btnReglerOptionsPartie.fill = GridBagConstraints.BOTH;
		gbc_btnReglerOptionsPartie.insets = new Insets(0, 0, 5, 5);
		gbc_btnReglerOptionsPartie.gridx = 0;
		gbc_btnReglerOptionsPartie.gridy = 4;
		panel.add(btnReglerOptionsPartie, gbc_btnReglerOptionsPartie);
		
		JButton btnQuitter = new JButton("      Quitter     ");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		GridBagConstraints gbc_btnQuitter = new GridBagConstraints();
		gbc_btnQuitter.insets = new Insets(0, 0, 5, 0);
		gbc_btnQuitter.gridheight = 3;
		gbc_btnQuitter.gridwidth = 2;
		gbc_btnQuitter.fill = GridBagConstraints.BOTH;
		gbc_btnQuitter.gridx = 5;
		gbc_btnQuitter.gridy = 6;
		panel.add(btnQuitter, gbc_btnQuitter);
		
		
		return M;
		
	}
}