package test01;

import java.util.Scanner;

public class CRUDEx01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		DAO dao = new DAO();
		
		while(true) {
			System.out.print("1. 입력 / 2. 출력 / 3. 수정 / 4. 삭제 / 5. 검색 / 6. 종료 >> ");
			int input = sc.nextInt();
			System.out.println();
			
			switch(input) {
			case 1:
				System.out.println("삽입할 행의 제목을 입력하십시오.");
				sc.nextLine();
				String title = sc.nextLine();
				System.out.println("삽입할 행의 내용을 입력하십시오.");
				String content = sc.nextLine();
				System.out.println("삽입할 행의 작성자를 입력하십시오.");
				String writer = sc.next();
				System.out.println();
				dao.insert(title, content, writer);
				break;
			case 2:
				dao.selectAll();
				break;
			case 3:
				System.out.println("변경할 행의 제목을 입력하십시오.");
				sc.nextLine();
				title = sc.nextLine();
				System.out.println("변경할 행의 내용을 입력하십시오.");
				content = sc.nextLine();
				System.out.println("변경할 행의 게시글 번호를 입력하십시오.");
				int bno = sc.nextInt();
				System.out.println();
				dao.update(title, content, bno);
				break;
			case 4:
				System.out.println("삭제할 행의 게시글 번호를 입력하십시오.");
				bno = sc.nextInt();
				System.out.println();
				dao.delete(bno);
				break;
			case 5:
				System.out.println("검색할 행의 게시글 번호를 입력하십시오.");
				bno = sc.nextInt();
				System.out.println();
				dao.select(bno);
				break;
			case 6:
				flag = true; break;
			default:
				System.out.println("입력 오류"); break;
			}
			
			System.out.println();
			if(flag) break;
		}
		
		System.out.println("종료합니다...");
		sc.close();
		
	}

}
