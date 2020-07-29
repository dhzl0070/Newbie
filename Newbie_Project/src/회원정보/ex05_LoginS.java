package 회원정보;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ex05_LoginS {

	private JFrame frame;

	public ex05_LoginS(VO vo) {
		initialize(vo);
		frame.setVisible(true);
		
	}

	private void initialize(VO vo) {
		frame = new JFrame();
		frame.setBounds(100, 100, 493, 547);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_name = new JLabel("New label");
		lbl_name.setBounds(33, 94, 384, 273);
		frame.getContentPane().add(lbl_name);
		lbl_name.setText(vo.getName());
	}

}
