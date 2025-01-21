package exam002;

import java.util.Scanner;

public class ProductInfo {
	
//	스캐너
	static Scanner sc = new Scanner(System.in);
	
//	id
	static int id = 1;
	
//	메소드
//	.상품 추가 메소드
	static Product input() {
		Product p = null;
		System.out.print("\n1. 책 | 2. 앨범 | 3. 회화책 >> ");
		int num = sc.nextInt();
		System.out.print("상품 설명 >> ");
		sc.nextLine();
		String comment = sc.nextLine();
		System.out.print("생산자 >> ");
		String productor = sc.next();
		System.out.print("가격 >> ");
		int price = sc.nextInt();
		switch(num) {
			case 1:
				System.out.print("제목 >> ");
				sc.nextLine();
				String title = sc.nextLine();
				System.out.print("작가 >> ");
				String author = sc.next();
				p = new Book(id++, comment, productor, price, title, author);
				break;
			case 2:
				System.out.print("제목 >> ");
				sc.nextLine();
				String albumTitle = sc.nextLine();
				System.out.print("가수 >> ");
				String singer = sc.next();
				p = new CompactDisc(id++, comment, productor, price, albumTitle, singer);
				break;
			case 3:
				System.out.print("제목 >> ");
				sc.nextLine();
				title = sc.nextLine();
				System.out.print("작가 >> ");
				author = sc.next();
				System.out.print("언어 >> ");
				String language = sc.next();
				p = new ConversationBook(id++, comment, productor, price, title, author, language);
				break;
			default: System.out.println("입력 오류");
		}
		return p;
	}
	
//	.전체 보기 메소드
	static void show(Product[] products, int k) {
		for(int i = 0; i < k; i++) {
			products[i].display();
			System.out.println();
		}
	}
	
//	.상품 조회 메소드
	static void search(Product[] products, int k) {
		boolean flag = false;
		System.out.print("상품 ID >> ");
		int id = sc.nextInt();
		for(int i = 0; i < k; i++) {
			if(products[i].getId() == id) {
				products[i].display();
				System.out.println();
				flag = true;
				break;
			}
		}
		if(!flag) System.out.println("찾는 상품이 없음.");
	}
	
//	.메인 메소드
	public static void main(String[] args) {
//		객체 배열 생성
		Product[] products = new Product[10];
		
//		메뉴 선택 반복문
		int k = 0;
		boolean flag = false;
		while(true) {
			System.out.println("\n1. 상품추가 | 2. 상품조회 | 3. 전체보기 | 4. 종료");
			System.out.print("선택 >> ");
			int num = sc.nextInt();
			switch(num) {
				case 1:
					products[k++] = input(); break;
				case 2:
					search(products, k); break;
				case 3:
					show(products, k); break;
				case 4:
					flag = true; break;
				default:
					System.out.println("번호를 잘못 입력하셨습니다.");
			}
			if(flag) break;
		}
		System.out.println("입력 종료");
		sc.close();
	}
	
}
