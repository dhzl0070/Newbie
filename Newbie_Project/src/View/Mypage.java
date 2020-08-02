package View;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.mypDAO;
import model.Cuml_VO;
import model.ProductsVO;
import model.mypVO;
import model.userVO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Mypage {
	mypDAO dao = new mypDAO();
	private JFrame frame;
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Mypage window = new Mypage();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	public Mypage(userVO vo, Cuml_VO cvo, mypVO mvo) {
		initialize(vo, cvo, mvo);
		frame.setVisible(true);
	}

	private void initialize(userVO vo,  Cuml_VO cvo, mypVO mvo) {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String url = getClass().getResource("").getPath(); //경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image = new ImageIcon(url + "images/Mypage.jpg").getImage();
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(390, 600, image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 384, 561);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
	               Home home = new Home(vo, cvo, mvo);
			}
		});
		lblNewLabel_1.setBounds(12, 10, 108, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
	            Myproduct Myproudct = new Myproduct(vo, cvo, mvo);
			}
		});
		lblNewLabel_2.setBounds(138, 264, 108, 42);
		frame.getContentPane().add(lblNewLabel_2);
		
		
	}

}
