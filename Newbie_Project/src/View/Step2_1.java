package View;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;

import controller.mypDAO;
import model.ProductsVO;
import model.userVO;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Step2_1 {
	mypDAO dao = new mypDAO();
	private String rs_m = " ";
	private String rs_p = " ";
	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private String category;

//   public static void main(userVO vo) {
//      EventQueue.invokeLater(new Runnable() {
//         public void run() {
//            try {
//               Step3_1 window = new Step3_1(vo);
//               window.frame.setVisible(true);
//            } catch (Exception e) {
//               e.printStackTrace();
//            }
//         }
//      });
//   }
	public Step2_1(userVO vo) {
		System.out.println("step3_1 " + vo.getVip_id());
		initialize(vo);
		frame.setVisible(true);
	}

	private void initialize(userVO vo) {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JComboBox comboBox = new JComboBox();
	      comboBox.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC120\uD0DD\uD558\uC138\uC694]", "DDT33ERGNS", "HDT33ERMBD", "TDT33ERMBD", "EDT33EFRTWT", "TDS10EPACR"}));
	      comboBox.setBounds(163, 80, 168, 21);
	      frame.getContentPane().add(comboBox);
	      
	      JComboBox comboBox_1 = new JComboBox();
	      comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC120\uD0DD\uD558\uC138\uC694 ]", "AWF14113", "AWM06DMW", "AWM09DMW", "BWD15PDR", "BWD23GDD"}));
	      comboBox_1.setBounds(163, 107, 168, 21);
	      frame.getContentPane().add(comboBox_1);
	      
	      JComboBox comboBox_2 = new JComboBox();
	      comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC120\uD0DD\uD558\uC138\uC694 ]", "WKR83DSSPWI", "WKR83DSJPWI", "WKR83DSSBBI", "S833SN75", "HRFSN566HMFR"}));
	      comboBox_2.setBounds(163, 133, 168, 21);
	      frame.getContentPane().add(comboBox_2);
	      
	      JComboBox comboBox_3 = new JComboBox();
	      comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC120\uD0DD\uD558\uC138\uC694 ]", "DWP-Y450", "GP-80R", "GP-80B", "UBUS-P202HRO(W)", "WM071RWA"}));
	      comboBox_3.setBounds(163, 160, 168, 21);
	      frame.getContentPane().add(comboBox_3);
	      
	      JComboBox comboBox_4 = new JComboBox();
	      comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC120\uD0DD\uD558\uC138\uC694 ]", "WD503AF", "BF-ESCW03-CW", "WPU-A1100C", "LC-CHP-101-BK", "LC-CHP-101-MS"}));
	      comboBox_4.setBounds(163, 186, 168, 21);
	      frame.getContentPane().add(comboBox_4);
	      
	      JComboBox comboBox_5 = new JComboBox();
	      comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC120\uD0DD\uD558\uC138\uC694]", "WKR83DSSPWI", "WKR83DSJPWI", "WKR83DSSBBI", "S833SN75", "HRFSN566HMFR"}));
	      comboBox_5.setBounds(163, 213, 168, 21);
	      frame.getContentPane().add(comboBox_5);
	      
	      JComboBox comboBox_6 = new JComboBox();
	      comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC120\uD0DD\uD558\uC138\uC694 ]", "HQ-CY2028-B", "WCDD10BRAT", "WCDC10ARAT", "WCDD06CRWL", "WCDD10BRPT"}));
	      comboBox_6.setBounds(163, 238, 168, 21);
	      frame.getContentPane().add(comboBox_6);
	      
	      JComboBox comboBox_7 = new JComboBox();
	      comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC120\uD0DD\uD558\uC138\uC694 ]", "BrizKing F7", "MF-14CB", "MF-35SB", "BF-35S", "UMF-8491KN"}));
	      comboBox_7.setBounds(163, 265, 168, 21);
	      frame.getContentPane().add(comboBox_7);
	      
	      JComboBox comboBox_8 = new JComboBox();
	      comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"[ \uC81C\uD488\uC744 \uC120\uD0DD\uD558\uC138\uC694]", "LW-TS16X1F", "W160X01-SC", "W160X01-SB", "LW-TS10W1F", "W160X01-SA"}));
	      comboBox_8.setBounds(163, 291, 168, 21);
	      frame.getContentPane().add(comboBox_8);
		JRadioButton rbtn = new JRadioButton("\uAE40\uCE58\uB0C9\uC7A5\uACE0");
		buttonGroup.add(rbtn);
		rbtn.setBounds(40, 81, 115, 23);
		frame.getContentPane().add(rbtn);
		
		
		JRadioButton rbtn1 = new JRadioButton("\uB4DC\uB7FC\uC138\uD0C1\uAE30");
		buttonGroup.add(rbtn1);
		rbtn1.setBounds(40, 106, 115, 23);
		frame.getContentPane().add(rbtn1);
		
		JRadioButton rbtn2 = new JRadioButton("\uC5D0\uC5B4\uCEE8");
		buttonGroup.add(rbtn2);
		rbtn2.setBounds(40, 131, 115, 23);
		frame.getContentPane().add(rbtn2);
		
		JRadioButton rbtn3 = new JRadioButton("\uC815\uC218\uAE30");
		buttonGroup.add(rbtn3);
		rbtn3.setBounds(40, 158, 115, 23);
		frame.getContentPane().add(rbtn3);
		
		JRadioButton rbtn4 = new JRadioButton("\uC815\uC218\uAE30(\uC21C\uAC04\uC2DD)");
		buttonGroup.add(rbtn4);
		rbtn4.setBounds(40, 184, 115, 23);
		frame.getContentPane().add(rbtn4);
		
		JRadioButton rbtn5 = new JRadioButton("\uB0C9\uC7A5\uACE0");
		buttonGroup.add(rbtn5);
		rbtn5.setBounds(40, 211, 115, 23);
		frame.getContentPane().add(rbtn5);
		
		JRadioButton rbtn6 = new JRadioButton("\uC804\uAE30\uBC25\uC1A5");
		buttonGroup.add(rbtn6);
		rbtn6.setBounds(40, 237, 115, 23);
		frame.getContentPane().add(rbtn6);
		
		JRadioButton rbtn7 = new JRadioButton("\uC120\uD48D\uAE30");
		buttonGroup.add(rbtn7);
		rbtn7.setBounds(40, 264, 115, 23);
		frame.getContentPane().add(rbtn7);
		
		JRadioButton rbtn8 = new JRadioButton("\uC77C\uBC18\uC138\uD0C1\uAE30");
		buttonGroup.add(rbtn8);
		rbtn8.setBounds(40, 290, 115, 23);
		frame.getContentPane().add(rbtn8);

		JButton btnNewButton = new JButton("\uB4F1\uB85D\uD558\uAE30");
		btnNewButton.addMouseListener(new MouseAdapter() {
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
				else if (rbtn5.isSelected()) {
					rs_p = rbtn5.getText();
				}
				else if (rbtn6.isSelected()) {
					rs_p = rbtn6.getText();
				}
				else if (rbtn7.isSelected()) {
					rs_p = rbtn7.getText();
				}
				else if (rbtn8.isSelected()) {
					rs_p = rbtn8.getText();
				}
				rs_m = " ";
				if (comboBox.getSelectedIndex() != 0) {
					rs_m += comboBox.getSelectedItem() + " ";
				} else
					rs_m += "";
				if (comboBox_1.getSelectedIndex() != 0) {
					rs_m += comboBox_1.getSelectedItem() + " ";
				} else
					rs_m += "";
				if (comboBox_2.getSelectedIndex() != 0) {
					rs_m += comboBox_2.getSelectedItem() + " ";
				} else
					rs_m += "";
				if (comboBox_3.getSelectedIndex() != 0) {
					rs_m += comboBox_3.getSelectedItem() + " ";
				} else
					rs_m += "";
				if (comboBox_4.getSelectedIndex() != 0) {
					rs_m += comboBox_4.getSelectedItem() + " ";
				} else
					rs_m += "";
				if (comboBox_5.getSelectedIndex() != 0) {
					rs_m += comboBox_5.getSelectedItem() + " ";
				} else
					rs_m += "";
				if (comboBox_6.getSelectedIndex() != 0) {
					rs_m += comboBox_6.getSelectedItem() + " ";
				} else
					rs_m += "";
				if (comboBox_7.getSelectedIndex() != 0) {
					rs_m += comboBox_7.getSelectedItem() + " ";
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
				
				
				
				String model_id = rs_m.trim();
				String category = rs_p;
				ProductsVO pvo = new ProductsVO(model_id,category);
				int cnt = dao.myproducts(pvo, vo);
				if (cnt > 0) {
					JOptionPane.showMessageDialog(null, "등록 성공!", "제품등록", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "이미 있는 제품입니다!!", "제품등록", JOptionPane.ERROR_MESSAGE);
				}
				
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
				comboBox_2.setSelectedIndex(0);
				comboBox_3.setSelectedIndex(0);
				comboBox_4.setSelectedIndex(0);
				comboBox_5.setSelectedIndex(0);
				comboBox_6.setSelectedIndex(0);
				comboBox_7.setSelectedIndex(0);
				comboBox_8.setSelectedIndex(0);

				/* txt_p.setText("선택한 제품  :" + rs_p + "\n" + "모델명  :" + rs_m + "\n"); */
			}
		});
		
		JButton fb = new JButton();
		frame.getContentPane().add(fb);
		buttonGroup.add(fb);
				
		btnNewButton.setBounds(55, 420, 115, 40);
		frame.getContentPane().add(btnNewButton);
		JButton btnNewButton_1 = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Step1 step1 = new Step1(vo);
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(197, 420, 110, 40);
		frame.getContentPane().add(btnNewButton_1);

		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Home home = new Home(vo, null, null);
			}
		});
		lblNewLabel_1.setBounds(55, 10, 100, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Mypage mypage = new Mypage(vo, null, null);
			}
		});
		lblNewLabel_2.setBounds(197, 10, 115, 45);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		String url = getClass().getResource("").getPath();
		Image image = new ImageIcon(url + "images/Step2.jpg").getImage();
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(390, 600, image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 384, 560);
		frame.getContentPane().add(lblNewLabel);
	}
}