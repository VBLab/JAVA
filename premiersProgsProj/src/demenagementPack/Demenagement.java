package demenagementPack;

public class Demenagement {
private String nom; // attributs
private int capCamion;
private int nbVoyage = 0;
private int emport; // nbre de cartons emportés

public Demenagement(String nom,int capCamion) { // constructeur
this.nom = nom;
this.capCamion = capCamion;
}
public void auTravail(int nbCartons){
System.out.println(nom + " possède un camion de capacité : " + capCamion);
System.out.println("Début du déménagement");
System.out.println("nbVoyage \t" + "nbCartons \t" + "emport \t" + "capCamion \t");

while(nbCartons > 0) {
	

	if (nbCartons > capCamion) {
		emport = capCamion;
	}
	else emport = nbCartons;
	nbVoyage++;
	System.out.println(nbVoyage + "\t \t" + nbCartons + "\t \t" + emport + "\t \t" + capCamion);
	nbCartons = nbCartons - emport; 
}
System.out.println("Fin du déménagement.");
}
}
