package exam;

public class StudentEx {
	
	public static void main(String[] args) {
		
		Student[] students = new Student[5];
		students[0] = new Student(1, "홍길동", 80, 60, 70);
		students[1] = new Student(2, "박경미", 90, 95, 80);
		students[2] = new Student(3, "정희선", 75, 80, 100);
		students[3] = new Student(4, "임혜동", 80, 70, 95);
		students[4] = new Student(5, "조만현", 100, 65, 80);
		
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=====================================================");
		for(int i = 0; i <students.length; i++) {
			System.out.printf("%-8d%-5s%-8d%-8d%-8d%-8d%-8.1f%n", students[i].getSno(), students[i].getName(), students[i].getKorean(),
					students[i].getEnglish(), students[i].getMath(), students[i].getSum(), students[i].getAvg());
		}
		
	}

}
