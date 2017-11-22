package chap11_practice_re;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class plusminus extends JFrame {
	public plusminus(){
		setTitle("그래픽 이미지 10% 확대 축소");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(400,400);
		setVisible(true);
		getContentPane().requestFocus();
	}
	class MyPanel extends JPanel {
		ImageIcon ico = new ImageIcon("images/apple.jpg");		
		Image image = ico.getImage();
		int w; int h;
		public MyPanel() {
			w = image.getWidth(this); h = image.getHeight(this);
			addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar() == '+') {
						w = (int)(w*1.1); h = (int)(h*1.1);	
						repaint();
					}
					else if(e.getKeyChar() == '-') {
						w = (int)(w*0.9); h = (int)(h*0.9);
						repaint();						
					}
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 10, 10, w, h, this);
		}		
	}
	static public void main(String[] args) {
		new plusminus();
	}
}
