package chap09_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameResize extends JFrame {
	FrameResize() {
		super("키로 프레임 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane(); // 컨텐트 팬 알아내기
		contentPane.setLayout(new FlowLayout()); // 배치 관리자
		contentPane.add(new JButton("A")); // 더미 버튼 추가
		contentPane.addKeyListener(new MyKeyListener()); // 키 리스너 달기
		setSize(150, 150);
		setVisible(true);

		contentPane.requestFocus(); // 컨텐트 팬에 포커스 설정. 키 입력 가능해짐
	}

	class MyKeyListener extends KeyAdapter { // 키 리스너
		public void keyPressed(KeyEvent e) {
			int w = getWidth(); // JFrame 윈도우의 너비
			int h = getHeight(); // JFrame 윈도우의 높이
			switch (e.getKeyCode()) { // 입력된 키 문자
			case KeyEvent.VK_F1:
				setSize(w + 10, h + 10); // JFrame 10픽셀 증가
				break;
			case KeyEvent.VK_F2:
				setSize(w - 10, h - 10); // JFrame 10픽셀 축소
				break;
			case KeyEvent.VK_Q :
				System.exit(0); // 프로그램 종료
			}
		}
	}

	public static void main(String[] args) {
		new FrameResize();
	}
}
