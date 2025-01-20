package bbb;

import aaa.TestA;

public class MainTest {

	public static void main(String[] args) {
		 TestA a = new TestA();
//		 	마찬가지로 public 클래스라서 import하면 다른 패키지에서 접근할 수 있음
//		 TestB b = new TestB();
//		 	얘도 default 클래스라서 다른 패키지에서 못 불러옴
		 TestC c = new TestC();
		 TestD d = new TestD();
		 
//		 a.func1(); <- 암만 public 클래스라도 얘는 default 멤버라서 접근할 수가 없음
		 a.func2(); // public 클래스의 public 멤버만 다른 패키지에서 접근 가능
	}

}
