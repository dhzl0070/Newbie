package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.PR_VO;

public class PR_DAO {
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
	
	//제도 선택
	public int PRDCT_RGSTR(PR_VO cev) {
		int cnt = 0;
		try {
			getConnection();
			String sql = "insert into PRDCT_RGSTR values(?)";// ?빈공간을 만들어줌
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, cev.getModel_id());
//			psmt.setString(2, cev.getCategory());// 1부터 시작
//			psmt.setInt(3, cev.getHour_sp());
//			psmt.setInt(4, cev.getOn_mode());
//			psmt.setInt(5, cev.getOff_mode());
//			psmt.setString(6, cev.getCompany());
//			psmt.setInt(7, cev.getSort());
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {// 예외가 발생해도 한번은 실행
			close();
		}
		return cnt;
	}
		public ArrayList<PR_VO> allSelect_CE() {
			ArrayList<PR_VO> list = new ArrayList<PR_VO>();
			try {
				getConnection();
				String sql = "Select * from CNSMP_EFRTN";
				psmt = conn.prepareStatement(sql);
				rs = psmt.executeQuery();
				
				int num1 = 1;
				
				while (rs.next()) {
					String model_id = rs.getString(1);
					String category = rs.getString(2);
					int hour_sp = rs.getInt(3);
					int on_mode = rs.getInt(4);
					int off_mode = rs.getInt(5);
					String company = rs.getString(6);
					int sort = rs.getInt(7);
					
					PR_VO CEV = new PR_VO(model_id, category,hour_sp, on_mode, off_mode, company, sort);
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
	
	

	
	
	

