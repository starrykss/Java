package chap04;

import java.util.Scanner;

class Book {
	String title, author;
	public Book(String title, String author) { 		// ������
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Book [] book = new Book[2]; 		// Book �迭 ����
		
		for(int i=0; i<book.length; i++) {
			System.out.println("����>>");
			String title = scanner.nextLine();
			System.out.print("����>>");
			String author = scanner.nextLine();
			book[i] = new Book(title, author); 	// �迭 ���� ��ü ����
		}
		
		for(int i=0; i<book.length; i++)
			System.out.println("(" + book[i].title + ", " + book[i].author + ")");
		scanner.close();
	}
}
