package chap11;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class GraphicsDrawLineMouseEx extends JFrame {
	GraphicsDrawLineMouseEx() {
		setTitle("���콺�� ���� ���� �� �׸��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();
	}
	
	// ���� �׸� �� �ִ� �г��� �����Ѵ�.
	// �� �гο� Mouse �����ʸ� �����Ѵ�.
	class MyPanel extends JPanel {
		// �׷��� ���� ��� �����ϱ� ���� �������� vStart��
		// ������ vEnd ���Ϳ� ���� �����Ѵ�.
		Vector<Point> vStart = new Vector<Point>();
		Vector<Point> vEnd = new Vector<Point>();
		
		public MyPanel() {
			
			// Mouse �����ʸ� ����Ѵ�.
			// �� �����ʴ� ���콺 ��ư�� �������� ���� ������(������)�� vStart ���Ϳ� �����ϰ�
			// ���콺 ��ư�� �������� ���콺 ������(����)�� vEnd ���Ϳ� ����Ѵ�.
			
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					Point startP = e.getPoint();  	// ���콺 �����͸� �˾Ƴ���.
					vStart.add(startP); 	// �������� vStart�� �����Ѵ�.
				}
				
				public void mouseReleased(MouseEvent e) {
					Point endP = e.getPoint(); // ���콺 �����͸� �˾Ƴ���.
					vEnd.add(endP); 	// ������ vEnd�� �����Ѵ�.
					
					// �г��� �ٽ� �׸��⸦ ��û�Ѵ�.
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE); 	// �Ķ����� �����Ѵ�.
			
			// ���Ϳ� ����� ���� ��� �׸���.
			for(int i=0; i<vStart.size(); i++) { 	// vStart ������ ũ��� ������� ���� ������ ����
				Point s = vStart.elementAt(i); 		// ���Ϳ� ��� �ִ� �������� �˾Ƴ���.
				Point e = vEnd.elementAt(i);		// ���Ϳ� ��� �ִ� ������ �˾Ƴ���.
				
				// ���������� �������� ���� �׸���.
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
		}
	}
}
