package stringPro;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	
	public static void main(String[] args) {
		
		String query = "name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "=&");
//			=, &, =&를 모두 구분자로 인식하겠다는 뜻
		int count = st.countTokens();
		System.out.println("token count = " + count);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
//			st.hasMoreTokens() -> 토큰이 남아있으면 true를 반환
		
//		토큰과 배열의 차이
		System.out.println();
		String[] arr = query.split("&");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
//			구분자가 1개일때는 토큰이랑 다를게 없긴 함
		System.out.println();
		String[] arr2 = query.split("=&");
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
//			구분자 2개 이상부터는 토큰 방식과는 달리 구분을 잘 못함
		
	}

}
