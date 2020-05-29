package warrior2Pack;

public class Magicien extends Personnages{
	private final static int VIE = 3;
	private final static int VIE_MAX = 6;
	private final static int FORCE = 8;
	private final static int FORCE_MAX = 15;
	
	public Magicien() {
		this("mag");
}
	public Magicien (String name) {
		super(name,VIE, FORCE);

	}
	public Magicien (String name, int vie, int force) {
		super (name, vie, force);

	}
	public String toString () {
		return ("Magicien " + getName()) ;
		//super.toString())// fait appel à la méthode du parent.
	}
	
	
		
	public static int getVieMax() {
		return VIE_MAX;
	}
	public static int getForceMax() {
		return FORCE_MAX;
	}
}
