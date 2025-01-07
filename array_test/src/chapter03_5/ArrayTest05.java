package chapter03_5;

public class ArrayTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {1, 2, 3, 4, 5};
		int sum = 0;
		
		for(int k: num) {
			sum += k;
		}
		System.out.println("num 배열 원소의 합계 = "+sum);
		
		
		String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		
		for(String k: names) {
			System.out.print(k+" ");
		}
		
		
		System.out.println();
		enum Week {
			월, 화, 수, 목, 금, 토, 일
			} // 나열형 or 열거형이란? 상수들을 클래스로 만든 것.
		
		for(Week day: Week.values()) {
			System.out.print(day+"요일 ");
		}

	}

}
