package collectionPro;

import java.util.ArrayList;
import java.util.Scanner;

public class ExProblem02 {
	
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Student 5명을 ArrayList에 추가합니다.");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("\n" + (i + 1) + "번째 Student의 정보를 입력합니다.");
			System.out.println("학번을 입력해주세요. >>");
			int sno = sc.nextInt();
			System.out.println("이름을 입력해주세요. >>");
			String name = sc.next();
			System.out.println("학과를 입력해주세요. >>");
			String major = sc.next();
			System.out.println("점수를 입력해주세요. >>");
			int score = sc.nextInt();
			
			students.add(new Student(sno, name, major, score));
			System.out.println("\n" + (i + 1) + "번째 Student를 ArrayList에 삽입하였습니다.\n");
		}
		
		boolean flag = false;
		while(true) {
			System.out.println("\n1. ArrayList 전체 출력\n"
					+ "2. 최고점수 Student 출력\n"
					+ "3. 종료\n");
			int input = sc.nextInt();
			
			switch(input) {
			case 1:
				for(Student s: students)
					System.out.println(s.toString());
				break;
			case 2:
				int highScore = 0;
				for(Student s: students) {
					if(s.getScore() > highScore)
						highScore = s.getScore();
				}
				System.out.println("최고점 [ " + highScore + " ] 점을 기록한 학생의 정보를 출력합니다.");
				for(Student s: students) {
					if(s.getScore() == highScore)
						System.out.println(s.toString());
				}
				break;
			case 3:
				flag = true;
				break;
			}
			
			if(flag) break;
		}
		
		System.out.println("\n입력을 종료합니다.\n");
		sc.close();
		
	}

}
