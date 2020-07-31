package View;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.userDAO;
import model.userVO;

import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JEditorPane;
import javax.swing.ButtonGroup;

public class Join {

   private JFrame frame;
   private JTextField txt_id;
   private JTextField txt_pw;
   private JTextField txt_name;
   private JTextField txt_age;
   private JTextField txt_Tel;
   private final ButtonGroup buttonGroup = new ButtonGroup();
   String choice = "";
   userDAO dao = new userDAO();

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Join window = new Join();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public Join() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 400, 600);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);

      txt_id = new JTextField();
      txt_id.setBounds(144, 145, 148, 34);
      frame.getContentPane().add(txt_id);
      txt_id.setColumns(10);

      txt_pw = new JTextField();
      txt_pw.setColumns(10);
      txt_pw.setBounds(144, 189, 148, 34);
      frame.getContentPane().add(txt_pw);

      txt_name = new JTextField();
      txt_name.setColumns(10);
      txt_name.setBounds(144, 237, 148, 34);
      frame.getContentPane().add(txt_name);

      txt_age = new JTextField();
      txt_age.setColumns(10);
      txt_age.setBounds(144, 281, 148, 34);
      frame.getContentPane().add(txt_age);

      JRadioButton rd_man = new JRadioButton("\uB0A8\uC790");
      buttonGroup.add(rd_man);
      rd_man.setBounds(144, 334, 73, 23);
      frame.getContentPane().add(rd_man);

      JRadioButton rd_woman = new JRadioButton("\uC5EC\uC790");
      buttonGroup.add(rd_woman);
      rd_woman.setBounds(224, 334, 73, 23);
      frame.getContentPane().add(rd_woman);

      rd_woman.isSelected();

      txt_Tel = new JTextField();
      txt_Tel.setColumns(10);
      txt_Tel.setBounds(144, 371, 148, 34);
      frame.getContentPane().add(txt_Tel);

      JLabel lbl_Join = new JLabel("");
      lbl_Join.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {

            String id = txt_id.getText();
            String pw = txt_pw.getText();
            String name = txt_name.getText();
            System.out.println(choice);
            
            if (rd_woman.isSelected()) {
               choice = rd_woman.getText();
            } else if (rd_man.isSelected()) {
               choice = rd_man.getText();
            }
            String gender = choice;
            int age = Integer.parseInt(txt_age.getText());
            int hp = Integer.parseInt(txt_Tel.getText());

            // ---> String -> int 형변환!!
            // ---> int가 기본형 타입이라서 변환이 안됨!
            // ---> Integer.parseInt(); : 형변환 메소드
            userVO vo = new userVO(id, pw, name, gender, age, hp);
            int cnt = dao.insert(vo);

            if (cnt > 0) {
               // 팝업창을 띄워보아요!
               // 부모 컴포넌트, 메세지, 제목, 아이콘 모양
               JOptionPane.showMessageDialog(null, "회원가입성공 :)", "회원가입", JOptionPane.INFORMATION_MESSAGE);
               System.out.println("회원가입 성공 :) ");
            } else {
               // 회원가입 실패했을 때 팝업창 띄우기!
               JOptionPane.showMessageDialog(null, "회원가입실패 :(", "회원가입", JOptionPane.ERROR_MESSAGE);
               System.out.println("회원가입 실패 :( ");
            }

            // 1. 기존의 창 닫아주기
            frame.dispose();
            // 2. 불러온다.
            Login.main(null);

         }
      });
      lbl_Join.setBounds(271, 432, 73, 95);
      frame.getContentPane().add(lbl_Join);
      String url = getClass().getResource("").getPath();
      Image image = new ImageIcon(url+"images\\Join.jpg").getImage();
      JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(390, 600, image.SCALE_SMOOTH)));
      lblNewLabel.setBounds(0, 0, 384, 560);
      frame.getContentPane().add(lblNewLabel);

   }
}