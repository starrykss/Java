package chap06_practice_re;

import java.util.Scanner;
public class Modify {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");			
			String sentence = scanner.nextLine(); 
			StringBuffer strbuff = new StringBuffer(sentence); 
			if(strbuff.toString().equals("exit")) {
				System.out.println("종료합니다...");	
				break;
			}
			int ix = (int)(Math.random()*sentence.length()); 
			while(true) {
				int i = (int)(Math.random()*26); 
				char c = (char)('a' + i); 
				
				if(strbuff.charAt(ix) != c) { 
					strbuff.replace(ix, ix+1, Character.toString(c));					
					break; 
				}
			}
			System.out.println(strbuff);
		}
	}
}
