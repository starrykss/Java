package chap07_practice_re;

import java.util.*;

public class height {
	public static void main (String[] args) {
		Vector<Double> h = new Vector<Double>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2000~2009����� 1�� ������ Ű(cm)�� �Է�");
		System.out.print(">>");
		for (int i=0; i<10; i++) {
			double t = scanner.nextDouble();
			h.add(t);
		}

		double bD = 0.0;
		int yr=0;
		for(int i=0; i<h.size()-1; i++) {
			double d = h.get(i+1) - h.get(i);
			if(bD < d) { bD = d; yr = i; }
			}
		System.out.println("���� Ű�� ���� �ڶ� �⵵�� " + (yr+2000) + "�� " + bD + "cm");		
		scanner.close();
	}
}
