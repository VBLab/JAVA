package warrior2Pack;

public class Massue extends Armes {
	private final static int attaque = 3;
	
	// Constructeur
	public Massue (String name, int attaque) {
		super(name, attaque);
	}
	@Override
	public void interaction(Personnages joueur) {
		if(joueur instanceof Guerrier) {
			joueur.setArmes(this);}
			else {
				System.out.println("tu ne peux prendre l'arme");
		}
}
}
