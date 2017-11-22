package chap09_practice_re;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class drag extends JFrame {
	public drag() {
		setTitle("드래깅동안 YELLOW로 변경");	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.GREEN);
		
		MyMouseListener mouse = new MyMouseListener();
		c.addMouseMotionListener(mouse);
		c.addMouseListener(mouse);
		setSize(300,200);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) {
			Container c = (Container)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		public void mouseMoved(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {
			Container c = (Container)e.getSource();
			c.setBackground(Color.GREEN);
		}		
	}
	static public void main(String [] args) {
		new drag();
	}
}
