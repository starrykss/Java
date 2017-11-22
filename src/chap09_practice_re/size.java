package chap09_practice_re;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class size extends JFrame {
	size() {
		setTitle("키로 프레임 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout()); 
		c.add(new JButton("A")); 
		c.addKeyListener(new MyKeyListener()); 
		setSize(150, 150);
		setVisible(true);
		c.requestFocus(); 
	}

	class MyKeyListener extends KeyAdapter { 
		public void keyPressed(KeyEvent e) {
			int x = getWidth(); int y = getHeight(); 
			switch (e.getKeyCode()) { 
			case KeyEvent.VK_F1:
				setSize(x+10,y+10); 
				break;
			case KeyEvent.VK_F2:
				setSize(x-10, y-10); 
				break;
			case KeyEvent.VK_Q :
				System.exit(0); 
			}
		}
	}
	public static void main(String[] args) {
		new size();
	}
}
