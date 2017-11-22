package chap02;

public class checktimep77 {
	public static void main(String[] args) {
		int x = 2, y = 10, z = 0;
		z = x++*2+--y-5+x*(y%2); 
		
		System.out.println(z);
	}
}

/*
1. x++를 찾고 x++부분에 2대입
z = 2 * 2 + --y - 5 + x * (y%2)

2. x++ -> x = x + 1 = 2 + 1 = 3
모든 x를 3으로 변경
z = 2 * 2 + --y - 5 + 3 * (y%2)

3. --y -> y = 10 - 1 = 9
모든 y를 9로 변경
z = 2 * 2 + 9 - 5 + 3 * (9  % 2)

4. 괄호 계산
z = 2 * 2 + 9 - 5 + 3 * 1

5. 산술연산 우선순위로 계산
z = 2 * 2 + 9 - 5 + 3 * 1 = 4 + 9 - 5 + 3 = 16 - 5 = 11
*/