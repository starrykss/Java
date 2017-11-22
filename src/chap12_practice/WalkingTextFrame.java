package chap12_practice;

import java.awt.*;
import javax.swing.*;

public class WalkingTextFrame extends JFrame {
	WalkingTextFrame() {
		super("�ɾ ��Ÿ���� �ؽ�Ʈ�� ���� ���̺�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new WalkingLabel("���� ����� ����մϴ�."));
		setSize(250,150);
		setVisible(true);
	}
	
	class WalkingLabel extends JLabel implements Runnable {
		String text;
		int count = 1; // ȭ�鿡 ���� ���� ����
		WalkingLabel(String text) {
			this.text = text;
			new Thread(this).start(); // ������ ����
		}
		
		public void run() {
			while(true) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) { return; }

				// �ؽ�Ʈ���ε��� 0���� count ������ŭ�� ���� ��Ʈ�� ����
				String s = text.substring(0, count); 
				setText(s);
				
				// ī��Ʈ�� 1~�ؽ�Ʈ�� ���ڼ��� �ǵ��� ����
				count %= text.length();
				count++;
			}
		}

	}
	
	public static void main(String[] args) {
		new WalkingTextFrame();
	}

}
