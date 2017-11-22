package chap05_practice;

interface AdderInterface {
	int add(int x, int y); // x�� y�� �� ����
	int add(int n); // 1���� n������ ���� �� ����. n�� 0���� ū ���� ����
}
public class MyAdder implements AdderInterface {
	public int add(int x, int y) {
		return x + y;
	}
	public int add(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++)
			sum += i;
		return sum;
	}
	public static void main(String[] args) {
		MyAdder adder = new MyAdder();
		System.out.println(adder.add(5, 10));
		System.out.println(adder.add(10));
	}
}
