package chap04_practice_re;

import java.util.Scanner;

class Rect {
	private int width, height;
	public Rect(int width, int height) { 
		this.width = width; 
		this.height = height; }
	public int getArea() { 
		return width*height; 
		}
}

public class RectSum {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		Rect [] rect = new Rect[4]; 
		
		for(int i=0; i<rect.length; i++) {
			System.out.print(i+1 + " �ʺ�� ���� >>");
			int width = scanner.nextInt();
			int height = scanner.nextInt();
			rect[i] = new Rect(width, height);
		}
		
		System.out.println("�����Ͽ����ϴ�...");
		int sum = 0; // sum 0 �ʱ�ȭ.
		for(int i=0; i<rect.length; i++) 
			sum += rect[i].getArea();

		System.out.println("�簢���� ��ü ���� " + sum);
		scanner.close();
	}
}