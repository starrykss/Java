package chap10_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageDraggingFrame extends JFrame {
	JLabel label;
	ImageDraggingFrame() {
		super("捞固瘤 靛贰彪");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		ImageIcon icon = new ImageIcon("images/img.jpg");
		label = new JLabel(icon);
		MyMouseListener listener = new MyMouseListener();
		label.addMouseListener(listener);
		label.addMouseMotionListener(listener);
		label.setSize(icon.getIconWidth(), icon.getIconWidth());
		label.setLocation(100,100);
		c.add(label);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter {
		int x, y;
		public void mousePressed(MouseEvent e) {
			x = e.getX(); y = e.getY();
		}
		public void mouseDragged(MouseEvent e) {
			System.out.println(e.getX() + "," + e.getY());
			int distanceX = e.getX() - x;
			int distanceY = e.getY() - y;
			label.setLocation(label.getX()+ distanceX, label.getY() + distanceY);
		}
	}
	
	public static void main(String[] args) {
		new ImageDraggingFrame();
	}
}
