package pk0121;

public class Student extends Person {
	
	public void set() {
		age = 30;
		name = "홍길동";
//		weight = 99; <- private 멤버라서 서브 클래스라도 접근 불가능
		setWeight(99); // 이렇게 setter로 불러와야함
		height = 175;
		System.out.println(getAge());
		System.out.println(getWeight());
	}

}
