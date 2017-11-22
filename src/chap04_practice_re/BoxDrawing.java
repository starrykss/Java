package chap04_practice_re;

public class BoxDrawing {
	private int width, height; 
	private char fill;
	
	public BoxDrawing() { 
		this(10,1); 
	}
	public BoxDrawing(int width, int height) { 
		this.width = width;
		this.height = height;
	}
	public void draw() { 
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++)
				System.out.print(fill);
			System.out.println();
		}
	}
	public void fill(char ct) { 
		this.fill = ct;		
	}
	public static void main(String[] args) {
		BoxDrawing a = new BoxDrawing(); 
		BoxDrawing b = new BoxDrawing(20,3);
		a.fill('*'); b.fill('%'); 
		a.draw(); b.draw(); 
	}
}