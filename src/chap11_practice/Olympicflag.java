package chap11_practice;

import java.awt.*;
import javax.swing.*;

public class Olympicflag extends JFrame {
	Olympicflag() {
		super("������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(210,150);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawOval(10, 10, 50, 50);
			g.setColor(Color.BLACK);
			g.drawOval(70, 10, 50, 50);
			g.setColor(Color.RED);
			g.drawOval(130, 10, 50, 50);
			g.setColor(Color.YELLOW);
			g.drawOval(40, 30, 50, 50);
			g.setColor(Color.GREEN);
			g.drawOval(100, 30, 50, 50);
		}
	}
	
	public static void main(String[] args) {
		new Olympicflag();
	}
}

