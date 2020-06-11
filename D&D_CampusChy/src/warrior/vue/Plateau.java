package warrior.vue;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Plateau extends JPanel {
    private final int CELL_WIDTH = 75;
    private final int CELL_HEIGHT = 55;

    public void paintComponent(Graphics g) {
    	
    	g.fillRect(0, 0, this.getWidth(), this.getHeight());
    	g.setColor(Color.BLACK);
        int[][] level = {{1,1,1,1,1,1,1,1,1,1,1,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0},
                        {1,1,1,1,1,1,1,1,1,1,1,1},
                        {0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,1,1,1,1,1,1,1,1,1,1,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0},
                        {1,1,1,1,1,1,1,1,1,1,1,1},
                        {0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,1,1,1,1,1,1,1,1,1,1,1}};

        g.setColor(Color.GRAY);

        for(int i=0; i<9;i++) {
            for(int j=0;j<12;j++) {
                if (level[i][j]==1) {
                    g.fill3DRect((int)(100+j*77),(int)(70+i*57),CELL_WIDTH,CELL_HEIGHT,true);
                }
            }
        }
    }
}