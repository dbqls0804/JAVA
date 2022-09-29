package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;

	public Toolbar(MainPanel mainPanel) { //mainPanel 객체 주소가 툴바로 넘어옴
		// 버튼 객체가 toolbar에 추가되긴 하지만 주소를 알지 못하므로 객체 생성
		// final은 생략 가능(주소가 변하지 않도록 상수 처리)
		final JButton red = new JButton("RED");
		final JButton blue = new JButton("BLUE");

		// 인터페이스는 객체를 생성할 수 없으므로 밑의 red, blue 클래스를 생성 후 인터페이스 만들어줌
		red.addActionListener(new ColorListener(mainPanel, Color.RED)); //RedListener에 주소 넣어줌
		blue.addActionListener(new ColorListener(mainPanel, Color.BLUE)); //BlueListener에 주소 넣어줌

		add(red);
		add(blue);
	}
}

class ColorListener implements ActionListener {
	//생성자 만들기
	private MainPanel mainPanel;
	private Color color;

	//mainPanel 의 주소 넣어줌
	public ColorListener(MainPanel mainPanel, Color color) {
		this.mainPanel = mainPanel;
		this.color = color;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		mainPanel.setBackground(color);
		// red 버튼 누르면 이 메소드가 실행됨
		// System.out.println("빨간 버튼 눌렀음");
		/* 메인 패널객체의 주소를 알아야 메인 패널의 색상을 바꿀 수 있음
		여기서 메인패널 객체를 만들어도 본 메인페널클래스와 다른 객체임 */
	}
}

