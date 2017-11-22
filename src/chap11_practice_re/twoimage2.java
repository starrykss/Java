package chap11_practice_re;

import java.awt.*;
import javax.swing.*;

public class twoimage2 extends JFrame {
	public twoimage2() {
		setTitle("두 이미지 밑으로 나란히 보이기");
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
			g.drawImage(image1, 0, 0, getWidth(), getHeight()/2, this);
			g.drawImage(image2, 0, getHeight()/2, getWidth(), getHeight()/2, this);			
		}
	}
	public static void main(String[] args) {
		new twoimage2();
	}
}
