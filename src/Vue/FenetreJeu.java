package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.*;

import Modele.*;
import Controleur.*;

import java.awt.GridLayout;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FenetreJeu implements Observer {

	private JFrame frame;
	private Partie Partie;
	private Manche Manche;
	private Variante Variante;
	private boolean etatLancement=true;
	
	
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
	//private JPanel tatamis;
	private JLayeredPane tatamis;
	private JLayeredPane pioche;
	//private JPanel pioche;
	private JLabel lblTatamis;
	
	ControleurCarte Cc;
	ControleurJoueur Cj;
	ControleurManche Cm;
	ControleurPartie Cp;
	ControleurPioche Cpi;
	ControleurTatamis Ct;
	ControleurVariante Cv;
	
	public boolean getEtatLancement(){
		return this.etatLancement;
	}
	
	public void setEtatLancement(boolean o){
		this.etatLancement=o;
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
					Variante Variante = new Variante(1,TypVariante.Minimale);
					Manche Manche = new Manche(Variante,Partie);
					
					if(Manche.joueur.size()==0){  //Creation Options par defaut
					
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
					
					
//					this.Partie = Partie;
//					this.Manche = Manche;
//					this.Variante = Variante;
					FenetreJeu window = new FenetreJeu(Partie,Manche,Variante);
					window.frame.setVisible(true);
					
					/*// Boucle Tour de Jeu
					int i1=0;
					while( Manche.partie.joueur.get(i1).hand.mainVide())
					{
						// Recherche du joueur actif
						for (int i=0;i<Manche.partie.joueur.size();i++){
							if(Manche.partie.joueur.get(i).isEtatActif()==true || Manche.partie.joueur.get(i).isTypePhysique()==true){
								i1=i;
							}
							
							
							// Le joueur joue
						// Cas Utilisateur
							System.out.println("Le joueur "+ Manche.partie.joueur.get(i1).getNom() +" joue.");

							if (Manche.partie.joueur.get(i1).isTypePhysique()){                                   // Cas du joueur physique
								Manche.partie.joueur.get(i1).setEtatActif(true);
								

							}

						// Cas IA
							else {                                                                    // Cas de l'IA
								Manche.partie.joueur.get(i1).jouer();
							}

							
							Manche.tatamis.verifierValiditeCarte(0); 
							
						}
						
						
					}*/
					
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
		initialize(P,M,V);
		
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
		
		// Joueur
		// Variante
		// Tatamis
		// Pioche
		// Manche
		// Partie
		// Carte
		
		
		Cv = new ControleurVariante(pioche, this.Manche, tatamis,this);
		Cpi = new ControleurPioche(pioche, tatamis, Joueur, IA_1, IA_2, IA_3, IA_4, IA_5, IA_6, IA_7, this, this.Manche);
		Ct = new ControleurTatamis();
		Cj = new ControleurJoueur(SignalerDerniereCarte, DenoncerDerniereCarte, DenoncerMauvaiseCarte, tatamis, pioche, Joueur, this.Manche);
		Cm = new ControleurManche(pioche, tatamis, Joueur, IA_1, IA_2, IA_3, IA_4, IA_5, IA_6, IA_7, this, this.Manche);
		Cc = new ControleurCarte();
		Cp = new ControleurPartie();
		
		
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
		
		
		//JLayeredPane layeredPane_3 = new JLayeredPane();
		//Joueur.add(layeredPane_3);
		
		
	//	tatamis = new JPanel();
	//	tatamis.setBackground(Color.WHITE);
	//	tatamis.setBounds(593, 268, 126, 147);
		
		tatamis = new JLayeredPane();
		tatamis.setBounds(593, 268, 126, 147);
		frame.getContentPane().add(tatamis);
		
		lblTatamis = new JLabel("Tatamis");
		lblTatamis.setBounds(631, 426, 46, 14);
		frame.getContentPane().add(lblTatamis);
		
		
		pioche = new JLayeredPane();
		pioche.setBounds(443, 268, 126, 147);
		frame.getContentPane().add(pioche);
	//	pioche = new JPanel();
	//	pioche.setBackground(Color.LIGHT_GRAY);
	//	pioche.setBounds(443, 268, 126, 147);
	
	//	frame.getContentPane().add(pioche);
		
		
		
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
		
		if (M.joueur.size()==2){
			
			IA_1 = new JLayeredPane();
			IA_1.setBackground(Color.WHITE);
			IA_1.setBounds(480, 11, 406, 103);
			frame.getContentPane().add(IA_1);
			
			
		}
		else if (M.joueur.size()==3){
			
			
			IA_6 = new JLayeredPane();
			IA_6.setBackground(Color.WHITE);
			IA_6.setBounds(22, 219, 99, 192);
			frame.getContentPane().add(IA_6);
			
			
		
			
			IA_3 = new JLayeredPane();
			IA_3.setBackground(Color.WHITE);
			IA_3.setBounds(1236, 219, 99, 192);
			frame.getContentPane().add(IA_3);
			
			
			
		
		}
		else if (M.joueur.size()==4){
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
			
			
		}
		else if (M.joueur.size()==5){
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
			
			
			
			
		}
		else if (M.joueur.size()==6){
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

		else if (M.joueur.size()==0){
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
	
	public void update(Observable instanceObservable, Object arg1){
		
		
		if (instanceObservable instanceof Pioche){
			
			List<Object> tab= (ArrayList) arg1;
			if((int)tab.get(0)==1){
			System.out.println("Nb cartes pioche graphique" + pioche.getComponents().length);
			JButton J = (CarteG) pioche.getComponent(0);
			Joueur joue = (Joueur) tab.get(1);
			System.out.println(joue.hand.carte.size()+ "dans obs");
			
			if(joue.isTypePhysique()) {
			Joueur.add(J);
			Joueur.repaint();
			pioche.remove(J);
			pioche.repaint();
			((CarteG) Joueur.getComponent(Joueur.getComponents().length-1)).retourner();
			for(ActionListener act : J.getActionListeners()) {
				J.removeActionListener(act);
			}
			Cj.donnerListener();
	
			/*
			J.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(Manche.joueur.get(0).isEtatActif()) {
						System.out.println(Manche.joueur.get(0).hand.carte.get((Manche.joueur.get(0).hand.carte.size())-1));
						Manche.joueur.get(0).jouerCarte(Manche.joueur.get(0).hand.carte.get((Manche.joueur.get(0).hand.carte.size())-1));
						Manche.joueurSuivant(Manche.joueur.get(0).hand.carte.get((Manche.joueur.get(0).hand.carte.size())-1), Manche.joueur.get(0));
					}
				}
				
			}); */
			}
			else{
				joue.panel.add(J);
				joue.panel.repaint();
				pioche.remove(J);
				pioche.repaint();
				
				for(ActionListener act : J.getActionListeners()) {
					J.removeActionListener(act);
				}
			}
			
			 JButton J2 = (CarteG) pioche.getComponent(0);
			J2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (Manche.joueur.get(0).isEtatActif()) {
						Manche.joueur.get(0).piocher();
						//Manche.joueurSuivant(null, Manche.joueur.get(0));
					}
				}
			});
			}
			if((int)tab.get(0)==2){
				List<Carte> piocheRecup = (List<Carte>) tab.get(1);
				int i=0;
				while(tatamis.getComponents().length>1){
				tatamis.remove(tatamis.getComponent(1));
				i++;}
				System.out.println("Re 2");
				i=0;
				while(i<piocheRecup.size()){
					CarteG carteg= new CarteG(piocheRecup.get(i).getNumero(),piocheRecup.get(i).getType(),pioche);
					pioche.add(carteg, i+1);
					pioche.repaint();
					((CarteG) pioche.getComponent(i+1)).retourner();
					 CarteG J2 = (CarteG) pioche.getComponent(i+1);
						J2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								if (Manche.joueur.get(0).isEtatActif()) {
									Manche.joueur.get(0).piocher();
								}
							}
						});
					System.out.println("Reconstitution: Graphique : [" +carteg.getNumero()+","+carteg.getType()+ "] / Modele : " +piocheRecup.get(i));
					i++;
				}
			}
		}
			  
		
		if (instanceObservable instanceof Joueur){
			List<Object> tab= (ArrayList) arg1;
			if((int) tab.get(0)==1) {
				Carte carte = (Carte) tab.get(2);
				Joueur jouer = (Joueur) tab.get(1);
				
					System.out.println("Taille main : " +jouer.hand.carte.size());
					System.out.println("NB elements panel "+jouer.getNom()+" : "+jouer.panel.getComponents().length);
					int i = 0;
					int ic=0;
					
					CarteG carteg = null;
					if(jouer instanceof IA){
						System.out.println("Components :");
						System.out.println("NB elements panel "+jouer.getNom()+" : "+jouer.panel.getComponents().length);
						for(i=0; i<jouer.panel.getComponents().length;i++){
							System.out.println(" "+ jouer.panel.getComponent(i));
						}
						for(i=0; i<jouer.panel.getComponents().length; i++) {
							carteg = (CarteG) jouer.panel.getComponent(i);
							if(carte.getNumero()== carteg.getNumero() && carte.getType() == carteg.getType()) {
								ic=i;
								System.out.println("ic : "+ic);
							}
						}
						carteg = (CarteG) jouer.panel.getComponent(ic);
					}
					else{
					for(i=0; i<jouer.hand.carte.size(); i++) {
						carteg = (CarteG) Joueur.getComponent(i);
						if(carte.getNumero()== carteg.getNumero() && carte.getType() == carteg.getType()) {
							ic=i;
							System.out.println("ic : "+ic);
						}
					}
					carteg = (CarteG) Joueur.getComponent(ic);
					}
							
					carteg.setBounds(20, 20, 80, 120);
					
					if(jouer.isTypePhysique()) {
					tatamis.add(carteg, 0);
					tatamis.repaint();
					Joueur.remove(carteg);
					Joueur.repaint();
					if(carte instanceof Commande) {
						String[] choix = {"Coeur", "Carreau","Trèfle","Pique"};
						JOptionPane jop = new JOptionPane();
					    int n = jop.showOptionDialog(null,  "Selectionnez une couleur", "Choix couleur",  JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,  null,  choix,  choix[3]);
					    Commande com = (Commande) carte;
					    com.appliquerPouvoir(Manche, n);
					}}
					else{
					tatamis.add(carteg, 0);
					((CarteG) tatamis.getComponent(0)).retourner();
					tatamis.repaint();
					jouer.panel.remove(carteg);
					jouer.panel.repaint();
					}
					System.out.println(jouer.getNom()+ " joue " +carteg.getNumero()+","+carteg.getType() +" = "+ carte + "dans le modele" );	
					
				//System.out.println("tab: "+tab);
			}if((int) tab.get(0)==2) {
				
				if ((boolean) tab.get(2)) {
					JOptionPane jop = new JOptionPane();
					jop.showMessageDialog(null, "Bonne dénonciation de " + ((Joueur) tab.get(1)).getNom()+"(derniere carte)" , "Information",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					if(((Joueur) tab.get(1)).isTypePhysique()){
					JOptionPane jop = new JOptionPane();
					jop.showMessageDialog(null, "Mauvaise dénonciation de " + ((Joueur) tab.get(1)).getNom()+"(derniere carte)", "Information",
							JOptionPane.INFORMATION_MESSAGE);}
					else{
						
					}
				}
			}
			if((int) tab.get(0)==3) {
				
				if ((boolean) tab.get(2)) {
					JOptionPane jop = new JOptionPane();
					jop.showMessageDialog(null, "Bonne dénonciation de " + ((Joueur) tab.get(1)).getNom()+"mauvaise carte", "Information",
							JOptionPane.INFORMATION_MESSAGE);
				}else {if(((Joueur) tab.get(1)).isTypePhysique()){
					JOptionPane jop = new JOptionPane();
					jop.showMessageDialog(null, "Mauvaise dénonciation de " + ((Joueur) tab.get(1)).getNom()+"mauvaise carte", "Information",
							JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					
				}
				}
			}
			if((int) tab.get(0)==4) {
				JOptionPane jop = new JOptionPane();
				jop.showMessageDialog(null, ((Joueur) tab.get(1)).getNom()+" annonce n'avoir plus qu'une carte", "Information",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		if (instanceObservable instanceof Tatamis){
			JOptionPane jop = new JOptionPane();
			jop.showMessageDialog(null, arg1 +" a été choisi", "Information",
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		if (instanceObservable instanceof Variante){
			
		}
		
		if (instanceObservable instanceof Manche){
			if(arg1 instanceof Joueur) {
				Joueur joue = (Joueur) arg1;
				System.out.println(joue);
				if(!joue.isTypePhysique()) {
					joue.jouer();
				}
			}if(arg1 instanceof String) {
				JOptionPane jop = new JOptionPane();
				String message= "";
				for(int i =0; i<Partie.joueur.size(); i++) {
					message= message + Partie.joueur.get(i).getNom()+" score : "+Partie.joueur.get(i).getNbPoints()+"";
				}
				jop.showMessageDialog(null, message, "Information",
						JOptionPane.INFORMATION_MESSAGE);
				final Main M2= new Main();

				M2.setP(Partie);
				String[] variante = {"basique", "Monclar","1","Carte et Maou", "Des Ulis", "4", "5", "6", "Courte Amicale", "Man et resta"};

			    int n = jop.showOptionDialog(null,  "Selectionnez une variante", "Choix variante",  JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,  null,  variante,  variante[9]) + 1;
			    M2.setV(new Variante(1, TypVariante.Minimale));
				M2.setM(new Manche(M2.getV(),M2.getP()));
				M2.setV(M2.getM().choisirVariante(n));
				M2.getM().setJoueur(Partie.joueur);
				M2.setPi(new Pioche(M2.getM()));
				M2.setT(new Tatamis());
				for(int i = 0; i<Partie.joueur.size();i++){ 
					M2.getM().joueur.get(i).setHand(new Hand(Partie.joueur.get(i)));
					System.out.println(Partie.joueur.get(i).hand.carte.size()+" dans la main");
					M2.getM().joueur.get(i).setaFini(false);
					
					
					}
				
				
				 System.out.println("Liste joueurs manche après transmission : " + M2.getM().getJoueur());
				 System.out.println("Variante manche après transmission : " + M2.getM().getVariante());
				
			
			
				 frame.setVisible(false);
				FenetreJeu window = new FenetreJeu(M2.getP(),M2.getM(),M2.getV());
				window.getFrame().setVisible(true);
				window.update(Manche, window);
			}
			if (instanceObservable instanceof Partie){
				JOptionPane jop = new JOptionPane();
				jop.showMessageDialog(null, arg1+" est le gagnant", "Information",
						JOptionPane.INFORMATION_MESSAGE);
			}
			
			/*if(Manche.verifierFinManche() || etatLancement){   //Si Debut de manche
				
				Manche = new Manche(Variante,Partie); 
				for (int i=0;i<Partie.getNbJoueurs();i++){   // Copie des joueurs de la Partie
					Manche.joueur.add(Partie.joueur.get(i));
					Manche.joueur.get(i).hand= new Hand(Manche.joueur.get(i));}
				
				
				
				Manche.pioche.setCarte(Manche.getVariante().genererJeuCartes());
				Collections.shuffle(Manche.pioche.getCarte());
				Manche.pioche.distribuerCartesDebut(Manche.getVariante());
				Manche.initialiserJoueur();
				
				// Mise à jour des panel
			}
			else{
				int i2=0;
				for(int i=0;i<Manche.joueur.size();i++){
					if(Manche.joueur.get(i).isEtatActif()){i2=i;}
				}
				Manche.joueurSuivant(Manche.tatamis.carte.get(0), Manche.joueur.get(i2));
			}
				
		}
		if (instanceObservable instanceof Partie){
			
			
			
			if(Partie.verifierFinPartie()){
				JOptionPane jop=new JOptionPane();
				Joueur[] J = new Joueur[8];
				for(int i=0;i<=Partie.joueur.size();i++){
					J[i]=Partie.joueur.get(i);
				}
	
				jop.showOptionDialog(null,  "Partie Terminée !",  "Resultats :",  JOptionPane.YES_NO_CANCEL_OPTION,  JOptionPane.QUESTION_MESSAGE,  null,  J,  Partie.joueur.get(0));
				
				this.getFrame().setVisible(false);
			}*/
		
		}
		
//		if (instanceObservable instanceof Carte){
//			
//		}
  	}
}
