package View;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Step2_2 {

   private JFrame frame;
   private JTextField textField;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Step2_2 window = new Step2_2();
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
   public Step2_2() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 768, 630);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JLabel lbl_HP = new JLabel("");
      lbl_HP.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {

            frame.dispose();
            Home.main(null);
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
            Mypage.main(null);
         }
      });
      lbl_Mypage.setBounds(176, 25, 122, 43);
      frame.getContentPane().add(lbl_Mypage);
      
      JLabel lbl_Step1 = new JLabel("");
      lbl_Step1.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            
            frame.dispose();
            Step1.main(null);
         }
      });
      lbl_Step1.setBounds(48, 473, 82, 96);
      frame.getContentPane().add(lbl_Step1);

      
      JLabel lblNewLabel_1 = new JLabel("");
      lblNewLabel_1.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            
            frame.dispose();
            Step3_2_1.main(null);
         }
      });
      lblNewLabel_1.setBounds(132, 176, 483, 309);
      frame.getContentPane().add(lblNewLabel_1);
      String url = getClass().getResource("").getPath();
      Image image = new ImageIcon(url+"images/Step2_2.jpg").getImage();
      JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(768, 580, Image.SCALE_SMOOTH)));
      lblNewLabel.setBounds(0, 0, 752, 600);
      frame.getContentPane().add(lblNewLabel);
      
   }
}