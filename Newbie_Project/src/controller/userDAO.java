package controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.userVO;

public class userDAO {
	// Database Access Object
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	// 데이터베이스와 연결하는 메소드 생성
	private void getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		// 1. 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);

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
				psmt.cancel();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public userVO login(userVO vo) {
		userVO result = null;
		try {
			getConnection();
			String sql = "select name, age from members where id=? and pw=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getVip_id());
			psmt.setString(2, vo.getVip_pw());
			rs = psmt.executeQuery();
			while (rs.next()) {// 같은 이름을 출력해주려고 while
				String name = rs.getString(1);
				int age = rs.getInt(2);
				result = new userVO(name, age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

	// 회원가입 메소드
	public int insert(userVO vo) {
		int cnt = 0;
		try {
			getConnection();
			String sql = "insert into members values(?,?,?,?,?)";// ?빈공간을 만들어줌
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getVip_id());// 1부터 시작
			psmt.setString(2, vo.getVip_pw());
			psmt.setString(3, vo.getName());
			psmt.setInt(4, vo.getAge());
			psmt.setInt(5, vo.getHp());
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {// 예외가 발생해도 한번은 실행
			close();
		}
		return cnt;
	}

	// 회원정보 수정,
	public int Update(String chn_id, String id, String pw) {
		int cnt = 0;
		try {
			getConnection();
			String sql = "update members set id = ? where id=? and pw=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, chn_id);
			psmt.setString(2, id);
			psmt.setString(3, pw);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// 회원 탈퇴
	public int Delete(userVO vo) {
		int cnt = 0;
		try {
			getConnection();
			String sql = "delete from members where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getVip_id());
			psmt.setString(2, vo.getVip_pw());
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	//회원정보확인
	public ArrayList<userVO> allSelect() {
		ArrayList<userVO> list = new ArrayList<userVO>();
		try {
			getConnection();
			String sql = "Select * from members";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			int num = 1;
			
			while (rs.next()) {
				String vip_id = rs.getString(1);
				String  vip_pw = rs.getString(2);
				String  name = rs.getNString(3);
				int age = rs.getInt(4);
				int hp = rs.getInt(5);
				userVO vo = new userVO(vip_id, vip_pw, name, age, hp);
				list.add(vo);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

}
