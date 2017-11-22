package chap10_practice_re;

import javax.swing.*;

public class menumake extends JFrame {
	public menumake() {
		setTitle("메뉴 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		setSize(400,250);
		setVisible(true);
	}
	private void createMenu() {
		JMenu fM = new JMenu("파일");
		JMenu eM = new JMenu("편집");
		JMenu vM = new JMenu("보기");
		vM.add(new JMenuItem("화면확대"));
		vM.addSeparator();
		vM.add(new JMenuItem("쪽윤곽"));
		JMenu iM = new JMenu("입력");
		JMenuBar mbar = new JMenuBar();
		mbar.add(fM); mbar.add(eM); mbar.add(vM); mbar.add(iM);		
		setJMenuBar(mbar);		
	}
	static public void main(String[] arg) {
		new menumake();
	}
}
