package warriorPack;

import java.util.Scanner; /*import pour lecture touche clavier*/

public class Main {

	public static void main(String[] args) { /*  => ça c'est mon programme principale */
		Menu menu = new Menu();
		Menu.start();
		
		Board board = new Board();
		System.out.println(board.toString());
		
		
		
		
		
		System.out.println ("début du jeu");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Quelle catégorie ? guerrier ou Magicien ? :");
		
		String str = sc.nextLine();
		
		System.out.println("Vous avez saisi : "+ str);
		
		Menu men = new Menu("start Game !", "Créer ton personnage"); // instancier le menu */
		
		Guerrier gue = new Guerrier("ImWarrior",9, 0); // instancier guerrier
		
		Magicien mag = new Magicien("ImWizard", 15, 3); // instancier  magicien
		
		gue.spawnGuerrier(str);
		mag.spawnMagicien(str);
		
		System.out.println();

	}

}
