package chap10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ComboActionEx extends JFrame {
	String [] fruits = { "apple", "banana", "mango" }; 		// �޺��ڽ� ������
	ImageIcon [] images = { new ImageIcon("images/apple.jpg"), new ImageIcon("images/banana.jpg"), new ImageIcon("images/mango.jpg") };
	JLabel imgLabel = new JLabel(images[0]); 				// �̹����� ����� ���̺�
	
	ComboActionEx() {
		setTitle("�޺��ڽ� Ȱ�� ����");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JComboBox combo = new JComboBox(fruits); 		// �޺��ڽ� ����
		c.add(combo); c.add(imgLabel);
		
		// �޺��ڽ��� Action ������ ���. ���õ� �������� �̹��� ���
		combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource(); 	// Action �̺�Ʈ�� �߻��� �޺��ڽ� �˾Ƴ���
				int index = cb.getSelectedIndex(); 			// �޺��ڽ��� ���õ� �������� �ε��� ��ȣ �˾Ƴ���
				imgLabel.setIcon(images[index]); 			// �ε����� �̹����� �̹��� ���̺� ���
			}
		});
		
		setSize(300,250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ComboActionEx();
	}

}
