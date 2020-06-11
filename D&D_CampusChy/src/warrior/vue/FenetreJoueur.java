package warrior.vue;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class FenetreJoueur extends JPanel{
	public void paintComponent(Graphics g) {
		try {
			Image img = ImageIO.read(new File("C:\\Users\\famille\\Documents\\GitHub\\JAVA\\D&D_CampusChy\\images\\avatar_mag.jpg"));
			g.drawImage(img, 0, 20,this.getWidth(), this.getHeight(),this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
