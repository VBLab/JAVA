package warrior2Pack;

public class fourzitout {

	if  (this.positionJoueur < CASE_MAX) {
		switch (option) {
		case "":
		this.rollDice();
		break;
		case "2":
		this.getJoueur();
		etatDuJeu = NEW_GAME;
		break;
		}
	}
	
}
public void moveJoueur (int dice) {
	this.positionJoueur +- dice;
	if (this.positionJoueur <= CASE_Max) {
		this.positionJoueur = CASE_MAX;
		System.out.println("Game Over");
	}
}
