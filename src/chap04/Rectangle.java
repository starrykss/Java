package chap04;

public class Rectangle {
	int width;
	int height;
	int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); // ��ü ����
		rect.width = 4;
		rect.height = 5;
		System.out.println("�簢���� ������ " + rect.getArea());
	}
}
