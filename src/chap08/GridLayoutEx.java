package chap08;

import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		super("GridLayout ����");							// setTitle("GridLayout ����"); �� ����.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();		// ����Ʈ�� �˾Ƴ���
		
		contentPane.setLayout(new GridLayout(1, 10)); 	// 1x10�� GridLayout ��ġ ������
		
		for(int i=0; i<10; i++) { // 10���� ��ư ����
			String text = Integer.toString(i);			// ���� i�� ���ڿ��� ��ȯ
			JButton button = new JButton(text);			// ��ư ������Ʈ ����
			contentPane.add(button);					// ����Ʈ�ҿ� ��ư ����
		}
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
