package stringPro;

import java.util.StringTokenizer;

public class StringTokenizerEx02 {
	
	public static void main(String[] args) {
		
		String s = "3++";
		StringTokenizer st = new StringTokenizer(s, "++--**//%%&&||", true);
//			구분자 뒤에 true를 넣으면 구분자까지 토큰으로 인식하겠다는 뜻임
		
		int num1 = Integer.parseInt(st.nextToken().trim());
//			이렇게 하면 "3 "에서 "3"을 인식함
		String op = st.nextToken();
//		int num2 = Integer.parseInt(st.nextToken().trim());
		
		System.out.println(num1);
		System.out.println(op);
//		System.out.println(num2);
		
	}

}
