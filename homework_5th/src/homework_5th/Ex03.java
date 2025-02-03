package homework_5th;

//	일반적인 음식을 나타내는 Food 클래스를 상속받아서 멜론을 나타내는 Melon 클래스를 작성하여 보자.
//	Food 클래스는 칼로리, 가격, 중량 등의 정보를 가진다.
//	Melon 클래스는 추가로 경작 농원 정보를 가진다.
//	생성자, 접근자, 설정자를 포함하여서 각각의 클래스를 작성한다.
//	이들 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력하는 테스트 클래스를 작성하라.

class Food {
	
//	필드
	private int cal;
	private int cost;
	private int kg;
	
//	생성자
	public Food() {}
	public Food(int cal, int cost, int kg) {
		super();
		this.cal = cal;
		this.cost = cost;
		this.kg = kg;
	}
	
//	getters, setters
	public int getCal() {
		return cal;
	}
	public int getCost() {
		return cost;
	}
	public int getKg() {
		return kg;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	
}

class Melon extends Food {
	
//	필드
	private String info;
	
//	생성자
	public Melon() {}
	public Melon(int cal, int cost, int kg, String info) {
		super(cal, cost, kg);
		this.info = info;
	}
	
//	getters, setters, toString
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "Melon [info=" + info + "]";
	}
	
}

public class Ex03 {
	
	public static void main(String[] args) {
		
//		객체 생성
		Food f1 = new Food(10, 1000, 1);
		Melon m1 = new Melon(20, 2000, 2, "보수동");
		
//		f1 정보 출력
		System.out.println(f1.getCal());
		System.out.println(f1.getCost());
		System.out.println(f1.getKg());
		
//		m1 정보 출력
		System.out.println();
		System.out.println(m1.getCal());
		System.out.println(m1.getCost());
		System.out.println(m1.getKg());
		System.out.println(m1.getInfo());
		System.out.println(m1.toString());
		
	}

}
