package warrior2Pack;

import java.util.Scanner;

public class Game {
	private Scanner scanner;
	private Personnages joueur;
	
	// constructeur 
	
	public Game() {
		scanner = new Scanner(System.in);
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
            System.out.println("Jouer");
            break;
        case 3:
            System.out.println("a plus");
            break;
        }
           
        } while (choix < 1 || choix > 3);
    // Tant que tu ne tapes pas un de ces choix,(!= différent de...) retour au menu//
    }
	// création d'un nouveau personnage = choix N
	//-affichage dans la console et récupère les entrées clavier//
	// création d'un nouveau personnage = choix N
	//-affichage dans la console et récupère les entrées clavier//
	    private void creatPersonnage() {
	        System.out.println("Créer un personnage");
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

}

// PROJET 1//
// + int etatDuJeu
// + Personnages p
// + Menu m
// + void jourParie()
// + int positionPersonnage
//+ void creerPersonnage()