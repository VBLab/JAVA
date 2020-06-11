package warrior2Pack;

// gestion des exception// Pour validation de compétences...

// I  -  crér une classe qui porte le nom de l'exception, qui hérite de exception
/// exception que 'on génère soit même
public class PersonnageHorsPlateauException extends Exception {
	public PersonnageHorsPlateauException () {
		System.out.println("Tu es sorti du plateau !! ");
	}

}
/** utilisation THROWS = fait attention à...
ex : throws PersonnageHorsPlateauException {
	if positionJoueur>CaseMax
}**/


/**  II - exception avec le NullPointerexception 
// ça fait partie de Java...
//si exception de Java faire un
//try {
	- mettre dedans tout ce qu'on veut tester
}
catch (prendre l'erreur en paramètres) {
		syso = afficher un message}
}**/