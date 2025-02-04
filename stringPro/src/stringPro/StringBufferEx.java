package stringPro;

public class StringBufferEx {
	
	public static void main(String[] args) {
		
		String s = new String("This");
		System.out.println(s.hashCode());
		s = s.concat(" is a pencil.");
		System.out.println(s.hashCode()); // s의 주소가 달라지고 있음
		
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb.hashCode());
		sb = sb.append(" is pencil.");
		System.out.println(sb.hashCode()); // 같은 객체를 가리키고 있음
		sb = sb.insert(7, " my");
		System.out.println(sb);
		sb = sb.replace(8, 10, "your");
		System.out.println(sb);
		String ss = sb.toString(); // StringBuffer를 String으로 만들었음
		System.out.println(sb.hashCode());
		System.out.println(ss.hashCode());
		
		
		
	}

}
