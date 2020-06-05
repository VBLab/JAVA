package warrior2Pack;

public class Potion extends Case {
	// attributs

    private String name;
    private int vie;

    // Constructeur
    public Potion(String name, int vie) {
        setName(name);
        setVie(vie);
    }

    // Methode
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

	@Override
	public void interaction(Personnages joueur) {
		/*int nouvelleVie = joueur.getVie() + this.vie;
		joueur.setVie(nouvelleVie); */
		
		joueur.setVie(joueur.getVie() + this.vie);
		//System.out.println("Bravo ! Tu as gangé de la vie");//
		
	}
}

//constructeur
