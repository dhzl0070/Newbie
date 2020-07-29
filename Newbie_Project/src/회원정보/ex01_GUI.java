package 회원정보;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ex01_GUI {

	private JFrame frame;
	private JTextField ID입력;
	private JPasswordField PW입력;
	private JLabel Lbn_text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex01_GUI window = new ex01_GUI();
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
	public ex01_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 715, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 205));
		panel.setForeground(Color.CYAN);
		panel.setBounds(12, 10, 675, 484);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel 제목입력 = new JLabel("\uC7AC\uBBF8\uC788\uB294 GUI");
		제목입력.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		제목입력.setHorizontalAlignment(SwingConstants.CENTER);
		제목입력.setBounds(169, 10, 320, 93);
		panel.add(제목입력);
		
		ID입력 = new JTextField();
		ID입력.setBounds(169, 113, 320, 55);
		panel.add(ID입력);
		ID입력.setColumns(10);
		
		PW입력 = new JPasswordField();
		PW입력.setBounds(169, 178, 320, 55);
		panel.add(PW입력);
		
		JButton Btn_get = new JButton("\uAC00\uC838\uC624\uAE30");
		Btn_get.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//마우스를 클릭했을 때 실행되는 코드
				System.out.println(ID입력.getText());
				System.out.println(PW입력.getText());
				Lbn_text.setText(ID입력.getText());
				
				
				
			}
		});
		Btn_get.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		Btn_get.setBackground(Color.YELLOW);
		Btn_get.setBounds(169, 255, 320, 55);
		panel.add(Btn_get);
		
		Lbn_text = new JLabel("");
		Lbn_text.setFont(new Font("휴먼매직체", Font.PLAIN, 25));
		Lbn_text.setHorizontalAlignment(SwingConstants.CENTER);
		Lbn_text.setBounds(169, 344, 320, 102);
		panel.add(Lbn_text);
	}
}
