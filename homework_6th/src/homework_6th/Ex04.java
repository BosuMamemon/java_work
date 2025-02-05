package homework_6th;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요. 빈 칸이 있어도 되고, 영어 한글 모두 됩니다.");
		String text = scanner.nextLine();
		
		System.out.println("<Enter>를 입력하면 문자열이 한 글자씩 회전합니다.");
		while(true) {
			String key = scanner.nextLine();
			if(key.equals("")) {
				String first = Character.toString(text.charAt(0)); 
				String last = text.substring(1);
				text = last + first;
				System.out.print(text + " >>");
			} else if (key.equals("q"))
				break;
			else
				System.out.println(text + " >>");
		}
		
		System.out.println("종료합니다...");
		scanner.close();
		
	}

}
