package chap03_practice_re;

public class BaksuGame {
	public static void main (String args[])  {
		for (int i=1; i <100; i++) {
			int count = 0; 
			int fir = i / 10; 
			int sec = i % 10; 

			if((fir != 0) && (fir % 3 == 0)) count++; 
			if((sec != 0) && (sec % 3 == 0)) count++; 
			
			switch(count) {
				case 1 : System.out.println(i + " �ڼ��ѹ�"); break;
				case 2 : System.out.println(i + " �ڼ��ι�"); break;
			}
		}
	}
}

