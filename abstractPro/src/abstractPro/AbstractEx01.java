package abstractPro;

abstract class Shape {
	public Shape() {};
	public void paint() {
		draw();
	}
	abstract public void draw();
}

abstract class MyComponent {
	String name;
	public void load(String name) {
		this.name = name;
	}
}

class Line extends Shape {
	public String toString() {
		return "Line";
	}
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class AbstractEx01 {
	
	public static void main(String[] args) {
		
//		Shape s1 = new Shape();
//		MyComponent m1 = new MyComponent();
//		둘 다 추상 클래스라서 인스턴스를 만들 수 없음
		
		Line l1 = new Line();
//		추상 클래스를 단순상속받은 애도 추상 클래스이기 때문에 인스턴스를 만들 수 없음
//		추상 클래스를 상속받으면 그 안엔 추상 메소드가 있기 때문에
//		무조건 추상 클래스라고 선언을 해주거나, 아님 추상 메소드를 오버라이드로 '구현'을 해줘야 함
		Rect r1 = new Rect();
		Circle c1 = new Circle();
		
		l1.draw();
		r1.draw();
		c1.draw();
		
	}

}
