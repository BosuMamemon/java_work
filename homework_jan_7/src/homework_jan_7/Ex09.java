package homework_jan_7;

public class Ex09 {

	public static void main(String[] args) {
//		다음은 3*4의 2차원 배열을 만들고 이곳에 0~9 범위의 정수를 랜덤하게 저장한 후
//		2차원 배열과 합을 출력하는 프로그램의 실행 결과와 코드이다.
//		빈 곳에 적절한 코드를 삽입하라.
//		0	4	4	7
//		7	9	2	4
//		9	1	2	7
//		합은 56
		
		int intArray[][] = new int[3][4];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				intArray[i][j] = (int)(Math.random() * 10);
			}
		}
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j]+"	");
			}
			System.out.println();
		}
		
		int i = 0, sum = 0;
		while(i < 3) {
			for(int j = 0; j < 4; j++) {
				sum += intArray[i][j];
			}
			i++;
		}
		System.out.println("합은 "+sum);
	}

}
