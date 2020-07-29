package 회원정보;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex02_Login {

	private JFrame frame;
	private JTextField text_id;
	private JTextField text_pw;
	DAO dao = new DAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex02_Login window = new ex02_Login();
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
	public ex02_Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 513, 597);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(12, 10, 473, 538);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_title = new JLabel("\uD68C\uC6D0\uAD00\uB9AC\uC2DC\uC2A4\uD15C");
		lbl_title.setFont(new Font("휴먼매직체", Font.BOLD, 36));
		lbl_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_title.setBounds(87, 27, 307, 59);
		panel.add(lbl_title);
		
		JLabel lbl_id = new JLabel("\uC544\uC774\uB514");
		lbl_id.setFont(new Font("휴먼매직체", Font.BOLD, 20));
		lbl_id.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_id.setBounds(24, 118, 67, 48);
		panel.add(lbl_id);
		
		JLabel lbl_pw = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lbl_pw.setFont(new Font("휴먼매직체", Font.BOLD, 20));
		lbl_pw.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pw.setBounds(24, 181, 67, 48);
		panel.add(lbl_pw);
		
		text_id = new JTextField();
		text_id.setBounds(103, 119, 307, 48);
		panel.add(text_id);
		text_id.setColumns(10);
		
		text_pw = new JTextField();
		text_pw.setBounds(103, 182, 307, 48);
		panel.add(text_pw);
		text_pw.setColumns(10);
		
		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.setBackground(new Color(102, 204, 255));
		btn_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//1.textField에 있는 값들을 가지고 오기
				String id = text_id.getText();
				String pw = text_pw.getText();
				
				//2.login 기능 수행
				VO vo = new VO(id, pw);
				VO result = dao.login(vo);
				if(result != null) {
					frame.dispose();
					ex05_LoginS ls = new ex05_LoginS(result);
				}
				
				
				System.out.println(result.getName()+result.getAge());
			}
		});
		btn_login.setFont(new Font("휴먼매직체", Font.BOLD, 30));
		btn_login.setBounds(151, 298, 167, 48);
		panel.add(btn_login);
		
		JButton btn_int = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_int.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();//현재창 닫기
				//frame.setVisible(false);
				ex03_Insert.main(null);//내가 원하는 창을 열기!
				
			}
		});
		btn_int.setBackground(new Color(102, 204, 255));
		btn_int.setFont(new Font("휴먼매직체", Font.BOLD, 30));
		btn_int.setBounds(151, 356, 167, 48);
		panel.add(btn_int);
		
		JButton btn_del = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		btn_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				ex04_Delete.main(null);
			}
		});
		btn_del.setBackground(new Color(102, 204, 255));
		btn_del.setFont(new Font("휴먼매직체", Font.BOLD, 30));
		btn_del.setBounds(151, 417, 167, 48);
		panel.add(btn_del);
	}
}
