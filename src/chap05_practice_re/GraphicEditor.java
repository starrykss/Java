// 어려워서 정답 참고했습니다.
package chap05_practice_re;

import java.util.Scanner;

public class GraphicEditor {
	static Shape start=null;
	static Shape end = null;
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		int choice = 0; // choice 0 초기화
		while (choice != 4) { 
			int decision, i;
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			choice = input.nextInt();
			
			// 선택
			switch (choice) {
				case 1:	
					System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>>");
					decision = input.nextInt();
					insert(decision);
					if (decision < 1 || decision > 3) { System.out.println("잘못 선택하셨습니다."); break; }
					break;
				case 2:	
					System.out.print("삭제할 도형의 위치>>");
					i = input.nextInt();
					if (!delete(i)) { System.out.println("삭제할 수 없습니다.");}
					break;
				case 3:	
					Shape p = start;
					while(p != null) {
						p.draw();
						p = p.getNext();
					}
					break;
				case 4:	break;
				default: System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	// delete 함수 
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
	
	
	// insert 함수
	private static void insert(int choice) {
		Shape object=null;   // object null 초기화
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
