package View;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class Step1 {

   private JFrame frame;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Step1 window = new Step1();
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
   public Step1() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 768, 609);
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

      JComboBox comboBox = new JComboBox();
      comboBox.setFont(new Font("±¼¸²", Font.PLAIN, 12));
      comboBox.setModel(new DefaultComboBoxModel(new String[] {"[\uC81C\uD488\uC744 \uD655\uC778\uD558\uC138\uC694]", "\uC804\uAE30\uB0C9\uC7A5\uACE0", "\uAE40\uCE58\uB0C9\uC7A5\uACE0", "\uC804\uAE30\uB0C9\uBC29\uAE30", "\uC804\uAE30\uC138\uD0C1\uAE30(\uC77C\uBC18)", "\uC804\uAE30\uC138\uD0C1\uAE30(\uB4DC\uB7FC)", "\uC804\uAE30\uB0C9\uC628\uC218\uAE30", "\uC804\uAE30\uB0C9\uC628\uC218\uAE30(\uC21C\uAC04\uC2DD)", "\uC804\uAE30\uBC25\uC1A5", "\uC804\uAE30\uC9C4\uACF5\uCCAD\uC18C\uAE30", "\uC120\uD48D\uAE30", "\uACF5\uAE30\uCCAD\uC815\uAE30", "\uBC31\uC5F4\uC804\uAD6C", "\uD615\uAD00\uB7A8\uD504", "\uC548\uC815\uAE30\uB0B4\uC7A5\uD615\uB7A8\uD504", "\uC0BC\uC0C1\uC720\uB3C4\uC804\uB3D9\uAE30", "\uAC00\uC815\uC6A9\uAC00\uC2A4\uBCF4\uC77C\uB7EC", "\uC5B4\uB311\uD130", "\uCDA9\uC804\uAE30", "\uC804\uAE30\uB0C9\uB09C\uBC29\uAE30", "\uC0C1\uC5C5\uC6A9\uC804\uAE30\uB0C9\uC7A5\uACE0", "\uAC00\uC2A4\uC628\uC218\uAE30", "\uBCC0\uC555\uAE30", "\uCC3D\uC138\uD2B8", "\uD154\uB808\uBE44\uC804\uC218\uC0C1\uAE30", "\uC804\uAE30\uC628\uD48D\uAE30", "\uC804\uAE30\uC2A4\uD1A0\uBE0C", "\uBA40\uD2F0\uC804\uAE30\uD788\uD2B8\uD38C\uD504\uC2DC\uC2A4\uD15C", "\uC81C\uC2B5\uAE30", "\uC804\uAE30\uB808\uC778\uC9C0", "\uC14B\uD1B1\uBC15\uC2A4", "\uCEE8\uBC84\uD130 \uB0C9\uC7A5\uD615 LED \uB7A8\uD504", "\uCEE8\uBC84\uD130 \uC678\uC7A5\uD615 LED \uB7A8\uD504", "\uB0C9\uB3D9\uAE30", "\uACF5\uAE30\uC555\uCD95\uAE30", "\uC0AC\uC774\uB2C8\uC9C0\uB514\uC2A4\uD50C\uB808\uC774", "\uC758\uB958\uAC74\uC870\uAE30"}));
      comboBox.setBounds(105, 327, 196, 21);
      frame.getContentPane().add(comboBox);

      JComboBox comboBox_1 = new JComboBox();
      comboBox_1.setFont(new Font("±¼¸²", Font.PLAIN, 12));
      comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"[\uC81C\uD488\uC744 \uD655\uC778\uD558\uC138\uC694]", "\uCEF4\uD4E8\uD130", "\uBAA8\uB2C8\uD130", "\uD504\uB9B0\uD130", "\uD329\uC2DC\uBC00\uB9AC", "\uBCF5\uC0AC\uAE30", "\uC2A4\uCE90\uB108", "\uBCF5\uD569\uAE30", "\uC790\uB3D9\uC808\uC804\uC81C\uC5B4\uC7A5\uCE58", "\uC624\uB514\uC624", "DVD\uD50C\uB808\uC774\uC5B4", "\uB77C\uB514\uC624\uCE74\uC138\uD2B8", "\uC804\uC790\uB808\uC778\uC9C0", "\uB3C4\uC5B4\uD3F0", "\uC720\uBB34\uC120\uC804\uD654\uAE30", "\uBE44\uB370", "\uBAA8\uB380", "\uD648\uAC8C\uC774\uD2B8\uC6E8\uC774", "\uC190\uAC74\uC870\uAE30", "\uC11C\uBC84", "\uB514\uC9C0\uD138\uCEE8\uBC84\uD130", "\uC720\uBB34\uC120\uACF5\uC720\uAE30"}));
      comboBox_1.setBounds(411, 327, 267, 21);
      frame.getContentPane().add(comboBox_1);
   
      
      JLabel lbl_Step2_1 = new JLabel("");
      lbl_Step2_1.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            
            frame.dispose();
            Step2_1.main(null);
         }
      });
      lbl_Step2_1.setBounds(105, 119, 196, 198);
      frame.getContentPane().add(lbl_Step2_1);
      
      JLabel lbl_Step2_2 = new JLabel("");
      lbl_Step2_2.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            
            frame.dispose();
            Step2_2.main(null);
         }
      });
      lbl_Step2_2.setBounds(411, 119, 267, 198);
      frame.getContentPane().add(lbl_Step2_2);
      String url = getClass().getResource("").getPath();
      Image image = new ImageIcon(url+"images/Step1.jpg").getImage();
      JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(768, 580, Image.SCALE_SMOOTH)));
      lblNewLabel.setBounds(0, -19, 752, 600);
      frame.getContentPane().add(lblNewLabel);

   }
}