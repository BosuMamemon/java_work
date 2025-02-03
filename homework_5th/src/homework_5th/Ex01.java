package homework_5th;

//	Person 클래스를 설계하라.
//	Person 클래스는 이름, 주소, 전화 번호를 필드로 가진다.
//	하나 이상의 생성자를 정의하고 각 필드에 대하여 접근자와 설정자 메소드를 작성하라.
//	이어서 Person을 상속받아서 Customer를 작성하여 보자.
//	Customer는 고객 번호와 마일리지를 필드로 가지고 있다.
//	한 개 이상의 생성자를 작성하고 적절한 접근자 메소드와 설정자 메소드를 작성한다.
//	이들 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력하는 테스트 클래스를 작성하라.

class Person {
	
//	필드
	private String name;
	private String address;
	private String tel;
	
//	생성자
	public Person() {}
	public Person(String name) {
		super();
		this.name = name;
	}
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Person(String name, String address, String tel) {
		super();
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	
//	getters, setters
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getTel() {
		return tel;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}

class Customer extends Person {
	
//	필드
	private int customerNum;
	private int mileage;
	
//	생성자
	public Customer() {}
	public Customer(String name, String address, String tel, int customerNum, int mileage) {
		super(name, address, tel);
		this.customerNum = customerNum;
		this.mileage = mileage;
	}

//	getters, setters
	public int getCustomerNum() {
		return customerNum;
	}
	public int getMileage() {
		return mileage;
	}
	public void setCustomerNum(int customerNum) {
		this.customerNum = customerNum;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
}

public class Ex01 {
	
	public static void main(String[] args) {

//		객체 생성
		Person p1 = new Person("정현민", "보수동책방골목", "010-6526-1524");
		Customer c1 = new Customer("콩알몬", "보수동책방골목", "010-6526-1524", 1, 1000000);
		
//		p1 정보 출력
		System.out.println(p1.getName());
		System.out.println(p1.getAddress());
		System.out.println(p1.getTel());
				
//		c1 정보 출력
		System.out.println();
		System.out.println(c1.getName());
		System.out.println(c1.getAddress());
		System.out.println(c1.getTel());
		System.out.println(c1.getCustomerNum());
		System.out.println(c1.getMileage());
		
	}

}
