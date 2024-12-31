package chapter02;

public class BinaryTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int number=8;
		int binaryNumber=0b1010; // 아래 명령어들이 주석처리가 되면 여기 메모리는 가비지가 됨.
		int oNum=012;
		int hNum=0XA;
//		int -> integral. 정수 변수를 지정하고 싶을 때 쓰는 명령어.
		
		byte bNum1=0b00000101;
//		1바이트로 정수를 표현할 때 쓰는 명령어
		byte bNum2=(byte) 0b11111011;
		
		int a=num+number;
		
		System.out.println(num);
		System.out.println(binaryNumber);
		System.out.println(oNum);
		System.out.println(hNum);
		// 주석은 컴파일 되지 않음. ctrl+/ 누르면 알아서 주석 처리 및 주석 취소가 됨.
		/* 이 주석처리는 ctrl+shift+/ 누르면 되기는 한데 이건 다시 누른다고 알아서 취소가 안됨. */
		
		System.out.println(bNum1);
		System.out.println(bNum2);
		System.out.println(bNum1+bNum2);
		
		System.out.println(a);

	}

}
