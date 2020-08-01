package View;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.userVO;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class Step1 {

   private JFrame frame;
//   public static void main(userVO vo) {
//      EventQueue.invokeLater(new Runnable() {
//         public void run() {
//            try {
//               Step1 window = new Step1(vo);
//               System.out.println("step1 "+vo.getVip_id());
//               window.frame.setVisible(true);
//            } catch (Exception e) {
//               e.printStackTrace();
//            }
//         }
//      });
//   }
   public Step1(userVO vo) {
	   System.out.println("step1 "+vo.getVip_id());
      initialize(vo);
      frame.setVisible(true);
   }

   private void initialize(userVO vo) {
      frame = new JFrame();
      frame.setBounds(100, 100, 768, 609);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);

      JLabel lbl_HP = new JLabel("");
      lbl_HP.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {

            frame.dispose();
            Home Home = new Home(vo, null);
         }
      });
      lbl_HP.setBounds(29, 10, 106, 36);
      frame.getContentPane().add(lbl_HP);

      JLabel lbl_Notice = new JLabel("");
      lbl_Notice.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {

            frame.dispose();
            Notice.main(null);

         }
      });
      lbl_Notice.setBounds(547, 25, 155, 43);
      frame.getContentPane().add(lbl_Notice);
      
      JLabel lbl_Mypage = new JLabel("");
      lbl_Mypage.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            
            frame.dispose();
            Mypage Mypage = new Mypage(vo, null);
         }
      });
      lbl_Mypage.setBounds(171, 10, 113, 36);
      frame.getContentPane().add(lbl_Mypage);
   
      
      JLabel lbl_Step2_1 = new JLabel("");
      lbl_Step2_1.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            
            frame.dispose();
            Step2_1 Step2_1 =  new Step2_1(vo);
         }
      });
      lbl_Step2_1.setBounds(65, 78, 288, 343);
      frame.getContentPane().add(lbl_Step2_1);
      
      JLabel lbl_Step2_2 = new JLabel("");
      lbl_Step2_2.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            
            frame.dispose();
            Step2_2 Step2_2 = new Step2_2(vo);
         }
      });
      lbl_Step2_2.setBounds(411, 78, 267, 343);
      frame.getContentPane().add(lbl_Step2_2);
      String url = getClass().getResource("").getPath();
      Image image = new ImageIcon(url+"images/Step1.jpg").getImage();
      JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(768, 580, Image.SCALE_SMOOTH)));
      lblNewLabel.setBounds(0, -19, 752, 600);
      frame.getContentPane().add(lblNewLabel);

   }
}