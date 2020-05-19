package warriorPack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println ("début du jeu");
		Scanner sc = new Scanner (System.in);
		System.out.println ("Quelle catégorie ? guerrier ou Magicien ? :");
		String str = sc.nextLine();
		System.out.println("Vous avez saisi : "+ str);
		Menu men = new Menu("start Game !", "Créer ton personnage");
		Guerrier gue = new Guerrier("ImWarrior",9, 0);
		Magicien mag = new Magicien("ImWizard", 15, 3);
		gue.spawnGuerrier(str);
		mag.spawnMagicien(str);
		
		

	}

}
