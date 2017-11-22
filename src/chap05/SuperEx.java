/*
package chap05;

class Point {
	private int x, y; 	// �� ���� �����ϴ� x, y ��ǥ
	Point() {
		this.x = this.y = 0;
	}
	Point(int x, int y) {
		this.x = x; this.y = y;
	}
	void showPoint() {	// ���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {	// Point�� ��ӹ��� ColorPoint ����
	private String color;	// ���� ��
	ColorPoint(int x, int y, String color) {
		super(x, y);	// Point�� ������ Point(x, y) ȣ��
		this.color = color;
	}
	void ShowColorPoint() {	// �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint();		// point �۷����� showPoint() ȣ��
	}
}

public class SuperEx {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.ShowColorPoint();
	}
}
*/
