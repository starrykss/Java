package chap11;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawLineEx extends JFrame {
	GraphicsDrawLineEx() {
		setTitle("drawLine ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(200,150);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED); 	// �������� �����Ѵ�.
			g.drawLine(20, 20, 100, 100); // (20,20)�� (100,100)�� �� ���� �����ϴ� ������ ���� �׸���.
		}
	}
	
	public static void main(String [] args) {
		new GraphicsDrawLineEx();
	}
}
