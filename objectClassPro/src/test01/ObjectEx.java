package test01;

class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point (" + x + ", " + y + ")";
	}
	@Override
	public boolean equals(Object obj) {
		Point other = (Point) obj; // downcasting
		if(this.x == other.x && this.y == other.y)
			return true;
		else
			return false;
	}
	
	
}

public class ObjectEx {
	
	public static void main(String[] args) {
		
		String s1 = new String("abcd");
		String s2 = new String("abcd");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		
		
		System.out.println();
		Point p1 = new Point(2, 3);
		Point p2 = new Point(3, 4);
		
		System.out.println(p1.getClass().getName());
		System.out.println(p1.hashCode());
		System.out.println(p1); // toString()을 걍 자동으로 호출함
		System.out.println(p1.toString());
		
		System.out.println();
		System.out.println(p2);
		
		System.out.println();
		System.out.println(p1 == p2);
		
		System.out.println();
		System.out.println(p1.equals(p2));
		
	}

}
