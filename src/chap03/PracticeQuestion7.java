package chap03;

public class PracticeQuestion7 {
	public static void main (String args[])  {
		for (int i=1; i <100; i++) {
			int count = 0; // 3�� ��� ����
			
			int first = i / 10; // 10�� �ڸ� ��
			int second = i % 10; // 1�� �ڸ� ��
			
			if((first != 0) && (first % 3 == 0)) {
				count++; // 3�� ��� �߰�
			}
			if((second != 0) && (second % 3 == 0)) {
				count++; // 3�� ��� �߰�
			}
			
			switch(count) {
				case 1 : System.out.println(i + " �ڼ��ѹ�"); break;
				case 2 : System.out.println(i + " �ڼ��ι�"); break;
			}
		}
	}
}
