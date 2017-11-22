package chap07_practice_re;

import java.util.*;

public class big {
	public static void main(String[] args) {
		Vector<Double> vec = new Vector<Double>();
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			double a = scanner.nextDouble();
			vec.add(a);
		}
		
		double big = vec.get(0);
		for(int i=0; i<vec.size(); i++) {
			if(big < vec.get(i)) 
				big = vec.get(i);
		}
		
		System.out.println("가장 큰 수는 " + big);
		scanner.close();
	}

}
