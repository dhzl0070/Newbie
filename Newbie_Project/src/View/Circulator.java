package View;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Circulator {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Circulator window = new Circulator();
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
	public Circulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		String url2 = getClass().getResource("").getPath(); //경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image2 = new ImageIcon(url2 + "images/light.jpg").getImage();
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon(image2.getScaledInstance(65, 74, image2.SCALE_SMOOTH)));
		lblNewLabel_1.setBounds(242, 365, 82, 91);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		String url = getClass().getResource("").getPath(); //경로가지고 오기! 하지만 뒤에 images폴더랑 파일명 확장자까지 필수!
		Image image = new ImageIcon(url + "images/calculator.jpg").getImage();
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(390, 600, image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 390, 600);
		frame.getContentPane().add(lblNewLabel);
		
	}

}
