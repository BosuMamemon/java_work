package exam;

public class Phone {
	
//	필드
	private String name;
	private String tel;
	private String address;
	
//	생성자
	public Phone() {}
	public Phone(String name, String tel, String address) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
//	getters, setters
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public String getAddress() {
		return address;
	}
	
}
