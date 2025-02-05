package test01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import collectionPro.Student;

public class Exam02 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Student> map = new HashMap<>();
		
		map.put(1, new Student(1, "홍길동", "컴공", 80));
		map.put(2, new Student(2, "정현민", "철학", 85));
		map.put(3, new Student(3, "이동근", "멀티미디어", 90));
		map.put(4, new Student(4, "전진육", "정보통신", 95));
		map.put(5, new Student(5, "배성훈", "멀티미디어", 75));
		
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(map.get(1));
		students.add(map.get(2));
		students.add(map.get(3));
		students.add(map.get(4));
		students.add(map.get(5));
		
		Iterator<Student> stuIt = students.iterator();
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n학번을 입력하세요.");
			System.out.println("전체 출력을 원하시면 0번을 입력하세요.");
			System.out.println("종료를 원하시면 '종료'라고 입력하세요. >>\n");
			String input = sc.next();
			if(input.equals("종료")) break;
			int sno = Integer.parseInt(input);
			
			if(sno == 0) {
				while(stuIt.hasNext())
					System.out.println(stuIt.next());
			} else if(map.get(sno) == null) System.out.println("데이터가 없습니다.");
			else System.out.println(map.get(sno));
		}
		
		System.out.println("\n입력을 종료합니다...\n");
		sc.close();
		
	}

}
