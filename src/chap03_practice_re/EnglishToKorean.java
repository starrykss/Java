package chap03_practice_re;

import java.util.Scanner;

public class EnglishToKorean {
	public static void main(String[] args) {
		String eng_word[] = { "student", "love", "java", "happy", "future" };
		String kor_word[] = { "학생", "사랑", "자바", "행복한", "미래" };
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("영어 단어를 입력하세요>>");			
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
				System.out.println("그런 영어 단어가 없습니다.");
		}
		scanner.close();
	}
}