package warrior2Pack;

public class Armes extends Case {
	// attributs
private String name;
private int force;

	// constructeur de la classe
public Armes (String name, int force) {
	
	setName(name);
	setForce(force);
}

// méthode de la classe
public String getName() {
	return this.name;
}


public void setName(String name) {
	this.name = name;
}


public int getForce() {
	return force;
}


public void setForce(int force) {
	this.force = force;
}


@Override
public void interaction(Personnages joueur) {
	
	
}

}
