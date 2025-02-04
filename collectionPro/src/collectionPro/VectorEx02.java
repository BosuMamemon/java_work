package collectionPro;

import java.util.Vector;

public class VectorEx02 {
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		
		v.add("사과");
		v.add("배");
		v.add("포도");
		v.add(2, "바나나");
		
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		
	}

}
