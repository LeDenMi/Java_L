import java.awt.*;

import javax.swing.*;

/*
 * 명품 Java Programming 9장 자바 GUI 기초
 * 예제중심으로 코드 작성할 예정
 */

public class Main_L extends JFrame {
	
	Main_L() {
		//9-2예제
		setTitle("FlowLayout Sample"); // 프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); // 컨텐트팬에 FlowLayout 배치관리자 설정
		
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300, 200); // 프레임 크기 300X200 설정
		setVisible(true); // 프레임을 화면에 출력
	}
	
	public static void main(String[] args) {
		new Main_L();
	}
	
}
