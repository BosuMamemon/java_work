package aaa;

class TestB {
	private int a;
	
	void func1() {
		a = 10;
	}
	public void func2() {
//		default 클래스 안의 public 멤버는 어차피 default 클래스 안이라서 다른 패키지에서 접근 불가능
		System.out.println("func2");
	}
}

public class TestA {
	void func1() {
		TestB b = new TestB();
//		b.a = 10;
//			private으로 지정된 필드 a는 다른 클래스에서 객체를 생성해도 멤버로 잡히지 않음
		b.func1();
//			얘는 default라서 다른 클래스에서도 접근 가능
	}
	
	public void func2() {
		System.out.println("func2");
	}
}
