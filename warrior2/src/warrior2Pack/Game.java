package warrior2Pack;

import java.util.Scanner;

public class Game {
	//attributs
	private Menu menu;
	private Scanner scanner;
	private Personnages joueur;
	private int positionJoueur;
	private Board board;
	
	
	// constructeur 
	
	public Game() {
		scanner = new Scanner(System.in);
		this.menu = new Menu ();
		this.board = new Board ();
	}
	public void start() {
		Menu menu = new Menu();
        int choix;
        do {
        	
        	choix = menu.afficherMenuPrincipal();
        			switch (choix) {
        case 1:
            this.creatPersonnage();
            break;
        case 2:
            System.out.println("Jouer \n");
            this.rollDice();
            break;
        case 3:
            System.out.println("a plus");
            break;
        }
           
        } while (choix < 1 || choix > 3);
    // Tant que tu ne tapes pas un de ces choix,(!= diff�rent de...) retour au menu//
    }
	// cr�ation d'un nouveau personnage = choix N
	//-affichage dans la console et r�cup�re les entr�es clavier//
	// cr�ation d'un nouveau personnage = choix N
	//-affichage dans la console et r�cup�re les entr�es clavier//
	    private void creatPersonnage() {
	        System.out.println("Cr�er un personnage");
	        System.out.println("1. Guerrier");
	        System.out.println("2. Magicien");
	        int choix = scanner.nextInt();
	        System.out.println("Entrer votre nom");
	        String name = scanner.next();
	        System.out.println(choix + name);
	        
	        switch (choix) {
	        case 1:
	            this.setJoueur(new Guerrier(name));
	           // System.out.println(name);//
	            break;
	        case 2:
	            this.setJoueur(new Magicien(name));
	            break;
	        }
	    }

	    public Personnages getJoueur() {
	        return joueur;
	    }

	    public void setJoueur(Personnages joueur) {
	        this.joueur = joueur;
	    }
	    

	    
	    
	    // rollDice = d�
 public void rollDice() {
	int option;
	int dice = 1 +(int) (Math.random()*6);
	position(dice);
	option = menu.afficherDice(dice, this.positionJoueur);
	if (this.positionJoueur < Board.cases);
	switch (option) {
	case 5:
		this.rollDice();
		break;
	}
	}
	public void position() {
		 this.positionJoueur = this.positionJoueur + dice;
		 if (positionJoueur > this.board) {
			 positionJoueur = CASE_MAX;
			 
		 }
	}
	}

// PROJET 1//
// + int etatDuJeu
// + Personnages p
// + Menu m
// + void jourParie()
// + int positionPersonnage
//+ void creerPersonnage()