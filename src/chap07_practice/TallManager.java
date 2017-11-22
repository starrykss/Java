package chap07_practice;

import java.util.*;

public class TallManager {
	public static void main (String[] args) {
		Vector<Double> height = new Vector<Double>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("2000~2009년까지 1년 단위로 키(cm)를 입력");
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
		System.out.println("가장 키가 많이 자란 년도는 " + (year+2000) + "년 "	+ bigDistance + "cm");		
	}
}
