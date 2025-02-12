package exam;

public class Student {
	
//	필드
	private int sno;
	private String name;
	private int korean, english, math;
	
//	생성자
	public Student(int sno, String name, int korean, int english, int math) {
		super();
		this.sno = sno;
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	
//	getters, setters
	public int getSno() {
		return sno;
	}
	public String getName() {
		return name;
	}
	public int getKorean() {
		return korean;
	}
	public int getEnglish() {
		return english;
	}
	public int getMath() {
		return math;
	}
	public int getSum() {
		return this.korean + this.english + this.math;
	}
	public double getAvg() {
		return (double)this.getSum() / 3;
	}
	
}
