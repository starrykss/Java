package chap09_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventFrame extends JFrame {
	KeyEventFrame() {
		super("키 누르기 떼기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		c.setBackground(Color.CYAN);

		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'R') {
					getContentPane().setBackground(Color.RED);
				}
			}
			public void keyReleased(KeyEvent e) {
				if(e.getKeyChar() == 'C') {
					getContentPane().setBackground(Color.CYAN);
				}
			}			
		});
		
		setSize(250,150);
		setVisible(true);
		
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new KeyEventFrame();
	}

}

