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
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Step3_2 {

   private JFrame frame;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Step3_2 window = new Step3_2();
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
   public Step3_2() {
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
      
      JCheckBox chckbxNewCheckBox_3 = new JCheckBox("\uCEF4\uD4E8\uD130");
      chckbxNewCheckBox_3.setBounds(49, 163, 115, 23);
      frame.getContentPane().add(chckbxNewCheckBox_3);
      
      JCheckBox chckbxNewCheckBox_3_1 = new JCheckBox("\uC2A4\uCE90\uB108");
      chckbxNewCheckBox_3_1.setBounds(49, 190, 115, 23);
      frame.getContentPane().add(chckbxNewCheckBox_3_1);
      
      JCheckBox chckbxNewCheckBox_4 = new JCheckBox("\uD504\uB9B0\uD130");
      chckbxNewCheckBox_4.setBounds(49, 216, 115, 23);
      frame.getContentPane().add(chckbxNewCheckBox_4);
      
      JCheckBox chckbxNewCheckBox_4_1 = new JCheckBox("\uBE44\uB370");
      chckbxNewCheckBox_4_1.setBounds(49, 243, 115, 23);
      frame.getContentPane().add(chckbxNewCheckBox_4_1);
      
      JComboBox comboBox_6 = new JComboBox();
      comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC785\uB825\uD558\uC138\uC694 ]", "CRONUS 279Q1 FAST165 GAMING FREESYNC WQHD HDR", "2885U IPS UHD HDR flat", "F32", "2885U IPS UHD HDR flat"}));
      comboBox_6.setBounds(172, 164, 168, 21);
      frame.getContentPane().add(comboBox_6);
      
      JComboBox comboBox_7 = new JComboBox();
      comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC785\uB825\uD558\uC138\uC694 ]", "CONTEX IQ FLEX", "IX1600-PPM", "IX1600"}));
      comboBox_7.setBounds(172, 191, 168, 21);
      frame.getContentPane().add(comboBox_7);
      
      JComboBox comboBox_8 = new JComboBox();
      comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC785\uB825\uD558\uC138\uC694 ]", "DocuPrint C3555 d", "PRO-300", "DocuPrint P475 AP"}));
      comboBox_8.setBounds(172, 217, 168, 21);
      frame.getContentPane().add(comboBox_8);
      
      JComboBox comboBox_9 = new JComboBox();
      comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC785\uB825\uD558\uC138\uC694 ]", "BD-WD61N", "BD-AH520", "GT-3800"}));
      comboBox_9.setBounds(172, 244, 168, 21);
      frame.getContentPane().add(comboBox_9);
      
      JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("\uC804\uC790\uB808\uC778\uC9C0");
      chckbxNewCheckBox_2_1.setBounds(49, 268, 115, 23);
      frame.getContentPane().add(chckbxNewCheckBox_2_1);
      
      JComboBox comboBox_5 = new JComboBox();
      comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC785\uB825\uD558\uC138\uC694 ]", "P70F20P-S4B", "EKRL205DWK", "EKRL263DWW"}));
      comboBox_5.setBounds(172, 269, 168, 21);
      frame.getContentPane().add(comboBox_5);

      
      JEditorPane txt_p = new JEditorPane();
      txt_p.setBounds(49, 349, 291, 100);
      frame.getContentPane().add(txt_p);
      String url = getClass().getResource("").getPath();
      Image image = new ImageIcon(url+"images/Step3.jpg").getImage();
      JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(390, 600, image.SCALE_SMOOTH)));
//      lblNewLabel.addMouseListener(new MouseAdapter() {
//      	
//      });
      lblNewLabel.setBounds(0, 0, 384, 560);
      frame.getContentPane().add(lblNewLabel);
      
      JButton btn_add = new JButton("\uCD94\uAC00\uD558\uAE30");
      btn_add.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		String rs_p = "";
			if (chckbxNewCheckBox_3.isSelected()) {
				rs_p += chckbxNewCheckBox_3.getText() + " ";
			}
			if (chckbxNewCheckBox_3_1.isSelected()) {
				rs_p += chckbxNewCheckBox_3_1.getText() + " ";
			}
			if (chckbxNewCheckBox_4.isSelected()) {
				rs_p += chckbxNewCheckBox_4.getText() + " ";
			}
			if (chckbxNewCheckBox_4_1.isSelected()) {
				rs_p += chckbxNewCheckBox_4.getText() + " ";
			}
			if (chckbxNewCheckBox_2_1.isSelected()) {
				rs_p += chckbxNewCheckBox_4.getText() + " ";
			}
      		String rs_m = " ";
      		if(comboBox_6.getSelectedIndex() != 0) {
      			rs_m += comboBox_6.getSelectedItem()+ " ";
      		}else
      			rs_m += "";
      		if(comboBox_7.getSelectedIndex() != 0) {
      			rs_m += comboBox_7.getSelectedItem()+ " ";
      		}else
      			rs_m += "";
      		if(comboBox_8.getSelectedIndex() != 0) {
      			rs_m += comboBox_8.getSelectedItem()+ " ";
      		}else
      			rs_m += "";
      		if(comboBox_9.getSelectedIndex() != 0) {
      			rs_m += comboBox_9.getSelectedItem()+ " ";
      		}else
      			rs_m += "";
      		if(comboBox_5.getSelectedIndex() != 0) {
      			rs_m += comboBox_5.getSelectedItem()+ " ";
      		}else
      			rs_m += "";
			
			txt_p.setText("선택한 제품"+rs_p+"\n"+"모델명"+rs_m+"\n");
      	}
      });
      btn_add.setBackground(Color.LIGHT_GRAY);
      btn_add.setBounds(93, 304, 168, 35);
      frame.getContentPane().add(btn_add);
      
      JLabel lblNewLabel_1 = new JLabel("New label");
      lblNewLabel_1.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		
      		 frame.dispose();
             Home.main(null);
      	}
      });
      lblNewLabel_1.setBounds(276, 459, 96, 74);
      frame.getContentPane().add(lblNewLabel_1);
   }
}