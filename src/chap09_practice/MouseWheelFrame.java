package chap09_practice;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MouseWheelFrame extends JFrame {
	public MouseWheelFrame() {
		super("���콺 �� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		label.setFont(new Font("Arial", Font.PLAIN, 10)); // 10 �ȼ� ũ��
		
		label.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				if(n < 0) { // up direction. ��Ʈ �۰�
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					if(size <= 5)
						return;
					la.setFont(new Font("Arial", Font.PLAIN, size-5)); 
				}
				else { // down direction. ��Ʈ ũ��
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("TimesRoman", Font.PLAIN, size+5)); 
				}
			}
		});
		c.add(label);
		setSize(250,150);
		setVisible(true);
		
		label.requestFocus();
	}
	static public void main(String [] args) {
		new MouseWheelFrame();
	}
}
