package chap03;

public class foreachEx {
	public static void main(String args[]) {
		int [] n = { 1,2,3,4,5 };
		int sum=0;
		for(int k : n) { // k�� n[0], n[1], ..., n[4]�� �ݺ�   -> for-each ��
			System.out.print(k + " "); // �ݺ��Ǵ� k �� ���
			sum += k;
		}
		System.out.println("���� " + sum);
		
		String f[] = { "���", "��", "�ٳ���", "ü��", "����", "����" };
		for(String s : f) // s�� f[0], f[1], ..., f[5]�� �ݺ� -> for-each ��
			System.out.print(s + " ");
	}

}
