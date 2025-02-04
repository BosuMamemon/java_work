package stringPro;

public class StringEx01 {
	
	public static void main(String[] args) {
		
		String s1 = "abcd";
		String s2 = "java";
		String s3 = "abcd";
		String s4 = new String("abcd");
		String s5 = new String("java");
		String s6 = new String("java");
		char[] s7 = {'a', 'b', 'c', 'd'};
		String s8 = new String(s7);
		
		System.out.println(s1.equals(s2)); // 값 내용이 다르기 때문에 false
		System.out.println(s1.compareTo(s8)); // 값 내용이 같기 때문에 0
		System.out.println(s1.compareTo("abcd")); // 첫번째 글자 아스키 코드값 차이 출력
		
		System.out.println();
		System.out.println(s1 == s3); // 스트링 리터럴에서 같은 주소를 참조하기 때문에 true
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s4); // 새 객체가 따로 만들어졌기 때문에 false
		System.out.println(s1.equals(s4));
		System.out.println(s5 == s6); // 서로 다른 객체이기 때문에 false
		System.out.println(s5.equals(s6));
		System.out.println(s4 == s8); // 서로 다른 객체이기 때문에 false
		System.out.println(s4.equals(s8));
		
		
	}

}
