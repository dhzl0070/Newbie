package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.ProductsVO;
import model.mypVO;
import model.userVO;

public class mypDAO {
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	private void getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		// 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 데이터베이스 연결
			conn = DriverManager.getConnection(url, user, password);
			// 예외처리
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 닫기 메소드
	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// myproducts에 등록
	public int myproducts(ProductsVO pvo, userVO vo) {
		int cnt = 0;
		try {
			System.out.println("연결완료");
			getConnection();
			String sql = "insert into myproducts(num,model_id,category,vip_id) values(mypdct_seq.nextval,?,?,?)";// ?빈공간을 만들어줌
			psmt = conn.prepareStatement(sql);
			/* psmt.setInt(1, vo.getNum()); */
			psmt.setString(1, pvo.getModel_id());
			psmt.setString(2, pvo.getCategory());
			//System.out.println("123" + pvo.getModel_id());
			psmt.setNString(3, vo.getVip_id());
			//System.out.println("456" + vo.getVip_id());
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {// 예외가 발생해도 한번은 실행
			close();
		}
		return cnt;
	}
	
	// 등록된 목록 불러오기
	public ArrayList<mypVO> allSelect_CE(userVO vo) {
		ArrayList<mypVO> list = new ArrayList<mypVO>();
		try {
			getConnection();
			String sql = "Select * from myproducts where vip_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getVip_id());
			rs = psmt.executeQuery();

			int num1 = 1;

			while (rs.next()) {
				int num = rs.getInt(1);
				String model_id = rs.getString(2);
				String category = rs.getString(3);
				String vip_id = rs.getString(4);
			

				mypVO CEV = new mypVO(num, model_id, category, vip_id);
				list.add(CEV);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
}
