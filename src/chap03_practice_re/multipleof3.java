package chap03_practice_re;

import java.util.Scanner;

public class multipleof3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num[] = new int [10];
		
		System.out.print("정수 10개 입력>>");
		for(int i=0; i<num.length; i++) {
			num[i] = scanner.nextInt(); 		
		}
		
		for(int i=0; i<num.length; i++) {
			if(num[i] % 3 == 0)
				System.out.print(num[i]+ " ");
		}
		scanner.close();
	}

}
