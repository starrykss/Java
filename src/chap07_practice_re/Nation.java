package chap07_practice_re;

import java.util.*;

public class Nation {
	public static void main(String[] args) {
		HashMap<String, Integer> ns = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �̸��� �α��� 5�� �Է��ϼ���." + "(��: Korea 5000)");
		for(int i=0; i<5; i++) {
			System.out.print("���� �̸�, �α� >> ");		
			String n = scanner.next();
			int pp= scanner.nextInt();
			ns.put(n, pp);
		}
		int bP = 0; 
		String bN=""; 
		Set<String> names = ns.keySet();
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next(); 
			int num = ns.get(name); 
			if(bP < num) {
				bP = num; bN = name;
			}
		}
		System.out.println("���� �α��� ���� ����� (" + bN + ", " + bP + ")");	
	}

}
