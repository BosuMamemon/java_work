package test01;

public class ObjectArrayTest {

	public static void main(String[] args) {
		
		Circle[] c = new Circle[5];
		
		for(int i = 0; i <c.length; i++) {
			c[i] = new Circle(i, "Circle " + (i + 1) + "th");
			System.out.println(c[i].name);
			System.out.println(c[i].getArea());
		}
		
	}
	
}
