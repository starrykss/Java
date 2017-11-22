package chap09_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonActionFrame extends JFrame {
	String text [] = {"+2", "-1", "%4"};
	JLabel la = new JLabel();
	JButton btn [] = new JButton [text.length];
	
	ButtonActionFrame() {
		super("0���� �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		// ���� ���̺� ����
		int num= (int)(Math.random()*60 + 1); // 1���� 60 ������ ������ ����  
		la.setText(Integer.toString(num)); // ������ ���ڿ��� ����� ���̺� ���
		la.setFont(new Font("Gothic", Font.ITALIC, 20));
		JPanel p = new JPanel();
		c.add(p, BorderLayout.CENTER);
		p.add(la);
		
		JPanel q = new JPanel();
		c.add(q, BorderLayout.SOUTH);
		// 3 ���� ��ư ����
		MyActionListener listener = new MyActionListener(); // Action ������ ��ü ����
		for(int i=0; i<text.length; i++) {
			btn[i] = new JButton(text[i]);
			btn[i].addActionListener(listener); // ������ �ޱ�
			q.add(btn[i]); // ����Ʈ�ҿ� ��ư �ޱ�
		}
		setSize(250,150);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ButtonActionFrame.this.setTitle("0���� �����"); // Ÿ��Ʋ �� �ʱ�ȭ
			
			int n = Integer.parseInt(la.getText()); // ���� ������ �˾Ƴ�
			switch(e.getActionCommand()) {
			case "+2":
				n += 2; // 2 ����
				btn[0].setEnabled(false); // ��ư ��Ȱ��ȭ���� �ٽ� Ŭ������ �ʰ� ��
				break;
			case "-1":
				n--; // 1 ����
				btn[1].setEnabled(false); // ��ư ��Ȱ��ȭ���� �ٽ� Ŭ������ �ʰ� ��
				break;
			case "%4":
				n %= 4; // 4�� ���� ������ ���
				btn[2].setEnabled(false); // ��ư ��Ȱ��ȭ���� �ٽ� Ŭ������ �ʰ� ��				
				break;
			}
			la.setText(Integer.toString(n)); // ������ ���ڿ��� ����� ���̺� ���
			if(n == 0) {
				ButtonActionFrame.this.setTitle("����");
				for(int i=0; i<text.length; i++) {
					btn[i].setEnabled(true);
				}
				int num= (int)(Math.random()*60 + 1); // 1���� 60 ������ ������ ����  
				la.setText(Integer.toString(num)); // ������ ���ڿ��� ����� ���̺� ���
			}
			else {
				if(btn[0].isEnabled() == false &&
  				   btn[1].isEnabled() == false &&
				   btn[2].isEnabled() == false) setTitle("����");
			}			
		}
	}
	
	public static void main(String[] args) {
		new ButtonActionFrame();
	}
}
