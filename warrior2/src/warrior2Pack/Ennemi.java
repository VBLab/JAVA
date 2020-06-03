package warrior2Pack;

public class Ennemi extends Case {
	// Atribut
    private String name;
    private int vie;
    private int attaque;

    // Constructeur
    public Ennemi(String name, int vie, int attaque) {
        setName(name);
        setVie(vie);
        setAttaque(attaque);
    }
    

   
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

    
    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }


    // utilisation de la méthode abstract de Case
	@Override
	public void interaction() {
		System.out.println(this.name);
		
	}



	@Override
	public void interaction(Personnages joueur) {
		// TODO Auto-generated method stub
		
	}
 
}
