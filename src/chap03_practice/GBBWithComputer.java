package chap03_practice;

import java.util.Scanner;

public class GBBWithComputer {

	public static void main(String[] args) {
		String com[] = { "����", "����", "��" }; // "����", "����", "��" ���ڿ��� ���� �迭

		Scanner scanner = new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");		
		while(true) {
			System.out.print("���� ���� ��!>>");
			String a = scanner.nextLine(); // ���ڿ� �б�
			if(a.equals("�׸�")) {
				System.out.print("������ �����մϴ�...");
				break; // while �� ���. ���α׷� ����
			}
			// ��ǻ���� ���������� ���� �����ϰ� �����Ѵ�.
			int n = (int)(Math.random()*3); // 0,1,2 �߿��� ������ ���� ����
			String b = com[n];
			
			System.out.print("����� = " + a + " , ��ǻ�� = " + b + ", ");
			
			if(a.equals("����")) { // ����ڰ� ������ ���
				if(b.equals("����"))
					System.out.println("�����ϴ�.");
				else if(b.equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else 
					System.out.println("����ڰ� �̰���ϴ�.");				
			}
			else if(a.equals("����")) { // ö���� ������ ���
				if(b.equals("����"))
					System.out.println("����ڰ� �̰���ϴ�.");
				else if(b.equals("����"))
					System.out.println("�����ϴ�.");
				else 
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");							
			}
			else if(a.equals("��")) { // ����ڰ� ���� ���
				if(b.equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else if(b.equals("����"))
					System.out.println("����ڰ� �̰���ϴ�.");
				else 
					System.out.println("�����ϴ�.");										
			}
			else {
				System.out.println("�ٽ� �ϼ���.");
			}			
		} // end of while
		scanner.close();
	} // end of main
}
