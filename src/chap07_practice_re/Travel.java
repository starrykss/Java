package chap07_practice_re;

import java.util.*;

class Location { // Location 클래스
	private int x;
	private int y;
	Location(int x, int y) { this.x = x; this.y = y; }
	
	public double distance(Location b) {
		double d = (x - b.x)*(x - b.x) + (y - b.y)*(y - b.y);
		return Math.sqrt(d);
	}
}

public class Travel {
	public static void main(String[] args) {
		ArrayList<Location> t = new ArrayList<Location>();
		Scanner scanner = new Scanner(System.in);
		
		t.add(new Location(0,0)); 
		System.out.println("쥐가 이동한 위치(x,y)를 5개 입력하라.");
		for (int i=0; i<5; i++) {
			System.out.print(">> ");
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			t.add(new Location(x, y));
		}
		t.add(new Location(0,0)); 
		
		double sum = 0.0;
		for(int i=0; i<t.size()-1; i++) {
			double d = t.get(i).distance(t.get(i+1));
			sum += d;	
		}
		System.out.println("총 이동 거리는 " + sum);		
		scanner.close();
	}
}
