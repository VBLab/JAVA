package warrior2Pack;

public class Armes extends Case {
	// attributs
private String nom;
private int force;

	// constructeur de la classe
public Armes (String nom, int force) {
	
	setNom(nom);
	setForce(force);
}

// m�thode de la classe
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

@Override
public void interaction() {
	
	
}

@Override
public void interaction(Personnages joueur) {
	// TODO Auto-generated method stub
	
}

}
