package chap11;

import javax.swing.*;
import java.awt.*;

public class GraphicsColorFontEx extends JFrame {
	GraphicsColorFontEx() {
		setTitle("���ڿ�, Color, Font ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel()); 	// ���ο� �г��� �����Ͽ� ����Ʈ������ ���
		setSize(300,300);
		setVisible(true);
	}
	
	// JPanel�� ��ӹ޾� �� �г� ����
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE); // �Ķ��� ����
			g.drawString("�ڹٰ� ���� ��Դ�.~~", 30,30); // (30,30)�� ���ڿ� ���
			g.setColor(new Color(255, 0, 0)); // ������ ���� 
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			g.drawString("How much?", 30, 70);
			g.setColor(new Color(0x00ff00ff)); // r=ff, g=00, b=ff, �� �����
			for(int i=1; i<=4; i++) {
				g.setFont(new Font("Jokerman", Font.ITALIC, i*10));
				g.drawString("This much!!", 30, 60+i*40);
			}
		}
	}
	
	public static void main(String[] args) {
		new GraphicsColorFontEx();
	}
}
