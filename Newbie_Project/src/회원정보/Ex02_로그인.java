package 회원정보;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02_로그인 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
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
			// sql 문
			String sql = "select name, age from members where id=? and pw=?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			// select문은 행에 영향을 끼치지 않는다.
			// executeQuery
			// ResultSet-> select문을 실행한 후에 테이블과 같은 형태를 담고 있다
			// cursor가 존재
			rs = psmt.executeQuery();
			// select 의 컬럼 이름 순서로 rs에 담긴다
			
			while (rs.next()) {//같은 이름을 출력해주려고 while
				// rs의 리턴 타입은 값이 있을때 ture 없으면 false
				String name = rs.getString(1);
				int age = rs.getInt(2);
				System.out.println("이름은 : " + name + " 나이는 : " + age + " 입니다.");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.cancel();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
