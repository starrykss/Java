package chap09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlyingTextEx extends JFrame {
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel("HELLO");		// 키 입력에 따라 움직일 레이블 컴포넌트
	
	FlyingTextEx() {
		super("상,하,좌,우 키를 이용하여  텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setLayout(null); 		// 컨텐트팬의 배치관리자 삭제
		contentPane.addKeyListener(new MyKeyListener()); 	// 컨텐트팬에 키 리스너 달기
		la.setLocation(50, 50); 		// 레이블의 초기 위치는 (50,50)
		la.setSize(100, 20);
		contentPane.add(la);
		setSize(200, 200);
		setVisible(true);
		
		contentPane.requestFocus(); 	// 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 시작
	}
	
	class MyKeyListener extends KeyAdapter { 	// Key 리스너 구현
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); 		// 입력된 키의 키코드를 알아낸다.
			switch(keyCode) { 			// 키 코드에 따라 상,하,좌,우 키 판별, 레이블 위치 이동
			case KeyEvent.VK_UP: 		// UP 키
				la.setLocation(la.getX(), la.getY() - 10); break;
			case KeyEvent.VK_DOWN:		// DOWN 키
				la.setLocation(la.getX(), la.getY() + 10); break;
			case KeyEvent.VK_LEFT: 		// LEFT 키
				la.setLocation(la.getX() - 10, la.getY()); break;
			case KeyEvent.VK_RIGHT:		// RIGHT 키
				la.setLocation(la.getX() + 10, la.getY()); break;
			}
		}
	}
	public static void main(String[] args) {
		new FlyingTextEx();
	}
}
