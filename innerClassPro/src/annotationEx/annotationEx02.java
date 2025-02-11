package annotationEx;

interface Unit6 {
	
	@Deprecated
	public void move(String s);
	public void run(String s);
	
}

class Human6 implements Unit6 {

	@Override
	@SuppressWarnings("deprecation")
	public void move(String s) {
		System.out.println(s);
	}

	@Override
	public void run(String s) {
		System.out.println(s);
	}
	
}

public class annotationEx02 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Unit6 unit = new Human6();
		unit.move("인간형 유닛이 이동합니다.");
		unit.run("인간형 유닛이 달립니다.");
		
	}
	
}
