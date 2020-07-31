package View;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;

public class Step3_1 {

   private JFrame frame;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Step3_1 window = new Step3_1();
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
   public Step3_1() {
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
      
      
      JCheckBox chckbxNewCheckBox = new JCheckBox("\uC815\uC218\uAE30");
      chckbxNewCheckBox.setBounds(40, 67, 115, 23);
      frame.getContentPane().add(chckbxNewCheckBox);
      
      JCheckBox chckbxNewCheckBox_1 = new JCheckBox("\uB0C9\uC7A5\uACE0");
      chckbxNewCheckBox_1.setBounds(40, 173, 115, 23);
      frame.getContentPane().add(chckbxNewCheckBox_1);
      
      JCheckBox chckbxNewCheckBox_2 = new JCheckBox("\uC5D0\uC5B4\uCEE8");
      chckbxNewCheckBox_2.setBounds(40, 120, 115, 23);
      frame.getContentPane().add(chckbxNewCheckBox_2);
      
      JCheckBox chckbxNewCheckBox_3 = new JCheckBox("\uC120\uD48D\uAE30");
      chckbxNewCheckBox_3.setBounds(40, 226, 115, 23);
      frame.getContentPane().add(chckbxNewCheckBox_3);
      
      JCheckBox chckbxNewCheckBox_4 = new JCheckBox("\uC77C\uBC18\uC138\uD0C1\uAE30");
      chckbxNewCheckBox_4.setBounds(40, 279, 115, 23);
      frame.getContentPane().add(chckbxNewCheckBox_4);
      
      JCheckBox chckbxNewCheckBox_5 = new JCheckBox("\uAE40\uCE58\uB0C9\uC7A5\uACE0");
      chckbxNewCheckBox_5.setBounds(40, 94, 115, 23);
      frame.getContentPane().add(chckbxNewCheckBox_5);
      
      JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("\uC815\uC218\uAE30(\uC21C\uAC04\uC2DD)");
      chckbxNewCheckBox_1_1.setBounds(40, 147, 115, 23);
      frame.getContentPane().add(chckbxNewCheckBox_1_1);
      
      JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("\uC138\uD0C1\uAE30");
      chckbxNewCheckBox_2_1.setBounds(40, 200, 115, 23);
      frame.getContentPane().add(chckbxNewCheckBox_2_1);
      
      JCheckBox chckbxNewCheckBox_3_1 = new JCheckBox("\uC804\uAE30\uBC25\uC1A5");
      chckbxNewCheckBox_3_1.setBounds(40, 253, 115, 23);
      frame.getContentPane().add(chckbxNewCheckBox_3_1);
      
      JCheckBox chckbxNewCheckBox_4_1 = new JCheckBox("\uB4DC\uB7FC\uC138\uD0C1\uAE30");
      chckbxNewCheckBox_4_1.setBounds(40, 306, 115, 23);
      frame.getContentPane().add(chckbxNewCheckBox_4_1);
      
      
      JComboBox comboBox = new JComboBox();
      comboBox.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC120\uD0DD\uD558\uC138\uC694]", "WD503AF", "BF-ESCW03-CW", "WPU-A1100C", "LC-CHP-101-BK", "LC-CHP-101_MS"}));
      comboBox.setBounds(163, 68, 168, 21);
      frame.getContentPane().add(comboBox);
      
      JComboBox comboBox_1 = new JComboBox();
      comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC120\uD0DD\uD558\uC138\uC694 ]", "DDT33ERGNS", "HDT33ERMBD", "TDT33ERMBD", "EDT33EFRTWT", "TDS10EPACR"}));
      comboBox_1.setBounds(163, 95, 168, 21);
      frame.getContentPane().add(comboBox_1);
      
      JComboBox comboBox_2 = new JComboBox();
      comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC120\uD0DD\uD558\uC138\uC694 ]", "WKR83DSSPWI", "WKR83DSJPWI", "WKR83DSSBBI", "S833SN75", "HRFSN566HMFR", "DWP-Y450"}));
      comboBox_2.setBounds(163, 121, 168, 21);
      frame.getContentPane().add(comboBox_2);
      
      JComboBox comboBox_3 = new JComboBox();
      comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC120\uD0DD\uD558\uC138\uC694 ]", "UBUS-P202HRO(W)", "WM071RWA", "GP-80B", "GP-80R"}));
      comboBox_3.setBounds(163, 148, 168, 21);
      frame.getContentPane().add(comboBox_3);
      
      JComboBox comboBox_4 = new JComboBox();
      comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC120\uD0DD\uD558\uC138\uC694 ]", "WKR83DSSPWI", "WKR83DSJPWI", "WKR83DSSBBI", "S833SN75", "HRFSN566HMFR"}));
      comboBox_4.setBounds(163, 174, 168, 21);
      frame.getContentPane().add(comboBox_4);
      
      JComboBox comboBox_5 = new JComboBox();
      comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC120\uD0DD\uD558\uC138\uC694]", "LW-TS16X1F", "W130X01-SC", "W160X01-SB", "LW-TS10W1F", "W160X01-SA"}));
      comboBox_5.setBounds(163, 201, 168, 21);
      frame.getContentPane().add(comboBox_5);
      
      JComboBox comboBox_6 = new JComboBox();
      comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC120\uD0DD\uD558\uC138\uC694 ]", "CRONUS 279Q1 FAST165 GAMING FREESYNC WQHD HDR", "2885U IPS UHD HDR flat", "F32"}));
      comboBox_6.setBounds(163, 227, 168, 21);
      frame.getContentPane().add(comboBox_6);
      
      JComboBox comboBox_7 = new JComboBox();
      comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC120\uD0DD\uD558\uC138\uC694 ]", "CONTEX IQ FLEX", "IX1600-PPM", "IX1600"}));
      comboBox_7.setBounds(163, 254, 168, 21);
      frame.getContentPane().add(comboBox_7);
      
      JComboBox comboBox_8 = new JComboBox();
      comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC120\uD0DD\uD558\uC138\uC694]", "DocuPrint C3555 d", "PRO-300", "DocuPrint P475 AP"}));
      comboBox_8.setBounds(163, 280, 168, 21);
      frame.getContentPane().add(comboBox_8);
      
      JComboBox comboBox_9 = new JComboBox();
      comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC120\uD0DD\uD558\uC138\uC694 ]", "BD-WD61N", "BD-AH520", "GT-3800"}));
      comboBox_9.setBounds(163, 307, 168, 21);
      frame.getContentPane().add(comboBox_9);
      String url = getClass().getResource("").getPath();
      Image image = new ImageIcon(url+"images/Step3.jpg").getImage();
      JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(390, 600, image.SCALE_SMOOTH)));
      lblNewLabel.setBounds(0, 0, 384, 560);
      frame.getContentPane().add(lblNewLabel);
      
      JEditorPane editorPane = new JEditorPane();
      editorPane.setBounds(40, 351, 291, 100);
      frame.getContentPane().add(editorPane);
      
      JTextPane textPane = new JTextPane();
      textPane.setBounds(90, 308, 6, 21);
      frame.getContentPane().add(textPane);
      
   }
}