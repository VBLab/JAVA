package warrior.vue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public  class GUI extends JFrame{
    // Atribut
	//Private JPanel pan = new JPanel ();

    // Constructeur
	// instantiation  de la fenetre interfaceGraph
    public GUI() {
        this.setSize(1280,720);
        this.setTitle("Warriors Jeu");
        this.setLocation(10,10);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // affichage de la barre
        this.setJMenuBar(this.BarreDeMenu());
       // doit �tre � la fin sinon on affiche la fen�tre avant que la barre ne lui soit associ�e...
        this.setVisible(true);
    }
    
    

    // Methode
 public  JMenuBar BarreDeMenu() {
	 //cr�ation d'une barre de menu (container global)
	 JMenuBar menuBar = new JMenuBar ();
	 
	 // cr�ation de la partie jeux contenu dans la barre de menu = menu 1
	 JMenu menu1 = new JMenu ("Jeux");
	 	// dans le menu jeux, nouveaux items
	 	JMenuItem nouveauPersonnage = new JMenuItem ("Nouveau Personnage");
	 	menu1.add(nouveauPersonnage);
	 	JMenuItem exit = new JMenuItem("quitter");
	 	menu1.add(exit);
		//l'ajout  de tout �a au container menu1
	 	menuBar.add(menu1);
	 // cr�ation de la partie Configuration dans la barre de menu = menu2	
	 JMenu menu2 = new JMenu ("Configuration");
	 // dans le menu configuration, nouveaux items
	 	JMenuItem essai1 = new JMenuItem ("essai 1");
	 	menu2.add(essai1);
	 	JMenuItem essai2 = new JMenuItem ("essai 2");
	 	menu2.add(essai2);
	 	//ajout de tout �a au container menu2
	 	menuBar.add(menu2);
	 //rappel de la barre de menu	
	 setJMenuBar(menuBar);
	 return menuBar;
	 
 }
}

 /*public JButton BoutonJouer () {
	 JButton menuBouton = new JButton ();
 }*/

 
 
 
 


