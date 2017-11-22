package chap04;

public class Circle2 {
	int radius;
	String name;
	
	public Circle2() {  // �Ű� ���� ���� ������
		radius = 1; name = " "; // radius�� �ʱⰪ�� 1
	}
	
	public Circle2(int r, String n) { 	// �Ű� ������ ���� ������
		radius = r; name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle2 pizza = new Circle2(10, "�ڹ�����"); 	// Circle2 ��ü ����, ������ 10
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle2 donut = new Circle2(); 		// Circle2 ��ü ����, ������ 1
		donut.name = "��������";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
	}
}
