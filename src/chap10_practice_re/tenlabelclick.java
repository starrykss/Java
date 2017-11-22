package chap10_practice_re;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class tenlabelclick extends JFrame {
	JLabel [] lab = new JLabel [10];
	int next = 0;
	public tenlabelclick() {
		setTitle("Ten 레이블 클릭");
		setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i=0; i<lab.length; i++) {
			Container c = getContentPane();
			lab[i] = new JLabel(Integer.toString(i));
			lab[i].setForeground(Color.MAGENTA);
			c.add(lab[i]);
			lab[i].addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					JLabel lab = (JLabel)e.getSource();
					if(Integer.parseInt(lab.getText()) == next) { 
						if(next == 10) {
							next = 0;
							configure();
						}
						else lab.setVisible(false);
						next++;
					}
				}
			});
		}
		setSize(400,400);
		setVisible(true);
		configure(); 
	}
	
	void configure() {
		Container c = getContentPane();
		for(int i=0; i<lab.length; i++) {
			int xB = c.getWidth() - lab[i].getWidth(); int yB = c.getHeight() - lab[i].getHeight(); 			
			int x = (int)(Math.random()*xB); int y = (int)(Math.random()*yB);				
			lab[i].setLocation(x, y);
			lab[i].setSize(15, 15);
			lab[i].setVisible(true);
		}
	}
	static public void main(String [] args) {
		new tenlabelclick();
	}
}
