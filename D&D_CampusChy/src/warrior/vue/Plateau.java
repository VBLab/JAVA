package warrior.vue;

import java.awt.Color;
import java.awt.paintComponent;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;


 //plateau---essai---
public class Plateau extends JPanel { 
	public void paintComponent(Graphics g){
		 //objet texte
		    g.setColor(Color.BLACK);          
		   
		    
		    // dessin polygone
		    int x[] = {20, 30, 50, 60, 60, 50, 30, 20};
		    int y[] = {30, 20, 20, 30, 50, 60, 60, 50};
		    g.drawPolygon(x, y, 8);
  }               
}