package chap02;

public class checktimep77 {
	public static void main(String[] args) {
		int x = 2, y = 10, z = 0;
		z = x++*2+--y-5+x*(y%2); 
		
		System.out.println(z);
	}
}

/*
1. x++�� ã�� x++�κп� 2����
z = 2 * 2 + --y - 5 + x * (y%2)

2. x++ -> x = x + 1 = 2 + 1 = 3
��� x�� 3���� ����
z = 2 * 2 + --y - 5 + 3 * (y%2)

3. --y -> y = 10 - 1 = 9
��� y�� 9�� ����
z = 2 * 2 + 9 - 5 + 3 * (9  % 2)

4. ��ȣ ���
z = 2 * 2 + 9 - 5 + 3 * 1

5. ������� �켱������ ���
z = 2 * 2 + 9 - 5 + 3 * 1 = 4 + 9 - 5 + 3 = 16 - 5 = 11
*/