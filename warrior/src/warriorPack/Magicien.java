package warriorPack;

public class Magicien extends Personnages {
	
	private final static int VIE = 3;
	private final static int VIE_MAX = 6;
	private final static int FORCE = 8;
	private final static int FORCE_MAX = 15;
	
	
	public Magicien (String name) {
		super(name,VIE, FORCE);

	}
}