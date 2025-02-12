package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateEx01 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "jhm", "1234");
			System.out.println("Connected");
			
			stmt = conn.createStatement();
			System.out.println("Statement created");
			
			System.out.println();
			
			int n = stmt.executeUpdate("DELETE FROM board WHERE bno = 4");
			System.out.println(n + "개의 행이 UPDATE되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
