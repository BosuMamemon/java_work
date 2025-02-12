package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

public class JDBCConnectEx {
	
	public static void main(String[] args) {
		
//		JDBC: Java Database Connectivity
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		
		try {
//			1. 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이브 로드");
			
//			2. DB주소를 통한 Connection 생성
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "jhm", "1234");
			System.out.println("DB 연결 성공");
			
//			3. 쿼리문 작성을 위한 Statement 생성
			statement = connection.createStatement();
			
//			4. 쿼리결과를 보기 위한 ResultSet 생성
			rs = statement.executeQuery("SELECT * FROM board");
			
//			5. ResultSet 출력
			while(rs.next()) {
//				rs.next() -> 다음 행으로 커서를 옮겨서 데이터가 있으면 true 반환
				int bno = rs.getInt("bno");
//				.get~~("열 이름") -> 해당 열의 값을 가져옴
//				.getInt / .getString (varchar를 이걸로 가져옴) / .getDate (java.util.Date를 임포트 해와야 함) 
//				.getTimestamp (java.sql.Timestamp를 임포트 해와야 함) / 그외 등등...
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				Timestamp date = rs.getTimestamp("postdate");
				
				System.out.printf("%d / %s / %s / %s / ", bno, title, content, writer);
				System.out.println(date);
				
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브 로드 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("드라이브 연결 오류");
			e.printStackTrace();
		} finally {
			try {
//			6. 객체 닫기
				rs.close();
				statement.close();
				connection.close();				
			} catch (Exception e2) {
				System.out.println("오류");
				e2.printStackTrace();
			}
		}
		
	}

}
