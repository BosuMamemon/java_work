package exam;

class Point {
	
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ColorPoint extends Point {
	
//	필드
	private String color;
	
//	생성자
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
//	getters, setters
	public void setPoint(int x, int y) {
		this.move(x, y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
//	메소드
	public void show() {
		System.out.printf("%s색으로 (%d, %d)", this.color, this.getX(), this.getY());
	}

//	메인
	public static void main(String[] args) {
		
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("PINK");
		cp.show();
		
	}

}
