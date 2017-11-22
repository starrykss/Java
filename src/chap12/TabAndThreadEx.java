package chap12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyLabel extends JLabel {
	int barSize = 0; // ���� ũ��
	int maxBarSize;
	
	MyLabel(int maxBarSize) { 
		this.maxBarSize = maxBarSize;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g); 
		g.setColor(Color.MAGENTA);
		int width = (int) (((double)(getWidth()))/maxBarSize*barSize);
		if(width==0) return; // ũ�Ⱑ 0�̱� ������ �ٸ� �׸� �ʿ� ����
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	synchronized void fill() {
		if(barSize == maxBarSize) {
			try {
				wait(); // ���� ũ�Ⱑ �ִ��̸�, ComsumerThread�� ���� ���� ũ�Ⱑ �پ�� ������ ���
			} catch (InterruptedException e) { return; }
		}
		barSize++;
		repaint(); // �� �ٽ� �׸���
		notify(); // ��ٸ��� ConsumerThread ������ �����
	}
	synchronized void consume() {
		if(barSize == 0) {
			try {
				wait(); // ���� ũ�Ⱑ 0�̸� ���� ũ�Ⱑ 0���� Ŀ�������� ���
			} catch (InterruptedException e) { return; }
		}
		barSize--;
		repaint(); // �� �ٽ� �׸���
		notify(); // ��ٸ��� �̺�Ʈ ������ �����
	}	
}

class ConsumerThread extends Thread {
	MyLabel bar;
	
	ConsumerThread(MyLabel bar) {
		this.bar = bar;
	}
	public void run() {
		while(true) {
			try {
				sleep(100);
				bar.consume(); // 0.1�ʸ��� �ٸ� 1�� ���δ�.
			} catch (InterruptedException e) { return; }
		}
	}
}

public class TabAndThreadEx  extends JFrame {
	MyLabel bar = new MyLabel(100); // ���� �ִ� ũ�⸦ 100���� ����
	
	TabAndThreadEx(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.ORANGE);
		bar.setOpaque(true);
		bar.setLocation(20,  50);
		bar.setSize(300, 20); // 300x20 ũ���� ��
		c.add(bar);
		
		// ����Ʈ�ҿ� Ű �̺�Ʈ �ڵ鷯 ���
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				bar.fill(); // Ű�� ���������� �ٰ� 1�� �����Ѵ�.
			}
		});
		setSize(350,200);
		setVisible(true);
		
		c.requestFocus(); // ����Ʈ�ҿ��� Ű ó���� �ο�
		ConsumerThread th = new ConsumerThread(bar); // ������ ����
		th.start(); // ������ ����
	}

	public static void main(String[] args) {
		new TabAndThreadEx("�ƹ�Ű�� ���� ���� �� ä���");
	}
}
