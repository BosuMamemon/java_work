package chapter03_2;

public class IfEx02 {

	public static void main(String[] args) {
		
		int score=80;
		
		if(score>=90) {
			System.out.println("A학점");
		} else if(score>=80) {
			System.out.println("B학점");
		} else if(score>=70) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}

	}

}
