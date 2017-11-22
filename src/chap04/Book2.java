package chap04;

public class Book2 {
	String title;
	String author;
	
	void show() { System.out.println(title + " " + author); }
	
	public Book2() {
		this("", "");
		System.out.println("������ ȣ���");
	}
	
	public Book2(String title) {
		this(title, "���ڹ̻�");
	}
	
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		Book2 javaBook = new Book2("Java", "Ȳ����");
		Book2 bible = new Book2("Bible");
		Book2 emptyBook = new Book2();
		
		bible.show();
				
	}
}
