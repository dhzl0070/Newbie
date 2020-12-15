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

//import au.com.bytecode.opencsv.CSVReader;

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

		JFreeChart chart = ChartFactory.createBarChart("누적사용량", // 차트의 제목
				"", // x축,가데이터 입력
				"사용요금", // y축,가데이터 입력
				getDataset(cmvo), // 우리가 넣어줄 데이터!
				PlotOrientation.VERTICAL, // 그래프의 방향
				true, // 범례
				true, // 말풍선
				false); // url

		chart.getTitle().setFont(new Font("굴림", Font.BOLD, 15));
		// ---> new Font(글씨체, 그 글씨체의 굵기, 크기)

		// 범례를 한글로 설정
		chart.getLegend().setItemFont(new Font("굴림", Font.BOLD, 15));

		// x축, y축 보유하고 있는 차트들의 한글 인코딩 --> frame 설정하기 전에 인코딩 작업을 먼저 해줘야 한다.
		CategoryPlot plot = chart.getCategoryPlot();
		// 1. x축 라벨 설정
		plot.getDomainAxis().setLabelFont(new Font("굴림", Font.BOLD, 14));
		// 2. x축 도메인 설정
		plot.getDomainAxis().setTickLabelFont(new Font("굴림", Font.BOLD, 8));
		// 3. y축 라벨,도메인 설정
		plot.getRangeAxis().setLabelFont(new Font("굴림", Font.BOLD, 14));
		plot.getRangeAxis().setTickLabelFont(new Font("굴림", Font.BOLD, 8));

		// 4. 차트의 배경색 설정
		plot.setBackgroundPaint(Color.WHITE);

		// 5. 차트의 라인색 설정
		plot.setRangeGridlinePaint(Color.DARK_GRAY);

		// 눈에 보이게 가시화 하는 방법
		ChartPanel chartVisual = new ChartPanel(chart);
		chartVisual.setBounds(49, 100, 653, 355);
		chartVisual.setPreferredSize(new Dimension(653, 355));
		chartVisual.setVisible(true);
		panel.add(chartVisual);

		ArrayList<Cuml_VO> list = dao.allSelect(cmvo);

		System.out.println(list.size());

		// 테이블에 1차원 배열로 틀만들어주고,
		// 데이터는 2차원 배열로 하나하나 담아주는 것!
		String colNames[] = { "모델명", "사용량" };
		// 크기지정 : [행==데이터갯수][열==컬럼갯수]
		Object data[][] = new Object[list.size()][colNames.length];
		// 데이터에 실제로 넣어주기
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
//		dataset.addValue(10, "이름", "김운비");
//		dataset.addValue(20, "이름", "김혜린");
//		dataset.addValue(30, "이름", "박성준");
//		dataset.addValue(40, "이름", "김형준");
//		dataset.addValue(50, "이름", "정진청");
//		
//		dataset.addValue(10, "점수", "김운비");
//		dataset.addValue(20, "점수", "김혜린");
//		dataset.addValue(30, "점수", "박성준");
//		dataset.addValue(40, "점수", "김형준");
//		dataset.addValue(50, "점수", "정진청");
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

