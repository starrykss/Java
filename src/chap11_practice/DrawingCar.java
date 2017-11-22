// �ǽ� ����

package chap11_practice;

import javax.swing.*;
import java.awt.*;

public class DrawingCar extends JFrame {
	DrawingCar() {
		super("JPanel�� paintComponent �ǽ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(600, 600);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.YELLOW); // ��ü �ܺ�
			g.fillRoundRect(140, 160, 200, 130, 50, 60);
			g.setColor(Color.BLUE); // ��ü
			g.fillRoundRect(145, 165, 190, 120, 40, 60);
			g.setColor(Color.YELLOW); // ��ü �ܺ�
			g.fillRoundRect(40, 240, 400, 120, 60, 80);
			g.setColor(Color.BLUE); // ��ü
			g.fillRoundRect(45, 245, 390, 110, 60, 80);
			g.setColor(Color.MAGENTA); // â�� �ܺ�
			g.fillRoundRect(190, 190, 100, 100, 20, 20);
			g.setColor(Color.GRAY);  // â��
			g.fillRoundRect(195, 195, 90, 90, 20, 20);
			g.setColor(Color.BLACK); // ���� ���� �ܺ�
			g.fillOval(100, 310, 80, 80);
			g.setColor(Color.RED); // ���� ����
			g.fillOval(106, 315, 70, 70);
			g.setColor(Color.BLACK); // ������ ���� �ܺ�
			g.fillOval(300, 310, 80, 80);
			g.setColor(Color.RED); // ������ ����
			g.fillOval(306, 315, 70, 70);
		}
	}
		
	public static void main(String[] args) {
		new DrawingCar();
	}
}
