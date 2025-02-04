package collectionPro;

import java.util.Vector;

public class VectorEx03 {
	
	public static void main(String[] args) {
		
		Vector<Point> v = new Vector<>();
		
		v.add(new Point(2, 3)); // 객체 생성 및 벡터에 삽입
		v.add(new Point(5, 10));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		
		System.out.println();
		v.remove(0);
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
//				toString() 메소드를 클래스 내에 만들어놓으면 이렇게 알아서 String으로 변환해서 출력함
		}
		
		
	}

}
