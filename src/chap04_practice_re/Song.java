package chap04_practice_re;

public class Song {
	private String title;
	public Song(String title) { this.title= title; }
	public String getTitle() { return title; }
	public static void main(String[] arg) {
		Song SongOfMe = new Song("Let it go");
		Song SongOfYou = new Song("������Ÿ��");
		System.out.println("�� �뷡�� " + SongOfMe.getTitle());
		System.out.println("�� �뷡�� "+ SongOfYou.getTitle());
	}
}
