package chap11;

import javax.swing.*;
import java.awt.*;

public class GraphicsFillEx extends JFrame {
	GraphicsFillEx() {
		setTitle("fillXXX ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(100, 350);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(10, 10, 50, 50); 	// ������ �簢�� ĥ�ϱ�
			g.setColor(Color.BLUE);
			g.fillOval(10, 70, 50, 50); 	// �Ķ��� Ÿ�� ĥ�ϱ�
			g.setColor(Color.GREEN);
			g.fillRoundRect(10, 130, 50, 50, 20, 20); 	// �ʷϻ� �ձٻ簢�� ĥ�ϱ�
			g.setColor(Color.MAGENTA);
			g.fillArc(10, 190, 50, 50, 0, 270); 	// ����Ÿ�� ��ȣ ĥ�ϱ�
			g.setColor(Color.ORANGE);
			int []x = {30,10,30,60};
			int []y = {250,275,300,275};
			g.fillPolygon(x, y, 4); 	// �������� �ٰ��� ĥ�ϱ�
		}
	}
	public static void main(String[] args) {
		new GraphicsFillEx();
	}
}
