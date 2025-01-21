package pk0121_2;

import pk0121.Student;

public class StudentWorker extends Student {
	
	public void set() {
//		age = 30; <- default 멤버라서 못 가져옴
		setAge(30);
		name = "성춘향"; // public 멤버라서 가져올 수 있음
		height = 170; // protected 멤버라서 다른 패키지라도 import하면 가져올 수 있음
//		weight = 99; <- private 멤버라서 못 가져옴
		setWeight(99);
		System.out.println(getAge());
		System.out.println(getWeight());
	}

}
