package test01;

public class MyStackEx {
	
	public static void main(String[] args) {
		
		GStack<String> stringStack = new GStack<>();
		
		stringStack.push("Seoul");
		stringStack.push("Daejeon");
		stringStack.push("Daegu");
		stringStack.push("Busan");
		
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
		
	}

}
