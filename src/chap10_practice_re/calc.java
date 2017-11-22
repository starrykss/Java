package chap10_practice_re;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calc extends JFrame {
	JTextField ip = new JTextField(8); 
	JTextField op = new JTextField(8); 
	JRadioButton rad [] = new JRadioButton [4]; 
	String [] t = {"decimal", "binary", "octal", "hex"};
	calc() {
		setTitle("Digit Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		ButtonGroup gro = new ButtonGroup(); 
		MyItemListener lis = new MyItemListener();
		c.add(ip); c.add(new JLabel("->")); c.add(op);
		for(int i=0; i<rad.length; i++) {
			rad[i] = new JRadioButton(t[i]); rad[i].addItemListener(lis); 
			c.add(rad[i]); gro.add(rad[i]);
		}
		setSize(300, 200);
		setVisible(true);
	}
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() != ItemEvent.SELECTED) return;
			int num;
			String t = ((JRadioButton)e.getItem()).getText();
			try {
				switch(t) {		
					case "decimal":
						num = Integer.parseInt(ip.getText());
						op.setText(Integer.toString(num)); 
						break;
					case "binary" :
						num = Integer.parseInt(ip.getText());
						op.setText(Integer.toBinaryString(num)); 
						break;				
					case "octal" :
						num = Integer.parseInt(ip.getText());
						op.setText(Integer.toOctalString(num)); 
						break;						
					case "hex" :
						num = Integer.parseInt(ip.getText());
						op.setText(Integer.toHexString(num)); 
						break;				
				}
			} catch(NumberFormatException exp) {
				op.setText("변환할 수 없습니다.");
			}
		}
	}
	public static void main(String[] args) {
		new calc();
	}
}
