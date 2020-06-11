package warrior2Pack;

import java.util.ArrayList;

//taille de l'arrayList
//arraylist( de case) 
/*syntaxe pr�cise = qd tu d�clares ton ArrayList ArrayList<case> +nom
pour pouvoir faire �a je dois d�j� avoir une classe CASE.
et sa seule fonction est d'�tre la m�re de toute les autres.*/

// ArrayList simplifie la vie car �vite de 
//manipuler des tableaux trop complexes.

public class Board {
	//attributs
	private ArrayList<Case> cellules;
	private final static int CASE_MAX = 64;
	
	
	
	// constructeur
	
	public Board() {
	this.cellules = new ArrayList<Case>();
	cellules.add( new Casevide ());
	for (int i = 1; i<CASE_MAX; i ++) {
		int random = (int) (Math.random()*10);
		switch(random) {
		case 0:
			cellules.add( new Casevide ());
			break;
		case 1:
			 cellules.add( new Ennemi ("Sorcier" , 2 , 9 ));
			 break;
		case 2:
			cellules.add( new Ennemi ("Gobelin" , 1 , 6 ));
		break;
		case 3:
			 cellules.add( new Ennemi ("Dragon" , 4 , 15 ));
			 break;
		case 4:
			cellules.add( new Armes ("Boule de feux" , 7));
			break;
		case 5:
			cellules.add( new Armes ("Eclair" , 2));
			break;
		case 6:
			 cellules.add( new Armes ("Ep�e" , 5));
			 break;
		case 7:
			 cellules.add( new Armes ("Massue" , 3));
			 break;
		case 8:
			cellules.add( new Potion ("Potion standard" , 2));
			break;
		case 9:
			cellules.add( new Potion ("Grande potion" , 5));
			break;
			
		}
	}
	}
	
    
    // m�thode affiche les index
   /* for (int i=0; i<cellules.size(); i++ ) {
    	System.out.println(i);
    }
    
    
   // avec la m�thode get
   
    /*for (int i=0; i<cellules.size(); i++) {
    	System.out.println(cellules.get(i));
    }*/


	public Case getCaseAtIndex(int positionJoueur) {
		 return cellules.get(positionJoueur);
		}
		/*public int[] getCases() {
			return cellules;
		}*/
		public int getMax() {
			return CASE_MAX;
		}
		
		public String toString() {
		String res = "|";
		for (int i =0; i < cellules.size(); i++) {
			res += cellules.get(i).getName() + "|";
		}
		return res;
		}
}
	




