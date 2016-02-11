
import javax.swing.JFrame;



class Canvas  extends JFrame {
	 public Canvas() {
		 super ("CANVAS TO DRAW");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setSize(350,100);
		 Canadian_Flag_Leaf  f = new Canadian_Flag_Leaf();
		 getContentPane().add(f);
	 }

}
