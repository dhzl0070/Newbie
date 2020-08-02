package View;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controller.mypDAO;
import model.ProductsVO;
import model.userVO;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;

public class Step2_2 {
	mypDAO dao = new mypDAO();
	private String rs_m = " ";	
	private String rs_p = " ";
	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(userVO vo) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Step3_2 window = new Step3_2(vo);
//					System.out.println(vo);
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Step2_2(userVO vo) {
		initialize(vo);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(userVO vo) {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		 JComboBox comboBox_6 = new JComboBox();
	      comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC785\uB825\uD558\uC138\uC694 ]", "TD200-GCR20SVM", "R752TN-C87W", "TMX514-51T-54HC", "A315-56-33L9", "R752TN-C10L"}));
	      comboBox_6.setBounds(172, 163, 168, 22);
	      frame.getContentPane().add(comboBox_6);
	      
	      JComboBox comboBox_7 = new JComboBox();
	      comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC785\uB825\uD558\uC138\uC694 ]", "CONTEX IQ FLEX", "IX1600-PPM", "IX1600"}));
	      comboBox_7.setBounds(172, 190, 168, 22);
	      frame.getContentPane().add(comboBox_7);
	      
	      JComboBox comboBox_8 = new JComboBox();
	      comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC785\uB825\uD558\uC138\uC694 ]", "DocuPrint C3555 d", "PRO-300", "DocuPrint P475 AP"}));
	      comboBox_8.setBounds(172, 216, 168, 22);
	      frame.getContentPane().add(comboBox_8);
	      
	      JComboBox comboBox_9 = new JComboBox();
	      comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC785\uB825\uD558\uC138\uC694 ]", "BD-WD61N", "BD-AH520", "GT-3800", "IST-N51E", "BA36-A"}));
	      comboBox_9.setBounds(172, 243, 168, 22);
	      frame.getContentPane().add(comboBox_9);
	      
	      JComboBox comboBox_5 = new JComboBox();
	      comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC785\uB825\uD558\uC138\uC694 ]", "P70F20P-S4B", "BD-AH520", "GT-3800", "IST-N51E", "BA36-A"}));
	      comboBox_5.setBounds(172, 268, 168, 22);
	      frame.getContentPane().add(comboBox_5);

//      lblNewLabel.addMouseListener(new MouseAdapter() {
//      	
//      });
		JRadioButton rbtn = new JRadioButton("\uCEF4\uD4E8\uD130");
	      rbtn.setBounds(35, 163, 121, 21);
	      frame.getContentPane().add(rbtn);
	      
	      JRadioButton rbtn1 = new JRadioButton("\uC2A4\uCE90\uB108");
	      rbtn1.setBounds(35, 190, 121, 21);
	      frame.getContentPane().add(rbtn1);
	      
	      JRadioButton rbtn2 = new JRadioButton("\uD504\uB9B0\uD130");
	      rbtn2.setBounds(35, 216, 121, 21);
	      frame.getContentPane().add(rbtn2);
	      
	      JRadioButton rbtn3 = new JRadioButton("\uBE44\uB370");
	      rbtn3.setBounds(35, 243, 121, 21);
	      frame.getContentPane().add(rbtn3);
	      
	      JRadioButton rbtn4 = new JRadioButton("\uC804\uC790\uB808\uC778\uC9C0");
	      rbtn4.setBounds(35, 268, 121, 21);
	      frame.getContentPane().add(rbtn4);

		JButton btn_add = new JButton("\uB4F1\uB85D\uD558\uAE30");
		btn_add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String rs_p = "";
				if (rbtn.isSelected()) {
					rs_p = rbtn.getText();
				} 
				else if (rbtn1.isSelected()) {
					rs_p = rbtn1.getText();
				}
				else if (rbtn2.isSelected()) {
					rs_p = rbtn2.getText();
				}
				else if (rbtn3.isSelected()) {
					rs_p = rbtn3.getText();
				}
				else if (rbtn4.isSelected()) {
					rs_p = rbtn4.getText();
				}
				rs_m = " ";
				if (comboBox_6.getSelectedIndex() != 0) {
					rs_m += comboBox_6.getSelectedItem() + " ";
				} else
					rs_m += "";
				if (comboBox_7.getSelectedIndex() != 0) {
					rs_m += comboBox_7.getSelectedItem() + " ";
				} else
					rs_m += "";
				if (comboBox_8.getSelectedIndex() != 0) {
					rs_m += comboBox_8.getSelectedItem() + " ";
				} else
					rs_m += "";
				if (comboBox_9.getSelectedIndex() != 0) {
					rs_m += comboBox_9.getSelectedItem() + " ";
				} else
					rs_m += "";
				if (comboBox_5.getSelectedIndex() != 0) {
					rs_m += comboBox_5.getSelectedItem() + " ";
				} else
					rs_m += "";
				
				String model_id = rs_m.trim();
				String category = rs_p;
				ProductsVO pvo = new ProductsVO(model_id, category);
				int cnt = dao.myproducts(pvo, vo);
				if (cnt > 0) {
					JOptionPane.showMessageDialog(null, "등록 성공!", "제품등록", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "이미 있는 제품입니다!!", "제품등록", JOptionPane.ERROR_MESSAGE);
				}
				
				comboBox_5.setSelectedIndex(0);
				comboBox_6.setSelectedIndex(0);
				comboBox_7.setSelectedIndex(0);
				comboBox_8.setSelectedIndex(0);
				comboBox_9.setSelectedIndex(0);
				
				//txt_p.setText("선택한 제품  :" + rs_p + "\n" + "모델명  :" + rs_m + "\n");
			}
		});
		btn_add.setBackground(Color.LIGHT_GRAY);
		btn_add.setBounds(58, 418, 117, 47);
		frame.getContentPane().add(btn_add);
		JButton btnNewButton_1 = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Step1 step1 = new Step1(vo);
			}
		});
	      btnNewButton_1.setBounds(187, 418, 117, 47);
	      frame.getContentPane().add(btnNewButton_1);
	      JLabel lblNewLabel_1 = new JLabel("");
	      lblNewLabel_1.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		frame.dispose();
	      		Home home = new Home(vo, null, null);
	      	}
	      });
	      lblNewLabel_1.setBounds(58, 10, 90, 42);
	      frame.getContentPane().add(lblNewLabel_1);
	      
	      JLabel lblNewLabel_2 = new JLabel("");
	      lblNewLabel_2.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		frame.dispose();
	      		Mypage mypage = new Mypage(vo, null, null);
	      	}
	      });
	      String url = getClass().getResource("").getPath();
			Image image = new ImageIcon(url + "images/Step2.jpg").getImage();
			JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(390, 600, image.SCALE_SMOOTH)));
			  lblNewLabel.setBounds(0, 0, 384, 560);
		      frame.getContentPane().add(lblNewLabel);
		      
		      JLabel lblNewLabel_3 = new JLabel("");
		      lblNewLabel_3.addMouseListener(new MouseAdapter() {
		      	@Override
		      	public void mouseClicked(MouseEvent e) {
		      		frame.dispose();
		      		Mypage mypage = new Mypage(vo, null, null);
		      	}
		      });
		      lblNewLabel_3.setBounds(199, 10, 104, 42);
		      frame.getContentPane().add(lblNewLabel_3);
		      
		      
	}
}