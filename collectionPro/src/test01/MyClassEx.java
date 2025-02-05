package test01;

public class MyClassEx {

	public static void main(String[] args) {
		
		MyClass<String> s = new MyClass<>();
		s.set("Hello");
		System.out.println(s.get());
		
		MyClass<Integer> n = new MyClass<>();
		n.set(10);
		System.out.println(n.get());
		
	}
	
}
