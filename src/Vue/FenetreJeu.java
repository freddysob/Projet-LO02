package Vue;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;

import Controleur.*;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FenetreJeu {

	private JButton lblPioche;
	
	private JFrame frame;
	
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
					FenetreJeu window = new FenetreJeu();
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
	public FenetreJeu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 686, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(200, 355, 267, 55);
		frame.getContentPane().add(panel);
		panel.setBackground(Color.WHITE);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		panel.add(layeredPane_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(609, 27, 51, 139);
		frame.getContentPane().add(panel_3);
		panel_3.setBackground(Color.WHITE);
		
		JLayeredPane layeredPane_5 = new JLayeredPane();
		panel_3.add(layeredPane_5);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(89, 11, 139, 49);
		frame.getContentPane().add(panel_5);
		panel_5.setBackground(Color.WHITE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		panel_5.add(layeredPane);
		
		lblPioche = new JButton(new ImageIcon("image/dos.png"));

		lblPioche.setBounds(217, 141, 67, 103);
		frame.getContentPane().add(lblPioche);
		
		JLabel lblTatamis = new JLabel("Tatamis");
		lblTatamis.setBounds(410, 177, 46, 14);
		frame.getContentPane().add(lblTatamis);
		
		JButton btnNewButton = new JButton("Dire Derni\u00E8re Carte");
		btnNewButton.setBounds(10, 370, 169, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDenoncerDerniereCarte = new JButton("Denoncer Derniere carte");
		btnDenoncerDerniereCarte.setBounds(477, 355, 182, 23);
		frame.getContentPane().add(btnDenoncerDerniereCarte);
		
		JButton btnDenoncerMauvaiseCarte = new JButton("Denoncer Mauvaise carte");
		btnDenoncerMauvaiseCarte.setBounds(477, 387, 183, 23);
		frame.getContentPane().add(btnDenoncerMauvaiseCarte);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(609, 177, 51, 139);
		frame.getContentPane().add(panel_1);
		panel_1.setBackground(Color.WHITE);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		panel_1.add(layeredPane_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 27, 51, 139);
		frame.getContentPane().add(panel_2);
		panel_2.setBackground(Color.WHITE);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		panel_2.add(layeredPane_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 177, 51, 139);
		frame.getContentPane().add(panel_4);
		panel_4.setBackground(Color.WHITE);
		
		JLayeredPane layeredPane_4 = new JLayeredPane();
		panel_4.add(layeredPane_4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(260, 11, 139, 49);
		frame.getContentPane().add(panel_6);
		panel_6.setBackground(Color.WHITE);
		
		JLayeredPane layeredPane_6 = new JLayeredPane();
		panel_6.add(layeredPane_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(437, 11, 139, 49);
		frame.getContentPane().add(panel_7);
		panel_7.setBackground(Color.WHITE);
		
		JLayeredPane layeredPane_7 = new JLayeredPane();
		panel_7.add(layeredPane_7);
		
		new ControleurPioche(lblPioche,null,null);
	}
}
