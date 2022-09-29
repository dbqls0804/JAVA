package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;


public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title); // 창의 제목

		//mainPanel 주소를 알 수 있음
		final MainPanel mainPanel = new MainPanel();
		
		setLayout(new BorderLayout()); // Border Layout 사용
		add(mainPanel, BorderLayout.CENTER); //패널을 메인 프레임에 붙임
		add(new Toolbar(mainPanel), BorderLayout.NORTH); // 툴바(버튼쪽 위쪽)를 메인 프레임에 붙임

		setSize(600, 400); // 창의 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
