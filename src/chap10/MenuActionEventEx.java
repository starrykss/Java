package chap10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MenuActionEventEx extends JFrame {
	JLabel imgLabel = new JLabel(); 		// �� �̹����� ���� ���̺�
	MenuActionEventEx() {
		setTitle("Menu�� Action ������ ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		getContentPane().add(imgLabel, BorderLayout.CENTER);
		setSize(250,200); setVisible(true);
	}
	
	void createMenu() { 		// �޴��ٿ� Screen �޴� ����. Screen �޴��� 4���� �޴������� ����
		JMenuBar mb = new JMenuBar(); 		// �޴��� ����
		JMenuItem [] menuItem = new JMenuItem [4];
		String [] itemTitle = {"Load", "Hide", "ReShow", "Exit"};
		JMenu screenMenu = new JMenu("Screen");
		
		// 4���� �޴��������� Screen �޴��� �����Ѵ�.
		MenuActionListener listener = new MenuActionListener(); 	// Action ������ ����
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]); 		// �޴������� ����
			menuItem[i].addActionListener(listener); 		// �޴������ۿ� Action ������ ���
			screenMenu.add(menuItem[i]); 					// �޴��������� Screen �޴��� ����
		}
		mb.add(screenMenu); 		// �޴��ٿ� Screen �޴� ����
		setJMenuBar(mb); 			// �޴��ٸ� �����ӿ� ����
	}
	
	class MenuActionListener implements ActionListener { 	// �޴������� ó�� Action ������
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand(); 				// ����ڰ� ������ �޴��������� ���ڿ� ����
			switch(cmd) { 		// �޴� �������� ���� ����
			case "Load":
				if(imgLabel.getIcon() != null) return; 		// �̹� �ε��Ǿ����� ����
				imgLabel.setIcon(new ImageIcon("images/img.jpg")); break;
			case "Hide":
				imgLabel.setVisible(false); break;
			case "ReShow":
				imgLabel.setVisible(true); break;
			case "Exit":
				System.exit(0); break;
			}
		}
	}
	public static void main(String[] args) {
		new MenuActionEventEx();
	}
}
