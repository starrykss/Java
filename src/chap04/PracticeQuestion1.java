package chap04;

public class PracticeQuestion1 {
	
	private String title;
	public PracticeQuestion1(String title){
		this.title = title;
	}

	private String getTitle() {
		return title;
	}

	public static void main(String[] args) {
		PracticeQuestion1 mySong = new PracticeQuestion1("Let it go");
		PracticeQuestion1 yourSong = new PracticeQuestion1("강남스타일");
		System.out.println("내 노래는 " + mySong.getTitle());
		System.out.println("너 노래는 " + yourSong.getTitle());
	}
}


