package chap02_practice_re;

import java.util.Scanner;

public class Rect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점 (x,y)의 좌표를 입력하세요>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		String a;
		
		if((x>=50 && y>=50) && (x<=100 && y<=100)) 
			a = "(50, 50)과 (100,100)의 사각형 내에 있습니다.";		
		else 
			a = "(50, 50)과 (100,100)의 사각형 내에 없습니다.";			

		System.out.print("점(" + x + "," + y + ")은 " + a);
		
		scanner.close();
	}

}
