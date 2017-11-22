package chap10_practice_re;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class radio extends JFrame {
	JRadioButton r = new JRadioButton("Red");
	JRadioButton b = new JRadioButton("Blue");
	radio() {
		setTitle("Two Radio Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		ButtonGroup gro = new ButtonGroup();
		gro.add(r); gro.add(b);
		c.add(r); c.add(b);
		MyItemListener listener = new MyItemListener();
		r.addItemListener(listener); b.addItemListener(listener);
		setSize(300, 200);
		setVisible(true);
	}
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() != ItemEvent.SELECTED) return;
			if(e.getItem() == r) getContentPane().setBackground(Color.RED);
			else if(e.getItem() == b) getContentPane().setBackground(Color.BLUE);
		}
	}
	public static void main(String[] args) {
		new radio();
	}
}

