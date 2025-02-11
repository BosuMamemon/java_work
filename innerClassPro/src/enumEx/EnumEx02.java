package enumEx;

enum Human2 { MAN, WOMAN }

enum Machine2 { TANK, AIRPLANE }

public class EnumEx02 {
	
	public static void createUnit(Machine2 kind) {
//		자료형을 미리 지정한 enum 열거 집합으로 지정을 해줘야 함
		switch(kind) {
		case TANK: System.out.println("탱크를 생성합니다."); break;
		case AIRPLANE: System.out.println("비행기를 생성합니다."); break;
		}
		
	}
	
	public static void main(String[] args) {
		
		createUnit(Machine2.TANK);
		createUnit(Machine2.AIRPLANE);
//		createUnit(Human2.MAN);
//		createUnit(Human2.WOMAN);
////		위 두문장은 컴파일 오류가 뜸
////		왜냐면 애초에 패러미터가 enum Machine2 자료형이라고 생성이 되었기 때문....
		
	}

}
