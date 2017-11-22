package chap05_practice_re;

class Point {
	private int x, y; 
	void set(int x, int y) {
		this.x = x; this.y = y;
	}
	void showPoint() {	// ���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point { 	// point�� ��ӹ��� ColorPoint ����
	private String color;	// ���� ��
	void setColor(String color) {
		this.color = color;
	}
	void showColorPoint() {	// �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint();	// Point Ŭ������ showPoint() ȣ��
	}
}

public class CP {
	public static void main(String [] args) {
		Point p = new Point();	// Point ��ü ����
		p.set(1,2);	// Point Ŭ������ set() ȣ��
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();	// ColorPoint ��ü ����
		cp.set(3, 4);	// Point Ŭ������ set() ȣ��
		cp.setColor("red");	// ColorPoint Ŭ������ setColor() ȣ��
		cp.showColorPoint(); // �÷��� ��ǥ ���
	}
}