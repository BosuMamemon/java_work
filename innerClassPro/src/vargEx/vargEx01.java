package vargEx;

public class vargEx01 {
	
//	public static void show(String str) {
//		System.out.println(str);
//	}
//	
//	public static void show(String str1, String str2) {
//		System.out.println(str1);
//		System.out.println(str2);
//	}
//	
//	public static void show(String str1, String str2, String str3) {
////	메소드 오버로딩을 사용한 방법
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
//	}
	
	public static void showAll(String...varg) {
//		(String...패러미터명) -> String이 가변인자로 들어온다고 선언한거임
//		이럴때 매개변수는 배열로서 들어옴(즉 varg는 String[]임)
		for(String s: varg) {
			System.out.printf("%s ", s);
		}
		System.out.println();
	}
	
	public static void showInt(int...varg) {
//		(String...패러미터명) -> String이 가변인자로 들어온다고 선언한거임
//		이럴때 매개변수는 배열로서 들어옴(즉 varg는 String[]임)
		for(int i: varg) {
			System.out.printf("%d ", i);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
//		show("abc");
//		System.out.println();
//		show("abc", "def");
//		System.out.println();
//		show("abc", "def", "ghi");
////			메소드 오버로딩을 이용한 방법
		
		showAll("abc");
		System.out.println();
		showAll("abc", "def");
		System.out.println();
		showAll("abc", "def", "ghi");
//			가변인자를 사용한 방법
//		showAll("abc", 1, 0.5);
//			이건 String[]안에 들어갈 수 없어서 컴파일 오류
		
		showInt(1);
		showInt(1, 2);
		showInt(1, 2, 3, 4, 5, 6);
		
	}

}
