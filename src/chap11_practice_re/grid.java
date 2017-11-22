package chap11_practice_re;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class grid extends JFrame {
	public grid() {
		setTitle("격자 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(150,160);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int a = getWidth()/10; int b = getHeight()/10;		
			for(int i=1; i<10; i++) g.drawLine(i*a, 0, i*a, getHeight()); 
			for(int i=1; i<10; i++) g.drawLine(0, i*b, getWidth(), i*b);
		}
	}
	public static void main(String[] args) {
		new grid();
	}
}

