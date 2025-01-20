package packagepro;

public class Student {
	
	private int sno;
	private String name;
	private String major;
	private static int count;
//		static 멤버는 공용 멤버라서 모든 클래스가 공유함
	
	public Student() {
		System.out.println("default 생성자");
		count++;
		}
	public Student(int sno, String name, String major) {
		this.sno = sno;
		this.name = name;
		this.major = major;
		count++;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public static int getCount() {
//		this.name = "aa";
//			static 멤버에는 non-static 요소를 넣을 수 없음
		return count;
	}

}
