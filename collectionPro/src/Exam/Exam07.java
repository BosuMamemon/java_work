package Exam;

import java.util.ArrayList;
import java.util.Scanner;

class Location {
	
	private int x, y;
	
	public Location() {
		x = 0; y = 0;
	}
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(Location l) {
		return Math.sqrt(Math.pow(this.x - l.x, 2) + Math.pow(this.y - l.y, 2));
	}

}

public class Exam07 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Location> locations = new ArrayList<>();
		
		System.out.println("쥐가 이동한 위치 (x, y)를 5개 입력하라.");
		
		for(int i = 0; i < 5; i++) {
			System.out.print(">> ");
			locations.add(new Location(scanner.nextInt(), scanner.nextInt()));
		}
		
		Location origin = new Location();
		double totalDistance = origin.distance(locations.get(0));
		for(int i = 0; i < 4; i++) {
			totalDistance += locations.get(i).distance(locations.get(i + 1));
		}
		totalDistance += locations.get(locations.size() - 1).distance(origin);
		
		System.out.println("총 이동 거리는 " + totalDistance);
		
		scanner.close();
		
	}

}
