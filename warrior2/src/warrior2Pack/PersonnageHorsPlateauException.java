package warrior2Pack;

// gestion des exception// Pour validation de comp�tences...

public class PersonnageHorsPlateauException extends Exception {
	public PersonnageHorsPlateauException () {
		System.out.println("Tu es sorti du plateau !! ");
	}

}
/* utilisation THROWS = fait attention �...
ex : throws PersonnageHorsPlateauException {
	if positionJoueur>CaseMax
}*/