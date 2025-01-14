package test03;

import java.util.Scanner;

public class EmployeeTest {
	
	static Scanner sc = new Scanner(System.in);
	
	static Employee add() {
		System.out.println("사번 >>");
		int eno = sc.nextInt();
		System.out.println("이름 >>");
		String name  = sc.next();
		System.out.println("부서 >>");
		String dept = sc.next();
		System.out.println("Position");
		String position = sc.next();
		System.out.println("봉급 >>");
		int sal = sc.nextInt();
		
		Employee emp = new Employee(eno, name, dept, position, sal);
		return emp;
	}
	
	static void list(Employee[] emps, int k) {
		for(int i = 0; i < k; i++) {
			emps[i].display();
		}
	}
	
	public static void main(String[] args) {
		
		Employee[] employees = new Employee[10];
		int k = 0;
		boolean flag = false;
		
		while(true) {
			System.out.println("1. 추가 / 2. 목록보기 / 3. 종료");
			int input = sc.nextInt();
			
			switch(input) {
				case 1:
					employees[k++] = add();
					break;						
				case 2:
					list(employees, k); 
					break;
				case 3:
					flag = true;
					break;
				default:
					System.out.println("입력 오류");
			}
			
			if(flag || k == 10) break;
		}
		System.out.println("입력 종료.");
		
	}

}
