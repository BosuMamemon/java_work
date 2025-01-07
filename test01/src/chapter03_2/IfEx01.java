package chapter03_2;

public class IfEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 60;
		
		if(score>70) {                        // 중괄호를 생략해버리면 if 조건문 바로 뒤에 있는 수행문 1개만 if문으로 인식함.
			System.out.println(score);
			System.out.println("합격");
		} else {
			System.out.println("불합격");
			System.out.println("다시 도전하세요.");
		}
		System.out.println("if문 바깥");

	}

}
