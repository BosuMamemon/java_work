package collectionPro;

import java.util.Vector;

public class VectorEx01 {
	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		int size = v.size();
		int capacity = v.capacity();
		
		System.out.printf("size = %d / capacity = %d%n", size, capacity);
		
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));			
		}
		
		System.out.println();
		v.add(2, 10); // 인덱스 2 위치에 10을 넣고, 원래 그 인덱스에 있었던 -1은 인덱스 3으로 밀려남
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));			
		}

		System.out.println();
		v.remove(1); // 인덱스 1의 값을 지웠음
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));			
		}
		
		System.out.println();
//		v.remove(10); // 객체 그 자체를 지정해서 지울 수도 있지만 정수는 인덱스랑 헷갈려서 예외 발생
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));			
		}
		
		System.out.println();
		System.out.println(v.lastElement());
		
		v.clear();
//		v.removeAllElements(); <- 이것도 clear랑 같음
		
		System.out.println();
		int sum = 0;
		for(int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			sum += n;
		}
		System.out.println(sum);
		
	}

}
