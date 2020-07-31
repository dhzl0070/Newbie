package View;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.mypDAO;
import model.ProductsVO;
import model.userVO;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Step3_2_1 {
	mypDAO PRD = new mypDAO();

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton;
	public static void main(userVO vo) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					System.out.println("여기"+vo.getVip_id());
					Step3_2_1 window = new Step3_2_1(vo);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Step3_2_1(userVO vo) {
		initialize(vo);
		frame.setVisible(true);
	}
	private void initialize(userVO vo) {
		frame = new JFrame();
		frame.setBounds(100, 100, 786, 637);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String url = getClass().getResource("").getPath(); // 경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image = new ImageIcon(url + "images/product_1STEP.jpg").getImage();
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(173, 63, 116, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// int num = Integer.parseInt(textField.getText());
				String model_id = textField.getText();
				ProductsVO pvo = new ProductsVO(model_id);
				
			
//				String category = textField_2.getText();
//				String vip_id = textField_3.getText();
//			
//				int hour_sp = Integer.parseInt(textField_2.getText());
//				int on_mode = Integer.parseInt(textField_3.getText());
//				int off_mode = Integer.parseInt(textField_4.getText());
//				String company = textField_5.getText();
//				int grade = Integer.parseInt(textField_6.getText());
//				int wh = Integer.parseInt(textField_7.getText());
//				//ArrayList<CNSMP_EFRTN_VO> result = PRD.allSelect_CE();

				
				
				
				int cnt = PRD.myproducts(pvo, vo);
				
				
				if (cnt > 0) {

					JOptionPane.showMessageDialog(null, "등록 성공!", "제품등록", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "등록 실패!", "제품등록", JOptionPane.ERROR_MESSAGE);
				}

				System.out.println();
				// 기존창 닫기
				frame.dispose();
			}
		});
		btnNewButton.setBounds(285, 337, 97, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
