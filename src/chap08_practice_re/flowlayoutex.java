package chap08_practice_re;

import java.awt.*;
import javax.swing.*;

public class flowlayoutex extends JFrame {
	public flowlayoutex() {
		setTitle("FlowLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JLabel("100"));
		contentPane.add(new JLabel("+"));
		contentPane.add(new JLabel("200"));
		contentPane.add(new JButton("="));
		contentPane.add(new JLabel("300"));
		setSize(400,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new flowlayoutex();
	}
}
