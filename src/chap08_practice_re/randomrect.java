package chap08_practice_re;

import java.awt.*;
import javax.swing.*;

public class randomrect extends JFrame {
	public randomrect() {
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		for(int i=0; i<20; i++) {
			JLabel lab = new JLabel(Integer.toString(i));
			lab.setText("");
			lab.setBackground(Color.BLUE);
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			lab.setLocation(x,y);
			lab.setSize(10,10);
			lab.setOpaque(true);
			c.add(lab);
		}
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new randomrect();
	}

}
