package warrior2Pack;

public class BouleDeFeu extends Armes{
	private final static int attaque = 7;
	
// Constructeur
	public BouleDeFeu(String name, int attaque) {
		super(name,attaque);
	}
	@Override
	public void interaction(Personnages joueur) {
		if(joueur instanceof Magicien) {
		joueur.setArmes(this);}
		else {
			System.out.println("tu ne peux prendre l'arme");
	}
	}
	
	}
