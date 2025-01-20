package aaa;

import bbb.TestC;

public class PackageTest {
	
	public static void main(String[] args) {
		TestA a = new TestA();
//			public 클래스는 같은 패키지 안에서 접근할 수 있음
		TestB b = new TestB();
//			default 클래스도 같은 패키지 안에서 접근할 수 있음
		TestC c = new TestC();
//			public 클래스라서 다른 패키지에서도 접근할 수 있긴 하지만 import를 꼭 시켜줘야 함
//		TestD d = new TestD();
//			다른 클래스의 default 클래스는 import도 못하고 그냥 쓸 수가 없음
		
		a.func1(); // default 멤버임
		a.func2(); // public 멤버임
		b.func1(); // default 멤버임
		b.func2(); // public 멤버임
//		같은 패키지 안이라서 걍 다 접근 가능함
	}

}
