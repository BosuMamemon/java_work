package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class DAO {
	
//	필드
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
//	메소드
	private void getConnection() {
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sampledb";
		String id = "jhm";
		String pw = "1234";
		
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB 접속");
		} catch (Exception e) {
			System.out.println("DB 접속 오류");
			e.printStackTrace();
		}
	}
	private void closeDB() {
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(conn != null) conn.close();
			System.out.println("DB 접속 종료");
		} catch (Exception e) {
			System.out.println("DB 종료 오류");
			e.printStackTrace();
		}
	}
	public void selectAll() {
		String sql = "SELECT * FROM board";
		try {
			getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				int bno = rs.getInt("bno");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				Timestamp postdate = rs.getTimestamp("postdate");
				System.out.printf("%d | %s | %s | %s | ", bno, title, content, writer);
				System.out.println(postdate);
			}
		} catch (Exception e) {
			System.out.println("데이터 처리 오류");
			e.printStackTrace();
		} finally {
			closeDB();
		}
	}
	public void select(int setBno) {
		String sql = "SELECT * FROM board WHERE bno = ?";
		try {
			getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, setBno);
			rs = ps.executeQuery();
			while(rs.next()) {
				int bno = rs.getInt("bno");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				Timestamp postdate = rs.getTimestamp("postdate");
				System.out.printf("%d | %s | %s | %s | ", bno, title, content, writer);
				System.out.println(postdate);
			}
		} catch (Exception e) {
			System.out.println("데이터 처리 오류");
			e.printStackTrace();
		} finally {
			closeDB();
		}
	}
	public void insert(String title, String content, String writer) {
		String sql = "INSERT INTO board(title, content, writer) VALUES(?, ?, ?)";
		try {
			getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, writer);
			int n = ps.executeUpdate();
			System.out.println(n + "개의 행이 추가되었습니다.");
		} catch (Exception e) {
			System.out.println("데이터 처리 오류");
			e.printStackTrace();
		} finally {
			closeDB();
		}
	}
	public void update(String title, String content, int bno) {
		String sql = "UPDATE board SET title = ?, content = ? WHERE bno = ?";
		try {
			getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, bno);
			int n = ps.executeUpdate();
			System.out.println(n + "개의 행이 변경되었습니다.");
		} catch (Exception e) {
			System.out.println("데이터 처리 오류");
			e.printStackTrace();
		} finally {
			closeDB();
		}
	}
	public void delete(int bno) {
		String sql = "DELETE FROM board WHERE bno = ?";
		try {
			getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bno);
			int n = ps.executeUpdate();
			System.out.println(n + "개의 행이 삭제되었습니다.");
		} catch (Exception e) {
			System.out.println("데이터 처리 오류");
			e.printStackTrace();
		} finally {
			closeDB();
		}
	}

}
