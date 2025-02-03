package homework_5th;

//	일반적인 휴대폰을 나타내는 Phone 클래스를 작성한다.
//	Phone에는 제조사, 가격, 통신타입(2g 또는 3g) 등의 정보가 저장되어 있다.
//	Phone에서 상속받아서 SmartPhone 클래스를 작성하여 보자.
//	SmartPhone 클래스에는 운영체제 타입, 운영체제 버전, 내부 메모리 크기,
//	카메라 장착 여부, 블루투스 지원 여부 등의 필드가 추가된다.
//	생성자, 접근자, 설정자를 포함하여서 각각의 클래스를 작성한다.
//	이들 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력하는 테스트 클래스를 작성하라.

class Phone {
	
//	필드
	private String productor;
	private int price;
	private String teltype;
	
//	생성자
	public Phone() {}
	public Phone(String productor, int price, String teltype) {
		super();
		this.productor = productor;
		this.price = price;
		this.teltype = teltype;
	}
	
//	getters, setters
	public String getProductor() {
		return productor;
	}
	public int getPrice() {
		return price;
	}
	public String getTeltype() {
		return teltype;
	}
	public void setProductor(String productor) {
		this.productor = productor;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setTeltype(String teltype) {
		this.teltype = teltype;
	}
	
}

class Smartphone extends Phone {
	
//	필드
	private String OStype;
	private String OSversion;
	private int memory;
	private boolean camera;
	private boolean bluetooth;
	
//	생성자
	public Smartphone() {}
	public Smartphone(String productor, int price, String teltype, 
			String oStype, String oSversion, int memory, boolean camera, boolean bluetooth) {
		super(productor, price, teltype);
		OStype = oStype;
		OSversion = oSversion;
		this.memory = memory;
		this.camera = camera;
		this.bluetooth = bluetooth;
	}
	
//	getters, setters
	public String getOStype() {
		return OStype;
	}
	public String getOSversion() {
		return OSversion;
	}
	public int getMemory() {
		return memory;
	}
	public boolean isCamera() {
		return camera;
	}
	public boolean isBluetooth() {
		return bluetooth;
	}
	public void setOStype(String oStype) {
		OStype = oStype;
	}
	public void setOSversion(String oSversion) {
		OSversion = oSversion;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public void setCamera(boolean camera) {
		this.camera = camera;
	}
	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}
		
}

public class Ex04 {
	
	public static void main(String[] args) {
		
//		객체 생성
		Phone p1 = new Phone("삼성", 1000000, "2G");
		Smartphone sp1 = new Smartphone("애플", 1000000, "3G", "OS", "1.0.0", 300, true, true);
		
//		p1 정보 출력
		System.out.println(p1.getProductor());
		System.out.println(p1.getProductor());
		System.out.println(p1.getTeltype());
		
//		sp1 정보 출력
		System.out.println();
		System.out.println(sp1.getProductor());
		System.out.println(sp1.getPrice());
		System.out.println(sp1.getTeltype());
		System.out.println(sp1.getOStype());
		System.out.println(sp1.getOSversion());
		System.out.println(sp1.getMemory());
		System.out.println("카메라 여부 = " + sp1.isCamera());
		System.out.println("블루투스 여부 = " + sp1.isBluetooth());
		
	}

}
