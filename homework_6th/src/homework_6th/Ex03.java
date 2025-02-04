package homework_6th;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = scanner.nextLine();
			StringBuffer sb = new StringBuffer(s); // 첫번째 문제
//			두번째 문제
			if(sb.toString().equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			int index = (int)(Math.random() * s.length());
			while(true) {
				int i = (int)(Math.random() * 26);
				char c = (char)('a' + i);
//				세번째, 네번째 문제
				if(sb.charAt(index) != c) {
					sb.replace(index, index + 1, Character.toString(c));
					break;
				}
			}
			System.out.println(sb);
		}
		
		scanner.close();
		
	}
	
}
