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
//...
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class CalculatriceFenetre extends JFrame {
	//...

	private void build(){
		JMenuBar menuBar = new JMenuBar();

		JMenu menu1 = new JMenu("Calculatrice");

		JMenuItem calculer = new JMenuItem(new CalculAction(this, "Calculer"));
		menu1.add(calculer);

		JMenuItem quitter = new JMenuItem(new QuitterAction("Quitter"));
		menu1.add(quitter);

		menuBar.add(menu1);

		JMenu menu2 = new JMenu("?");

		JMenuItem aPropos = new JMenuItem(new AProposAction(this, "A propos"));
		menu2.add(aPropos);

		menuBar.add(menu2);

		setJMenuBar(menuBar);

		//...
	}

	//...
}
