package chap06_practice_re;

public class MyPoint {
	int x, y;
	MyPoint(int x, int y) { this.x = x; this.y = y; }
	public String toString() { return getClass().getName() + "(" + x + "," + y+ ")"; }
	public static void main(String [] args) {
		MyPoint first = new MyPoint(3,20);
		System.out.println(first);
	}
}