package warrior2Pack;

public class Armes {
	// attributs
private String nom;
private int force;

	// constructeur de la classe
public Armes (String nom, int force) {
	
	setNom(nom);
	setForce(force);
}

// méthode de la classe
public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public int getForce() {
	return force;
}


public void setForce(int force) {
	this.force = force;
}

}
