package chap06;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a + "�� ���̴� " + a.length()); 			// ���ڿ��� ����(���� ����) -> 3
		System.out.println(a.contains("#"));					// ���ڿ��� ���� ���� -> True
		
		a = a.concat(b); 										// ���ڿ� ���� -> " C#,C++"
		System.out.println(a);
		
		a = a.trim(); 											// ���ڿ� �� ���� ���� ���� -> "C#,C++"
		System.out.println(a);
		
		a = a.replace("C#", "Java"); 							// ���ڿ� ��ġ -> "Java,C++"
		System.out.println(a);
		
		String s[] = a.split(",");								// ���ڿ� �и�  -> s[0] = "Java", s[1] = "C++"
		for (int i=0; i<s.length; i++)
			System.out.println("�и��� ���ڿ�" + i + ": " + s[i]);
		
		a = a.substring(5); 									// �ε��� 5���� ������ ���� ��Ʈ�� ���� -> a = "C++"
		System.out.println(a);
		
		char c = a.charAt(2);									// �ε��� 2�� ���� ���� -> '+'
		System.out.println(c);
	}
}
