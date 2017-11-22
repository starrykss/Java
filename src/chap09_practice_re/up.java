package chap09_practice_re;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class up extends JFrame {
	public up() {
		setTitle("마우스 올리기 내리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel lab = new JLabel("자기야");
		lab.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				JLabel lab2 = (JLabel)e.getSource();
				lab2.setText("사랑해");
			}
			public void mouseExited(MouseEvent e) {
				JLabel lab3 = (JLabel)e.getSource();
				lab3.setText("자기야");
			}			
		});
		c.add(lab);
		setSize(300,200);
		setVisible(true);
	}
	static public void main(String [] args) {
		new up();
	}
}
