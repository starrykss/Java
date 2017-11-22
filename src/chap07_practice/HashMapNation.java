package chap07_practice;

import java.util.*;

public class HashMapNation {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �̸��� �α��� 5�� �Է��ϼ���.(��: Korea 5000)");
		for(int i=0; i<5; i++) {
			System.out.print("���� �̸�, �α� >> ");		
			String nation = scanner.next();
			int population = scanner.nextInt();
			nations.put(nation, population);
		}
		
		int bigPopu = 0; // ���� ���� �α�
		String bigNation=""; // ���� ���� �α��� ����
		Set<String> names = nations.keySet();
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next(); // Ű. ���� �̸�
			int n = nations.get(name); // �α�
			if(bigPopu < n) {
				bigPopu = n;
				bigNation = name;
			}
		}
		System.out.println("���� �α��� ���� ����� (" + 
				bigNation + ", " + bigPopu + ")");	
	}

}
