package chap03_practice_re;

import java.util.Scanner;

public class RockScissorPaper {

	public static void main(String[] args) {
		String com[] = { "����", "����", "��" }; 

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");		
		while(true) {
			System.out.print("���� ���� ��!>>");
	
			String a = scanner.nextLine(); 
			if(a.equals("�׸�")) {
				System.out.print("������ �����մϴ�...");
				break; 
			}
	
			int n = (int)(Math.random()*3); 
			String b = com[n];
	
			System.out.print("����� = " + a + " , ��ǻ�� = " + b + ", ");
			
			if(a.equals("����")) { 
				switch(b) {
				case "����":
					System.out.println("�����ϴ�.");
					break;
				case "����":
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					break;
				default:
					System.out.println("����ڰ� �̰���ϴ�.");
					break;
				}
			}
			else if(a.equals("����")) { 
				switch(b) {
				case "����":
					System.out.println("����ڰ� �̰���ϴ�.");
					break;
				case "����":
					System.out.println("�����ϴ�.");
					break;
				default:
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					break;
				}
			}
			else if(a.equals("��")) { 
				switch(b) {
				case "����":
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					break;
				case "����":
					System.out.println("����ڰ� �̰���ϴ�.");
					break;
				default:
					System.out.println("�����ϴ�.");	
					break;
				}
			}
			else {
				System.out.println("�ٽ� �ϼ���.");
			}			
		} 
		scanner.close();
	} 
}