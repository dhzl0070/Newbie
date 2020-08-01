package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;

import controller.cal_DAO;
import model.ProductsVO;
import model.cal_VO;
import model.userVO;

public class Cal_ {

   private JFrame frame;
    cal_DAO dao = new cal_DAO();
   private JTable table;
   private JTextField txt_time;
   private JTextPane textPane;
   private String commaNum = "";
   private double fee = 0;

//   public static void main(String[] args) {
//      EventQueue.invokeLater(new Runnable() {
//         public void run() {
//            try {
//               Cal_ window = new Cal_();
//               window.frame.setVisible(true);
//            } catch (Exception e) {
//               e.printStackTrace();
//            }
//         }
//      });
//   }

   public Cal_(userVO vo, ProductsVO pvo) {
      initialize(vo, pvo);
      frame.setVisible(true);
   }

   private void initialize(userVO vo, ProductsVO pvo) {

      frame = new JFrame();
      frame.setBounds(100, 100, 400, 600);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);

      JLabel lbl_HP = new JLabel("");
      lbl_HP.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {

            frame.dispose();
            Home home = new Home(null, null);
         }
      });
      lbl_HP.setBounds(58, 10, 130, 58);
      frame.getContentPane().add(lbl_HP);

      JLabel lbl_Mypage = new JLabel("");
      lbl_Mypage.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {

            frame.dispose();
            Mypage mypage = new Mypage(vo, pvo);
         }
      });
      
      lbl_Mypage.setBounds(193, 10, 122, 58);
      frame.getContentPane().add(lbl_Mypage);
      
      
      JScrollPane scrollPane = new JScrollPane();
      scrollPane.setBounds(37, 204, 305, 138);
      frame.getContentPane().add(scrollPane);
      
      ArrayList<cal_VO> list = dao.allSelect();

      System.out.println(list.size());

      // 테이블에 1차원 배열로 틀만들어주고,
      // 데이터는 2차원 배열로 하나하나 담아주는 것!
      String colNames[] = { "번호", "모델명", "제품", "요금" };
      // 크기지정 : [행==데이터갯수][열==컬럼갯수]
      Object data[][] = new Object[list.size()][colNames.length];
      // 데이터에 실제로 넣어주기
      
      
      for (int i = 0; i < list.size(); i++) {
         data[i][0] = list.get(i).getNum();
         data[i][1] = list.get(i).getModel_id();
         data[i][2] = list.get(i).getCategory();
         data[i][3] = fee;
         //data[i][3] = ""; //여기 빈값을 넣으려면 어떻게 ?
         
      }
      table = new JTable(data, colNames);
      table.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent arg0) {
            
            System.out.println("s");
            
            
         }
      });
      scrollPane.setViewportView(table);
      table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

      JButton btnNewButton = new JButton("Enter");
      btnNewButton.addMouseListener(new MouseAdapter() {

         @Override
         public void mouseClicked(MouseEvent e) {
            

            int time =  Integer.valueOf(txt_time.getText()); 
            int Total = dao.total(time);//총사용량.
            System.out.println(Total);
            cal_DAO caldao = new cal_DAO();
            fee = caldao.cal(Total);
            commaNum = NumberFormat.getInstance().format(fee);
            textPane.setText(commaNum+"원");
//            String use = commaNum;
            int row = table.getSelectedRow();
            table.setValueAt(commaNum, row, 3);
            
         }
      });
      btnNewButton.setBounds(164, 410, 63, 43);
      frame.getContentPane().add(btnNewButton);
      
      txt_time = new JTextField();
      txt_time.setColumns(10);
      txt_time.setBounds(45, 410, 109, 43);
      frame.getContentPane().add(txt_time);
      
      textPane = new JTextPane();
      textPane.setForeground(Color.BLACK);
      textPane.setBackground(Color.LIGHT_GRAY);
      textPane.setBounds(239, 410, 90, 43);
      frame.getContentPane().add(textPane);
      
      
      JLabel lbl_save = new JLabel("");
      lbl_save.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            
         JOptionPane.showMessageDialog(null, "누적성공 :)","누적확인창",JOptionPane.INFORMATION_MESSAGE);
         System.out.println("누적성공 :) ");
         
         frame.dispose();
         Pattern.main(null);
         }
      });
      lbl_save.setBounds(279, 466, 63, 58);
      frame.getContentPane().add(lbl_save);
      String url = getClass().getResource("").getPath();
      
      Image image = new ImageIcon(url+"images/Circulator.jpg").getImage();
      JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(390, 600, image.SCALE_SMOOTH)));
      lblNewLabel.setBounds(0, 0, 384, 560);
      frame.getContentPane().add(lblNewLabel);
   }
}