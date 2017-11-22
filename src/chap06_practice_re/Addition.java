package chap06_practice_re;

import java.util.*;

public class Addition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String exp = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(exp, "+");
		int sum = 0;
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			s = s.trim();
			sum += Integer.parseInt(s);
		}

		System.out.println("гую╨ " + sum);
		scanner.close();
	}

}