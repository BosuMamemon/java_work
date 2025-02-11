package annotationEx;

interface Unit5 {
	
	@Deprecated
	public void move(String s);
	public void run(String s);
	
}

class Human5 implements Unit5 {

	@Override
	public void move(String s) {
		System.out.println(s);
	}

	@Override
	public void run(String s) {
		System.out.println(s);
	}
	
}

public class annotationEx01 {
	
	public static void main(String[] args) {
		
		Unit5 unit = new Human5();
		unit.move("인간형 유닛이 이동합니다.");
		unit.run("인간형 유닛이 달립니다.");
		
	}

}
