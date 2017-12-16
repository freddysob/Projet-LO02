import java.awt.Color; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class InterfaceGraphique extends JFrame{
  public static void main(String[] args){

    JFrame fenetre = new JFrame();
                
    //Définit un titre pour notre fenêtre
    fenetre.setTitle("Jeu du 8 Americain");
    
    //Définit sa taille : 400 pixels de large et 100 pixels de haut
    fenetre.setSize(400, 100);
    
    JPanel pan = new JPanel();
    
    //Nous demandons maintenant à notre objet de se positionner au centre
    fenetre.setLocationRelativeTo(null);
    
    //Termine le processus lorsqu'on clique sur la croix rouge
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //Et enfin, la rendre visible        
    fenetre.setVisible(true);
    
    fenetre.setContentPane(pan);
    
    pan.setBackground(Color.GRAY);
    
       





//  public Fenetre(){
//		
//    this.setTitle("Box Layout");
//    this.setSize(300, 120);
//    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    this.setLocationRelativeTo(null);

    JPanel b1 = new JPanel();
    //On définit le layout en lui indiquant qu'il travaillera en ligne
    b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
    b1.add(new JButton("Joueur 1"));

    JPanel b2 = new JPanel();
    //Idem pour cette ligne
    b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
    b2.add(new JButton("Joueur 2"));
    b2.add(new JButton("Joueur 3"));

    
    JPanel b3 = new JPanel();
    //Idem pour cette ligne
    b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
    b3.add(new JButton("Joueur 4"));
    b3.add(new JButton("Joueur 5"));
    b3.add(new JButton("Joueur 6"));

    
    JPanel b4 = new JPanel();
    //On positionne maintenant ces trois lignes en colonne
    b4.setLayout(new BoxLayout(b4, BoxLayout.PAGE_AXIS));
    b4.add(b1);
    b4.add(b2);
    b4.add(b3);
		
    fenetre.getContentPane().add(b4);
    fenetre.setVisible(true);
    
  }
  }
  
