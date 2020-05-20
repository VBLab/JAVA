package warriorPack;

public class Personnages {

	
	private String name;
	private int vie;
	private int force;
	
	public Personnages (String name,int vie, int force) {
	setName(name); 
	setVie (vie);
	setForce (force);
		
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
	
	
	

}
