package chap10_practice_re;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class images extends JFrame {
	images() {
		setTitle("4 Images");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 4, 10, 10));
		
		ImageIcon image [] = new ImageIcon [4];
		for(int i=0; i<4; i++) {
			image[i] = new ImageIcon("images/img" + (i+1) + ".jpg");
			c.add(new JLabel(image[i]));
		}
		setSize(600, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new images();
	}
}
