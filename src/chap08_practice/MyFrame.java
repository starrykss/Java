package chap08_practice;

import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame("Let's study Java");
	}

}
