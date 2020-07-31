package View;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.userDAO;
import model.userVO;

public class Login {

   private JFrame frame;
   private JTextField txt_id;
   private JTextField txt_pw;
   private JLabel lbl_Join;
   userDAO dao = new userDAO();

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Login window = new Login();
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
   public Login() {
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
      txt_id.setBounds(154, 235, 160, 25);
      frame.getContentPane().add(txt_id);
      txt_id.setColumns(10);

      txt_pw = new JTextField();
      txt_pw.setBounds(154, 285, 160, 25);
      frame.getContentPane().add(txt_pw);
      txt_pw.setColumns(10);

      JLabel lbl_HP = new JLabel("");
      lbl_HP.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {

            frame.dispose();
            Home.main(null);
         }
      });
      lbl_HP.setBounds(58, 10, 130, 58);
      frame.getContentPane().add(lbl_HP);

      JLabel lbl_Mypage = new JLabel("");
      lbl_Mypage.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {

            frame.dispose();
            Mypage.main(null);
         }
      });
      lbl_Mypage.setBounds(193, 10, 122, 58);
      frame.getContentPane().add(lbl_Mypage);

      lbl_Join = new JLabel("");
      lbl_Join.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {

            frame.dispose();
            Join.main(null);
         }
      });
      lbl_Join.setBounds(114, 443, 147, 64);
      frame.getContentPane().add(lbl_Join);

      // 로그인
      JLabel lbl_Login = new JLabel("");
      lbl_Login.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent arg0) {

            // 1. textField에 있는 값들을 가지고 오기
            String vip_id = txt_id.getText();
            String vip_pw = txt_pw.getText();

            // 2. JDBC _DAO login 기능 수행
            userVO vo = new userVO(vip_id, vip_pw);

            userVO result = dao.login(vo);
            

            if (result != null) {
               frame.dispose();
               Home.main(null);
            }
            else {
               JOptionPane.showMessageDialog(null, "로그인실패 :(","로그인",JOptionPane.ERROR_MESSAGE);
               System.out.println("로그인 실패 :( ");
            }

         }
      });

      lbl_Login.setBounds(114, 357, 147, 64);
      frame.getContentPane().add(lbl_Login);
      String url = getClass().getResource("").getPath();
      Image image = new ImageIcon(url+"images/Login.jpg").getImage();
      JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(390, 600, image.SCALE_SMOOTH)));
      lblNewLabel.setBounds(0, 0, 384, 560);
      frame.getContentPane().add(lblNewLabel);
   }
}