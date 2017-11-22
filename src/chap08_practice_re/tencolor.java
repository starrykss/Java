package chap08_practice_re;

import java.awt.*;
import javax.swing.*;

public class tencolor extends JFrame {
	public tencolor() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));
		Color [] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY }; 
		for(int i=0; i<10; i++) {
			JButton button = new JButton(Integer.toString(i));
			button.setOpaque(true);
			button.setBackground(color[i]); 
			c.add(button); 
		}
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new tencolor();
	}

}
