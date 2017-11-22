package chap10;

import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {
	RadioButtonEx() {
		setTitle("������ư ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup(); 		// ��ư �׷� ��ü ����
		
		// ������ư 3�� ����
		JRadioButton apple = new JRadioButton("���");
		JRadioButton pear = new JRadioButton("��", true);
		JRadioButton cherry = new JRadioButton("ü��");
		
		// ��ư �׷쿡 3���� ������ư ����
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		// ����Ʈ�ҿ� 3���� ���� ��ư ����
		c.add(apple); c.add(pear); c.add(cherry);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RadioButtonEx();
	}
}
