package warrior2Pack;

import java.util.Scanner;

public class Menu {
	private Scanner scanner;

	public Menu() {
		scanner = new Scanner(System.in);
	}

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
		// nextLine stoque les lettres, netInt pour les chiffres//
		choix = scanner.nextInt();

		System.out.println();
		return choix;
	}
}
