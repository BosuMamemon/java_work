package chapter03;

public class OpEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		int i = 2;
		
		boolean value = ((num=num+10)<10) && ((i=i+2)<10);
		
		System.out.println(value);
		System.out.println(num);
		System.out.println(i); // 단락 평가 상 &&(AND)는 앞 항이 false면 걍 false를 출력해서 뒷 항은 아예 실행조차 안 됨.
		
		System.out.println();
		
		value = ((num=num+10)>10) || ((i=i+2)<10); // 위에서 boolean이라 선언했으니까 그냥 값만 바꿔주면 됨.
		
		System.out.println(value);
		System.out.println(num);
		System.out.println(i); // ||(OR)은 앞 항이 true면 걍 true를 출력해서 뒷 항은 아예 실행조차 안 됨.
		
		System.out.println();
		
		int num1 = 10;
		
		System.out.println(num1+=5); // num1 = num1 + 5 라는 뜻
		System.out.println(num1-=5); // num1 = num1 - 5 라는 뜻
		System.out.println(num1*=5); // num1 = num1 * 5 라는 뜻
		System.out.println(num1/=5); // num1 = num1 / 5 라는 뜻
		System.out.println(num1%=5); // num1 = num1 % 5 라는 뜻

	}

}
