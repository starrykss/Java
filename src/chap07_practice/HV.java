package chap07_practice;

import java.util.*;
public class HV {
	public static Vector<String> hashToVector(HashMap<String, String> h) {
		Vector<String> v = new Vector<String>(); // ���� ����	
		Set<String> s = h.keySet(); // �ؽø� h�κ��� Ű�� Set �÷��� s ���
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String key  = it.next();
			v.add(h.get(key)); // '��'�� ���Ϳ� ����
		}
		return v; //���� ��
	}
	
	public static void main(String [] args) {
		HashMap<String, String> h = new HashMap<String, String>(); // �ؽø� h ����
		h.put("����", "112");
		h.put("ȭ��", "119");
		h.put("��ȭ��ȣ", "114");
		
		Vector<String> v = hashToVector(h); // hashToVector() ȣ��
		for(int n=0; n<v.size(); n++) // v�� ��� ��ҿ� ���� �ݺ�
			System.out.print(v.get(n) + " ");
	}
}
