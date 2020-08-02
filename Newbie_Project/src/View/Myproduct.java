package View;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.mypDAO;
import model.Cuml_VO;
import model.ProductsVO;
import model.mypVO;
import model.userVO;
import javax.swing.SwingConstants;

public class Myproduct {
	mypDAO dao = new mypDAO();
	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Myproduct window = new Myproduct();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Myproduct(userVO vo, Cuml_VO cvo, mypVO mvo) {
		initialize(vo,  cvo, mvo);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(userVO vo,  Cuml_VO cvo, mypVO mvo) {
		frame = new JFrame();
		frame.setBounds(100, 100, 768, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbl_HP = new JLabel("");
		lbl_HP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				Home home = new Home(vo,  null, null);
			}
		});
		lbl_HP.setBounds(49, 25, 81, 43);
		frame.getContentPane().add(lbl_HP);

		JLabel lbl_Notice = new JLabel("");
		lbl_Notice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				Notice.main(null);

			}
		});
		lbl_Notice.setBounds(547, 25, 155, 43);
		frame.getContentPane().add(lbl_Notice);

		JLabel lbl_Mypage = new JLabel("");
		lbl_Mypage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				Mypage mypage = new Mypage(vo,  cvo, mvo);
			}
		});
		lbl_Mypage.setBounds(176, 25, 99, 43);
		frame.getContentPane().add(lbl_Mypage);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 166, 728, 320);
		frame.getContentPane().add(scrollPane);
		// 선택한 셀의 행 번호계산
		ArrayList<mypVO> list = dao.allSelect_CE(vo);
		System.out.println(list.size());
		String colNames[] = { "번호", "모델명", "제품종류", "회원번호" };
		// [행 == 데이터의 개수][열 == 컬럼개수]
		// 크기 지정
		Object data[][] = new Object[list.size()][colNames.length];
		for (int i = 0; i < list.size(); i++) {
			data[i][0] = list.get(i).getNum();
			data[i][1] = list.get(i).getModel_id();
			data[i][2] = list.get(i).getCategory();
			data[i][3] = list.get(i).getVip_id();
		}
		table = new JTable(data, colNames);
		scrollPane.setViewportView(table);

		String url = getClass().getResource("").getPath();
		Image image = new ImageIcon(url + "images/Myproduct.jpg").getImage();
		JLabel lblNewLabel1 = new JLabel(new ImageIcon(image.getScaledInstance(768, 580, Image.SCALE_SMOOTH)));
		lblNewLabel1.setBounds(0, 0, 752, 600);
		frame.getContentPane().add(lblNewLabel1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(44, 32, 84, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Mypage mypage = new Mypage(vo,  cvo, mvo);
			}
		});
		lblNewLabel_1.setBounds(564, 496, 155, 53);
		frame.getContentPane().add(lblNewLabel_1);

	}
}
