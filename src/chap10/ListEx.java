package chap10;

import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
	String [] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	ImageIcon [] images = { new ImageIcon("images/icon1.png"), new ImageIcon("images/icon2.png"), new ImageIcon("images/icon3.png"), new ImageIcon("images/icon4.png") };
	
	ListEx() {
		setTitle("����Ʈ ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JList strList = new JList(fruits); 		// ���ڿ� ����Ʈ ����
		c.add(strList);
		
		JList imageList = new JList(); 			// �̹��� ����Ʈ ����, �� ����Ʈ
		imageList.setListData(images);			// ����Ʈ�� �̹��� ������ ����
		c.add(imageList);
		
		JList scrollList = new JList(fruits); 	// ���ڿ� ����Ʈ ����
		c.add(new JScrollPane(scrollList)); 	// ����Ʈ�� JScrollPane�� ����

		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListEx();
	}
}
