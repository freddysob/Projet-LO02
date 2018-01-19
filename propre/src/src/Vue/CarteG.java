package Vue;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLayeredPane;

import Modele.*;

public class CarteG extends JButton {

	/** Permet de donner une visualisation graphique à une carte*/
	private static final long serialVersionUID = 1L;
	
	/** numéro de la carte dans le modèle*/
	public NumeroCarte numero;
	
	/** type de la carte dans le modèle*/
	public TypCarte type;
	/** Panel dans lequel se trouve la carte*/
	public JLayeredPane panel;
	/** Permet de savoir si est affiché la face de la carte*/
	public boolean positionFace;

	/** Constructeur liant une carte à son image*/
	public CarteG(NumeroCarte num, TypCarte typ, JLayeredPane p1) {
		this.numero = num;
		this.type = typ;
		this.panel = p1;
		positionFace = true;

		BufferedImage img = null;

		try {
			if (numero == NumeroCarte._1 && type == TypCarte.Pique) {
				img = ImageIO.read(new File("src/image/1Pique.png"));
			}
			if (numero == NumeroCarte._2 && type == TypCarte.Pique) {
				img = ImageIO.read(new File("src/image/2Pique.png"));
			}
			if (numero == NumeroCarte._3 && type == TypCarte.Pique) {
				img = ImageIO.read(new File("src/image/3Pique.png"));
			}
			if (numero == NumeroCarte._4 && type == TypCarte.Pique) {
				img = ImageIO.read(new File("src/image/4Pique.png"));
			}
			if (numero == NumeroCarte._5 && type == TypCarte.Pique) {
				img = ImageIO.read(new File("src/image/5Pique.png"));
			}
			if (numero == NumeroCarte._6 && type == TypCarte.Pique) {
				img = ImageIO.read(new File("src/image/6Pique.png"));
			}
			if (numero == NumeroCarte._7 && type == TypCarte.Pique) {
				img = ImageIO.read(new File("src/image/7Pique.png"));
			}
			if (numero == NumeroCarte._8 && type == TypCarte.Pique) {
				img = ImageIO.read(new File("src/image/8Pique.png"));
			}
			if (numero == NumeroCarte._9 && type == TypCarte.Pique) {
				img = ImageIO.read(new File("src/image/9Pique.png"));
			}
			if (numero == NumeroCarte._10 && type == TypCarte.Pique) {
				img = ImageIO.read(new File("src/image/10Pique.png"));
			}
			if (numero == NumeroCarte._V && type == TypCarte.Pique) {
				img = ImageIO.read(new File("src/image/VPique.png"));
			}
			if (numero == NumeroCarte._D && type == TypCarte.Pique) {
				img = ImageIO.read(new File("src/image/DPique.png"));
			}
			if (numero == NumeroCarte._R && type == TypCarte.Pique) {
				img = ImageIO.read(new File("src/image/RPique.png"));
			}
			if (numero == NumeroCarte._1 && type == TypCarte.Trefle) {
				img = ImageIO.read(new File("src/image/1Trefle.png"));
			}
			if (numero == NumeroCarte._2 && type == TypCarte.Trefle) {
				img = ImageIO.read(new File("src/image/2Trefle.png"));
			}
			if (numero == NumeroCarte._3 && type == TypCarte.Trefle) {
				img = ImageIO.read(new File("src/image/3Trefle.png"));
			}
			if (numero == NumeroCarte._4 && type == TypCarte.Trefle) {
				img = ImageIO.read(new File("src/image/4Trefle.png"));
			}
			if (numero == NumeroCarte._5 && type == TypCarte.Trefle) {
				img = ImageIO.read(new File("src/image/5Trefle.png"));
			}
			if (numero == NumeroCarte._6 && type == TypCarte.Trefle) {
				img = ImageIO.read(new File("src/image/6Trefle.png"));
			}
			if (numero == NumeroCarte._7 && type == TypCarte.Trefle) {
				img = ImageIO.read(new File("src/image/7Trefle.png"));
			}
			if (numero == NumeroCarte._8 && type == TypCarte.Trefle) {
				img = ImageIO.read(new File("src/image/8Trefle.png"));
			}
			if (numero == NumeroCarte._9 && type == TypCarte.Trefle) {
				img = ImageIO.read(new File("src/image/9Trefle.png"));
			}
			if (numero == NumeroCarte._10 && type == TypCarte.Trefle) {
				img = ImageIO.read(new File("src/image/10Trefle.png"));
			}
			if (numero == NumeroCarte._V && type == TypCarte.Trefle) {
				img = ImageIO.read(new File("src/image/VTrefle.png"));
			}
			if (numero == NumeroCarte._D && type == TypCarte.Trefle) {
				img = ImageIO.read(new File("src/image/DTrefle.png"));
			}
			if (numero == NumeroCarte._R && type == TypCarte.Trefle) {
				img = ImageIO.read(new File("src/image/RTrefle.png"));
			}
			if (numero == NumeroCarte._1 && type == TypCarte.Coeur) {
				img = ImageIO.read(new File("src/image/1Coeur.png"));
			}
			if (numero == NumeroCarte._2 && type == TypCarte.Coeur) {
				img = ImageIO.read(new File("src/image/2Coeur.png"));
			}
			if (numero == NumeroCarte._3 && type == TypCarte.Coeur) {
				img = ImageIO.read(new File("src/image/3Coeur.png"));
			}
			if (numero == NumeroCarte._4 && type == TypCarte.Coeur) {
				img = ImageIO.read(new File("src/image/4Coeur.png"));
			}
			if (numero == NumeroCarte._5 && type == TypCarte.Coeur) {
				img = ImageIO.read(new File("src/image/5Coeur.png"));
			}
			if (numero == NumeroCarte._6 && type == TypCarte.Coeur) {
				img = ImageIO.read(new File("src/image/6Coeur.png"));
			}
			if (numero == NumeroCarte._7 && type == TypCarte.Coeur) {
				img = ImageIO.read(new File("src/image/7Coeur.png"));
			}
			if (numero == NumeroCarte._8 && type == TypCarte.Coeur) {
				img = ImageIO.read(new File("src/image/8Coeur.png"));
			}
			if (numero == NumeroCarte._9 && type == TypCarte.Coeur) {
				img = ImageIO.read(new File("src/image/9Coeur.png"));
			}
			if (numero == NumeroCarte._10 && type == TypCarte.Coeur) {
				img = ImageIO.read(new File("src/image/10Coeur.png"));
			}
			if (numero == NumeroCarte._V && type == TypCarte.Coeur) {
				img = ImageIO.read(new File("src/image/VCoeur.png"));
			}
			if (numero == NumeroCarte._D && type == TypCarte.Coeur) {
				img = ImageIO.read(new File("src/image/DCoeur.png"));
			}
			if (numero == NumeroCarte._R && type == TypCarte.Coeur) {
				img = ImageIO.read(new File("src/image/RCoeur.png"));
			}
			if (numero == NumeroCarte._1 && type == TypCarte.Carreau) {
				img = ImageIO.read(new File("src/image/1Carreau.png"));
			}
			if (numero == NumeroCarte._2 && type == TypCarte.Carreau) {
				img = ImageIO.read(new File("src/image/2Carreau.png"));
			}
			if (numero == NumeroCarte._3 && type == TypCarte.Carreau) {
				img = ImageIO.read(new File("src/image/3Carreau.png"));
			}
			if (numero == NumeroCarte._4 && type == TypCarte.Carreau) {
				img = ImageIO.read(new File("src/image/4Carreau.png"));
			}
			if (numero == NumeroCarte._5 && type == TypCarte.Carreau) {
				img = ImageIO.read(new File("src/image/5Carreau.png"));
			}
			if (numero == NumeroCarte._6 && type == TypCarte.Carreau) {
				img = ImageIO.read(new File("src/image/6Carreau.png"));
			}
			if (numero == NumeroCarte._7 && type == TypCarte.Carreau) {
				img = ImageIO.read(new File("src/image/7Carreau.png"));
			}
			if (numero == NumeroCarte._8 && type == TypCarte.Carreau) {
				img = ImageIO.read(new File("src/image/8Carreau.png"));
			}
			if (numero == NumeroCarte._9 && type == TypCarte.Carreau) {
				img = ImageIO.read(new File("src/image/9Carreau.png"));
			}
			if (numero == NumeroCarte._10 && type == TypCarte.Carreau) {
				img = ImageIO.read(new File("src/image/10Carreau.png"));
			}
			if (numero == NumeroCarte._V && type == TypCarte.Carreau) {
				img = ImageIO.read(new File("src/image/VCarreau.png"));
			}
			if (numero == NumeroCarte._D && type == TypCarte.Carreau) {
				img = ImageIO.read(new File("src/image/DCarreau.png"));
			}
			if (numero == NumeroCarte._R && type == TypCarte.Carreau) {
				img = ImageIO.read(new File("src/image/RCarreau.png"));
			}
			if (numero == NumeroCarte._J && type == TypCarte.JN) {
				img = ImageIO.read(new File("src/image/JN.png"));
			}
			if (numero == NumeroCarte._J && type == TypCarte.JR) {
				img = ImageIO.read(new File("src/image/JR.png"));
			}

			this.setBounds(20, 20, 80, 120);
			this.setIcon(new ImageIcon(img));

		} catch (IOException e) {
		}

	}

