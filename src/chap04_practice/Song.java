package chap04_practice;

public class Song {
	private String title;
	public Song(String title) {
		this.title= title;
	}
	public String getTitle() {
		return title; 

	}
	public static void main(String[] arg) {
		Song mySong = new Song("Let it go");
		Song yourSong = new Song("������Ÿ��");
		System.out.println("�� �뷡�� " + mySong.getTitle());
		System.out.println("�� �뷡�� "+ yourSong.getTitle());
	}

}