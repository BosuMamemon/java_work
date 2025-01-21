package exam002;

public class Book extends Product {

//	필드
	private String title;
	private String author;
	
//	생성자
	public Book() { super(); }
	public Book(int id, String comment, String productor, int price, String title, String author) {
		super(id, comment, productor, price);
		this.title = title;
		this.author = author;
	}
	
//	메소드
	public void display() {
		super.display();
		System.out.print(title + "\t");
		System.out.print(author + "\t");
	}

}
