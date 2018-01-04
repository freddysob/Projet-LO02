package Vue;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.*;

import Modele.*;
 
public class CarteG extends JButton { 
	
	public NumeroCarte numero;
	public TypCarte type;
	public JPanel panel;
	
	public CarteG(NumeroCarte num,TypCarte typ, JPanel p1){
		this.numero = num;
		this.type = typ;
		this.panel=p1;
		
		BufferedImage img = null;
		
		 try {
		    	if(numero==NumeroCarte._1 && type == TypCarte.Pique){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/1Pique.png"));
		    	}
		    	if(numero==NumeroCarte._2 && type == TypCarte.Pique){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/2Pique.png"));
		    	}
		    	if(numero==NumeroCarte._3 && type == TypCarte.Pique){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/3Pique.png"));
		    	}
		    	if(numero==NumeroCarte._4 && type == TypCarte.Pique){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/4Pique.png"));
		    	}
		    	if(numero==NumeroCarte._5 && type == TypCarte.Pique){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/5Pique.png"));
		    	}
		    	if(numero==NumeroCarte._6 && type == TypCarte.Pique){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/6Pique.png"));
		    	}
		    	if(numero==NumeroCarte._7 && type == TypCarte.Pique){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/7Pique.png"));
		    	}
		    	if(numero==NumeroCarte._8 && type == TypCarte.Pique){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/8Pique.png"));
		    	}
		    	if(numero==NumeroCarte._9 && type == TypCarte.Pique){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/9Pique.png"));
		    	}
		    	if(numero==NumeroCarte._10 && type == TypCarte.Pique){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/10Pique.png"));
		    	}
		    	if(numero==NumeroCarte._V && type == TypCarte.Pique){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/VPique.png"));
		    	}
		    	if(numero==NumeroCarte._D && type == TypCarte.Pique){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/DPique.png"));
		    	}
		    	if(numero==NumeroCarte._R && type == TypCarte.Pique){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/RPique.png"));
		    	}
		    	if(numero==NumeroCarte._1 && type == TypCarte.Trefle){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/1Trefle.png"));
		    	}
		    	if(numero==NumeroCarte._2 && type == TypCarte.Trefle){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/2Trefle.png"));
		    	}
		    	if(numero==NumeroCarte._3 && type == TypCarte.Trefle){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/3Trefle.png"));
		    	}
		    	if(numero==NumeroCarte._4 && type == TypCarte.Trefle){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/4Trefle.png"));
		    	}
		    	if(numero==NumeroCarte._5 && type == TypCarte.Trefle){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/5Trefle.png"));
		    	}
		    	if(numero==NumeroCarte._6 && type == TypCarte.Trefle){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/6Trefle.png"));
		    	}
		    	if(numero==NumeroCarte._7 && type == TypCarte.Trefle){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/7Trefle.png"));
		    	}
		    	if(numero==NumeroCarte._8 && type == TypCarte.Trefle){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/8Trefle.png"));
		    	}
		    	if(numero==NumeroCarte._9 && type == TypCarte.Trefle){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/9Trefle.png"));
		    	}
		    	if(numero==NumeroCarte._10 && type == TypCarte.Trefle){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/10Trefle.png"));
		    	}
		    	if(numero==NumeroCarte._V && type == TypCarte.Trefle){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/VTrefle.png"));
		    	}
		    	if(numero==NumeroCarte._D && type == TypCarte.Trefle){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/DTrefle.png"));
		    	}
		    	if(numero==NumeroCarte._R && type == TypCarte.Trefle){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/RTrefle.png"));
		    	}
		    	if(numero==NumeroCarte._1 && type == TypCarte.Coeur){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/1Coeur.png"));
		    	}
		    	if(numero==NumeroCarte._2 && type == TypCarte.Coeur){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/2Coeur.png"));
		    	}
		    	if(numero==NumeroCarte._3 && type == TypCarte.Coeur){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/3Coeur.png"));
		    	}
		    	if(numero==NumeroCarte._4 && type == TypCarte.Coeur){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/4Coeur.png"));
		    	}
		    	if(numero==NumeroCarte._5 && type == TypCarte.Coeur){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/5Coeur.png"));
		    	}
		    	if(numero==NumeroCarte._6 && type == TypCarte.Coeur){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/6Coeur.png"));
		    	}
		    	if(numero==NumeroCarte._7 && type == TypCarte.Coeur){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/7Coeur.png"));
		    	}
		    	if(numero==NumeroCarte._8 && type == TypCarte.Coeur){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/8Coeur.png"));
		    	}
		    	if(numero==NumeroCarte._9 && type == TypCarte.Coeur){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/9Coeur.png"));
		    	}
		    	if(numero==NumeroCarte._10 && type == TypCarte.Coeur){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/10Coeur.png"));
		    	}
		    	if(numero==NumeroCarte._V && type == TypCarte.Coeur){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/VCoeur.png"));
		    	}
		    	if(numero==NumeroCarte._D && type == TypCarte.Coeur){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/DCoeur.png"));
		    	}
		    	if(numero==NumeroCarte._R && type == TypCarte.Coeur){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/RCoeur.png"));
		    	}
		    	if(numero==NumeroCarte._1 && type == TypCarte.Carreau){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/1Carreau.png"));
		    	}
		    	if(numero==NumeroCarte._2 && type == TypCarte.Carreau){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/2Carreau.png"));
		    	}
		    	if(numero==NumeroCarte._3 && type == TypCarte.Carreau){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/3Carreau.png"));
		    	}
		    	if(numero==NumeroCarte._4 && type == TypCarte.Carreau){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/4Carreau.png"));
		    	}
		    	if(numero==NumeroCarte._5 && type == TypCarte.Carreau){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/5Carreau.png"));
		    	}
		    	if(numero==NumeroCarte._6 && type == TypCarte.Carreau){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/6Carreau.png"));
		    	}
		    	if(numero==NumeroCarte._7 && type == TypCarte.Carreau){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/7Carreau.png"));
		    	}
		    	if(numero==NumeroCarte._8 && type == TypCarte.Carreau){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/8Carreau.png"));
		    	}
		    	if(numero==NumeroCarte._9 && type == TypCarte.Carreau){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/9Carreau.png"));
		    	}
		    	if(numero==NumeroCarte._10 && type == TypCarte.Carreau){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/10Carreau.png"));
		    	}
		    	if(numero==NumeroCarte._V && type == TypCarte.Carreau){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/VCarreau.png"));
		    	}
		    	if(numero==NumeroCarte._D && type == TypCarte.Carreau){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/DCarreau.png"));
		    	}
		    	if(numero==NumeroCarte._R && type == TypCarte.Carreau){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/RCarreau.png"));
		    	}
		    	if(numero==NumeroCarte._J && type == TypCarte.JN){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/JN.png"));
		    	}
		    	if(numero==NumeroCarte._J && type == TypCarte.JR){
		    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/JR.png"));
		    	}
		    	
		    	this.setIcon(new ImageIcon(img));
		    	//this.setBounds(img.getMinX(),img.getMinY(), img.getWidth(),img.getHeight());
		    	
		    	
		    	
		    	//this.setSize(img.getWidth(),img.getHeight());
		    	
		    } catch (IOException e) {
		    }
		
		
	}
	
