package chap10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ButtonAndImageLabelFrame extends JFrame {
	Container contentPane;
	JLabel imageLabel;								// �̹��� ���̺�
	ImageIcon [] images = new ImageIcon [4]; 		// �̹��� ��ü �迭
	int currentId; 	// ���� ���õ� �̹��� ��ȣ(0~3)
	
	public ButtonAndImageLabelFrame() {
		setTitle("Open Challenge 10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane(); 			// ����Ʈ�� ���
		contentPane.setLayout(new BorderLayout()); 	// ����Ʈ�ҿ� BorderLayout ����
		
		// �̹��� ���� �ε�
		for(int i=0; i<images.length; i++)
			images[i] = new ImageIcon("images/image" + i + ".jpg");
		currentId = 0; 			// ���� ���õ� �̹��� ��ȣ
		imageLabel = new JLabel(images[currentId]);				// ���� ���õ� �̹����� ���̺� ���
		contentPane.add(imageLabel, BorderLayout.CENTER); 		// �̹��� ���̺��� CENTER�� ����
		contentPane.add(new MenuPanel(), BorderLayout.SOUTH); 	// 2 ���� ȭ��ǥ ��ư MenuPanel ����

		setSize(300,400);
		setVisible(true);
	}
	
	// �� ���� ȭ��ǥ ��ư�� ���� �޴� �г�
	class MenuPanel extends JPanel {
		public MenuPanel() {
			setBackground(Color.GRAY);
			ImageIcon leftIcon = new ImageIcon("images/left.png");		// ���� ȭ��ǥ �̹��� �ε�
			ImageIcon rightIcon = new ImageIcon("images/right.png");	// ������ ȭ��ǥ �̹��� �ε�
			JButton leftBtn = new JButton(leftIcon); 		// ���� ��ư ����
			JButton rightBtn = new JButton(rightIcon);		// ������ ��ư ����
			add(leftBtn);
			add(rightBtn);
			
			// ���� ȭ��ǥ ��ư�� Action ������ �ޱ�
			leftBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					currentId --; 							// �̹��� ��ȣ ����. ���� �̹���
					currentId += images.length; 			// currentId�� ������ �� �� �ֱ� ������ 4�� ����
					currentId %= images.length; 			// 4�� �Ѵ� ���� ���� ���� �̹��� ������ ������ ����
					imageLabel.setIcon(images[currentId]); 	// �̹��� ���̺� �̹��� ����
				}
			});
			
			// ������ ȭ��ǥ ��ư�� Action ������ �ޱ�
			rightBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					currentId ++; 								// �̹��� ��ȣ ����. ���� �̹���
					currentId %= images.length; 				// 4�� �Ѵ� ���� ���� ���� �̹��� ������ ������ ����.
					imageLabel.setIcon(images[currentId]); 		// �̹��� ���̺� �̹��� ����
				}
			});
		}
	}
	public static void main(String[] args) {
		new ButtonAndImageLabelFrame();
	}
}
