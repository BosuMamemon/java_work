package test01;

import java.util.Scanner;

public class StudentArrayTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[3];
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("학번, 이름, 학과 (구분 = 스페이스바)");
			int sno = sc.nextInt();
			String name = sc.next();
			String major = sc.next();
			students[i] = new Student(sno, name, major);
			System.out.println();
			System.out.println((i + 1) + "번째 학생 입력 완료\n");
		}
		
		for(Student i: students) {
			i.display();
		}
		
		sc.close();

	}

}
