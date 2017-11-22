package chap07_practice_re;

import java.util.*;
public class hashtovector {
	public static Vector<String> hashToVector(HashMap<String, String> hash) {
		Vector<String> vec = new Vector<String>(); 
		Set<String> set = hash.keySet(); 
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key  = it.next();
			vec.add(hash.get(key)); 
		}
		return vec; 
	}
	
	public static void main(String [] args) {
		HashMap<String, String> hash = new HashMap<String, String>(); 
		hash.put("����", "112"); hash.put("ȭ��", "119"); hash.put("��ȭ��ȣ", "114");
		Vector<String> vec = hashToVector(hash); 
			for(int n=0; n<vec.size(); n++) System.out.print(vec.get(n) + " ");
	}
}
