// 어려워서 정답 참고했습니다.
package chap03_practice_re;

public class RandomArray {
	public static void main(String[] args) {
		int exArray[][] = new int[3][4]; 
	
		for(int i=0; i<3; i++)
			for(int j=0; j<4; j++)
				exArray[i][j] = (int)(Math.random()*10); 
		
		for(int i=0; i<exArray.length; i++) {
			for(int j=0; j<exArray[i].length; j++)
				System.out.print(exArray[i][j] + "\t");
			System.out.println(); 
		}

		int i=0, sum=0; // i, sum 0 초기화.
		while(i<3) {  
			for(int j=0; j<4; j++)
				sum += exArray[i][j];
			i++;
		}
		System.out.println("합은 " + sum);		
	}
}

