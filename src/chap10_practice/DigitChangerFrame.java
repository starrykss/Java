package chap10_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DigitChangerFrame extends JFrame {
	JTextField src = new JTextField(8); // �Է¿� �ؽ�Ʈ�ʵ�
	JTextField dest = new JTextField(8); // ��¿� �ؽ�Ʈ�ʵ�
	JRadioButton radio [] = new JRadioButton [4]; // ������ư �迭 ����
	String [] text = {"decimal", "binary", "octal", "hex"};
	
	DigitChangerFrame() {
		super("Digit Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup(); // ��ư �׷� ����
		MyItemListener listener = new MyItemListener(); // Item ������ ����
		
		// ������Ʈ ����
		c.add(src);
		c.add(new JLabel("->"));
		c.add(dest);
		
		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]); // ������ư ����
			radio[i].addItemListener(listener); // ������ ����
			c.add(radio[i]); // ������ư�� ����Ʈ�ҿ� ����
			g.add(radio[i]); // ������ư�� ��ư�׷쿡 ����
		}
		
		setSize(280, 150);
		setVisible(true);
		
	}
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() != ItemEvent.SELECTED)
				return;

			int n;
			String text = ((JRadioButton)e.getItem()).getText();
			try {
				switch(text) {		
					case "decimal":
						n = Integer.parseInt(src.getText());
						dest.setText(Integer.toString(n)); 
						break;
					case "binary" :
						n = Integer.parseInt(src.getText());
						dest.setText(Integer.toBinaryString(n)); 
						break;				
					case "octal" :
						n = Integer.parseInt(src.getText());
						dest.setText(Integer.toOctalString(n)); 
						break;						
					case "hex" :
						n = Integer.parseInt(src.getText());
						dest.setText(Integer.toHexString(n)); 
						break;				
				}
			} catch(NumberFormatException exp) {
				dest.setText("��ȯ�� �� �����ϴ�.");
			}
		}
	}
	
	public static void main(String[] args) {
		new DigitChangerFrame();
	}

}
