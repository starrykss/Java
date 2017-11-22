package chap10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LabelEx extends JFrame {
	LabelEx() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// ���ڿ� ���̺� ����
		JLabel textLabel = new JLabel("���ӽ� ���� �Դϴ�!");
		
		// �̹��� ���̺� ����
		ImageIcon img = new ImageIcon("images/gosling.jpg"); 		// �̹��� �ε�
		JLabel imageLabel = new JLabel(img); 						// ���̺� ����
		
		// ���ڿ� �̹��� ��� ���� ���̺� ����
		ImageIcon icon = new ImageIcon("images/icon.gif");
		JLabel label = new JLabel("Ŀ������ �ϽǷ���, ��ȭ���̼�", icon, SwingConstants.CENTER);
		
		// ����Ʈ�ҿ� 3 ���� ���̺� ����
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new LabelEx();
	}
}
