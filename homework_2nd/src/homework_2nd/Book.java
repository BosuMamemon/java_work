package homework_2nd;

public class Book {
	
	public String title;
	public String author;
	public String pub;
	public int page;
	
	public Book() {}

	public Book(String title, String author, String pub, int page) {
		super();
		this.title = title;
		this.author = author;
		this.pub = pub;
		this.page = page;
	}
	
	public void display() {
		System.out.printf("%-10s | %-10s | %-10s |%-10d%n", title, author, pub, page);
	}

}
