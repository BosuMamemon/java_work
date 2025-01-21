package pk0121;

class Point {
	
//	필드
	private int x, y;
//	생성자
	public Point() { super(); }
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
//	getter, setter
	public int getX() {
			return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	//	메소드
	public void showPoint() { System.out.println("(" + x + ", " + y + ")"); }
	
}

class ColorPoint extends Point {
	
//	필드
	private String color;
//	생성자
	public ColorPoint() { super(); }
	public ColorPoint(int x, int y, String color) { 
		super(x, y);
		this.color = color;
		}
//	메소드
	public void showColorPoint() { 
		System.out.printf("(%d, %d) %s", getX(), getY(), color);
		}
	
}

public class SuperEx {
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();
	}

}
