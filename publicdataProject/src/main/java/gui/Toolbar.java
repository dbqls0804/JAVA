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
		red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setBackground(Color.RED);
			}
		});
		blue.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				mainPanel.setBackground(Color.BLUE);
			}
		});
		
		//익명클래스 람다식으로 더 간단하게 표현 가능(굳이 알 필요는x)
		//red.addActionListener(e -> mainPanel.setBackground(Color.RED));
		//blue.addActionListener(e -> mainPanel.setBackground(Color.BLUE));
		
		add(red);
		add(blue);
	}
}


