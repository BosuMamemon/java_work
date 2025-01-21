package homework_3rd;

// 다음 코드에서 오류를 찾으시오.
// (1) 
class Point {
	private int x, y; 
	public Point(int x, int y) { 
//		생성자이므로 리턴 타입을 지워준다.
		this.x = x; 
		this.y = y;
//			필드와 매개변수의 차이를 명확하게 하기 위해 this를 쓴다.
	}
}
// (2)
class MyMath { 
	public int getRandom() {
		return (int)Math.random(); 
	}
	public double getRandomF() {
//		오버로드 없이 메소드 이름이 중복 지정되었으므로 적절히 이름을 변경해준다.
		return Math.random();
	}
}
// (3)
class MyClass { 
	private static String getName() {
		return "MyClass";
	}
	public static String getClassName() {
		return getName();
//			static 메소드가 non-static 멤버를 참조하고 있으므로,
//			getName() 메소드를 static 메소드로 바꾸어준다.
	}
}

public class Ex05 {
	public static void main(String[] args) {
		System.out.println("Ex05");
	}
}
