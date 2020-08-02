package controller;



	
	
	
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;

import model.Cuml_VO;
import model.ProductsVO;
import model.userVO;

	public class Cuml_DAO {

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
				String sql = "insert into myproducts(num,model_id,vip_id) values(mypdct_seq.nextval,?,?)";// ?빈공간을 만들어줌
				psmt = conn.prepareStatement(sql);
				/* psmt.setInt(1, vo.getNum()); */
				psmt.setString(1, pvo.getModel_id());

				System.out.println("123" + pvo.getModel_id());
				psmt.setString(2, vo.getVip_id());
				System.out.println("456" + vo.getVip_id());
				cnt = psmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {// 예외가 발생해도 한번은 실행
				close();
			}
			return cnt;
		}
		
		public ArrayList<Cuml_VO> allSelect() {
			//	
			ArrayList<Cuml_VO> list = new ArrayList<Cuml_VO>();
			
			//	1. 연결 --> 데이터베이스랑 연결해주는 메소드
			getConnection();
			
			try {
				String sql = "select model_id, fare from cuml_use";
				//					---> 컬럼의 크기가 커진다면, 테이블 이름을 써주는 편이 좋다!
				psmt = conn.prepareStatement(sql);			
				//	? 가 있을 때만 인자를 채워주기 위해서 setString, setInt와 같은 기능을 사용!
				
				rs = psmt.executeQuery();
				//	-->전송해주는 객체
				while(rs.next()) {
					//	---> 값이 있을때까지, 무조건 가지고 와랏!
					String model_id = rs.getString(1);
					int fare = rs.getInt(2);
					
					//	인덱스가 1부터 시작한다.
					
					list.add(new Cuml_VO(model_id, fare));
					//				---> 위에서 가지고온 양식을
					//				---> 생성자에 대한 파라미터를 채워줘야 한다.
					
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				close();
			}
			
			return list;
		}
		
		
		
		public int chart_num(ProductsVO pvo, userVO vo) {
			int cnt = 0;
			try {
				System.out.println("연결완료");
				getConnection();
				String sql = "insert into myproducts(num,model_id,vip_id) values(mypdct_seq.nextval,?,?)";// ?빈공간을 만들어줌
				psmt = conn.prepareStatement(sql);
				/* psmt.setInt(1, vo.getNum()); */
				psmt.setString(1, pvo.getModel_id());

				System.out.println("123" + pvo.getModel_id());
				psmt.setString(2, vo.getVip_id());
				System.out.println("456" + vo.getVip_id());
				cnt = psmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {// 예외가 발생해도 한번은 실행
				close();
			}
			return cnt;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
