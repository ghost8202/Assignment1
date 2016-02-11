
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JPanel;

public class Canadian_Flag_Leaf extends JPanel {
	public void paintComponent(Graphics comp) {
		Graphics2D comp2D = (Graphics2D) comp;
		comp2D.setColor (Color.white);
		comp2D.drawRect(220, 20, 550, 480);
		comp2D.fillRect(220, 20, 550, 480);
		comp2D.setColor (Color.red);
//points            1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19	20	21	22	23	24	25
		int[] X = {500,465,440,455,410,400,340,360,330,420,405,490,485,515,510,595,580,670,640,660,600,588,545,560,535};
	    int[] Y = {60,130,108,218,155,178,168,228,235,325,350,340,440,440,340,350,325,235,228,168,178,158,218,108,130};
	    comp2D.drawRect(20,20,200,480);
	    comp2D.drawRect(770, 20, 200, 480);
	    comp2D.fillRect(20, 20, 200, 480);
	    comp2D.fillRect(770, 20, 200, 480);
	
	    	//comp2D.drawPolygon (XArray, YArray, 25);
		
		//FILL THE POLYGON WITH CURRENT COLOR

	   	//comp2D.fillPolygon (XArray, YArray, 25);
	    	int pts = X.length;
			Polygon poly = new Polygon(X,Y,pts);
			comp2D.fillPolygon(poly);
		    comp2D.setColor (Color.black);
		    comp2D.drawRect(20, 20, 950, 480);

}
} 


