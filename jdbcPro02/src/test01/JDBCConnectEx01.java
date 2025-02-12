package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;

public class JDBCConnectEx01 {
	
	public static void main(String[] args) {
		
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("JDBC Driver 로드");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "1234");
			System.out.println("Connection 생성");
			
			statement = connection.createStatement();
			System.out.println("Statement 생성");
			
			rs = statement.executeQuery("SELECT * FROM member");
			int mno = rs.getInt("mno");
			String name = rs.getString("name");
			String id = rs.getString("id");
			String pw = rs.getString("pw");
			Timestamp regdate = rs.getTimestamp("regdate");
			
			System.out.println("member 테이블 출력\n");
			while(rs.next())
				System.out.println(mno + " / " + name + " / " + id + " / " + pw + " / " + regdate);
			
			System.out.println();
			System.out.println("member 테이블에 행 삽입");
			statement.executeUpdate("INSERT INTO member(name, id, pw) VALUES('이준목', 'nyamnyam', '우하하')");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				statement.close();
				connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
