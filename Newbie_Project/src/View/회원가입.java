package View;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원가입 {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField txt_id;
	private JTextField txt_pw;
	private JTextField txt_name;
	private JTextField txt_age;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JTextField txt_phone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					회원가입 window = new 회원가입();
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
	public 회원가입() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		txt_id = new JTextField();
		txt_id.setBounds(153, 146, 155, 34);
		frame.getContentPane().add(txt_id);
		txt_id.setColumns(10);
		
		txt_pw = new JTextField();
		txt_pw.setBounds(153, 190, 155, 34);
		txt_pw.setColumns(10);
		frame.getContentPane().add(txt_pw);
		
		txt_name = new JTextField();
		txt_name.setColumns(10);
		txt_name.setBounds(153, 234, 155, 34);
		frame.getContentPane().add(txt_name);
		
		txt_age = new JTextField();
		txt_age.setColumns(10);
		txt_age.setBounds(153, 278, 155, 34);
		frame.getContentPane().add(txt_age);

		
		rdbtnNewRadioButton = new JRadioButton("\uB0A8\uC790");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setBounds(150, 329, 73, 34);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("\uC5EC\uC790");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setBounds(235, 329, 73, 34);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		txt_phone = new JTextField();
		txt_phone.setColumns(10);
		txt_phone.setBounds(153, 369, 155, 34);
		frame.getContentPane().add(txt_phone);
		
		String url2 = getClass().getResource("").getPath(); // 경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image2 = new ImageIcon(url2 + "images/light.jpg").getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_join = new JLabel(new ImageIcon(image2.getScaledInstance(65, 74, image2.SCALE_SMOOTH)));
		lbl_join.setBounds(242, 414, 82, 91);
		frame.getContentPane().add(lbl_join);
		
		String url = getClass().getResource("").getPath(); //경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image = new ImageIcon(url + "images/join.jpg").getImage();
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(390, 600, image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 384, 561);
		frame.getContentPane().add(lblNewLabel);


	}
}
