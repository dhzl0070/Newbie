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
         
         String sql = "select name, age from VIP where vip_id=? and vip_pw=?";
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, vo.getVip_id());
         psmt.setString(2, vo.getVip_pw());
         rs = psmt.executeQuery();
         while (rs.next()) {// 같은 이름을 출력해주려고 while
            String vip_id = rs.getString(1);
            String vip_pw = rs.getString(2);
            result = new userVO(vip_id, vip_pw);
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         close();
      }
      return result;
   }

   // 회원가입 메소드
   public int insert(userVO uservo) {
      int cnt = 0;
      try {
         getConnection();
         String sql = "insert into VIP values(?,?,?,?,?,?)";// ?빈공간을 만들어줌
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, uservo.getVip_id());// 1부터 시작
         psmt.setString(2, uservo.getVip_pw());
         psmt.setString(3, uservo.getName());
         psmt.setString(4, uservo.getGender());
         psmt.setInt(5, uservo.getAge());
         psmt.setInt(6, uservo.getHp());
         cnt = psmt.executeUpdate();

      } catch (SQLException e) {
         e.printStackTrace();
      } finally {// 예외가 발생해도 한번은 실행
         close();
      }
      return cnt;
   }

   // 회원정보 수정,
   public int Update(String chn_id, String vip_id, String vip_pw) {
      int cnt = 0;
      try {
         getConnection();
         String sql = "update VIP set vip_id = ? where vip_id=? and vip_pw=?";
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, chn_id);
         psmt.setString(2, vip_id);
         psmt.setString(3, vip_pw);
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
         String sql = "delete from VIP where vip_id = ? and vip_pw = ?";
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

   // 회원정보확인
   public ArrayList<userVO> allSelect() {
      ArrayList<userVO> list = new ArrayList<userVO>();
      try {
         getConnection();
         String sql = "Select * from VIP";
         psmt = conn.prepareStatement(sql);
         rs = psmt.executeQuery();

         int num = 1;

         while (rs.next()) {
            String vip_id = rs.getString(1);
            String vip_pw = rs.getString(2);
            String name = rs.getString(3);
            String gender = rs.getString(4);
            int age = rs.getInt(5);
            int hp = rs.getInt(6);
            userVO vo = new userVO(vip_id, vip_pw, name, gender, age, hp);
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