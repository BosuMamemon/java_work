package exam002;

public class ConversationBook extends Book {

//	필드
	private String language;
	
//	생성자
	public ConversationBook() { super(); }
	public ConversationBook(int id, String comment, String productor, int price, String title, String author, String language) {
		super(id, comment, productor, price, title, author);
		this.language = language;
	}
	
//	메소드
	public void display() {
		super.display();
		System.out.print(language + "\t");
	}
	
}
