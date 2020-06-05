package warrior2Pack;

public class Personnages {
	
	// attributs de la classe
	private String name;
	private int vie;
	private int force;
	private Armes armes;
	
	
	// constructeur de la classe.
	public Personnages (String name,int vie, int force) {
	
		// qd le joueur est instancié il a une arme vide
	this.armes = new Armes ("armeVide", 0);
	
	setName(name); 
	setVie (vie);
	setForce (force);
	setArmes(armes);
		
}
	// Méthode de la classe 
	public void equiArmes (Armes armes ) {
		setArmes(armes);
	}
	public Armes getArmes() {
		return armes;
	}
	public void setArmes(Armes armes) {
		this.armes = armes;
	
	}
	public Personnages () { 
		this.name = "";
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
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	
	public  String toString() {
		return name + " Vie : " 
					+ vie +  ", force : "+force+"";
	}
	
}
