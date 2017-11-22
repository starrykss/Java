package chap10_practice_re;

import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.*;

public class menu extends JFrame {
	JTextArea testa = new JTextArea();
	menu() {
		setTitle("���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		Container c = getContentPane();
		c.add(new JScrollPane(testa));
		setSize(400,300);
		setVisible(true);
	}
	private void createMenu() {
		JMenu fM = new JMenu("����");
		JMenuItem sv = new JMenuItem("����");
		fM.add(sv);
		sv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(testa.getText().length() == 0) {
					JOptionPane.showMessageDialog(menu.this, "�Էµ� ������ �����ϴ�.", "Warning", JOptionPane.WARNING_MESSAGE);
					return;
				}
				String fN = JOptionPane.showInputDialog(menu.this, "������ ���ϸ��� �Է��ϼ���");
				if(fN == null) {
					JOptionPane.showMessageDialog(menu.this, "������ �������� �ʽ��ϴ�.", "Warning", JOptionPane.WARNING_MESSAGE);
					return;					
				}
				try {
					FileWriter fo = new FileWriter(fN); 
					String te = testa.getText(); 
					StringTokenizer stoken = new StringTokenizer(testa.getText(), "\n"); 
					while(stoken.hasMoreTokens()) {
						fo.write(stoken.nextToken()); 
						fo.write("\r\n");
					}
					fo.close(); 
				} catch (IOException e1) {}
			}
		});
		JMenuBar mbar = new JMenuBar();
		mbar.add(fM);
		setJMenuBar(mbar);		
	}
	public static void main(String[] args) {
		new menu();
	}

}
