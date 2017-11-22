// 실습 과제

package chap11_practice;

import javax.swing.*;
import java.awt.*;

public class DrawingCar extends JFrame {
	DrawingCar() {
		super("JPanel의 paintComponent 실습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(600, 600);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.YELLOW); // 상체 외부
			g.fillRoundRect(140, 160, 200, 130, 50, 60);
			g.setColor(Color.BLUE); // 상체
			g.fillRoundRect(145, 165, 190, 120, 40, 60);
			g.setColor(Color.YELLOW); // 하체 외부
			g.fillRoundRect(40, 240, 400, 120, 60, 80);
			g.setColor(Color.BLUE); // 하체
			g.fillRoundRect(45, 245, 390, 110, 60, 80);
			g.setColor(Color.MAGENTA); // 창문 외부
			g.fillRoundRect(190, 190, 100, 100, 20, 20);
			g.setColor(Color.GRAY);  // 창문
			g.fillRoundRect(195, 195, 90, 90, 20, 20);
			g.setColor(Color.BLACK); // 왼쪽 바퀴 외부
			g.fillOval(100, 310, 80, 80);
			g.setColor(Color.RED); // 왼쪽 바퀴
			g.fillOval(106, 315, 70, 70);
			g.setColor(Color.BLACK); // 오른쪽 바퀴 외부
			g.fillOval(300, 310, 80, 80);
			g.setColor(Color.RED); // 오른쪽 바퀴
			g.fillOval(306, 315, 70, 70);
		}
	}
		
	public static void main(String[] args) {
		new DrawingCar();
	}
}
