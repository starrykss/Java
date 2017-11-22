package chap02;

import java.util.Scanner;
public class practiceQuestion2 {
	public static void main(String args[]) {
		
		System.out.print("점 (x, y)의 좌표를 입력하세요" + ">> " );
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if (((a >= 50) && (a <= 100)) && ((b >= 50) && (b <= 100)))
				System.out.println("점(" + a + "," + b +")" + "은" +"(50, 50)과 (100, 100)의 사각형 내에 있습니다.");
		else
				System.out.println("점(" + a + "," + b +")" + "은" +"(50, 50)과 (100, 100)의 사각형 내에 없습니다.");		
		
		scan.close();
	}
}
