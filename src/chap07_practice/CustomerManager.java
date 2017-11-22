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
		System.out.println("** 포인트 관리 프로그램입니다 **");
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("이름과 포인터 입력>>");
			String name = scanner.next();
			int point = scanner.nextInt();
			Integer n = map.get(name);
			if(n != null) {
				point += n; // 포인트 점수 누적
			}
			map.put(name, point);
			printMap(map);
		}
	}
}

