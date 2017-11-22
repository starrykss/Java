package chap03;

import java.util.Scanner;

public class PracticeQuestion5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n[] = new int [10];
		
		System.out.print("정수 10개 입력" + ">>");
		for(int i=0; i<n.length; i++) {
			n[i] = scanner.nextInt(); 	
		}
		
		for(int i=0; i<n.length; i++) { 
			for(int j=i; j<n.length; j++) { 
				if(n[i] > n[j]) {
					int temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
		}
		
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i] + " ");			
		}		
		scanner.close();		
	}

}
