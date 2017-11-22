package chap11_practice_re;

import java.awt.*;
import javax.swing.*;

public class rect extends JFrame {
	rect() {
		setTitle("¸¶¸§¸ð");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(200,200);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		int a [] = new int [4]; 
		int b [] = new int [4];
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);			
			a[0] = getWidth()/2; 
			b[0] = 0;
			a[1] = 0; 
			b[1] = getHeight()/2;
			a[2] = getWidth()/2; 
			b[2] = getHeight();
			a[3] = getWidth(); 
			b[3] = getHeight()/2;
			g.drawPolygon(a,b,4);
		}
	}
	
	public static void main(String[] args) {
		new rect();
	}
}
