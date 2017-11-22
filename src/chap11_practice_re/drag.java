package chap11_practice_re;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class drag extends JFrame {
	public drag(){
		setTitle("이미지 위에 원 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(400,400);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		ImageIcon ico = new ImageIcon("images/back.jpg");
		Image img = ico.getImage();
		int oX=100, oY=100;
		public MyPanel() {
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					oX = e.getX();
					oY = e.getY();
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			g.setColor(Color.GREEN);
			g.fillOval(oX, oY, 20, 20);			
		}
	}
	
	static public void main(String[] args) {
		new drag();
	}
}
