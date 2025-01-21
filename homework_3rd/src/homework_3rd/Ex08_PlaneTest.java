package homework_3rd;

public class Ex08_PlaneTest {

	public static void main(String[] args) {
//		객체 생성
		Plane a = new Plane();
		Plane b = new Plane("companyB", "B000");
		Plane c = new Plane("companyC", "C000", 300);
		
//		getter, setter test
//			set a
		a.setProductor("companyA");
		a.setModel("A000");
		a.setPassengers_num(100);
//			get a
		System.out.println(a.getProductor());
		System.out.println(a.getModel());
		System.out.println(a.getPassengers_num());
//			set b
		b.setPassengers_num(200);
//			get b
		System.out.println(b.getProductor());
		System.out.println(b.getModel());
		System.out.println(b.getPassengers_num());
//			get c
		System.out.println(c.getProductor());
		System.out.println(c.getModel());
		System.out.println(c.getPassengers_num());
		
//		getPlanes() test
		System.out.println("\n생성된 Plane의 갯수 = " + Plane.getPlanes());
	}
	
}
