package chap10_practice_re;

import javax.swing.*;

public class menumake extends JFrame {
	public menumake() {
		setTitle("�޴� �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		setSize(400,250);
		setVisible(true);
	}
	private void createMenu() {
		JMenu fM = new JMenu("����");
		JMenu eM = new JMenu("����");
		JMenu vM = new JMenu("����");
		vM.add(new JMenuItem("ȭ��Ȯ��"));
		vM.addSeparator();
		vM.add(new JMenuItem("������"));
		JMenu iM = new JMenu("�Է�");
		JMenuBar mbar = new JMenuBar();
		mbar.add(fM); mbar.add(eM); mbar.add(vM); mbar.add(iM);		
		setJMenuBar(mbar);		
	}
	static public void main(String[] arg) {
		new menumake();
	}
}
