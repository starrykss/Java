package chap10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
	CheckBoxEx() {
		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 3���� üũ�ڽ��� �����Ѵ�.
		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��", true); 		// ���� ������ üũ�ڽ� ����
		JCheckBox cherry = new JCheckBox("ü��");
		
		// ����Ʈ�ҿ� 3���� üũ�ڽ� ����
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxEx();
	}
}
