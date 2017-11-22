package chap11_practice_re;

import java.awt.*;
import javax.swing.*;

public class twoimage extends JFrame {
	public twoimage() {
		setTitle("두 이미지 나란히 보이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		Image image1 = new ImageIcon("images/a.jpg").getImage();
		Image image2 = new ImageIcon("images/b.jpg").getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image1, 0, 0, getWidth()/2, getHeight(), this);
			g.drawImage(image2, getWidth()/2, 0, getWidth()/2, getHeight(), this);	
		}
	}
	public static void main(String[] args) {
		new twoimage();
	}
}