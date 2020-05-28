package warrior2Pack;

public class Guerrier extends Personnages{
	private final static int VIE = 5;
	private final static int VIE_MAX = 10;
	private final static int FORCE = 5;
	private final static int FORCE_MAX = 10;
	
	public Guerrier() {
		this("gue");
}
	public Guerrier (String name) {
		this(name,VIE, FORCE);

}
	public Guerrier (String name, int vie, int force) {
	super (name, vie, force);

}
	public String toString () {
		return ("Guerrier" + getName);
	}
	public static int getForceMax() {
		return FORCE_MAX;
	}
	public static int getVieMax() {
		return VIE_MAX;
	}
}
