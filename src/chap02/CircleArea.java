package chap02;

public class CircleArea {
	public static void main(String[] args)
	{
		final double PI = 3.14;						 // �������� ����� ����
		double radius = 10.2;						 // ���� ������
		double circleArea = radius * radius * PI;   // ���� ���� ���
		
		
		// ���� ������ ȭ�鿡 ����Ѵ�.
		System.out.print("������ " + radius + ", ");
		System.out.println("���� ���� = " + circleArea);
	}
}
