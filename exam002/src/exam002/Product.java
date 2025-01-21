package exam002;

public class Product {

//	필드
	private int id;
	private String comment;
	private String productor;
	private int price;
	
//	생성자
	public Product() {}
	public Product(int id, String comment, String productor, int price) {
		super();
		this.id = id;
		this.comment = comment;
		this.productor = productor;
		this.price = price;
	}
	
//	getter, setter
	public int getId() {
		return id;
	}
	
//	메소드
	public void display() {
		System.out.print(id + "\t");
		System.out.print(comment + "\t");
		System.out.print(productor+ "\t");
		System.out.print(price+ "\t");
	}
	
}
