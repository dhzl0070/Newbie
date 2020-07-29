package 회원정보;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex05_select {

	public static void main(String[] args) {

		// 전체회원정보 보기
		//
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "Select * from members";
			
			psmt = conn.prepareStatement(sql);
			
			
			rs = psmt.executeQuery();
			System.out.println("===== 회원정보보기 =====");
			System.out.println("번호\t아이디\t비밀번호\t이름\t나이");
			int num =1;
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getNString(3);
				int age = rs.getInt(4);
						System.out.println(num++ +"\t"+id+"\t" +pw+"\t"+name +"\t"+ age+"\t");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)
				rs.close();
				if(psmt != null)
					psmt.close();
				if(conn !=null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
