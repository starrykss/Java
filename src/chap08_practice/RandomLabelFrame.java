package chap08_practice;

import java.awt.*;
import javax.swing.*;

public class RandomLabelFrame extends JFrame {
	public RandomLabelFrame() {
		super("Random Labels");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=0; i<20; i++) {
			JLabel label = new JLabel(Integer.toString(i));
			label.setText(""); // 문자열 없도록 초기화
			label.setOpaque(true);
			label.setBackground(Color.BLUE);
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			label.setLocation(x,y);
			label.setSize(10,10);
			c.add(label);
		}
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RandomLabelFrame();
	}

}
