package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import au.com.bytecode.opencsv.CSVReader;
import controller.Cuml_DAO;
import model.Cuml_VO;
import model.ProductsVO;
import model.mypVO;
import model.userVO;

public class Cuml {

	private JFrame frame;
	Cuml_DAO dao = new Cuml_DAO();
	ArrayList<Cuml_VO> list = new ArrayList<Cuml_VO>();


	public Cuml(userVO vo, Cuml_VO cmvo) {
		initialize(vo, cmvo);
		System.out.println("vo "+vo.getVip_id());
		frame.setVisible(true);
	}
	private void initialize(userVO vo, Cuml_VO cmvo) {
		frame = new JFrame();
		frame.setBounds(100, 100, 768, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbl_HP = new JLabel("");
		lbl_HP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				Home home = new Home(vo, cmvo, null);
			}
		});
		lbl_HP.setBounds(49, 25, 122, 43);
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
				Mypage mypage = new Mypage(vo,  cmvo, null);
			}
		});
		lbl_Mypage.setBounds(176, 25, 122, 43);
		frame.getContentPane().add(lbl_Mypage);

		JPanel panel = new JPanel();
		panel.setBounds(49, 100, 653, 355);
		frame.getContentPane().add(panel);

		JFreeChart chart = ChartFactory.createBarChart("������뷮", // ��Ʈ�� ����
				"", // x��,�������� �Է�
				"�����", // y��,�������� �Է�
				getDataset(cmvo), // �츮�� �־��� ������!
				PlotOrientation.VERTICAL, // �׷����� ����
				true, // ����
				true, // ��ǳ��
				false); // url

		chart.getTitle().setFont(new Font("����", Font.BOLD, 15));
		// ---> new Font(�۾�ü, �� �۾�ü�� ����, ũ��)

		// ���ʸ� �ѱ۷� ����
		chart.getLegend().setItemFont(new Font("����", Font.BOLD, 15));

		// x��, y�� �����ϰ� �ִ� ��Ʈ���� �ѱ� ���ڵ� --> frame �����ϱ� ���� ���ڵ� �۾��� ���� ����� �Ѵ�.
		CategoryPlot plot = chart.getCategoryPlot();
		// 1. x�� �� ����
		plot.getDomainAxis().setLabelFont(new Font("����", Font.BOLD, 14));
		// 2. x�� ������ ����
		plot.getDomainAxis().setTickLabelFont(new Font("����", Font.BOLD, 8));
		// 3. y�� ��,������ ����
		plot.getRangeAxis().setLabelFont(new Font("����", Font.BOLD, 14));
		plot.getRangeAxis().setTickLabelFont(new Font("����", Font.BOLD, 8));

		// 4. ��Ʈ�� ���� ����
		plot.setBackgroundPaint(Color.WHITE);

		// 5. ��Ʈ�� ���λ� ����
		plot.setRangeGridlinePaint(Color.DARK_GRAY);

		// ���� ���̰� ����ȭ �ϴ� ���
		ChartPanel chartVisual = new ChartPanel(chart);
		chartVisual.setBounds(49, 100, 653, 355);
		chartVisual.setPreferredSize(new Dimension(653, 355));
		chartVisual.setVisible(true);
		panel.add(chartVisual);

		ArrayList<Cuml_VO> list = dao.allSelect(cmvo);

		System.out.println(list.size());

		// ���̺��� 1���� �迭�� Ʋ������ְ�,
		// �����ʹ� 2���� �迭�� �ϳ��ϳ� ����ִ� ��!
		String colNames[] = { "�𵨸�", "��뷮" };
		// ũ������ : [��==�����Ͱ���][��==�÷�����]
		Object data[][] = new Object[list.size()][colNames.length];
		// �����Ϳ� ������ �־��ֱ�
		for (int i = 0; i < list.size(); i++) {
			data[i][0] =  cmvo.getcommaNum();
			data[i][1] =  cmvo.gettype_selected();
			
			String url = getClass().getResource("").getPath();
			Image image = new ImageIcon(url+"images/Pattern.jpg").getImage();
			JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(768, 580, Image.SCALE_SMOOTH)));
			lblNewLabel.setBounds(0, 0, 752, 600);
			frame.getContentPane().add(lblNewLabel);
		}
	}

	private DefaultCategoryDataset getDataset(Cuml_VO cmvo) {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//		dataset.addValue(10, "�̸�", "����");
//		dataset.addValue(20, "�̸�", "������");
//		dataset.addValue(30, "�̸�", "�ڼ���");
//		dataset.addValue(40, "�̸�", "������");
//		dataset.addValue(50, "�̸�", "����û");
//		
//		dataset.addValue(10, "����", "����");
//		dataset.addValue(20, "����", "������");
//		dataset.addValue(30, "����", "�ڼ���");
//		dataset.addValue(40, "����", "������");
//		dataset.addValue(50, "����", "����û");
		int cnt = 0;
		while(true) {
			cnt++;
			if(cnt > 1) {
				for (int i = 0; i < list.size(); i++) {
					dataset.addValue(10,"list.get(i)", "list.get(i+1)");
				}
			}
			if(cnt > 6) {
				break;
			}
		}
		return dataset;
	}

	}
