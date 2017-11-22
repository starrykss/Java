package chap03_practice;

import java.util.Scanner;

public class Eng2Kor {
	public static void main(String[] args) {
		String eng[] = { "student", "love", "java", "happy", "future" };
		String kor[] = { "학생", "사랑", "자바", "행복한", "미래" };
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("영어 단어를 입력하세요>>");			
			String s = scanner.nextLine(); // 문자열 읽기
			if(s.equals("exit")) 
				break; // while 문 벗어남. 프로그램 종료

			int i;
			for(i=0; i<eng.length; i++) {
				if(eng[i].equals(s)) {
					System.out.println(kor[i]);
					break;
				}
			}
			if(i==eng.length) // 마지막까지 검색하였다면
				System.out.println("그런 영어 단어가 없습니다.");
		}
		scanner.close();
	}
}
