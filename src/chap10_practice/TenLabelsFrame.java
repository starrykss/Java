package chap10_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TenLabelsFrame extends JFrame {
	JLabel [] gameLabels = new JLabel [10];
	int nextPressed = 0;
	public TenLabelsFrame() {
		super("Ten ���̺� Ŭ��");
		setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i=0; i<gameLabels.length; i++) {
			Container c = getContentPane();
			gameLabels[i] = new JLabel(Integer.toString(i));
			gameLabels[i].setForeground(Color.MAGENTA);
			c.add(gameLabels[i]);
			gameLabels[i].addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					JLabel la = (JLabel)e.getSource();
					if(Integer.parseInt(la.getText()) == nextPressed) { 
						nextPressed++;
						if(nextPressed == 10) {
							nextPressed = 0;
							configure();
						}
						else 
							la.setVisible(false);
					}
				}
			});
		}
		setSize(300,300);
		setVisible(true);
		configure(); // �������� ������ ��, ����Ʈ���� ũ�Ⱑ ������ �� ���� 0~9���� ��ġ�ؾ� �Ѵ�. 
	}
	
	void configure() {
		Container c = getContentPane();
		for(int i=0; i<gameLabels.length; i++) {
			int xBound = c.getWidth() - gameLabels[i].getWidth(); // ���̺��� �� ��ŭ ����
			int yBound = c.getHeight() - gameLabels[i].getHeight(); // ���̺��� ���� ��ŭ ����				
			int x = (int)(Math.random()*xBound);
			int y = (int)(Math.random()*yBound);				
			gameLabels[i].setLocation(x, y);
			gameLabels[i].setSize(15, 15);
			gameLabels[i].setVisible(true);
		}
	}
	static public void main(String [] args) {
		new TenLabelsFrame();
	}
}
