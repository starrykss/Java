package chap05_practice;

import java.util.Scanner;

public class GraphicEditor {
	static Shape start=null, end=null;
	public static void main(String [] args) {
		Scanner sin = new Scanner(System.in);
		
		int choice = 0;
		while (choice != 4) { 
			int type, index;
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			choice = sin.nextInt();
			switch (choice) {
				case 1:	// ����
					System.out.print("���� ���� Line(1), Rect(2), Circle(3)>>");
					type = sin.nextInt();
					if (type < 1 || type > 3) {
						System.out.println("�߸� �����ϼ̽��ϴ�.");
						break;
					}
					insert(type);
					break;
				case 2:	// ����
					System.out.print("������ ������ ��ġ>>");
					index = sin.nextInt();
					if (!delete(index)) {
						System.out.println("������ �� �����ϴ�.");
					}
					break;
				case 3:	// ��� ����
					Shape p = start;
					while(p != null) {
						p.draw();
						p = p.getNext();
					}
					break;
				case 4:	// ������
					break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}

	private static boolean delete(int index) {
		Shape current = start, previous = start;
		if (start == null) // ����Ʈ�� �� ���
			return false;
		for (int i=0; i<index; i++) {
			previous = current;
			current = current.getNext(); // ���� ���ҷ� �̵�
			if (current == null) // �ε����� ����Ʈ ���� �������� ū ���
				return false;
		}
		if (start == end) { // ����Ʈ�� ���Ұ� �Ѱ��ۿ� ���� ���
			start = end = null;
			return true;
		}
		if (current == start) {// ù��° ���Ҹ� �����ϴ� ���
			start = start.getNext(); // ���� ���Ұ� ù��° ���Ұ� ��
		}
		else if (current == end) {// ������ ���Ҹ� �����ϴ� ���
			end = previous; // ���� ���Ұ� ������ ���Ұ� ��
			end.setNext(null);
		} else {
			previous.setNext(current.getNext()); // ���� ���Ҹ� ����Ʈ���� ����
		}
		return true;
	}

	private static void insert(int choice) {
		Shape obj=null;
		switch (choice) {
			case 1: // Line
				 obj = new Line();
				 break;
			case 2: // Rect
				obj = new Rect();
				break;
			case 3: // Circle
				obj = new Circle2();
		}
		if (start == null) { // ����Ʈ�� ����� ��
			start = end = obj;
		} else {
			end.setNext(obj); // ������ ���� �ڿ� ����
			end = obj;
		}
	}

}
