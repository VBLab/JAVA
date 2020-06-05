package warrior2Pack;

public class Epee extends Armes {
	private final static int attaque = 5;
	
	//constructeurs
	public Epee(String name, int attaque) {
		super(name,attaque);
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
