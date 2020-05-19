package demenagementPack;

public class testDem {

	public static void main(String[] args) {
		System.out.println("Bienvenus");
		Demenagement dem = new Demenagement("Entreprise bretonne",9);  // on crée une "instance"
		dem.auTravail(34); 			// on a 34 cartons à transporter//on appelle la méthode d'instance "auTravail()
	}

}
