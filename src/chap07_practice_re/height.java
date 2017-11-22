package chap07_practice_re;

import java.util.*;

public class height {
	public static void main (String[] args) {
		Vector<Double> h = new Vector<Double>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2000~2009년까지 1년 단위로 키(cm)를 입력");
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
		System.out.println("가장 키가 많이 자란 년도는 " + (yr+2000) + "년 " + bD + "cm");		
		scanner.close();
	}
}
