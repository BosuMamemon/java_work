package pk0121;

class A {
	public A() { System.out.println("생성자 A"); }
	public A(int x) { System.out.println(x); }
	static void printA() { System.out.println("static A"); }
	
}

class B extends A {
	public B() {}
	public B(int x) {
		super(x);
		System.out.println("생성자 B");
		}
	static void printB() { System.out.println("static B"); }
}

class C extends B {
	public C() {}
	public C(int x) {
		super(x); // 슈퍼 클래스 생성자(기본 or 패러미터) 호출. 지시 안하면 컴파일러가 알아서 이거 함.
		System.out.println("생성자 C");
		}
}

public class ConstructorEx {
	
	public static void main(String[] args) {
		C c = new C(1);
	}

}
