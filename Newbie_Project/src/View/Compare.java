package View;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Compare {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compare window = new Compare();
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
	public Compare() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 786, 637);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String url = getClass().getResource("").getPath(); //��ΰ����� ����! ������ �ڿ� images������ ���ϸ� Ȯ���ڱ��� �ʼ�!
		Image image = new ImageIcon(url + "images/compare.jpg").getImage();
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(768, 600, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 768, 600);
		frame.getContentPane().add(lblNewLabel);
		
	}

}