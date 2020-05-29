package warrior2Pack;

public class Personnages {
	
	// attributs de la classe
	private String name;
	private int vie;
	private int force;
	
	
	// constructeur de la classe.
	public Personnages (String name,int vie, int force) {
	setName(name); 
	setVie (vie);
	setForce (force);
		
}
	public Personnages () { 
		this.name = "";
	}
 
	// Méthode de la classe 
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
