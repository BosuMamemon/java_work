package homework_5th;

//	다음 그림에 해당하는 클래스를 작성하여 보자.
//	모든 학생은 이름, 학번, 소속 학과, 학년, 이수 학점 수를 가진다.
//	추가적으로 학부생은 소속 동아리명을 가지고 있고 대학원생은 조교 유형과 장학금 비율을 가진다.
//	조교 유형에는 교육 조교와 연구 조교가 있으며 장학금 비율은 0과 1사이의 값이다.
//	각 클래스는 적절한 생성자 메소드, 접근자 메소드, 변경자 메소드를 가진다.
//	이러한 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력하는 테스트 클래스를 작성하라. 

class Student {
	
//	필드
	private String name;
	private int sNum;
	private String major;
	private int grade;
	private int credit;
	
//	생성자
	public Student() {}
	public Student(String name, int sNum, String major, int grade, int credit) {
		super();
		this.name = name;
		this.sNum = sNum;
		this.major = major;
		this.grade = grade;
		this.credit = credit;
	}
	
//	getters, setters
	public String getName() {
		return name;
	}
	public int getsNum() {
		return sNum;
	}
	public String getMajor() {
		return major;
	}
	public int getGrade() {
		return grade;
	}
	public int getCredit() {
		return credit;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setsNum(int sNum) {
		this.sNum = sNum;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
		
}

class UnderGraduate extends Student {
	
//	필드
	private String club;
	
//	생성자
	public UnderGraduate() {}
	public UnderGraduate(String name, int sNum, String major, int grade, int credit, String club) {
		super(name, sNum, major, grade, credit);
		this.club = club;
	}

//	getters, setters
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	
	public void describe() {
		System.out.printf("이름: %s / 학번: %d / 학과: %s / 학년: %d / 이수학점: %d / 소속 동아리: %s",
				super.getName(), super.getsNum(), super.getMajor(), super.getGrade(), super.getCredit(), club);
	}
}

class Graduate extends Student {
	
//	필드	
	private String taType;
	private double scholarship;
	
//	생성자
	public Graduate() {}
	public Graduate(String name, int sNum, String major, int grade, int credit, String taType, double scholarship) {
		super(name, sNum, major, grade, credit);
		this.taType = taType;
		this.scholarship = scholarship;
	}
	
// getters, setters
	public String getTaType() {
		return taType;
	}
	public double getScholarship() {
		return scholarship;
	}
	public void setTaType(String taType) {
		this.taType = taType;
	}
	public void setScholarship(double scholarship) {
		this.scholarship = scholarship;
	}
	
	public void describe() {
		System.out.printf("이름: %s / 학번: %d / 학과: %s / 학년: %d / 이수학점: %d / 조교 유형: %s / 장학금 비율: %f",
				super.getName(), super.getsNum(), super.getMajor(), super.getGrade(), super.getCredit(), taType, scholarship);
	}
	
}

public class Ex05 {
	
	public static void main(String[] args) {
		
//		객체 생성
		Student s1 = new Student("정현민", 1, "철학과", 1, 10);
		UnderGraduate u1 =  new UnderGraduate("콩알몬", 2, "법학과", 2, 20, "테니스부");
		Graduate g1 = new Graduate("김토리", 3, "멍멍학과", 3, 30, "교육 조교", 0.5);
		
//		s1 정보 출력
		System.out.println(s1.getName());
		System.out.println(s1.getsNum());
		System.out.println(s1.getMajor());
		System.out.println(s1.getGrade());
		System.out.println(s1.getCredit());
		
//		u1 정보 출력
		System.out.println();
		u1.describe();
		
//		g1 정보 출력
		System.out.println();
		g1.describe();
		
	}

}
