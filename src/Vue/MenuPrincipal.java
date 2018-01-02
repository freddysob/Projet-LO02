package Vue;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import Modele.Affichage;
import Modele.IA;
import Modele.Joueur;
import Modele.Main;
import Modele.Manche;
import Modele.Partie;
import Modele.Tatamis;
import Modele.TypVariante;
import Modele.Variante;
//import Modele;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import java.io.*;


public class MenuPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal window = new MenuPrincipal();
					window.frame.setVisible(true);
					Main Mi = new Main();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 716, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle(" Menu principal ");
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.GRAY);
		panel.setBounds(10, 0, 680, 430);
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{261, 26, 161, 0, 162, 223, 0};
		gbl_panel.rowHeights = new int[]{66, 64, 25, -3, 60, 76, 73, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnNewButton = new JButton("     Jouer      ");
		btnNewButton.addActionListener(new ActionListener() {
			
		
			
			public void actionPerformed(ActionEvent arg0, Main Ma) {

				
				
				String[] args = new String[6];
				Ma.main(args);
				

			}
			
			public JPanel setBackgroundImage(JFrame frame, final File img) throws IOException{
				JPanel panel = new JPanel()
				{
					private static final long serialVersionUID = 1;
					
					private BufferedImage buf = ImageIO.read(img);
					
					@Override
					protected void paintComponent(Graphics g)
					{
						super.paintComponent(g);
						g.drawImage(buf, 0,0, null);
					}
				};
				
				frame.setContentPane(panel);
				
				return panel;
			}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							FenetreJeu window = new FenetreJeu();
							window.getFrame().setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				// TODO Auto-generated method stub
				/*
				JFrame frame2 = new JFrame();
				frame2.setExtendedState(JFrame.MAXIMIZED_BOTH);
				frame2.setTitle(" Tableau de Jeu ");
				frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame2.getContentPane().setLayout(null);
				frame.setVisible(false);
				frame2.setVisible(true);
				
				JPanel panel_2 = new JPanel();
				panel_2.setBounds(0, 0, 1400, 1200);
				
				panel_2.setBackground(Color.CYAN);
				
				
				
				
				JPanel J2 = new JPanel();
				J2.setBounds(1000, 100, 400, 400);
				panel_2.add(J2);
				
				J2.setBackground(Color.YELLOW);
				
				JPanel J3 = new JPanel();
				J3.setBounds(1000, 500, 400, 400);
				panel_2.add(J3);
				
				J3.setBackground(Color.WHITE);
				
				JPanel J4 = new JPanel();
				J4.setBounds(1000, 900, 400, 400);
				panel_2.add(J4);
				
				J4.setBackground(Color.WHITE);
				
				JPanel J1 = new JPanel();
				J1.setBounds(500, 50, 400, 400);
				panel_2.add(J1);
				
				J1.setBackground(Color.WHITE);
				
				JPanel J5 = new JPanel();
				J5.setBounds(500, 900, 400, 400);
				panel_2.add(J5);
				
				J5.setBackground(Color.WHITE);
				
				JPanel J6 = new JPanel();
				J6.setBounds(100, 100, 400, 400);
				panel_2.add(J6);
				
				J6.setBackground(Color.WHITE);
				
				JPanel J7 = new JPanel();
				J7.setBounds(100, 500, 400, 400);
				panel_2.add(J7);
				
				J7.setBackground(Color.WHITE);
				
				JPanel J8 = new JPanel();
				J8.setBounds(100, 900, 400, 400);
				panel_2.add(J8);
				
				J8.setBackground(Color.WHITE);
				
				JPanel Pioche = new JPanel();
				Pioche.setBounds(450, 500, 400, 400);
				panel_2.add(Pioche);
				
				
				JPanel Tatamis = new JPanel();
				Tatamis.setBounds(550, 500, 400, 400);
				panel_2.add(Tatamis);
				
				
				frame2.getContentPane().add(panel_2);
				
			*/}
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
				//Affichage A = new Affichage();
				boolean fini = false;
				int nbj=0;
				Ma.setV(new Variante(1, TypVariante.Minimale));
				Ma.setT( new Tatamis());
				Ma.setM( new Manche(0, Ma.getV(), Ma.getP(), Ma.getT() ));
				
				JOptionPane jop = new JOptionPane();
				
				JPanel panel_1 = new JPanel();
				panel_1.setBounds(37, 182, 159, 69);
				frame.getContentPane().add(panel_1);
				
				int nombre=0;
				String[] pointsmax = {"250", "500"};
				   
				
				Ma.getP().setPointsMax( jop.showOptionDialog(null,  "Entrez le nombre de points maximum",  "Points max",  JOptionPane.YES_NO_CANCEL_OPTION,  JOptionPane.QUESTION_MESSAGE,  null,  pointsmax,  pointsmax[1]) );
				
				
				
				int nombre2=0;
				boolean o=false;

				while (o==false){
				    String recu = jop.showInputDialog(null, "Entrez le nombre de joueurs", "Nombre de joueurs", JOptionPane.QUESTION_MESSAGE);
					try {
						
						nombre2=Integer.parseInt(recu);
						if(nombre2<=6 && nombre2>=0){
						o=true;}
						else{

							jop.showMessageDialog(null, "Le nombre est trop grand ou trop petit", "Erreur", JOptionPane.ERROR_MESSAGE);
						}
						
					} catch (NumberFormatException nfe) {

						jop.showMessageDialog(null, "Veuillez rentrer un nombre", "Erreur", JOptionPane.ERROR_MESSAGE);
					}
				}
				
				Ma.getP().setNbJoueurs(nombre2);
				
				for (int i=0;i<Ma.getP().getNbJoueurs();i++){         // Creation des joueurs                        
		
					if(i==0){
					    String nom = jop.showInputDialog(null, "Entrez votre nom :", "Nom du joueur", JOptionPane.QUESTION_MESSAGE);
		
						Ma.getP().joueur.add(new Joueur(nom,i,null));
						Ma.getP().joueur.get(i).setTypePhysique(true);
					}
		
					else{
		
						String nom= "";
						Ma.getP().joueur.add(new IA(nom,i,null));
						Ma.getP().joueur.get(i).setTypePhysique(false);
					}
		
				}
				
				
				String[] variante = {"basique", "Monclar","1","Carte et Maou", "Des Ulis", "4", "5", "6", "Courte Amicale", "Man et resta"};

				   
				    int n = jop.showOptionDialog(null,  "Selectionnez une variante", "Choix variante",  JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,  null,  variante,  variante[9]);
				    
				    //A.choisirVariante(V,n);
				    
				    
				
			
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
		
		
		
		
	}
}
