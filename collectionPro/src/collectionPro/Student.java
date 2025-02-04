package collectionPro;

public class Student {

//	필드
	private int sno, score;
	private String name, major;
	
//	생성자
	public Student() {}
	public Student(int sno, String name, String major, int score) {
		super();
		this.sno = sno;
		this.name = name;
		this.major = major;
		this.score = score;
	}
	
//	getters, setters, toString
	public int getSno() {
		return sno;
	}
	public int getScore() {
		return score;
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return this.sno + " " + this.name + " " + this.major + " " + this.score;
	}
	
}
