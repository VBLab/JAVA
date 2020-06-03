package warrior2Pack;

import java.util.Scanner;

public class Game {
	// attributs
	private Menu menu;
	private Scanner scanner;
	private Personnages joueur; // je vais avoir un attribut qui est de type...personnages et il s'appelle personnage...
	private int positionJoueur;
	private Board board;

	//////////////// constructeur = //////////////
	// appelée une seule fois
	// + ne retourne rien
	// + prend le nom de la classe
	// + pour instancier l'objet

	public Game() {
		scanner = new Scanner(System.in);
		this.menu = new Menu();
		this.board = new Board();
		this.joueur = new Personnages();
	}

	public void start() {
		// Menu menu = new Menu();
		int choix;
		do {

			choix = menu.afficherMenuPrincipal();
			switch (choix) {
			case 1:
				this.creatPersonnage();
				break;
			case 2:
				System.out.println("Jouer");
				this.jouerPartieRapide();

				break;
			case 3:
				System.out.println("A plus !");
				break;
			}

		} while (choix < 1 || choix > 3);
		// Tant que tu ne tapes pas un de ces choix,(!= différent de...) retour au
		// menu//
	}

	// création d'un nouveau personnage = choix N
	// -affichage dans la console et récupère les entrées clavier//
	// création d'un nouveau personnage = choix N
	// -affichage dans la console et récupère les entrées clavier//
	private void creatPersonnage() {
		System.out.println("Créer un personnage");
		System.out.println("1. Guerrier");
		System.out.println("2. Magicien");
		int choix = scanner.nextInt();
		System.out.println("Tu as choisis le " + choix);
		System.out.println("Entrer votre nom");
		String name = scanner.next();

		switch (choix) {
		case 1:
			this.setJoueur(new Guerrier(name));// création d'un nouveau guerrier
			// System.out.println(name);//
			break;
		case 2:
			this.setJoueur(new Magicien(name));
			break;
		}

		System.out.println(choix + name);
		System.out.println(joueur.toString());
		// this.joueur.setName(name);

		// System.out.println(joueur.toString());
		// this.joueur.setForce(10);
		System.out.println(joueur.getForce());
		this.jouerPartie();

	}

	public Personnages getJoueur() {
		return joueur;
	}

	public void setJoueur(Personnages joueur) {
		this.joueur = joueur;
	}

	private void jouerPartie() {
		System.out.println("Tu as choisis de t'appeler " + this.joueur.getName());
		System.out.println("Lancement de la partie");
		System.out.println("Voici ton plateau de jeu " + board.toString());

		while (this.positionJoueur < board.getMax()) {
			System.out.println(board.getTypeCase(positionJoueur)); // vérification de la position joueur au 1er tour avant lancement dé.
			int dice = rollDice();
			positionJoueur += dice; // raccourci pour écrire positionJoueur = positionJoueur+dice
			while (menu.afficherDice(dice, positionJoueur) != 5) {
			}

			 // renvoi le type de case cf board
		}
		System.out.println("Bravo ! Tu as gagné !!!!");

	}

	public int rollDice() {

		return 1 + (int) (Math.random() * 6);
	}

	public void position(int dice) {
		this.positionJoueur = this.positionJoueur + dice;
		if (this.positionJoueur > board.getMax()) {
			System.out.println("Fin du jeu");

		}
	}

	private void jouerPartieRapide() {
		int choix = 1 + (int) (Math.random() * 2);

		System.out.println("création d'un personnage aléatoire");
		switch (choix) {
		case 1:
			this.setJoueur(new Guerrier("patate"));// création d'un nouveau guerrier
			// System.out.println(name);//
			break;
		case 2:
			this.setJoueur(new Magicien("courgette"));
			break;
		}
		// System.out.println("voici ton plateau de jeu "+ board.toString());

		System.out.println(this.joueur.getName());
		this.jouerPartie();
	}

}

// PROJET 1//
// + int etatDuJeu
// + Personnages p
// + Menu m
// + void jourParie()
// + int positionPersonnage
//+ void creerPersonnage()