package chap10;

import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
	String [] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	ImageIcon [] images = { new ImageIcon("images/icon1.png"), new ImageIcon("images/icon2.png"), new ImageIcon("images/icon3.png"), new ImageIcon("images/icon4.png") };
	
	ListEx() {
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JList strList = new JList(fruits); 		// 문자열 리스트 생성
		c.add(strList);
		
		JList imageList = new JList(); 			// 이미지 리스트 생성, 빈 리스트
		imageList.setListData(images);			// 리스트에 이미지 아이템 삽입
		c.add(imageList);
		
		JList scrollList = new JList(fruits); 	// 문자열 리스트 생성
		c.add(new JScrollPane(scrollList)); 	// 리스트를 JScrollPane에 부착

		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListEx();
	}
}
