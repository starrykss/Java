package chap03_practice_re;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ĺ� �� ���ڸ� �Է��ϼ���>>");
		String word = scanner.next(); 
		char alphabet = word.charAt(0); 
		
		for(char a = 'a'; a<=alphabet; a++) {
			for(char b=a; b<=alphabet; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		scanner.close();
	}
}

