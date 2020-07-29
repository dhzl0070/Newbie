package 회원정보;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
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

	public VO login(VO vo) {
		VO result = null;
		try {
			getConnection();
			String sql = "select name, age from members where id=? and pw=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			rs = psmt.executeQuery();
			while (rs.next()) {// 같은 이름을 출력해주려고 while
				String name = rs.getString(1);
				int age = rs.getInt(2);
				result = new VO(name, age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

	// 회원가입 메소드
	public int insert(VO vo) {
		int cnt = 0;
		try {
			getConnection();
			String sql = "insert into members values(?,?,?,?)";// ?빈공간을 만들어줌
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());// 1부터 시작
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getName());
			psmt.setInt(4, vo.getAge());
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
	public int Delete(VO vo) {
		int cnt = 0;
		try {
			getConnection();
			String sql = "delete from members where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	//회원정보확인
	public ArrayList<VO> allSelect() {
		ArrayList<VO> list = new ArrayList<VO>();
		try {
			getConnection();
			String sql = "Select * from members";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			int num = 1;
			
			while (rs.next()) {
				String id = rs.getString(1);
				String  pw = rs.getString(2);
				String  name = rs.getNString(3);
				int age = rs.getInt(4);
				VO vo = new VO(id, pw, name, age);
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
