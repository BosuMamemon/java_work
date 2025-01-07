package chapter03_3;

public class SwitchTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 89;
		char grade;
		
		switch(score) {
			case 90: grade = 'A';
				break;
			case 80: grade = 'B';
				break;
			case 70: grade = 'C';
				break;
			default: grade = 'F';
		}
		
//		switch문에서 비교연산자를 쓸 수 없기 때문에, score를 범위로 비교하고 싶다면 if else 문을 쓰는 것이 훨씬 낫다!! 
//		만일 switch문으로 범위의 값을 지정하고 싶으면... case 뒤에는 정수만 올 수 있기 때문에 switch로 score/10의 값을 받아오는 걸 추천.
//		switch(score/10) {
//			case 10, 9: grade = 'A';
//				break;
//			case 8: grade = 'B';
//				break;
//			case 7: grade = 'C';
//				break;
//			default: grade = 'F';
//		}
		
//		if(score>=90) {
//			grade = 'A'; // score >= 90
//		} else if(score>=80) {
//			grade = 'B'; // 90 > score >= 80
//		} else if(score>=70) {
//			grade = 'C'; // 80 > score >= 70
//		} else {
//			grade = 'F'; // 70 > score
//		}
		
		System.out.println(grade);

	}

}
