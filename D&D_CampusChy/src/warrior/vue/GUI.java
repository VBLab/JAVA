package warrior.vue;

import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public  class GUI extends JFrame{
    // Atribut
 
	SpringLayout layout = new SpringLayout();
	Plateau plaplateau = new Plateau();
	JPanel backPanel = new BackGroundPanel();//créer une classe background panel
	JPanel avatarPanel = new  FenetreJoueur();

    // Constructeur
	/** instantiation  de la fenetre interfaceGraph**/
    public GUI() {
        this.setSize(1500,1000);
        this.setResizable(false);
        this.setTitle("Warriors Jeu");
        this.setLocation(10,10);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // affichage de la barre
       this.setJMenuBar(this.BarreDeMenu());
       this.setContentPane(this.ZoneTravail()); 
       
       backPanel.setPreferredSize(new Dimension(1500, 1000));
       this.add(backPanel);
 
        avatarPanel.setPreferredSize(new Dimension(200,150));
        this.add(avatarPanel);
        
        
        //appel du plateau (class Plateau)--en test pour l'instant--
       // this.setContentPane(new Plateau());
        
        
     // doit être à la fin sinon on affiche la fenêtre avant que la barre ne lui soit associée...
        this.setVisible(true);
     
    }
    
    

    // Methode
    
 public  JMenuBar BarreDeMenu() {
	 //création d'une barre de menu (container global)
	 JMenuBar menuBar = new JMenuBar ();
	 
	 /** création de la partie jeux contenu dans la barre de menu = menu 1**/
	 
	 JMenu menu1 = new JMenu ("Jeux");
	 	// dans le menu jeux, nouveaux items
	 	JMenuItem nouveauPersonnage = new JMenuItem ("Nouveau Personnage");
	 	menu1.add(nouveauPersonnage);
	 	JMenuItem exit = new JMenuItem("quitter");
	 	menu1.add(exit);
		//l'ajout  de tout ça au container menu1
	 	menuBar.add(menu1);
	 // création de la partie Configuration dans la barre de menu = menu2	
	 JMenu menu2 = new JMenu ("Configuration");
	 // dans le menu configuration, nouveaux items
	 	JMenuItem essai1 = new JMenuItem ("essai 1");
	 	menu2.add(essai1);
	 	JMenuItem essai2 = new JMenuItem ("essai 2");
	 	menu2.add(essai2);
	 	//ajout de tout ça au container menu2
	 	menuBar.add(menu2);
	 //rappel de la barre de menu	
	 setJMenuBar(menuBar);
	 return menuBar;
	 
 }
 /** JPanel = composant de type container dont la vocation
 est d'accueillir d'autres objets de même types ou d'autres objets d types composants.**/
        
        
 public JPanel ZoneTravail() {
	 
	 JPanel pan = new JPanel ();//création zone de travail
	 pan.setBackground(Color.GRAY); // definition de sa couleur de fond
	 pan.setLayout(layout);
	
	 JPanel titreAccueil = new JPanel ();
	 layout.putConstraint(SpringLayout.WEST, titreAccueil,40, SpringLayout.WEST, pan);
	 layout.putConstraint(SpringLayout.EAST, titreAccueil,-400, SpringLayout.EAST, pan);
	 layout.putConstraint(SpringLayout.NORTH, titreAccueil,50, SpringLayout.NORTH, pan);
	 layout.putConstraint(SpringLayout.SOUTH, titreAccueil,-810, SpringLayout.SOUTH, pan);
	 pan.add(titreAccueil);
	 
	// new Plateau ();
	 JPanel plateauJeux =new Plateau(); //=>panel plateau accroché à la class Plateau
	 plateauJeux.setBackground(Color.BLACK);
	 layout.putConstraint(SpringLayout.WEST, plateauJeux,40, SpringLayout.WEST, pan);
	 layout.putConstraint(SpringLayout.EAST, plateauJeux,-400, SpringLayout.EAST, pan);
	 layout.putConstraint(SpringLayout.NORTH, plateauJeux,150, SpringLayout.NORTH, pan);
	 layout.putConstraint(SpringLayout.SOUTH, plateauJeux,-40, SpringLayout.SOUTH, pan);
	 pan.add(plateauJeux);
	
	 JPanel fenetreJoueur = new JPanel ();
	 fenetreJoueur.setBackground(Color.LIGHT_GRAY);
	 layout.putConstraint(SpringLayout.WEST, fenetreJoueur,1150, SpringLayout.WEST, pan);
	 layout.putConstraint(SpringLayout.EAST, fenetreJoueur,-10, SpringLayout.EAST, pan);
	 layout.putConstraint(SpringLayout.NORTH, fenetreJoueur,50, SpringLayout.NORTH, pan);
	 layout.putConstraint(SpringLayout.SOUTH, fenetreJoueur,-40, SpringLayout.SOUTH, pan);
	 pan.add(fenetreJoueur);
	 
	 
	 JButton rollDice = new JButton ("lancer le Dé");
	 layout.putConstraint(SpringLayout.WEST, rollDice,1200, SpringLayout.WEST, pan);
	 layout.putConstraint(SpringLayout.EAST, rollDice,-90, SpringLayout.EAST, pan);
	 layout.putConstraint(SpringLayout.NORTH, rollDice,750, SpringLayout.NORTH, pan);
	 plateauJeux.add(rollDice);
	 
	 
	 
	 JButton attaquer = new JButton ("Attaquer");
	 layout.putConstraint(SpringLayout.WEST, attaquer,1500, SpringLayout.WEST, pan);
	 layout.putConstraint(SpringLayout.EAST,attaquer ,-90, SpringLayout.EAST, pan);
	 layout.putConstraint(SpringLayout.NORTH, attaquer,800, SpringLayout.NORTH, pan);
	 plateauJeux.add(attaquer);
	 
	 
	 JButton defendre = new JButton ("défendre");
	 layout.putConstraint(SpringLayout.WEST, defendre,1500, SpringLayout.WEST, pan);
	 layout.putConstraint(SpringLayout.EAST,defendre ,-90, SpringLayout.EAST, pan);
	 layout.putConstraint(SpringLayout.NORTH, defendre,850, SpringLayout.NORTH, pan);
	 plateauJeux.add(defendre);
	 
	 JButton boutonEx = new JButton("Quitté");
     //boutonEx.setBackground(Color.BLACK);
     layout.putConstraint(SpringLayout.WEST, boutonEx,1200, SpringLayout.WEST, pan);
     layout.putConstraint(SpringLayout.EAST, boutonEx,-90, SpringLayout.EAST, pan);
     layout.putConstraint(SpringLayout.NORTH, boutonEx,800, SpringLayout.NORTH, pan);
     plateauJeux.add(boutonEx);
	 
	 
	 return pan;
	 }
 
	
}

 /*public JButton BoutonJouer () { //pour lancer la partie
	 JButton menuBouton = new JButton ();
 }*/

/*JButton boutonDé = new JButton("Lancer le dé");
//boutonDé.setBackground(Color.BLACK);
layout.putConstraint(SpringLayout.WEST, boutonDé,1200, SpringLayout.WEST, pan);
layout.putConstraint(SpringLayout.EAST, boutonDé,-90, SpringLayout.EAST, pan);
layout.putConstraint(SpringLayout.NORTH, boutonDé,750, SpringLayout.NORTH, pan);
pan.add(boutonDé);*/
 
 
 
 


