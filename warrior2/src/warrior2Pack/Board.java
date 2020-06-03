package warrior2Pack;
//taille de l'arrayList
//arraylist( de case)
/*syntaxe précise = qd tu déclares ton ArrayList ArrayList<case> +nom
pour pouvoir faire ça je dois déjà avoir une classe CASE.
et sa seule fonction est d'être la mère de toute les autres.*/

// ArrayList simplifie la vie car évite de 
//manipuler des tableaux trop complexes.


public class Board {
private final static int CASE_MAX = 64;
	
	private int [] cases;
	
	public Board() {
		cases = new int[CASE_MAX];
		for (int i=0; i<cases.length; i++) {
			cases[i] = (int) (Math.random()*4);
		}
	}

	/**
	 * 0 = case vide
	 * 1 = ennemi
	 * 2 = arme
	 * 3 = potion
	 *
	 * @return
	 */
 public int getTypeCase(int positionJoueur) {
	 return cases [positionJoueur];
 }
	public int[] getCases() {
		return cases;
	}
	public int getMax() {
		return CASE_MAX;
	}
	public String toString() {
	String res = "|";
	for (int i =0; i < cases.length; i++) {
		res += cases[i] + "|";
	}
	return res;
}
}


