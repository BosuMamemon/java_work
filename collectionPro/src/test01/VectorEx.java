package test01;

import java.util.Vector;

public class VectorEx {
	
	public static void main(String[] args) {
		
	Vector<String> v = new Vector<>();
	v.add("홍길동");
	v.add("김소정");
	v.add(1, "지정우");
	
	System.out.println(v.get(0));
	System.out.println(v.get(1));
	System.out.println(v.get(2));
	
	v.remove(0);
	v.remove("김소정");
	
	System.out.println(v.size());
	System.out.println(v.capacity()); // 가변 용량임
		
	}

}
