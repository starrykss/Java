package chap09_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameResize extends JFrame {
	FrameResize() {
		super("Ű�� ������ ũ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane(); // ����Ʈ �� �˾Ƴ���
		contentPane.setLayout(new FlowLayout()); // ��ġ ������
		contentPane.add(new JButton("A")); // ���� ��ư �߰�
		contentPane.addKeyListener(new MyKeyListener()); // Ű ������ �ޱ�
		setSize(150, 150);
		setVisible(true);

		contentPane.requestFocus(); // ����Ʈ �ҿ� ��Ŀ�� ����. Ű �Է� ��������
	}

	class MyKeyListener extends KeyAdapter { // Ű ������
		public void keyPressed(KeyEvent e) {
			int w = getWidth(); // JFrame �������� �ʺ�
			int h = getHeight(); // JFrame �������� ����
			switch (e.getKeyCode()) { // �Էµ� Ű ����
			case KeyEvent.VK_F1:
				setSize(w + 10, h + 10); // JFrame 10�ȼ� ����
				break;
			case KeyEvent.VK_F2:
				setSize(w - 10, h - 10); // JFrame 10�ȼ� ���
				break;
			case KeyEvent.VK_Q :
				System.exit(0); // ���α׷� ����
			}
		}
	}

	public static void main(String[] args) {
		new FrameResize();
	}
}
