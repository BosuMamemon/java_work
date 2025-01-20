package test5_1;

import test05.Point;

public class ColorPoint02 extends Point {
//	필드
	private String Color;
//	setter, getter
	public void setColor(String color) {
		this.Color = color;
	}
//	메소드
	public void showColorPoint2() {
		System.out.println(x + ", " + y);
//			x, y는 다른 패키지 부모 클래스의 필드이지만, protected라서 접근 가능함
	}
}
