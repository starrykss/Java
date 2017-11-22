package chap13_practice;

import java.io.*;
import java.util.*;
public class WordSearch {
	public static void main(String[] args) {
		// words.txt 파일 읽기
		Vector<String> v = new Vector<String>();
		try {
			Scanner fscanner = new Scanner(new FileInputStream("words.txt"));
			while(fscanner.hasNext()) 
				v.add(fscanner.next());
			fscanner.close();
		} catch(IOException e) { 
			System.out.println("입출력 오류가 발생했습니다.");
		}
		// 단어 검색
		Scanner scanner = new Scanner(System.in);
		while(true) {
			boolean found = false;
			System.out.print("단어>>");
			String search = scanner.next();
			if(search.equals("exit")) { 
				System.out.println("종료합니다...");
				break; // 검색 종료
			}
			for(int i=0; i<v.size(); i++) {
				String vs = v.get(i); // 벡터 내의 문자열
				if(vs.length() < search.length()) // 벡터의 문자열이 검색 문자열보다 짧은 경우 
					continue;
				// 벡터문자열의 앞부분을 검색 문자열 크기만큼 잘라내기
				String a = vs.substring(0, search.length());
				if(search.equals(a)) { // 검색 문자열과 잘라낸 부분 비교
					System.out.println(vs);
					found = true;
				}
			}
			if(!found)
				System.out.println("발견할 수 없음");
		}		
	}
}