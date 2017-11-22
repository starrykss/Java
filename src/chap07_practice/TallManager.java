package chap07_practice;

import java.util.*;

public class TallManager {
	public static void main (String[] args) {
		Vector<Double> height = new Vector<Double>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("2000~2009����� 1�� ������ Ű(cm)�� �Է�");
		System.out.print(">>");
		for (int i=0; i<10; i++) {
			double tall = scanner.nextDouble();
			height.add(tall);
		}

		double bigDistance = 0.0;
		int year=0;
		for(int i=0; i<height.size()-1; i++) {
			double distance = height.get(i+1) - height.get(i);
			if(bigDistance < distance) {
				bigDistance = distance;
				year = i;
			}
		}
		System.out.println("���� Ű�� ���� �ڶ� �⵵�� " + (year+2000) + "�� "	+ bigDistance + "cm");		
	}
}
