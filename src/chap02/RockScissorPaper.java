package chap02;

import java.util.Scanner;
public class RockScissorPaper {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in); // Ű���� �Է��� ���� Scanner ��ü ���� 		
			System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
			System.out.print("ö�� >> ");
			String a = s.next(); // ö���� ����, ����, ��, ���ڿ���  �Է¹޴´�.
			System.out.print("���� >> ");
			String b = s.next(); // ������ ����, ����, ��, ���ڿ��� �Է¹޴´�.
			
			if(a.equals("����")) { // ö���� ������ ���
				if(b.equals("����"))
					System.out.println("�����ϴ�.");
				else if(b.equals("����"))
					System.out.println("���� �̰���ϴ�.");
				else 
					System.out.println("ö���� �̰���ϴ�.");				
			}
			else if(a.equals("����")) { // ö���� ������ ���
				if(b.equals("����"))
					System.out.println("ö���� �̰���ϴ�.");
				else if(b.equals("����"))
					System.out.println("�����ϴ�.");
				else 
					System.out.println("���� �̰���ϴ�.");							
			}
			else { // ö���� ���� ���
				if(b.equals("����"))
					System.out.println("���� �̰���ϴ�.");
				else if(b.equals("����"))
					System.out.println("ö���� �̰���ϴ�.");
				else 
					System.out.println("�����ϴ�.");										
			}
		}

	}