package test05;

public class Point {
	
//	필드
	protected int x, y;
//		protected 지정자를 사용하면 다른 패키지의 자녀 클래스도 필드에 접근할 수 있음
//	setter, getter
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
//	메소드
	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
}

class ColorPoint extends Point {
//	Point 클래스로부터 상속받은 클래스라는 의미
	
//	필드
	private String color;
//	setter, getter
	public void setColor(String color) {
		this.color = color;
	}
//	메소드
	public void showColorPoint() {
		System.out.print(color);
	}
	
}
