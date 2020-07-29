package 회원정보;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01_Update {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, user, password);
			
			System.out.print("아이디 입력 >>");
			String id = sc.next();
			System.out.print("비밀번호 입력 >>");
			String pw = sc.next();
			System.out.print("변경할 아이디 입력 >>");
			String chn_id = sc.next();
			//update 테이블명 set 바꾸고 싶은값 where 조건
			String sql = "update members set id = ? where id=? and pw=?";
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, chn_id);
			psmt.setString(2, id);
			psmt.setString(3, pw);
			
			int cnt = psmt.executeUpdate();
			
			if(cnt > 0)
				System.out.println("성공");
			else
				System.out.println("실패");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(psmt != null)
					psmt.close();
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}

}
