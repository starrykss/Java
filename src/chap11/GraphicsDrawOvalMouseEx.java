package chap11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsDrawOvalMouseEx extends JFrame {
	GraphicsDrawOvalMouseEx() {
		setTitle("���콺 �巡������ Ÿ�� �׸��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new GraphicsDrawOvalMouseEx();
	}
	
	// Ÿ���� �׸� �г� �ۼ�. �� �гο� ���콺 ������ ����
	class MyPanel extends JPanel {
		Point start=null, end=null; // ���콺�� �������� ����
		public MyPanel() {
			MyMouseListener listener = new MyMouseListener(); 	// ������ ����
			// listener�� �Ʒ� �� �����ʷ� �������� ����ؾ� �Ѵ�.
			addMouseListener(listener); 	// Mouse ������ ���
			addMouseMotionListener(listener); 	// MouseMotion ������ ���
		}		

		class MyMouseListener extends MouseAdapter {	// ���콺 ������
			public void mousePressed(MouseEvent e) {
				start = e.getPoint(); // ���콺������(������)�� start ��ü�� ����
			}

			public void mouseDragged(MouseEvent e) {
				end = e.getPoint(); // ���콺������(����)�� end ��ü�� ����
				repaint(); // �г��� �׸��� ��û �ָ�
			}
		}
		
		public void paintComponent(Graphics g) {	// �гο� Ÿ�� �׸���
			super.paintComponent(g);
			if(start == null) // Ÿ���� ��������� �ʾ���
			return;
			g.setColor(Color.BLUE); // �Ķ��� ����
			int x = Math.min(start.x, end.x);
			int y = Math.min(start.y, end.y);
			int width = Math.abs(start.x - end.x);
			int height = Math.abs(start.y - end.y);
			g.drawOval(x, y, width, height); // Ÿ�� �׸���
		}
	}
}
