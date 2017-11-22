package chap11_practice_re;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class drawing extends JFrame {
	public drawing(){
		setTitle("마우스로 폐다각형 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		Vector<Integer> x = new Vector<Integer>(); Vector<Integer> y = new Vector<Integer>();
		MyPanel() {
			this.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					x.add(e.getX()); y.add(e.getY());
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.MAGENTA);	
			int xa [] = new int [x.size()]; int ya [] = new int [y.size()];
			for(int i=0; i<x.size(); i++) {
				xa[i] = x.get(i); ya[i] = y.get(i);
			}
			g.drawPolygon(xa,  ya,  xa.length);
		}
	}
	static public void main(String[] args) {
		new drawing();
	}
}