	/* public void repaint(){
		    //x1, y1, width, height, arcWidth, arcHeight

			    BufferedImage img = null;
			    try {
			        img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/dos.png"));
			        this.setIcon(new ImageIcon(img));
			        img = null;
			    } catch (IOException e) {
			    }
			   
	  }*/
	
 /* public void paintComponent(Graphics g){
    //x1, y1, width, height, arcWidth, arcHeight

	    BufferedImage img = null;
	    try {
	    	if(numero==NumeroCarte._1 && type == TypCarte.Pique){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/1Pique.png"));
	    	}
	    	if(numero==NumeroCarte._2 && type == TypCarte.Pique){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/2Pique.png"));
	    	}
	    	if(numero==NumeroCarte._3 && type == TypCarte.Pique){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/3Pique.png"));
	    	}
	    	if(numero==NumeroCarte._4 && type == TypCarte.Pique){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/4Pique.png"));
	    	}
	    	if(numero==NumeroCarte._5 && type == TypCarte.Pique){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/5Pique.png"));
	    	}
	    	if(numero==NumeroCarte._6 && type == TypCarte.Pique){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/6Pique.png"));
	    	}
	    	if(numero==NumeroCarte._7 && type == TypCarte.Pique){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/7Pique.png"));
	    	}
	    	if(numero==NumeroCarte._8 && type == TypCarte.Pique){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/8Pique.png"));
	    	}
	    	if(numero==NumeroCarte._9 && type == TypCarte.Pique){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/9Pique.png"));
	    	}
	    	if(numero==NumeroCarte._10 && type == TypCarte.Pique){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/10Pique.png"));
	    	}
	    	if(numero==NumeroCarte._V && type == TypCarte.Pique){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/VPique.png"));
	    	}
	    	if(numero==NumeroCarte._D && type == TypCarte.Pique){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/DPique.png"));
	    	}
	    	if(numero==NumeroCarte._R && type == TypCarte.Pique){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/RPique.png"));
	    	}
	    	if(numero==NumeroCarte._1 && type == TypCarte.Trefle){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/1Trefle.png"));
	    	}
	    	if(numero==NumeroCarte._2 && type == TypCarte.Trefle){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/2Trefle.png"));
	    	}
	    	if(numero==NumeroCarte._3 && type == TypCarte.Trefle){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/3Trefle.png"));
	    	}
	    	if(numero==NumeroCarte._4 && type == TypCarte.Trefle){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/4Trefle.png"));
	    	}
	    	if(numero==NumeroCarte._5 && type == TypCarte.Trefle){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/5Trefle.png"));
	    	}
	    	if(numero==NumeroCarte._6 && type == TypCarte.Trefle){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/6Trefle.png"));
	    	}
	    	if(numero==NumeroCarte._7 && type == TypCarte.Trefle){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/7Trefle.png"));
	    	}
	    	if(numero==NumeroCarte._8 && type == TypCarte.Trefle){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/8Trefle.png"));
	    	}
	    	if(numero==NumeroCarte._9 && type == TypCarte.Trefle){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/9Trefle.png"));
	    	}
	    	if(numero==NumeroCarte._10 && type == TypCarte.Trefle){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/10Trefle.png"));
	    	}
	    	if(numero==NumeroCarte._V && type == TypCarte.Trefle){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/VTrefle.png"));
	    	}
	    	if(numero==NumeroCarte._D && type == TypCarte.Trefle){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/DTrefle.png"));
	    	}
	    	if(numero==NumeroCarte._R && type == TypCarte.Trefle){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/RTrefle.png"));
	    	}
	    	if(numero==NumeroCarte._1 && type == TypCarte.Coeur){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/1Coeur.png"));
	    	}
	    	if(numero==NumeroCarte._2 && type == TypCarte.Coeur){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/2Coeur.png"));
	    	}
	    	if(numero==NumeroCarte._3 && type == TypCarte.Coeur){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/3Coeur.png"));
	    	}
	    	if(numero==NumeroCarte._4 && type == TypCarte.Coeur){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/4Coeur.png"));
	    	}
	    	if(numero==NumeroCarte._5 && type == TypCarte.Coeur){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/5Coeur.png"));
	    	}
	    	if(numero==NumeroCarte._6 && type == TypCarte.Coeur){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/6Coeur.png"));
	    	}
	    	if(numero==NumeroCarte._7 && type == TypCarte.Coeur){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/7Coeur.png"));
	    	}
	    	if(numero==NumeroCarte._8 && type == TypCarte.Coeur){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/8Coeur.png"));
	    	}
	    	if(numero==NumeroCarte._9 && type == TypCarte.Coeur){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/9Coeur.png"));
	    	}
	    	if(numero==NumeroCarte._10 && type == TypCarte.Coeur){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/10Coeur.png"));
	    	}
	    	if(numero==NumeroCarte._V && type == TypCarte.Coeur){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/VCoeur.png"));
	    	}
	    	if(numero==NumeroCarte._D && type == TypCarte.Coeur){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/DCoeur.png"));
	    	}
	    	if(numero==NumeroCarte._R && type == TypCarte.Coeur){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/RCoeur.png"));
	    	}
	    	if(numero==NumeroCarte._1 && type == TypCarte.Carreau){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/1Carreau.png"));
	    	}
	    	if(numero==NumeroCarte._2 && type == TypCarte.Carreau){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/2Carreau.png"));
	    	}
	    	if(numero==NumeroCarte._3 && type == TypCarte.Carreau){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/3Carreau.png"));
	    	}
	    	if(numero==NumeroCarte._4 && type == TypCarte.Carreau){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/4Carreau.png"));
	    	}
	    	if(numero==NumeroCarte._5 && type == TypCarte.Carreau){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/5Carreau.png"));
	    	}
	    	if(numero==NumeroCarte._6 && type == TypCarte.Carreau){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/6Carreau.png"));
	    	}
	    	if(numero==NumeroCarte._7 && type == TypCarte.Carreau){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/7Carreau.png"));
	    	}
	    	if(numero==NumeroCarte._8 && type == TypCarte.Carreau){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/8Carreau.png"));
	    	}
	    	if(numero==NumeroCarte._9 && type == TypCarte.Carreau){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/9Carreau.png"));
	    	}
	    	if(numero==NumeroCarte._10 && type == TypCarte.Carreau){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/10Carreau.png"));
	    	}
	    	if(numero==NumeroCarte._V && type == TypCarte.Carreau){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/VCarreau.png"));
	    	}
	    	if(numero==NumeroCarte._D && type == TypCarte.Carreau){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/DCarreau.png"));
	    	}
	    	if(numero==NumeroCarte._R && type == TypCarte.Carreau){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/RCarreau.png"));
	    	}
	    	if(numero==NumeroCarte._J && type == TypCarte.JN){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/JN.png"));
	    	}
	    	if(numero==NumeroCarte._J && type == TypCarte.JR){
	    		img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/JR.png"));
	    	}
	    } catch (IOException e) {
	    }
	    
	    g = img.getGraphics();
	    g.drawImage(img,this.getWidth(), this.getHeight(), this);
	  
  } 
  
  public void repaint(Graphics g){
	    //x1, y1, width, height, arcWidth, arcHeight

		    BufferedImage img = null;
		    try {
		        img = ImageIO.read(new File("C:/Users/Pret/Desktop/GM05/LO02/Projet/Partie 3 - Interf Graph/Graphique2/image/dos.png"));
		    } catch (IOException e) {
		    }
		    g = img.getGraphics();
		    g.drawImage(img,this.getWidth(), this.getHeight(), this);
  }*/
}
