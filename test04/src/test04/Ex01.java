package test04;

public class Ex01 {

	public static void main(String[] args) {
		Circle pizza = new Circle();
		
		pizza.name = "포테이토 피자";
		pizza.radius = 10;
		double pizzaArea = pizza.getArea();
		
		System.out.println(pizza.name);
		System.out.println(pizza.radius);
		System.out.println(pizzaArea);
		
		Circle donut = new Circle();
		
		donut.name = "글레이즈드 도넛";
		donut.radius = 2;
		double donutArea = donut.getArea();
		
		System.out.println(donut.name);
		System.out.println(donut.radius);
		System.out.println(donutArea);
	}

}
