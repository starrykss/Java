package chap03;

public class NestedLoop {
	public static void main(String args[]) {
		for(int i=0; i<10; i++) { // �ܿ� ���� �ݺ�. 1�ܿ��� 9��
			for(int j=1; j<10; j++) { // �� ���� ����
				System.out.print(i + "*" + j + "=" + i*j);	// ������ ���
				System.out.print('\t');     // �ϳ��� ������ ���
			}
			System.out.println(); // �� ���� ������ ���� �ٷ� Ŀ�� �̵�
		}
	}
}
