package homework_6th;

//	bonus 1 문제

class Circle {
	
//	필드
	private int x, y, radius;
	
//	생성자
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius; // 필드 초기화. 첫번째 문제
	}
	
//	toString. 두번째 문제
	public String toString() {
		return "(" + this.x + ", " + this.y + ") 반지름 " + this.radius;
	}
	
//	equals. 세번째 문제
	public boolean equals(Circle c) {
		double thisArea = Math.PI * Math.pow(this.radius, 2);
		double cArea = Math.PI * Math.pow(c.radius, 2);
		if(thisArea == cArea) return true;
		else return false;
	}
	
	
}

public class Ex02 {
	
	public static void main(String[] args) {
		
		Circle a = new Circle(1, 2, 10);
		Circle b = new Circle(5, 6, 10);
		System.out.println("원 1: " + a);
		System.out.println("원 2: " + b);
		if(a.equals(b)) System.out.println("같은 원입니다.");
		else System.out.println("다른 원입니다.");
		
	}

}
