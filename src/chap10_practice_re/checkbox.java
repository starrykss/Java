package chap10_practice_re;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class checkbox extends JFrame {
	JButton butt = new JButton("test button");
	public checkbox() {
		setTitle("CheckBox와 Item 이벤트 Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JCheckBox act = new JCheckBox("버튼 비활성화");
		JCheckBox unact = new JCheckBox("버튼 감추기");
		c.add(act); c.add(unact); c.add(butt);
		
		act.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) butt.setEnabled(false);
				else butt.setEnabled(true);
			}
		});
		unact.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) butt.setVisible(false);
				else butt.setVisible(true);
			}
		});
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new checkbox();
	}
}
