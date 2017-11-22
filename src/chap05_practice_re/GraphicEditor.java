// ������� ���� �����߽��ϴ�.
package chap05_practice_re;

import java.util.Scanner;

public class GraphicEditor {
	static Shape start=null;
	static Shape end = null;
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		int choice = 0; // choice 0 �ʱ�ȭ
		while (choice != 4) { 
			int decision, i;
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			choice = input.nextInt();
			
			// ����
			switch (choice) {
				case 1:	
					System.out.print("���� ���� Line(1), Rect(2), Circle(3)>>");
					decision = input.nextInt();
					insert(decision);
					if (decision < 1 || decision > 3) { System.out.println("�߸� �����ϼ̽��ϴ�."); break; }
					break;
				case 2:	
					System.out.print("������ ������ ��ġ>>");
					i = input.nextInt();
					if (!delete(i)) { System.out.println("������ �� �����ϴ�.");}
					break;
				case 3:	
					Shape p = start;
					while(p != null) {
						p.draw();
						p = p.getNext();
					}
					break;
				case 4:	break;
				default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}

	// delete �Լ� 
	private static boolean delete(int index) {
		Shape now = start;
		Shape before = start;
		if (start == null) return false;
		for (int i=0; i<index; i++) {
			before = now; 
			now = before.getNext(); 
			if (now == null) return false;
		}
		if (start == end) { 
			start = end = null;
			return true;
		}
		if (now == start) { start = start.getNext(); }
		else if (now == end) {
			end = before; 
			end.setNext(null);
		} else { before.setNext(now.getNext()); }
		return true;
	}
	
	
	// insert �Լ�
	private static void insert(int choice) {
		Shape object=null;   // object null �ʱ�ȭ
		switch (choice) {
			case 1: 
				 object = new Line();
				 break;
			case 2: 
				object = new Rect();
				break;
			case 3: object = new Circle2();
		}
		if (start == null) { start = end = object;
		} else {
			end.setNext(object); 
			end = object;
		}
	}
}
