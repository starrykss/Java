package chap03_practice;

import java.util.Scanner;

public class Multiple3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n[] = new int [10];
		
		System.out.print("���� 10�� �Է�>>");
		for(int i=0; i<n.length; i++) {
			n[i] = scanner.nextInt(); // ���� �б�			
		}
		
		for(int i=0; i<n.length; i++) {
			if(n[i] % 3 == 0)
				System.out.print(n[i]+ " ");
		}
		scanner.close();
	}

}
