package View;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 제품등록_2STEP_효율 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					제품등록_2STEP_효율 window = new 제품등록_2STEP_효율();
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
	public 제품등록_2STEP_효율() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 786, 637);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String url2 = getClass().getResource("").getPath(); // 경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image2 = new ImageIcon(url2 + "images/light.jpg").getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_refrig = new JLabel(new ImageIcon(image2.getScaledInstance(65, 74, image2.SCALE_SMOOTH)));
		lbl_refrig.setBounds(75, 158, 82, 91);
		frame.getContentPane().add(lbl_refrig);

		String url3 = getClass().getResource("").getPath(); // 경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image3 = new ImageIcon(url3 + "images/light.jpg").getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_kimchi_refrig = new JLabel(new ImageIcon(image3.getScaledInstance(65, 74, image3.SCALE_SMOOTH)));
		lbl_kimchi_refrig.setBounds(150, 237, 82, 91);
		frame.getContentPane().add(lbl_kimchi_refrig);

		String url4 = getClass().getResource("").getPath(); // 경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image4 = new ImageIcon(url4 + "images/light.jpg").getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_aircon = new JLabel(new ImageIcon(image4.getScaledInstance(65, 74, image4.SCALE_SMOOTH)));
		lbl_aircon.setBounds(244, 158, 82, 91);
		frame.getContentPane().add(lbl_aircon);

		String url5 = getClass().getResource("").getPath(); // 경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image5 = new ImageIcon(url5 + "images/light.jpg").getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_washing_mac = new JLabel(new ImageIcon(image5.getScaledInstance(65, 74, image5.SCALE_SMOOTH)));
		lbl_washing_mac.setBounds(90, 334, 82, 91);
		frame.getContentPane().add(lbl_washing_mac);
		
		String url6 = getClass().getResource("").getPath(); // 경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image6 = new ImageIcon(url6 + "images/light.jpg").getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_drum_wash_mac = new JLabel(new ImageIcon(image6.getScaledInstance(65, 74, image6.SCALE_SMOOTH)));
		lbl_drum_wash_mac.setBounds(224, 338, 82, 91);
		frame.getContentPane().add(lbl_drum_wash_mac);

		String url7 = getClass().getResource("").getPath(); // 경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image7 = new ImageIcon(url3 + "images/light.jpg").getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_warter_purifier = new JLabel(new ImageIcon(image7.getScaledInstance(65, 74, image7.SCALE_SMOOTH)));
		lbl_warter_purifier.setBounds(429, 158, 82, 91);
		frame.getContentPane().add(lbl_warter_purifier);

		String url8 = getClass().getResource("").getPath(); // 경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image8 = new ImageIcon(url4 + "images/light.jpg").getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_instn_purifier = new JLabel(new ImageIcon(image8.getScaledInstance(65, 74, image8.SCALE_SMOOTH)));
		lbl_instn_purifier.setBounds(596, 158, 82, 91);
		frame.getContentPane().add(lbl_instn_purifier);

		String url9 = getClass().getResource("").getPath(); // 경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image9 = new ImageIcon(url5 + "images/light.jpg").getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_rice_cooker = new JLabel(new ImageIcon(image9.getScaledInstance(65, 74, image9.SCALE_SMOOTH)));
		lbl_rice_cooker.setBounds(502, 237, 82, 91);
		frame.getContentPane().add(lbl_rice_cooker);
		
		String url10 = getClass().getResource("").getPath(); // 경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image10 = new ImageIcon(url5 + "images/light.jpg").getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_electric_fan = new JLabel(new ImageIcon(image10.getScaledInstance(65, 74, image10.SCALE_SMOOTH)));
		lbl_electric_fan.setBounds(440, 334, 82, 91);
		frame.getContentPane().add(lbl_electric_fan);
		
		String url11 = getClass().getResource("").getPath(); // 경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image11 = new ImageIcon(url5 + "images/light.jpg").getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_settp_box = new JLabel(new ImageIcon(image11.getScaledInstance(65, 74, image11.SCALE_SMOOTH)));
		lbl_settp_box.setBounds(572, 338, 82, 91);
		frame.getContentPane().add(lbl_settp_box);
		
		String url = getClass().getResource("").getPath(); //경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image = new ImageIcon(url + "images/product_2STEP_1.jpg").getImage();
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(768, 600, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 768, 600);
		frame.getContentPane().add(lblNewLabel);
		
	}

}
