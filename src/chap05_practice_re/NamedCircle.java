package chap05_practice_re;

class Circle {
	private int rad;
	public Circle(int rad) { this.rad = rad; }
	public int getRadius() { return rad; }
}

public class NamedCircle extends Circle {
	
	private String name;
	
	NamedCircle(int rad, String name) { // NamedCircle() 매개 함수
		super(rad);
		this.name = name;
	}
	
	public void show() { 	// show() 매개 함수
		System.out.println(name + ", 반지름 = " + getRadius());
	}
	
	public static void main(String[] args) {
		NamedCircle w = new NamedCircle(5, "Waffle"); 
		w.show(); 
	}

}