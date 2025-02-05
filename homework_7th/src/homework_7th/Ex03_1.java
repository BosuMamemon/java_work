package homework_7th;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//	학생 정보를 나타내는 Student 클래스에 이름, 학과, 학번, 학점, 학점을 평균저장하는 필드를 작성하라.  
//	(1) 학생 객체를 생성하고 5명을 학생정보를 ArrayList<Student> 컬렉션에 저장한 후에, 
//	ArrayList<Student>의 모든 학생(5명)의 정보를 출력하고,
//	학생의 이름을 입력받아 해당 학생의 학점 평균을 출력하는 프로그램을 작성하라.
//	(2) ArrayList<Student> 대신, HashMap<String, Student> 해시맵을 이용하여 다시 작성하라.
//	해시맵의 키는 학생이름으로 한다.

class Student {
	
//	필드
	private String name, major;
	private int sNum;
	private double credit;
	
//	생성자
	public Student() {}
	public Student(String name, String major, int sNum, double credit) {
		super();
		this.name = name;
		this.major = major;
		this.sNum = sNum;
		this.credit = credit;
		this.credit = credit;
	}
	
//	getters, setters, toString
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	public int getsNum() {
		return sNum;
	}
	public double getCredit() {
		return credit;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setsNum(int sNum) {
		this.sNum = sNum;
	}
	public void setCredit(double Credit) {
		this.credit = Credit;
	}
	@Override
	public String toString() {
		return
				"이름: " + this.getName()
				+ "\n학과: " + this.getMajor()
				+ "\n학번: " + this.getsNum()
				+ "\n평균학점: " + this.getCredit();
	}
	
		
}

public class Ex03_1 {
	
	public static void main(String[] args) {
		
//		객체 등 선언 및 생성
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		
//		Student 객체 5개 ArrayList 삽입 및 출력
		System.out.println("학생 이름, 학과, 학번, 평균학점을 입력하세요.");
		for(int i = 0; i < 5; i++) {
			System.out.print(" >> ");
			String name = scanner.next();
			String major = scanner.next();
			int sNum = scanner.nextInt();
			double credit = scanner.nextDouble();
			
			students.add(new Student(name, major, sNum, credit));
		}
		
		Iterator<Student> studentIt = students.iterator();
		while(studentIt.hasNext()) {
			Student current = studentIt.next();
			System.out.println("--------------------------------------------");
			System.out.println(current.toString());
		}
		
//		학생 검색 및 평균학점 출력
		while(true) {
			System.out.println("--------------------------------------------");
			System.out.print("학생 이름 >> ");
			String input = scanner.next();
			if(input.equals("그만")) break;
			
			boolean search= false;
			for(int i = 0; i < students.size(); i++) {
				if(input.equals(students.get(i).getName())) {
					System.out.println(students.get(i).toString());
					search = true;
					break;
				}
			}
			if(!search) System.out.println("데이터가 없습니다.");
		}
		
		System.out.println("종료합니다...");
		scanner.close();
		
	}

}
