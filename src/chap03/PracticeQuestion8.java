package chap03;

import java.util.Scanner;

public class PracticeQuestion8 {
	public static void main(String[] args) {
		String com[] = { "����", "����", "��" }; 

		Scanner scanner = new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");		
		while(true) {
			System.out.print("���� ���� ��!" + ">>");
			String a = scanner.nextLine();
			if(a.equals("�׸�")) {
				System.out.print("������ �����մϴ�...");
				break; 
			}

			int n = (int)(Math.random()*3); // 0,1,2 �߿��� ������ ���� ����
			String b = com[n];
			
			System.out.print("����� = " + a + " , ��ǻ�� = " + b + ", ");
			
			if(a.equals("����")) { 
				if(b.equals("����"))
					System.out.println("�����ϴ�.");
				else if(b.equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else 
					System.out.println("����ڰ� �̰���ϴ�.");				
			}
			else if(a.equals("����")) { 
				if(b.equals("����"))
					System.out.println("����ڰ� �̰���ϴ�.");
				else if(b.equals("����"))
					System.out.println("�����ϴ�.");
				else 
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");							
			}
			else if(a.equals("��")) { 
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
		} 
		scanner.close();
	} 
}
