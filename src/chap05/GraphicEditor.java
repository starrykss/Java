package chap05;

import java.util.Scanner;

abstract class DObject {
	abstract public void draw();
}

class Figure extends DObject {
	String type;
	public Figure() {
		type = "";
	}
	public void draw() {
		switch (type) {
		case "Line":
			System.out.println("Line");
			break;
		case "Rect":
			System.out.println("Rect");
			break;
		case "Circle":
			System.out.println("Circle");
			break;
		}
	}
}

public class GraphicEditor {
	public static void main(String[] args) {
		int i = 0;
		Menu M = new Menu();
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4) >>");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				M.Insert(i);
				i++;
				break;
			case 2:
				M.Delete();
				break;
			case 3:
				M.View();
				break;
			case 4:
				M.Exit();
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
			}
		}
	}
}

class Menu {
	Scanner rd = new Scanner(System.in);
	Figure f[] = new Figure[10];
	public Menu() {
		for (int i = 0; i < f.length; i++)
			f[i] = new Figure();
	}

	void Insert(int i) {
		System.out.print("도형 종류  Line(1), Rect(2), Circle(3) >>");
		int num = rd.nextInt();
		switch (num) {
		case 1:
			f[i].type = "Line";
			break;

		case 2:
			f[i].type = "Rect";
			break;
		case 3:
			f[i].type = "Circle";
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	void Delete() {
		System.out.print("삭제할 도형의 위치 >>");
		int num = rd.nextInt();
		if (f[num - 1].type.equals(""))
			System.out.println("삭제할 수 없습니다");
		f[num - 1].type = "";
	}
	void View() {
		for (int i = 0; i < f.length; i++) {
			if (f[i].equals("")) {
			} else
				f[i].draw();
		}
	}
	void Exit() {
		System.exit(0);
	}
}
