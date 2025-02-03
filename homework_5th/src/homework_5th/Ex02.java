package homework_5th;

//	일반적인 책을 나타내는 Book 클래스를 상속받아서 잡지를 나타내는 Magazine 클래스를 작성하여 보자.
//	Book 클래스는 제목, 페이지수, 저자 등의 정보를 가진다.
//	Magazine 클래스는 추가로 발매일 정보를 가진다.
//	생성자, 접근자, 설정자를 포함하여서 각각의 클래스를 작성한다.
//	이들 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력하는 테스트 클래스를 작성하라.

class Book {
	
//	필드
	private String title;
	private int pages;
	private String writer;
	
//	생성자
	public Book() {}
	public Book(String title, int pages, String writer) {
		super();
		this.title = title;
		this.pages = pages;
		this.writer = writer;
	}

//	getters, setters, toString
	public String getTitle() {
		return title;
	}
	public int getPages() {
		return pages;
	}
	public String getWriter() {
		return writer;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", pages=" + pages + ", writer=" + writer + "]";
	}
	
}

class Magazine extends Book {
	
//	필드
	private String date;

//	생성자
	public Magazine() {}
	public Magazine(String title, int pages, String writer, String date) {
		super(title, pages, writer);
		this.date = date;
	}

//	getters, setters
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}	
	
}

public class Ex02 {
	
	public static void main(String[] args) {
		
//		객체 생성
		Magazine m1 = new Magazine("잡지 A", 10, "기자 A", "2010년 2월 25일");
		Magazine m2 = new Magazine("잡지 B", 20, "기자 B", "2010년 3월 8일");
		
//		m1 정보 출력
		System.out.println(m1.getTitle());
		System.out.println(m1.getPages());
		System.out.println(m1.getWriter());
		System.out.println(m1.getDate());
		
//		m2 정보 출력
		System.out.println();
		System.out.println(m2.getTitle());
		System.out.println(m2.getPages());
		System.out.println(m2.getWriter());
		System.out.println(m2.getDate());
		
	}

}
