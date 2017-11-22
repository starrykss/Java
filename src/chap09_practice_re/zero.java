package chap09_practice_re;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class zero extends JFrame {
	String text [] = {"+2", "-1", "%4"};
	JLabel lab = new JLabel();
	JButton but [] = new JButton [text.length];
	
	zero() {
		setTitle("0으로 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		int number= (int)(Math.random()*60 + 1); lab.setFont(new Font("Gothic", Font.ITALIC, 20)); lab.setText(Integer.toString(number)); 

		JPanel a = new JPanel(); c.add(a, BorderLayout.CENTER); a.add(lab);
		JPanel b = new JPanel(); c.add(b, BorderLayout.SOUTH);
		
		MyActionListener listener = new MyActionListener(); 
		for(int i=0; i<text.length; i++) {
			but[i] = new JButton(text[i]);
			but[i].addActionListener(listener);
			b.add(but[i]); 
		}
		setSize(250,150);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			zero.this.setTitle("0으로 만들기");
			int num = Integer.parseInt(lab.getText()); 
			switch(e.getActionCommand()) {
			case "+2":
				num = num + 2; 
				but[0].setEnabled(false);
				break;
			case "-1":
				num--; 
				but[1].setEnabled(false);
				break;
			case "%4":
				num = num % 4; 
				but[2].setEnabled(false);		
				break;
			}
			lab.setText(Integer.toString(num)); 
			if(num == 0) {
				zero.this.setTitle("성공");
				for(int i=0; i<text.length; i++) {
					but[i].setEnabled(true);
				}
				int number= (int)(Math.random()*60 + 1); 
				lab.setText(Integer.toString(number)); 
			}
			else {
				if(but[0].isEnabled() == false && but[1].isEnabled() == false && but[2].isEnabled() == false) setTitle("실패");
			}			
		}
	}
	public static void main(String[] args) {
		new zero();
	}
}
