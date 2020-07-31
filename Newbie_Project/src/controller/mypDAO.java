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

	// myproducts�� ���
	public int myproducts(ProductsVO pvo, userVO vo) {
		int cnt = 0;
		try {
			getConnection();
			String sql = "insert into myproducts(num,model_id,vip_id) values(mypdct_seq.nextval,?,?)";// ?������� �������
			psmt = conn.prepareStatement(sql);
			/* psmt.setInt(1, vo.getNum()); */
			psmt.setString(1, pvo.getModel_id());
			//System.out.println("123" + pvo.getModel_id());
			psmt.setNString(2, vo.getVip_id());
			//System.out.println("456" + vo.getVip_id());
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {// ���ܰ� �߻��ص� �ѹ��� ����
			close();
		}
		return cnt;
	}

	// ��ϵ� ��� �ҷ�����
	public ArrayList<mypVO> allSelect_CE() {
		ArrayList<mypVO> list = new ArrayList<mypVO>();
		try {
			getConnection();
			String sql = "Select * from products";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			int num1 = 1;

			while (rs.next()) {
				int num = rs.getInt(1);
				String model_id = rs.getString(2);
				String category = rs.getString(3);
				String vip_id = rs.getString(4);
				int sort = rs.getInt(5);
				int wh = rs.getInt(6);

				mypVO CEV = new mypVO(num, model_id, category, vip_id, sort, wh);
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