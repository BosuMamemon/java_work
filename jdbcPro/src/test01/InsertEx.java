package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertEx {
	
	public static void main(String[] args) {
		
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver 로드 완료");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "jhm", "1234");
			System.out.println("Connection 완료");
			
			statement = connection.createStatement();
			System.out.println("Statement 생성 완료");
			
			int n = statement.executeUpdate("INSERT INTO board(title, content, writer) VALUES('추가 제목', '추가 내용', '추가 글쓴이')");
//				int n = DB에서 변경된 데이터가 몇개인지를 반환함
			System.out.println(n + "개의 데이터를 추가했습니다.");
		} catch (Exception e) {
			System.out.println("오류");
			e.printStackTrace();
		} finally {
			try {
//				닫을 때도 try catch로 닫아줘야함. 보통 finally문에서 닫음
				statement.close();
				connection.close();				
			} catch (Exception e2) {
				System.out.println("오류");
				e2.printStackTrace();
			}
		}
		
	}

}
