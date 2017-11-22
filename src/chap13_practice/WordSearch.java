package chap13_practice;

import java.io.*;
import java.util.*;
public class WordSearch {
	public static void main(String[] args) {
		// words.txt ���� �б�
		Vector<String> v = new Vector<String>();
		try {
			Scanner fscanner = new Scanner(new FileInputStream("words.txt"));
			while(fscanner.hasNext()) 
				v.add(fscanner.next());
			fscanner.close();
		} catch(IOException e) { 
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}
		// �ܾ� �˻�
		Scanner scanner = new Scanner(System.in);
		while(true) {
			boolean found = false;
			System.out.print("�ܾ�>>");
			String search = scanner.next();
			if(search.equals("exit")) { 
				System.out.println("�����մϴ�...");
				break; // �˻� ����
			}
			for(int i=0; i<v.size(); i++) {
				String vs = v.get(i); // ���� ���� ���ڿ�
				if(vs.length() < search.length()) // ������ ���ڿ��� �˻� ���ڿ����� ª�� ��� 
					continue;
				// ���͹��ڿ��� �պκ��� �˻� ���ڿ� ũ�⸸ŭ �߶󳻱�
				String a = vs.substring(0, search.length());
				if(search.equals(a)) { // �˻� ���ڿ��� �߶� �κ� ��
					System.out.println(vs);
					found = true;
				}
			}
			if(!found)
				System.out.println("�߰��� �� ����");
		}		
	}
}