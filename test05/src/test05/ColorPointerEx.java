package test05;

public class ColorPointerEx {
//	메인 메소드
	public static void main(String[] args) {
//		Point p 생성
		Point p = new Point();
		p.setXY(1, 2);
		p.showPoint();
		
//		ColorPoint cp 생성
		ColorPoint cp = new ColorPoint();
		cp.setXY(3, 4);
		cp.setColor("red");
		cp.showPoint();
		cp.showColorPoint();
	}
}
