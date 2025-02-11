package lambdaEx;

public interface Unit5 {
	
	void move(String s);

}

class Human5 implements Unit5 {

	@Override
	public void move(String s) {

		System.out.println(s);
		
	}
	
	
	
}