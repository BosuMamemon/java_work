package homework_3rd;

//날짜(date)를 클래스 Date로 작성한다고 가정하자.
//Date 안에 저장되는 변수 이름과 날짜를 조작하는 메소드 이름을 생각하여 보자. 

class Date {
	
//	필드
	private int year; // 년도
	private int month; // 월
	private int day; // 일
	
//	메소드
//		생성자
	public Date() {};
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
//		setter, getter
	public void setYear(int year) { this.year = year; }
	public void setMonth(int month) { this.month = month; }
	public void setDay(int day) { this.day = day; }
	public int getYear() { return year; }
	public int getMonth() { return month; }
	public int getDay() { return day; }
//		날짜 출력
	public String getDate() {
		return (year + "/" + month + "/" + day);
	}
	public void printDate() {
		System.out.printf("%d/%d/%d", year, month, day);
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		Date date = new Date();
		date.setYear(2025);
		date.setMonth(1);
		date.setDay(20);
		System.out.println(date.getDate());
		date.printDate();
	}
	
}
