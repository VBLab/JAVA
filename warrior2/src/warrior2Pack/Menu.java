package warrior2Pack;

import java.util.Scanner;

public class Menu {
	// attributs
	private Scanner scanner;
   // constructeur
	public Menu() {
		scanner = new Scanner(System.in);
	}
   // afficher le menu 
	public int afficherMenuPrincipal() {
		int choix ;
		System.out.println("Menu");
		System.out.println("1: Nouveau Personnage");
		System.out.println("2: Jouer");
		System.out.println("3: Quitter");
		/*
		 * on va utiliser la librairie scanner avec la méthode nextLine, pour lire les
		 * entrées clavier.
		 */
		// nextLine stoke les lettres, netInt pour les chiffres//
		choix = scanner.nextInt();

		System.out.println();
		return choix;
	}
	// afficher le dé
	
	public  int afficherDice(int dice, int position) {
		System.out.println("le dé est lancé" + dice);
		System.out.println("Nouvelle position"+ position);
		System.out.println("5.relancer le dé");
		return scanner.nextInt();
	}
}
