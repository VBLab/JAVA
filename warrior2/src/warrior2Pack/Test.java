package warrior2Pack;

/*import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		  ArrayList al = new ArrayList();
		    al.add(12);
		    al.add("Une chaîne de caractères !");
		    al.add(12.20f);
		    al.add('d');
		                
		    for(int i = 0; i < al.size(); i++)
		    {
		      System.out.println("donnée à l'indice " + i + " = " + al.get(i));
		    }               
		  }
	}

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
