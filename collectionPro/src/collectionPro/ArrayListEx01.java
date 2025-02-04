package collectionPro;

import java.util.ArrayList;

public class ArrayListEx01 {
	
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();
		
		a.add("hello");
		a.add("Hi");
		a.add("Java");
		a.add(1, "사과");
		for(String i: a)
			System.out.println(i);
		
		System.out.println();
		a.remove(0);
		for(String i: a)
			System.out.println(i);
		
//		System.out.println();
//		a.clear();
//		System.out.println(a.isEmpty());
//		for(String i: a)
//			System.out.println(i);
		
		System.out.println();
		a.remove("Hi");
//			제네릭 타입이 Integer가 아니라서 이제 특정 값을 지닌 객체를 직접 삭제할 수 있음
		for(String i: a)
			System.out.println(i);
		
		System.out.println();
		Object[] arr = a.toArray();
//		 	객체를 저장했기 때문에 배열 선언 자체를 Object[]로 해야함
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		 
		System.out.println();
		System.out.println(a.contains("사과"));
		
	}

}
