package chap03;

public class sum1to10 {
	public static void main(String args[]) {
		int intArray [] = new int [10];
		int sum = 0;
		
		for (int i=0; i<intArray.length; i++)
			intArray[i] = i+1;
		for (int j=0; j<intArray.length; j++ )
			sum += intArray[j];
		System.out.println("1~10까지의 원소의 합은 " + sum);
	}

}
