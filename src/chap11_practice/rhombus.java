package chap11_practice;

import java.awt.*;
import javax.swing.*;

public class rhombus extends JFrame {
	rhombus() {
		super("������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(150,160);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		int x [] = new int [4];
		int y [] = new int [4];
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);			
			x[0] = getWidth()/2; y[0] = 0;
			x[1] = 0; y[1] = getHeight()/2;
			x[2] = getWidth()/2; y[2] = getHeight();
			x[3] = getWidth(); y[3] = getHeight()/2;

			g.drawPolygon(x,  y,  4);
			
		}
	}
	
	public static void main(String[] args) {
		new rhombus();
	}
}
