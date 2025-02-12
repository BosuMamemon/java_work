package test01;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCEx01 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로드");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SCOTT", "tiger");
			System.out.println("커넥션 생성");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
