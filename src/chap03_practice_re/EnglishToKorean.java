package chap03_practice_re;

import java.util.Scanner;

public class EnglishToKorean {
	public static void main(String[] args) {
		String eng_word[] = { "student", "love", "java", "happy", "future" };
		String kor_word[] = { "�л�", "���", "�ڹ�", "�ູ��", "�̷�" };
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� �ܾ �Է��ϼ���>>");			
			String sentence = scanner.nextLine(); 
			
			if(sentence.equals("exit")) break; 

			int i;
			
			for(i=0; i<eng_word.length; i++) {
				if(eng_word[i].equals(sentence)) {
					System.out.println(kor_word[i]);
					break;
				}
			}
			if(i==eng_word.length) 
				System.out.println("�׷� ���� �ܾ �����ϴ�.");
		}
		scanner.close();
	}
}