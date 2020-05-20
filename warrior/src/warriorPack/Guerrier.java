package warriorPack;

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
}
