package homework_3rd;

//	비행기를 나타내는 Plane라는 이름의 클래스를 설계하라.
//	Plane 클래스는 제작사(예를 들어서 에어버스), 모델(A380), 최대 승객수(500)를 필드로 가지고 있다.
//	(1) 필드를 정의하라. 모든 필드는 전용 멤버로 하라. 
//	(2) 모든 필드에 대한 접근자와 설정자 메소드를 작성한다. 
//	(3) Plane 클래스의 생성자를 몇 개를 중복 정의하라.
//		생성자는 모든 데이터를 받을 수도 있고 아니면 하나도 받지 않을 수 있다. 
//	(4) PlaneTest라는 이름의 테스트 클래스를 만드는데
//		main()에서 Plane 객체 여러 개를 생성하고 접근자와 설정자를 호출하여 보라.
//	(5) Plane 클래스에 지금까지 생성된 비행기의 개수를 나타내는
//		정적 변수인 planes를 추가하고 생성자에서 증가시켜보자. 
//	(6) Plane 클래스에 정적 변수 planes의 값을 반환하는
//		정적 메소드인 getPlanes()를 추가하고 main()에서 호출하여보라.

class Plane {
	
//	필드
	private String productor;
	private String model;
	private int passengers_num;
	private static int planes;
	
//	getter, setter
	public String getProductor() {
		return productor;
	}
	public String getModel() {
		return model;
	}
	public int getPassengers_num() {
		return passengers_num;
	}
	public static int getPlanes() {
		return planes;
	}
	public void setProductor(String productor) {
		this.productor = productor;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setPassengers_num(int passengers_num) {
		this.passengers_num = passengers_num;
	}
	
//	생성자
	public Plane() {
		super();
		planes++;
		}
	public Plane(String productor, String model) {
		super();
		this.productor = productor;
		this.model = model;
		planes++;
	}
	public Plane(String productor, String model, int passengers_num) {
		super();
		this.productor = productor;
		this.model = model;
		this.passengers_num = passengers_num;
		planes++;
	}
	
//	메소드
	
}

public class Ex08 {

	public static void main(String[] args) {
		System.out.println("Ex08");
	}
	
}
