package View;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.mypDAO;
import model.ProductsVO;
import model.mypVO;
import model.userVO;

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
	public Myproduct(userVO vo, ProductsVO pvo) {
		initialize(vo, pvo);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(userVO vo, ProductsVO pvo) {
		frame = new JFrame();
		frame.setBounds(100, 100, 620, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 10, 109, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 36, 580, 367);
		frame.getContentPane().add(scrollPane);
		  //선택한 셀의 행 번호계산 
		ArrayList<mypVO> list = dao.allSelect_CE();
		System.out.println(list.size());
		String colNames[] = { "번호", "모델명", "제품종류","회원번호" };
		//[행 == 데이터의 개수][열 == 컬럼개수]
		//크기 지정 
		Object data[][] = new Object[list.size()][colNames.length];
		for (int i = 0; i < list.size(); i++) {
			data[i][0] = list.get(i).getNum();
			data[i][1] = list.get(i).getModel_id();
			data[i][2] = list.get(i).getCategory();
			data[i][3] = list.get(i).getVip_id();
		}
		table = new JTable(data, colNames);
		scrollPane.setViewportView(table);
		
	}
}
