package chap08_practice_re;

import java.awt.*;
import javax.swing.*;

public class colorframe extends JFrame {
	public colorframe() {
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 4));
		JLabel [] lab = new JLabel [16];
		Color [] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY, Color.BLACK, Color.ORANGE, Color.BLUE,Color.MAGENTA }; 
		for(int i=0; i<lab.length; i++) {
			lab[i] = new JLabel(Integer.toString(i));
			lab[i].setOpaque(true);
			lab[i].setBackground(color[i]);
			c.add(lab[i]);
		}
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new colorframe();
	}

}
