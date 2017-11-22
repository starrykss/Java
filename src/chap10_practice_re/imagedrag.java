package chap10_practice_re;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class imagedrag extends JFrame {
	JLabel lab;
	imagedrag() {
		setTitle("이미지 드래깅");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		ImageIcon ico = new ImageIcon("images/img.jpg");
		lab = new JLabel(ico);
		MyMouseListener list = new MyMouseListener();
		lab.addMouseListener(list);
		lab.addMouseMotionListener(list);
		lab.setSize(ico.getIconWidth(), ico.getIconWidth());
		lab.setLocation(100,100);
		c.add(lab);
		setSize(400, 400);
		setVisible(true);
	}
	class MyMouseListener extends MouseAdapter {
		int x, y;
		public void mousePressed(MouseEvent e) {
			x = e.getX(); y = e.getY();
		}
		public void mouseDragged(MouseEvent e) {
			System.out.println(e.getX() + "," + e.getY());
			int dX = e.getX() - x; int dY = e.getY() - y;
			lab.setLocation(lab.getX()+ dX, lab.getY() + dY);
		}
	}
	public static void main(String[] args) {
		new imagedrag();
	}
}
