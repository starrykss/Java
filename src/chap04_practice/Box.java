package chap04_practice;

public class Box {
	private int width, height; // �ڽ��� �ʺ�� ���� 
	private char fillChar; // �ڽ��� �׸��� �� ����ϴ� ����
	
	public Box() { // �Ű� ���� ���� ������
		this(10,1); // this() �̿�
	}
	public Box(int width, int height) { // �ʺ�� ������ 2 �Ű� ������ ���� ������
		this.width = width;
		this.height = height;
	}
	public void draw() { // �ڽ� �׸��� �޼ҵ�
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++)
				System.out.print(fillChar);
			System.out.println();
		}
	}
	public void fill(char c) { // �ڽ��� �׸��µ� ����ϴ� ���� ����
		this.fillChar = c;		
	}
	public static void main(String[] args) {
		Box a = new Box(); // 10x1 �簢��
		Box b = new Box(20,3); // 20x3 �簢��
		a.fill('*'); // box�� �׸� �� ����ϴ� ���� '*'
		b.fill('%'); // box�� �׸� �� ����ϴ� ���� '%' 
		a.draw(); // �ڽ� �׸���
		b.draw(); // �ڽ� �׸���
	}
}
