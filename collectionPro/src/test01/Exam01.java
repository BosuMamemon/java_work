package test01;

import java.util.ArrayList;
import java.util.Scanner;

import collectionPro.Student;

public class Exam01 {
	
	public static void main(String[] args) {
		
		ArrayList<Student> a = new ArrayList<>();
		
		a.add(new Student(1, "홍길동", "컴공", 80));
		a.add(new Student(2, "정현민", "철학", 85));
		a.add(new Student(3, "이동근", "멀티미디어", 90));
		a.add(new Student(4, "전진육", "정보통신", 95));
		a.add(new Student(5, "배성훈", "멀티미디어", 75));
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n학번을 입력하세요.");
			System.out.println("종료를 원하시면 '종료'라고 입력하세요. >>\n");
			String input = sc.next();
			if(input.equals("종료")) break;
			int sno = Integer.parseInt(input);
			
			boolean searchFlag = false;
			for(int i = 0; i < a.size(); i++) {
				if(sno == a.get(i).getSno()) {
					System.out.println(a.get(i));
					searchFlag = true;
					break;
				}
			}
			if(!searchFlag) System.out.println("데이터가 없습니다.");
		}
		
		System.out.println("\n입력을 종료합니다...\n");
		sc.close();
		
	}

}