	/** Permet de mettre la carte de face, ou l'inverse*/
	public void retourner() {

		if (positionFace) {
			BufferedImage img = null;
			try {
				img = ImageIO.read(new File("src/image/dos.png"));
				this.setIcon(new ImageIcon(img));

				positionFace = false;
				this.setBounds(20, 20, 80, 120);
			} catch (IOException e) {
			}
		} else {

			BufferedImage img = null;

			try {
				if (numero == NumeroCarte._1 && type == TypCarte.Pique) {
					img = ImageIO.read(new File("src/image/1Pique.png"));
				}
				if (numero == NumeroCarte._2 && type == TypCarte.Pique) {
					img = ImageIO.read(new File("src/image/2Pique.png"));
				}
				if (numero == NumeroCarte._3 && type == TypCarte.Pique) {
					img = ImageIO.read(new File("src/image/3Pique.png"));
				}
				if (numero == NumeroCarte._4 && type == TypCarte.Pique) {
					img = ImageIO.read(new File("src/image/4Pique.png"));
				}
				if (numero == NumeroCarte._5 && type == TypCarte.Pique) {
					img = ImageIO.read(new File("src/image/5Pique.png"));
				}
				if (numero == NumeroCarte._6 && type == TypCarte.Pique) {
					img = ImageIO.read(new File("src/image/6Pique.png"));
				}
				if (numero == NumeroCarte._7 && type == TypCarte.Pique) {
					img = ImageIO.read(new File("src/image/7Pique.png"));
				}
				if (numero == NumeroCarte._8 && type == TypCarte.Pique) {
					img = ImageIO.read(new File("src/image/8Pique.png"));
				}
				if (numero == NumeroCarte._9 && type == TypCarte.Pique) {
					img = ImageIO.read(new File("src/image/9Pique.png"));
				}
				if (numero == NumeroCarte._10 && type == TypCarte.Pique) {
					img = ImageIO.read(new File("src/image/10Pique.png"));
				}
				if (numero == NumeroCarte._V && type == TypCarte.Pique) {
					img = ImageIO.read(new File("src/image/VPique.png"));
				}
				if (numero == NumeroCarte._D && type == TypCarte.Pique) {
					img = ImageIO.read(new File("src/image/DPique.png"));
				}
				if (numero == NumeroCarte._R && type == TypCarte.Pique) {
					img = ImageIO.read(new File("src/image/RPique.png"));
				}
				if (numero == NumeroCarte._1 && type == TypCarte.Trefle) {
					img = ImageIO.read(new File("src/image/1Trefle.png"));
				}
				if (numero == NumeroCarte._2 && type == TypCarte.Trefle) {
					img = ImageIO.read(new File("src/image/2Trefle.png"));
				}
				if (numero == NumeroCarte._3 && type == TypCarte.Trefle) {
					img = ImageIO.read(new File("src/image/3Trefle.png"));
				}
				if (numero == NumeroCarte._4 && type == TypCarte.Trefle) {
					img = ImageIO.read(new File("src/image/4Trefle.png"));
				}
				if (numero == NumeroCarte._5 && type == TypCarte.Trefle) {
					img = ImageIO.read(new File("src/image/5Trefle.png"));
				}
				if (numero == NumeroCarte._6 && type == TypCarte.Trefle) {
					img = ImageIO.read(new File("src/image/6Trefle.png"));
				}
				if (numero == NumeroCarte._7 && type == TypCarte.Trefle) {
					img = ImageIO.read(new File("src/image/7Trefle.png"));
				}
				if (numero == NumeroCarte._8 && type == TypCarte.Trefle) {
					img = ImageIO.read(new File("src/image/8Trefle.png"));
				}
				if (numero == NumeroCarte._9 && type == TypCarte.Trefle) {
					img = ImageIO.read(new File("src/image/9Trefle.png"));
				}
				if (numero == NumeroCarte._10 && type == TypCarte.Trefle) {
					img = ImageIO.read(new File("src/image/10Trefle.png"));
				}
				if (numero == NumeroCarte._V && type == TypCarte.Trefle) {
					img = ImageIO.read(new File("src/image/VTrefle.png"));
				}
				if (numero == NumeroCarte._D && type == TypCarte.Trefle) {
					img = ImageIO.read(new File("src/image/DTrefle.png"));
				}
				if (numero == NumeroCarte._R && type == TypCarte.Trefle) {
					img = ImageIO.read(new File("src/image/RTrefle.png"));
				}
				if (numero == NumeroCarte._1 && type == TypCarte.Coeur) {
					img = ImageIO.read(new File("src/image/1Coeur.png"));
				}
				if (numero == NumeroCarte._2 && type == TypCarte.Coeur) {
					img = ImageIO.read(new File("src/image/2Coeur.png"));
				}
				if (numero == NumeroCarte._3 && type == TypCarte.Coeur) {
					img = ImageIO.read(new File("src/image/3Coeur.png"));
				}
				if (numero == NumeroCarte._4 && type == TypCarte.Coeur) {
					img = ImageIO.read(new File("src/image/4Coeur.png"));
				}
				if (numero == NumeroCarte._5 && type == TypCarte.Coeur) {
					img = ImageIO.read(new File("src/image/5Coeur.png"));
				}
				if (numero == NumeroCarte._6 && type == TypCarte.Coeur) {
					img = ImageIO.read(new File("src/image/6Coeur.png"));
				}
				if (numero == NumeroCarte._7 && type == TypCarte.Coeur) {
					img = ImageIO.read(new File("src/image/7Coeur.png"));
				}
				if (numero == NumeroCarte._8 && type == TypCarte.Coeur) {
					img = ImageIO.read(new File("src/image/8Coeur.png"));
				}
				if (numero == NumeroCarte._9 && type == TypCarte.Coeur) {
					img = ImageIO.read(new File("src/image/9Coeur.png"));
				}
				if (numero == NumeroCarte._10 && type == TypCarte.Coeur) {
					img = ImageIO.read(new File("src/image/10Coeur.png"));
				}
				if (numero == NumeroCarte._V && type == TypCarte.Coeur) {
					img = ImageIO.read(new File("src/image/VCoeur.png"));
				}
				if (numero == NumeroCarte._D && type == TypCarte.Coeur) {
					img = ImageIO.read(new File("src/image/DCoeur.png"));
				}
				if (numero == NumeroCarte._R && type == TypCarte.Coeur) {
					img = ImageIO.read(new File("src/image/RCoeur.png"));
				}
				if (numero == NumeroCarte._1 && type == TypCarte.Carreau) {
					img = ImageIO.read(new File("src/image/1Carreau.png"));
				}
				if (numero == NumeroCarte._2 && type == TypCarte.Carreau) {
					img = ImageIO.read(new File("src/image/2Carreau.png"));
				}
				if (numero == NumeroCarte._3 && type == TypCarte.Carreau) {
					img = ImageIO.read(new File("src/image/3Carreau.png"));
				}
				if (numero == NumeroCarte._4 && type == TypCarte.Carreau) {
					img = ImageIO.read(new File("src/image/4Carreau.png"));
				}
				if (numero == NumeroCarte._5 && type == TypCarte.Carreau) {
					img = ImageIO.read(new File("src/image/5Carreau.png"));
				}
				if (numero == NumeroCarte._6 && type == TypCarte.Carreau) {
					img = ImageIO.read(new File("src/image/6Carreau.png"));
				}
				if (numero == NumeroCarte._7 && type == TypCarte.Carreau) {
					img = ImageIO.read(new File("src/image/7Carreau.png"));
				}
				if (numero == NumeroCarte._8 && type == TypCarte.Carreau) {
					img = ImageIO.read(new File("src/image/8Carreau.png"));
				}
				if (numero == NumeroCarte._9 && type == TypCarte.Carreau) {
					img = ImageIO.read(new File("src/image/9Carreau.png"));
				}
				if (numero == NumeroCarte._10 && type == TypCarte.Carreau) {
					img = ImageIO.read(new File("src/image/10Carreau.png"));
				}
				if (numero == NumeroCarte._V && type == TypCarte.Carreau) {
					img = ImageIO.read(new File("src/image/VCarreau.png"));
				}
				if (numero == NumeroCarte._D && type == TypCarte.Carreau) {
					img = ImageIO.read(new File("src/image/DCarreau.png"));
				}
				if (numero == NumeroCarte._R && type == TypCarte.Carreau) {
					img = ImageIO.read(new File("src/image/RCarreau.png"));
				}
				if (numero == NumeroCarte._J && type == TypCarte.JN) {
					img = ImageIO.read(new File("src/image/JN.png"));
				}
				if (numero == NumeroCarte._J && type == TypCarte.JR) {
					img = ImageIO.read(new File("src/image/JR.png"));
				}

				this.setBounds(20, 20, 80, 120);
				this.setIcon(new ImageIcon(img));

				positionFace = true;
			} catch (IOException e) {
			}

		}

	}

	public NumeroCarte getNumero() {
		return numero;
	}

	public void setNumero(NumeroCarte numero) {
		this.numero = numero;
	}

	public TypCarte getType() {
		return type;
	}

	public void setType(TypCarte type) {
		this.type = type;
	}

}
