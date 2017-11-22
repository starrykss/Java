package chap07_practice;

import java.util.*;

class Location {
	private int x, y;
	Location(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public double distance(Location b) {
		double d = (x - b.x)*(x - b.x) + (y - b.y)*(y - b.y);
		return Math.sqrt(d);
	}
}

public class TravelManager {
	public static void main(String[] args) {
		ArrayList<Location> travel = new ArrayList<Location>();
		Scanner scanner = new Scanner(System.in);
		
		travel.add(new Location(0,0)); // ���� ��ġ
		System.out.println("�㰡 �̵��� ��ġ(x,y)�� 5�� �Է��϶�.");
		for (int i=0; i<5; i++) {
			System.out.print(">> ");
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			travel.add(new Location(x, y));
		}
		travel.add(new Location(0,0)); // ���� ��ġ
		
		double sum = 0.0;
		for(int i=0; i<travel.size()-1; i++) {
			// Location(i)�� Location(i+1)�ǻ����� �̵� �Ÿ�
			double d = travel.get(i).distance(travel.get(i+1));
			sum += d;	
		}
		System.out.println("�� �̵� �Ÿ��� " + sum);		
	}
}
