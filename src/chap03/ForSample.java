package chap03;

public class ForSample {
	public static void main(String args[]) {
		int i, sum = 0;
		
		for(i=1; i<=10; i++) {	// 1~10���� �ݺ�
			sum += i;
			System.out.print(i);	// ���ϴ� �� ���
			if(i<=9)	//1~9������ '+'���
				System.out.print("+");
			else { // i�� 10�� ���
				System.out.print("=");	// '=' ����ϰ�
				System.out.print(sum);  // ���� ��� ���
			}
		}
	}
}
