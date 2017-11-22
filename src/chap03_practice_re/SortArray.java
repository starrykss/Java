package chap03_practice_re;

import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num[] = new int [10];
		
		System.out.print("정수 10개 입력>>");
		
		for(int i=0; i<num.length; i++) {
			num[i] = scanner.nextInt(); 
		}
		
		for(int i=0; i<num.length; i++) { 
			for(int j=i; j<num.length; j++) { 
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");			
		}		
		scanner.close();		
	}

}
