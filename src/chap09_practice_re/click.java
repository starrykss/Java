package chap09_practice_re;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class click extends JFrame {
	public click() {
		setTitle("클릭 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
	
		JLabel lab = new JLabel("C");
		lab.setLocation(50,50);
		lab.setSize(20, 20);
		lab.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JLabel lab2 = (JLabel)e.getSource();
				Container c = lab2.getParent();
				int xa = c.getWidth() - lab2.getWidth(); 
				int ya = c.getHeight() - lab2.getHeight(); 				
				int x = (int)(Math.random()*xa);
				int y = (int)(Math.random()*ya);				
				lab2.setLocation(x, y);
			}
		});
		c.add(lab);
		setSize(250,150);
		setVisible(true);
	}
	static public void main(String [] args) {
		new click();
	}
}
