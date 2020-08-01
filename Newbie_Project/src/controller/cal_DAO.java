package controller;



import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.table.TableModel;

import model.cal_VO;

public class cal_DAO {

   private Connection conn = null;
   private PreparedStatement psmt = null;
   private ResultSet rs = null;
   private int use;

   private void getConnection() {

      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "hr";
      String password = "hr";

      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         conn = DriverManager.getConnection(url, user, password);
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      } catch (SQLException e) {
         e.printStackTrace();
      }

   }

   private void close() {
      try {
         if (rs != null) {
            rs.close();
         }
         if (psmt != null) {
            rs.close();
         }
         if (conn != null) {
            rs.close();
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }

   }

   private int WattPerHour (String model_id) { //소비전력(watt) 구하는 메소드      
      int Watt = 0;
      try {
         getConnection();

         String sql = "Select wh from products where model_id =?";
         psmt = conn.prepareStatement(sql);
         rs = psmt.executeQuery();

         while (rs.next()) {
            Watt = rs.getInt(1);
            
            
         }

      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         close();
      }
      return Watt;
   }
   
   
   
   public ArrayList<cal_VO> allSelect() { //일단 이거는 .... 계산기에 mypage 
      //   
      ArrayList<cal_VO> list = new ArrayList<cal_VO>();
      
      getConnection();
      
      try {
         String sql = "select * from myproducts";
         psmt = conn.prepareStatement(sql);         
         rs = psmt.executeQuery();
         while(rs.next()) {
            int num = rs.getInt(1);
            String model_id= rs.getString(2);
            String category= rs.getString(3); //와트수.
            
            
            list.add(new cal_VO(num, model_id, category));
            
         }
         
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         close();
      }
      
      return list; //arrayList 형태
   }
   
   
   public int total(int time) { //사용시간 총와트수 구하는 메소드.
      int result = 0 ;
      int wh = 0;
      try {
         getConnection();
         String sql = "select wh from products where model_id = 'a1'";
         psmt = conn.prepareStatement(sql);
         //psmt.setString(1, );
         rs = psmt.executeQuery();
         while (rs.next()) {
            wh = rs.getInt(1);   
         }
         
         
         result = wh * time;
         
         
         
         
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         close();
      }
      return result;
   }
   
   public double cal(int Total){ //총사용량 넣으면 금액 산출해주는 메소드.
      int watt=0;

      
//      Scanner scan = new Scanner(System.in);
//      System.out.println("사용값을 입력해보세요");
//      
//      int Time = scan.nextInt();
        
      double fee = 0; //얘는 누적데이터 산출할때 !

      final int[] BASIC_FEE = { 410, 910, 1600, 3850, 7300, 12940 };
      final double[] LV_USE_FEE = { 60.7, 125.9, 187.9, 280.6, 417.7, 709.5 }; //변경할 사항 없음.

      if (Total <= 100*1000) {
         fee = BASIC_FEE[0] + LV_USE_FEE[0] * Total;
         System.out.println("누진 1단계");
      } else if (Total <= 200*1000) {
         fee = BASIC_FEE[1] + LV_USE_FEE[0] * 100 + LV_USE_FEE[1] * (Total - 100);
         System.out.println("누진 2단계");
      } else if (Total <= 300*1000) {
         fee = BASIC_FEE[2] + LV_USE_FEE[0] * 100 + LV_USE_FEE[1] * 100 + LV_USE_FEE[2] * (Total - 200);
         System.out.println("누진 3단계");
      } else if (Total <= 400*1000) {
         fee = BASIC_FEE[3] + LV_USE_FEE[0] * 100 + LV_USE_FEE[1] * 100 + LV_USE_FEE[2] * 100
               + LV_USE_FEE[3] * (Total - 300);
         System.out.println("누진 4단계");
      } else if (Total <= 500*1000) {
         fee = BASIC_FEE[3] + LV_USE_FEE[0] * 100 + LV_USE_FEE[1] * 100 + LV_USE_FEE[2] * 100 + LV_USE_FEE[3] * 100
               + LV_USE_FEE[4] * (Total - 400);
         System.out.println("누진 5단계");
      } else {
         fee = BASIC_FEE[3] + LV_USE_FEE[0] * 100 + LV_USE_FEE[1] * 100 + LV_USE_FEE[2] * 100 + LV_USE_FEE[3] * 100
               + LV_USE_FEE[4] * 100 + LV_USE_FEE[5] * (Total - 500);
      }
      System.out.println("예상 비용은"+ fee+"원 입니다");
      
      return fee;
   }
   
   

}