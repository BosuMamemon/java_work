package test01;

public class Rectangle {

	int width;
	int height;
	
	public Rectangle() {}
	
	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}
	
	public int getArea() {
		return width * height; 
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
//			생성자를 아무것도 안만들면 기본 생성자를 컴파일러가 알아서 하나 만들어줌
//			생성자를 하나라도 만들면 기본 생성자는 개발자가 직접 만들어줘야함(왜냐면 밑에서 이렇게 쓰고 있으니까!!)
		
		System.out.println(r1.width);
		System.out.println(r1.height);
		System.out.println(r1.getArea());
	}
	
}
