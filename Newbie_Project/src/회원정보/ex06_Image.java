package 회원정보;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ex06_Image {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex06_Image window = new ex06_Image();
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
	public ex06_Image() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 464, 525);//뜨는 창위치 x,y
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//이미지 넣기
		Image img = new ImageIcon("C:\\Users\\SMT078\\Documents\\Java_Study\\20200721_GUI\\fire.PNG").getImage();
		JLabel lbl_img = new JLabel(new ImageIcon(img.getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
		//크기조절하는 방법
		
		lbl_img.setBounds(12, 10, 424, 466);
		frame.getContentPane().add(lbl_img);
		
	}

}
