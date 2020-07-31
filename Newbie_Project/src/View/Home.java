package View;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Home() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 786, 637);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		String url2 = getClass().getResource("").getPath(); // 경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image2 = new ImageIcon(url2 + "images/light.jpg").getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_product = new JLabel(new ImageIcon(image2.getScaledInstance(65, 74, image2.SCALE_SMOOTH)));
		lbl_product.setBounds(57, 490, 82, 91);
		frame.getContentPane().add(lbl_product);

		String url3 = getClass().getResource("").getPath(); // 경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image3 = new ImageIcon(url3 + "images/light.jpg").getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_calculator = new JLabel(new ImageIcon(image3.getScaledInstance(65, 74, image3.SCALE_SMOOTH)));
		lbl_calculator.setBounds(175, 490, 82, 91);
		frame.getContentPane().add(lbl_calculator);

		String url4 = getClass().getResource("").getPath(); // 경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image4 = new ImageIcon(url4 + "images/light.jpg").getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_pattern = new JLabel(new ImageIcon(image4.getScaledInstance(65, 74, image4.SCALE_SMOOTH)));
		lbl_pattern.setBounds(512, 490, 82, 91);
		frame.getContentPane().add(lbl_pattern);

		String url5 = getClass().getResource("").getPath(); // 경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image5 = new ImageIcon(url5 + "images/light.jpg").getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_compare = new JLabel(new ImageIcon(image2.getScaledInstance(65, 74, image5.SCALE_SMOOTH)));
		lbl_compare.setBounds(631, 490, 82, 91);
		frame.getContentPane().add(lbl_compare);

		String url = getClass().getResource("").getPath(); // 경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		System.out.println(url);
		Image image = new ImageIcon(url + "images/Home.jpg").getImage();
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(768, 600, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 768, 600);
		frame.getContentPane().add(lblNewLabel);
	}

}
