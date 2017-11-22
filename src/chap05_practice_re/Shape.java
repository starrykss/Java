package chap05_practice_re;

public abstract class Shape {
	private Shape next;
	public Shape() { next = null;}
	public void setNext(Shape object) {next = object;} 
	public Shape getNext() {return next;}
	public abstract void draw();
}
