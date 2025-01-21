package personPackage;

class Shape {
	public Shape next;
	public Shape() { next = null; }
	public void draw() { System.out.println("Shape"); }
}

class Line extends Shape {
	public void draw() { System.out.println("Line"); }
}

class Rect extends Shape {
	public void draw() { System.out.println("Rect"); }
}

class Circle extends Shape {
	public void draw() { System.out.println("Circle"); }
}

public class MethodOverridingEx {
	
	static void paint(Shape p) { p.draw(); }
	
	public static void main(String[] args) {
		Line line = new Line();
		line.draw();
		Shape l = new Line();
		l.draw(); // 업캐스팅을 해도 인스턴스 멤버에 같은 이름의 메소드가 있긴 있기 때문에
//					 오버라이딩이 됨
		paint(line);
		paint(new Shape());
		paint(new Rect());
		paint(new Circle());
		
//		Shape start, last, obj;
//		start = new Line();
//		last = start;
//		obj = new Rect();
//		last.next = obj;
//		last = obj;
//		obj = new Line();
//		last.next = obj;
//		last = obj;
//		obj = new Circle();
//		last.next = obj;
//		
//		Shape p = start;
//		while(p != null) {
//			p.draw();
//			p = p.next;
//		}
	}

}
