package warrior2Pack;

// gestion des exception// Pour validation de compétences...

public class PersonnageHorsPlateauException extends Exception {
	public PersonnageHorsPlateauException () {
		System.out.println("Tu es sorti du plateau !! ");
	}

}
/* utilisation THROWS = fait attention à...
ex : throws PersonnageHorsPlateauException {
	if positionJoueur>CaseMax
}*/