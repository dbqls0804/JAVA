package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public JTextField address; //어드레스 입력창
	public JLabel resAddress, resX, resY, jibunAddress, imageLabel; //라벨 글자들
	
	public MainFrame(String title) {
		super(title); //윈도우창 제목
		//위쪽에 라벨 주소 입력, 클릭 버튼
		JPanel pan = new JPanel();
		JLabel addressLbl = new JLabel("주소입력");
		address = new JTextField(50); //입력창 객체 생성
		JButton btn = new JButton("클릭");
		pan.add(addressLbl);
		pan.add(address);
		pan.add(btn);
		// this => 버튼을 눌렀을 때 MainFrame 객체를 매개변수로 전달
		btn.addActionListener(e -> {
			try {
				new NaverMap(this);
			} catch (Exception e1) {
				e1.printStackTrace(); //빨간색 에러 뜨는것
			}
		});
		
		//지도 입력 라벨
		imageLabel = new JLabel("지도보기");
		// 아래의 주소 정보 표시 패널
		JPanel pan1 = new JPanel();
		pan1.setLayout(new GridLayout(4,1));
		resAddress = new JLabel("도로명");
		jibunAddress = new JLabel("지번주소");
		resX = new JLabel("경도");
		resY = new JLabel("위도");
		pan1.add(resAddress);
		pan1.add(jibunAddress);
		pan1.add(resX);
		pan1.add(resY);
		
		//레이아웃 설정
		setLayout(new BorderLayout());
		add(pan, BorderLayout.NORTH); //pan을 위쪽에 추가
		add(imageLabel, BorderLayout.CENTER); //지도보기 중간에 추가
		add(pan1, BorderLayout.SOUTH); // pan1 내용 아래에 추가
		
		
		setSize(730, 660); //사진 크기 보다 크게
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
