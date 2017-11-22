package chap07_practice_re;

import java.util.*;

public class CManager {
	static void printMap(HashMap<String, Integer> map) {
		Set<String> keywords = map.keySet();
		Iterator<String> it = keywords.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int p = map.get(name);
			System.out.print("(" + name + "," + p + ")");			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		HashMap<String, Integer> Hmap = new HashMap<String, Integer>();
		System.out.println("** 포인트 관리 프로그램입니다 **");
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("이름과 포인터 입력>>");
			String name = scanner.next();
			int p = scanner.nextInt();
			Integer n = Hmap.get(name);
			if(n != null) { p += n; }
			Hmap.put(name, p);
			printMap(Hmap);
		}
	}
}

