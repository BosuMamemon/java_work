package chapter03_3;

public class SwitchTest {

	public static void main(String[] args) {
		
		int rank = 1;
		char color;
		
//		switch(rank) {
//			case 1: color = 'G';
//				break;
//			case 2: color = 'S';
//				break;
//			case 3: color = 'B';
//				break;
//			default: color = 'A';
//		}
//		
//		위 switch-case는 아래 if 구문이랑 완전히 같은 내용임!!!!
		
		if(rank==1) {
			color = 'G';
		} else if(rank==2) {
			color = 'S';
		} else if(rank==3) {
			color = 'B';
		} else {
			color = 'A';
		}
		
		System.out.println(color);

	}

}
