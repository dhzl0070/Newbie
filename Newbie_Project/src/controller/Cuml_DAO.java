package controller;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;

import model.Cuml_VO;
import model.ProductsVO;
import model.cal_VO;
import model.userVO;

	public class Cuml_DAO {

		private Connection conn = null;
		private PreparedStatement psmt = null;
		private ResultSet rs = null;

		private void getConnection() {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			// �����ε�
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// �����ͺ��̽� ����
				conn = DriverManager.getConnection(url, user, password);
				// ����ó��
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// �ݱ� �޼ҵ�
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

		
		public ArrayList<Cuml_VO> allSelect(Cuml_VO cmvo) {
			//	
			ArrayList<Cuml_VO> list = new ArrayList<Cuml_VO>();
			
			//	1. ���� --> �����ͺ��̽��� �������ִ� �޼ҵ�
			
			try {
				getConnection();
				String sql = "select model_id, fare from cuml_use";
				//					---> �÷��� ũ�Ⱑ Ŀ���ٸ�, ���̺� �̸��� ���ִ� ���� ����!
				psmt = conn.prepareStatement(sql);			
				//	? �� ���� ���� ���ڸ� ä���ֱ� ���ؼ� setString, setInt�� ���� ����� ���!
				
				rs = psmt.executeQuery();
				//	-->�������ִ� ��ü
				while(rs.next()) {
					//	---> ���� ����������, ������ ������ �Ͷ�!
					
					int fare = rs.getInt(1);
					String model_id = rs.getString(2);
					
					//	�ε����� 1���� �����Ѵ�.
					
					list.add(new Cuml_VO(model_id, fare));
					//				---> ������ �������� �����
					//				---> �����ڿ� ���� �Ķ���͸� ä����� �Ѵ�.
					
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
				System.out.println("����Ϸ�");
				getConnection();
				String sql = "insert into myproducts(num,model_id,vip_id) values(mypdct_seq.nextval,?,?)";// ?������� �������
				psmt = conn.prepareStatement(sql);
				/* psmt.setInt(1, vo.getNum()); */
				psmt.setString(1, pvo.getModel_id());

				System.out.println("123" + pvo.getModel_id());
				psmt.setString(2, vo.getVip_id());
				System.out.println("456" + vo.getVip_id());
				cnt = psmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {// ���ܰ� �߻��ص� �ѹ��� ����
				close();
			}
			return cnt;
		}
}