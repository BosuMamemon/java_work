package homework_jan_14th;

import java.util.Scanner;

public class BookTest {
	
	static Scanner sc = new Scanner(System.in);
	
	static Book add() {
		sc.nextLine();
		System.out.println("책 제목 >>");
		String title = sc.nextLine();
		System.out.println("저자 >>");
		String author = sc.nextLine();
		System.out.println("출판사 >>");
		String pub = sc.nextLine();
		System.out.println("페이지 수 >>");
		int page = sc.nextInt();
		
		Book b = new Book(title, author, pub, page);
		System.out.println("책 추가 완료.");
		return b;
	}
	
	static void list(Book[] books, int k) {
		for(int i = 0; i < k; i++) {
			books[i].display();
		}
	}
	
	public static void main(String[] args) {
		
		Book[] books = new Book[10];
		int k = 0;
		boolean flag = false;
		
		while(true) {
			System.out.println("\n>> 1. 책 추가 | 2. 목록 보기 | 3. 종료 >>");
			int input = sc.nextInt();
			
			switch(input) {
			case 1:
				books[k++] = add();
				break;
			case 2:
				list(books, k);
				break;
			case 3:
				flag = true;
				break;
			default:
				System.out.println("입력 오류.\n");
				break;
			}
			
			if(flag) break;
		}
		
		System.out.println("입력 종료.");
		sc.close();
		
	}

}
