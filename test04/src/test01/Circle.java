package test01;

public class Circle {
	
	int radius;
	String name;
	
	public Circle() {}
//		기본 생성자(default 생성자)
	
	public Circle(int r) {
		radius = r;
	}
	
	public Circle(String n) {
		name = n;
	}
	
	public Circle(int r, String n) {
		radius = r;
		name = n;
	}
	
	public Circle(String n, int r) {
		name = n;
		radius = r;
	}
//		위처럼 패러미터가 다른 여러 생성자들을
//		'메소드 오버로딩(같은 이름의 메소드를 중복하여 정의하는 것)'이라고 부름
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle();
		System.out.println(pizza.radius);
		System.out.println(pizza.name);
//			필드에 아무 값을 안 넣으면 걍 기본형으로 나옴(배열이랑 같음)
		System.out.println(pizza.getArea());
		
		Circle donut = new Circle(10, "자바");
		System.out.println(donut.radius);
		System.out.println(donut.name);
		System.out.println(donut.getArea());
	}

}
