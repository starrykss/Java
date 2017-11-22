package chap09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCharEx extends JFrame {
	JLabel la = new JLabel("<Enter>Ű�� ������ �ٲ�ϴ�.");
	KeyCharEx() {
		super("KeyListener�� ���� Ű �Է� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();				// ����Ʈ�� �˾Ƴ���
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(new MyKeyListener()); 		// Ű ������ �ޱ�
		setSize(250, 150);
		setVisible(true);
		
		c.requestFocus();		// ����Ʈ�ҿ� ��Ŀ�� ����, Ű �Է� ��������
	}
	
	class MyKeyListener extends KeyAdapter { 	// Ű ������
		public void keyPressed(KeyEvent e) {
			// ������ ���� ����� ���� �����ϰ� r, g, b ���� ����
			int r = (int) (Math.random()*256); 	// 0~255 ������ ������ red ����
			int g = (int) (Math.random()*256);	// 0~255 ������ ������ green ����
			int b = (int) (Math.random()*256);	// 0~255 ������ ������ blue ����
			
			switch(e.getKeyChar()) {	// �Էµ� Ű ����
			case '\n': 		// <Enter> Ű �Է�
				la.setText("r=" + r + ", g=" + g + ", b=" + b);
				getContentPane().setBackground(new Color(r, g, b)); // ����Ʈ���� ���� ����
				break;
			case 'q': System.exit(0);	// ���α׷� ����
			}
		}
		
	}
	public static void main(String[] args) {
		new KeyCharEx();
	}
}
