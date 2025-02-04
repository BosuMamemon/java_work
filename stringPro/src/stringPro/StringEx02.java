package stringPro;

public class StringEx02 {
	
	public static void main(String[] args) {
		
		String a = "  ab cd\t";
		System.out.println("|" + a + "|");
		System.out.println("|" + a.trim() + "|"); // 문자열 a의 앞뒤 공백을 제거함
		
		String b = "java";
		System.out.println(a.length());
		System.out.println(b.length());
		
		String c = a.concat(b);
		System.out.println(c);
		String d = c.replace("java", "python");
		System.out.println(d);
		
		String s1 = "java-program-python";
		String[] arr = s1.split("-"); // "-"를 기준으로 단어를 나눠 배열에 넣겠다는 소리임
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		String s2 = s1.substring(5); // s1[5] 뒷 글자부터 끝까지 substring
		String s3 = s1.substring(5, 8); // s1[5] 뒷 글자부터 s1[8]까지 substring
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.charAt(1)); // s1[1]를 출력
		System.out.println(s1.codePointAt(1)); // s1[1]의 아스키 코드를 출력
		System.out.println(s1.indexOf("-")); // 처음 만나는 "-"의 인덱스값을 출력
		System.out.println(s1.lastIndexOf("-")); // 마지막에 만나는 "-"의 인덱스값을 출력
		
//		s1에서 "program"만 뽑아보기
		System.out.println(s1.substring(s1.indexOf("-") + 1, s1.lastIndexOf("-")));
		
		String ss = "";
		for(int i = 0; i < 100; i++) {
			ss += i;
		} // 이러면 ss에 대한 String 가비지가 99개가 생김
		
		StringBuffer sb = new StringBuffer("java");
			// String의 가변객체 ver임. 문자열 수정이 많은 작업에 적합.
		
		
	}

}
