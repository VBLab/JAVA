package warrior2Pack;

public class Board {
private final static int CASE_MAX = 64;
	
	private int [] cases;
	
	public Board() {
		cases = new int[CASE_MAX];
		for (int i=0; i<cases.length; i++) {
			cases[i] = 0;
		}
	}

	public int[] getCases() {
		return cases;
	}
	public String toString() {
	String res = "|";
	for (int i =0; i < cases.length; i++) {
		res += cases[i] + "|";
	}
	return res;
}
}

