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
		 * on va utiliser la librairie scanner avec la m�thode nextLine, pour lire les
		 * entr�es clavier.
		 */
		// nextLine stoke les lettres, netInt pour les chiffres//
		choix = scanner.nextInt();

		System.out.println();
		return choix;
	}
	// afficher le d�
	
	public  int afficherDice(int dice, int position) {
		System.out.println("le d� est lanc�" + dice);
		System.out.println("Nouvelle position"+ position);
		System.out.println("5.relancer le d�");
		return scanner.nextInt();
	}
}
