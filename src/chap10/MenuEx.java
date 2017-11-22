package chap10;

import javax.swing.*;

public class MenuEx extends JFrame {
	MenuEx() {
		setTitle("Menu ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu(); 		// �޴� ����. �����ӿ� ����
		setSize(250,200);
		setVisible(true);
	}
	
	// �޴��� ����� �����ӿ� �����Ѵ�.
	void createMenu() {
		JMenuBar mb = new JMenuBar(); 		// �޴��� ����
		JMenu screenMenu = new JMenu("Screen"); 		// screen �޴� ����
		
		// Screen �޴��� �޴������� ���� ����
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator();		// �и��� ����
		screenMenu.add(new JMenuItem("Exit"));
		
		// �޴��ٿ� �޴� ����
		mb.add(screenMenu); 			// Screen �޴� ����
		mb.add(new JMenu("Source"));	// Edit �޴� ���� ����
		mb.add(new JMenu("Project"));	// Source �޴� ���� ����
		mb.add(new JMenu("Run")); 		// Run �޴� ���� ����
		
		// �޴��ٸ� �����ӿ� ����
		setJMenuBar(mb);
	}
	public static void main(String[] args) {
		new MenuEx();
	}
}
