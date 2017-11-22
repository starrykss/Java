// 어려워서 정답 참고했습니다.
package chap04_practice_re;

class Circle {
	private int radius;
	public Circle(int radius) { this.radius = radius; }
	public int getRadius() { return this.radius; }
	public void setRadius(int radius) { this.radius = radius; }
}
class CircleManager { 
	static void copy(Circle fir, Circle sec) { 
		sec.setRadius(fir.getRadius()); 
	}
	static boolean equals(Circle first, Circle second) {  
		if (first.getRadius() == second.getRadius()) return true;
		else return false;
	}
}
public class Static {
	public static void main(String[] args) {
		Circle pizza = new Circle(5);
		Circle waffle = new Circle(1);
		
		boolean result = CircleManager.equals(pizza, waffle); 
		if (result == true) System.out.println("pizza와 waffle 크기 같음");
		else System.out.println("pizza와 waffle 크기 다름");
		
		CircleManager.copy(pizza, waffle); 
		result = CircleManager.equals(pizza, waffle); 
		if (result == true) System.out.println("pizza와 waffle 크기 같음");
		else System.out.println("pizza와 waffle 크기 다름");
	}
}
