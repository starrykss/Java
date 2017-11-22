package chap04;

public class PracticeQuestion6 {

	private int width, height;
	private char fillChar;

	public PracticeQuestion6(){
		this(10,1);
	}

	public PracticeQuestion6(int width, int height){
		this.width = width;
		this.height = height;
	}

	public void draw(){
		for(int i=0;i<height;i++){
			for(int j=0;j<width;j++)
				System.out.print(fillChar);
			System.out.println();
		}
	}

	public void fill(char c){
		this.fillChar = c;
	}

	public static void main(String[] args){
		PracticeQuestion6 a = new PracticeQuestion6();
		PracticeQuestion6 b = new PracticeQuestion6(20,3);
		a.fill('*');
		b.fill('%');
		a.draw();
		b.draw();
	}

}