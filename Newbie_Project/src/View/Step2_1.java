package View;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Step2_1 {

   private JFrame frame;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Step2_1 window = new Step2_1();
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
   public Step2_1() {
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
      JLabel lbl_rice_cooker = new JLabel("");
      lbl_rice_cooker.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            
            frame.dispose();
            Step3_1.main(null);
         }
      });
      lbl_rice_cooker.setBounds(85, 155, 596, 304);
      frame.getContentPane().add(lbl_rice_cooker);
      String url = getClass().getResource("").getPath();
      Image image = new ImageIcon(url+"images/Step2_1.jpg").getImage();
      JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(768, 580, Image.SCALE_SMOOTH)));
      lblNewLabel.setBounds(0, 0, 752, 600);
      frame.getContentPane().add(lblNewLabel);
      
      JLabel lblNewLabel_1 = new JLabel("New label");
      lblNewLabel_1.setBounds(35, 119, 683, 344);
      frame.getContentPane().add(lblNewLabel_1);

   }

}