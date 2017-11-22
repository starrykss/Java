package chap11;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx1 extends JFrame {
	GraphicsDrawImageEx1() {
		setTitle("���� ũ��� ���ϴ� ��ġ�� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		ImageIcon icon = new ImageIcon("images/image0.jpg"); 	// �̹��� �ε�
		Image img = icon.getImage(); // �̹��� ��ü
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			// �̹����� �г��� (20,20)�� ������ ũ��� �׸���.
			g.drawImage(img, 20, 20, this);
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawImageEx1();
	}
}
