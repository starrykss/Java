package chap09_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClickPracticeFrame extends JFrame {
	public ClickPracticeFrame() {
		super("클릭 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("C");
		label.setLocation(50,50);
		label.setSize(20, 20);
		label.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				Container c = la.getParent();
				int xBound = c.getWidth() - la.getWidth(); // 레이블의 폭 만큼 감소
				int yBound = c.getHeight() - la.getHeight(); // 레이블의 높이 만큼 감소				
				int x = (int)(Math.random()*xBound);
				int y = (int)(Math.random()*yBound);				
				la.setLocation(x, y);
			}
		});
		c.add(label);
		setSize(250,150);
		setVisible(true);
	}
	static public void main(String [] args) {
		new ClickPracticeFrame();
	}
}
