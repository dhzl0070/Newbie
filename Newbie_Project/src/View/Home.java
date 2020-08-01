package View;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.ProductsVO;
import model.userVO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home {


   private JFrame frame;

//   public static void main(userVO vo) {
//      EventQueue.invokeLater(new Runnable() {
//         public void run() {
//            try {
//               Home window = new Home(vo);
//               System.out.println("home "+vo.getVip_id());
//               window.frame.setVisible(true);
//            } catch (Exception e) {
//               e.printStackTrace();
//            }
//         }
//      });
//   }

   public Home(userVO vo, ProductsVO pvo) {
      initialize(vo, pvo);
      frame.setVisible(true);
   }

   

private void initialize(userVO vo,ProductsVO pvo) {
	
      frame = new JFrame();
      frame.setBounds(100, 100, 768, 630);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JLabel lbl_Step1 = new JLabel("");
      lbl_Step1.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            
            frame.dispose();
            Step1 step1 = new Step1(vo);
         }
      });
      lbl_Step1.setBounds(48, 473, 82, 96);
      frame.getContentPane().add(lbl_Step1);
      
      JLabel lbl_Circulator = new JLabel("");
      lbl_Circulator.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            
            frame.dispose();
            Cal_ cal_ =new Cal_(vo, pvo);
         }
      });
      lbl_Circulator.setBounds(168, 473, 82, 96);
      frame.getContentPane().add(lbl_Circulator);
      
      JLabel lbl_Pattern = new JLabel("");
      lbl_Pattern.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            
            frame.dispose();
            Pattern.main(null);
         }
      });
      lbl_Pattern.setBounds(501, 473, 82, 96);
      frame.getContentPane().add(lbl_Pattern);
      
      JLabel lbl_Compare = new JLabel("");
      lbl_Compare.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            
            frame.dispose();
            Compare.main(null);
         }
      });
      lbl_Compare.setBounds(621, 473, 82, 96);
      frame.getContentPane().add(lbl_Compare);
      
      JLabel lbl_HP = new JLabel("");
      lbl_HP.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {

            frame.dispose();
            Home home = new Home(vo, pvo);
         }
      });
      lbl_HP.setBounds(49, 25, 122, 43);
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
            Mypage mypage = new Mypage(vo, pvo);
            		
         }
      });
      lbl_Mypage.setBounds(176, 25, 122, 43);
      frame.getContentPane().add(lbl_Mypage);
      String url = getClass().getResource("").getPath();
      Image image = new ImageIcon(url+"images/Home.jpg").getImage();
      JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(768, 580, Image.SCALE_SMOOTH)));
      lblNewLabel.setBounds(0, 0, 752, 600);
      frame.getContentPane().add(lblNewLabel);
      
   }

	

}