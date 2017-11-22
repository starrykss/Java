package chap07_practice_re;

import java.util.*;

public class Score {
	public static void main(String[] args) {
		ArrayList<Character> a = new ArrayList<Character>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("빈 칸으로 분리하여 5 개의 학점을 입력(A/B/C/D/F)>>");
		for(int i=0; i<5; i++) {
			String gr = scanner.next();
			if(gr.length() > 1) {
				System.out.println("Not character");
				return;
			}
			char ch = gr.charAt(0);
			if((ch >= 'A' && ch <= 'D') || ch == 'F') { a.add(ch); }
			else {
				System.out.println("Invalid");
				return;
			}
			scanner.close();
		}
		
		double score=0.0;
		for(int i=0; i<a.size(); i++) {
			char grade = a.get(i);
			
			switch(grade) {
				case 'A' : score = 4.0; 
				break;
				case 'B' : score = 3.0; 
				break;
				case 'C' : score = 2.0; 
				break;
				case 'D' : score = 1.0; 
				break;
				case 'F' : score = 0.0; 
				break;			
			}
			System.out.print(score + " ");
		}
	}
}
