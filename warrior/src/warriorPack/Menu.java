package warriorPack;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Personnages joueur;

    public Menu() {
        scanner = new Scanner(System.in);
    }
    /*
     * fonction de démarrage qu'on appelle dans la main
     */
    public void start() {
        String choix;
        do {
            System.out.println("Menu");
            System.out.println("N: Nouveau Personnage");
            System.out.println("J: Jouer");
            System.out.println("Q: Quitter");
            /* on va utiliser la librairie scanner avec la méthode nextLine, pour lire les entrées clavier.*/
            //nextLine stoque les lettres, netInt pour les chiffres//
            choix = this.scanner.nextLine(); 
            switch (choix) {
            case "N":
                this.creatPersonnage();
                break;
            case "J":
                System.out.println("Jouer");
                break;
            case "Q":
                System.out.println("a plus");
                break;
            }
            System.out.println(); 
        } while (choix != "Q"); // Tant que tu ne tapes pas un de ces choix,(!= différent de...) retour au menu//
    }
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