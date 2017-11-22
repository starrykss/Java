package chap09_practice_re;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class wheel extends JFrame {
	public wheel() {
		setTitle("¸¶¿ì½º ÈÙ ±¼¸®±â ¿¬½À");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel lab = new JLabel("Love Java");
		lab.setFont(new Font("Arial", Font.PLAIN, 10));
		lab.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				int num = e.getWheelRotation();
				if(num < 0) { 
					JLabel lab2 = (JLabel)e.getSource();
					Font font = lab2.getFont();
					int s = font.getSize();
					if(s <= 5) return;
					lab.setFont(new Font("Arial", Font.PLAIN, s-5)); 
				}
				else { 
					JLabel lab3 = (JLabel)e.getSource();
					Font font = lab3.getFont();
					int s = font.getSize();
					lab3.setFont(new Font("Arial", Font.PLAIN, s+5)); 
				}
			}
		});
		c.add(lab);
		setSize(300,200);
		setVisible(true);
		lab.requestFocus();
	}
	static public void main(String [] args) {
		new wheel();
	}
}
