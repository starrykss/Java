package chap09_practice_re;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class up extends JFrame {
	public up() {
		setTitle("���콺 �ø��� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel lab = new JLabel("�ڱ��");
		lab.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				JLabel lab2 = (JLabel)e.getSource();
				lab2.setText("�����");
			}
			public void mouseExited(MouseEvent e) {
				JLabel lab3 = (JLabel)e.getSource();
				lab3.setText("�ڱ��");
			}			
		});
		c.add(lab);
		setSize(300,200);
		setVisible(true);
	}
	static public void main(String [] args) {
		new up();
	}
}
