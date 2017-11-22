package chap11_practice_re;

import java.awt.*;
import javax.swing.*;

public class imagedraw extends JFrame {
	public imagedraw(){
		setTitle("이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(400,400);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		ImageIcon ico = new ImageIcon("images/back.jpg");
		Image image = ico.getImage();
		public MyPanel() {
			setLayout(new FlowLayout());
			add(new JButton("Hello"));
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}
	static public void main(String[] args) {
		new imagedraw();
	}
}
