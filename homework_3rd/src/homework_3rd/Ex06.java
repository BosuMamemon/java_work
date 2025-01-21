package homework_3rd;

// 책을 나타내는 Book 클래스를 정의하여 보자.
// Book 클래스는 제목(title)과 저자(author), 출판사(publisher), 분류(sort)를 나타내는 필드를 가진다.
// 필드는 모두 private로 선언한다.
// 각 필드에 대하여 접근자(getter)와 설정자(setter) 메소드를 정의하고
// 이것을 통하여 필드 값을 얻고 설정한다.
// 그리고 default 생성자, 값을 모두 초기화 하는 생성자, 제목만 초기화하는 생성자를 작성하여 보자.
// 메인함수는 주어진 3가지 생성자를 모두 사용하여 다음과 같은 결과가 나오도록 작성한다.

class Book {
	
//	필드
	private String title;
	private String author;
	private String publisher;
	private String sort;
	
//	생성자
	public Book() {}
	public Book(String title, String author, String publisher, String sort) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.sort = sort;
	}
	public Book(String title) {
		super();
		this.title = title;
	}
	
//	getter, setter
	public String getTitle() { return title;}
	public String getAuthor() {return author;}
	public String getPublisher() {return publisher;}
	public String getSort() {return sort;}
	public void setTitle(String title) {this.title = title;}
	public void setAuthor(String author) {this.author = author;}
	public void setPublisher(String publisher) {this.publisher = publisher;}
	public void setSort(String sort) {this.sort = sort;}
	
}

public class Ex06 {
	
//	메인 메소드
	public static void main(String[] args) {
//		객체 생성
		Book book1 = new Book("82년생 김지영", "조남주", "민읍사", "소설");
		Book book2 = new Book("파리아파트", "기욤 뮈소", "밝은 세상", "소설");
		Book book3 = new Book("자료구조", "이자료", "DB출판사", "컴퓨터/IT");
		
//		출력
		System.out.printf("%-15s%-15s%-15s%s%n", "제목", "저자", "출판사", "분류");
		System.out.printf("%-12s%-14s%-15s%s%n", book1.getTitle(), book1.getAuthor(), book1.getPublisher(), book1.getSort());
		System.out.printf("%-12s%-13s%-14s%s%n", book2.getTitle(), book2.getAuthor(), book2.getPublisher(), book2.getSort());
		System.out.printf("%-13s%-14s%-15s%s%n", book3.getTitle(), book3.getAuthor(), book3.getPublisher(), book3.getSort());
	}
	
}
