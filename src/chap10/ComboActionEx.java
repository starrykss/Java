package chap10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ComboActionEx extends JFrame {
	String [] fruits = { "apple", "banana", "mango" }; 		// 콤보박스 아이템
	ImageIcon [] images = { new ImageIcon("images/apple.jpg"), new ImageIcon("images/banana.jpg"), new ImageIcon("images/mango.jpg") };
	JLabel imgLabel = new JLabel(images[0]); 				// 이미지를 출력할 레이블
	
	ComboActionEx() {
		setTitle("콤보박스 활용 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JComboBox combo = new JComboBox(fruits); 		// 콤보박스 생성
		c.add(combo); c.add(imgLabel);
		
		// 콤보박스에 Action 리스너 등록. 선택된 아이템의 이미지 출력
		combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource(); 	// Action 이벤트가 발생한 콤보박스 알아내기
				int index = cb.getSelectedIndex(); 			// 콤보박스의 선택된 아이템의 인덱스 번호 알아내기
				imgLabel.setIcon(images[index]); 			// 인덱스의 이미지를 이미지 레이블에 출력
			}
		});
		
		setSize(300,250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ComboActionEx();
	}

}
