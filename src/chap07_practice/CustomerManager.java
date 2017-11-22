package chap07_practice;

import java.util.*;

public class CustomerManager {
	static void printMap(HashMap<String, Integer> map) {
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int point = map.get(name);
			System.out.print("("+name+","+point+")");			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("�̸��� ������ �Է�>>");
			String name = scanner.next();
			int point = scanner.nextInt();
			Integer n = map.get(name);
			if(n != null) {
				point += n; // ����Ʈ ���� ����
			}
			map.put(name, point);
			printMap(map);
		}
	}
}

