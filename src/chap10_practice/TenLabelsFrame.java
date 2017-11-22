package chap10_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TenLabelsFrame extends JFrame {
	JLabel [] gameLabels = new JLabel [10];
	int nextPressed = 0;
	public TenLabelsFrame() {
		super("Ten 레이블 클릭");
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
		configure(); // 프레임이 생성된 후, 컨텐트팬의 크기가 결정된 후 숫자 0~9까지 배치해야 한다. 
	}
	
	void configure() {
		Container c = getContentPane();
		for(int i=0; i<gameLabels.length; i++) {
			int xBound = c.getWidth() - gameLabels[i].getWidth(); // 레이블의 폭 만큼 감소
			int yBound = c.getHeight() - gameLabels[i].getHeight(); // 레이블의 높이 만큼 감소				
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
