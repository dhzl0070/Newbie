package View;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mypage {

	private JFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mypage window = new Mypage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Mypage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String url = getClass().getResource("").getPath(); //��ΰ����� ����! ������ �ڿ� images������ ���ϸ� Ȯ���ڱ��� �ʼ�!
		Image image = new ImageIcon(url + "images/Mypage.jpg").getImage();
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(390, 600, image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 384, 561);
		frame.getContentPane().add(lblNewLabel);
		
		
	}

}