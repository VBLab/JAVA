package warrior2Pack;

// gestion des exception// Pour validation de comp�tences...

// I  -  cr�r une classe qui porte le nom de l'exception, qui h�rite de exception
/// exception que 'on g�n�re soit m�me
public class PersonnageHorsPlateauException extends Exception {
	public PersonnageHorsPlateauException () {
		System.out.println("Tu es sorti du plateau !! ");
	}

}
/** utilisation THROWS = fait attention �...
ex : throws PersonnageHorsPlateauException {
	if positionJoueur>CaseMax
}**/


/**  II - exception avec le NullPointerexception 
// �a fait partie de Java...
//si exception de Java faire un
//try {
	- mettre dedans tout ce qu'on veut tester
}
catch (prendre l'erreur en param�tres) {
		syso = afficher un message}
}**/