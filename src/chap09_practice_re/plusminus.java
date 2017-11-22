package chap09_practice_re;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class plusminus extends JFrame {
	public plusminus() {
		setTitle("+,- 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel lab = new JLabel("Love Java");
		lab.setFont(new Font("Arial", Font.PLAIN, 10)); 
		lab.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '+') {
					JLabel lab = (JLabel)e.getSource();
					Font f = lab.getFont();
					int s = f.getSize();
					lab.setFont(new Font("Arial", Font.PLAIN, s+5)); 					
				}
				else if(e.getKeyChar() == '-') {
					JLabel lab = (JLabel)e.getSource();
					Font font = lab.getFont();
					int s = font.getSize();
					if(s <= 5) return;
					lab.setFont(new Font("Arial", Font.PLAIN, s-5)); 					
				}				
			}
		});
		c.add(lab);
		setSize(300,200);
		setVisible(true);
		lab.requestFocus();
	}
	static public void main(String [] args) {
		new plusminus();
	}
}
