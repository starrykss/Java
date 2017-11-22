package chap08_practice;

import java.awt.*;
import javax.swing.*;

public class TenColorButtonFrame extends JFrame {
	public TenColorButtonFrame() {
		super("Ten Color Buttons Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(1, 10));
		
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY}; 

		for(int i=0; i<10; i++) {
			JButton button = new JButton(Integer.toString(i));
			button.setOpaque(true); // ������ ���̰� ��
			button.setBackground(color[i]); // �� ��ư�� �� ����
			contentPane.add(button); // ����Ʈ�ҿ� ��ư ����
		}
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TenColorButtonFrame();
	}

}
