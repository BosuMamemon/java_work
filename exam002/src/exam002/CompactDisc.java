package exam002;

public class CompactDisc extends Product {

//	필드
	private String albumTitle;
	private String singer;
	
//	생성자
	public CompactDisc() { super(); }
	public CompactDisc(int id, String comment, String productor, int price, String albumTitle, String singer) {
		super(id, comment, productor, price);
		this.albumTitle = albumTitle;
		this.singer = singer;
	}
	
//	메소드
	public void display() {
		super.display();
		System.out.print(albumTitle + "\t");
		System.out.print(singer + "\t");
	}
	
}
