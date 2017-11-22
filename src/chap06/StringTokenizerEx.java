package chap06;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String query = "name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "&");
		
		int n = st.countTokens(); 					// �и��� ��ū ����
		System.out.println("��ū ���� = " + n);
		while(st.hasMoreTokens()) { 				// for(int i=0; i<n; i++)�� ����
			String token = st.nextToken(); 			// ��ū ���
			System.out.println(token); 				// ��ū ���
		}
	}
}
