import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

/*
 * 명품 Java Programming 9장 자바 GUI 기초
 * 예제중심으로 코드 작성할 예정
 */

public class Main_L extends JFrame {
	
	Main_L() {
		/*
		// 9-1예제
		setTitle("ContentPane과 JFrame"); // 프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
		
		Container c = getContentPane();
		c.setBackground(Color.ORANGE);
		c.setLayout(new FlowLayout()); // 컨텐트팬에 FlowLayout 배치관리자 설정
		c.add(new JButton("Ok"));
		c.add(new JButton("Cancle"));
		c.add(new JButton("Ignore"));
		
		setSize(300, 150); // 프레임 크기 300X200 설정
		setVisible(true); // 프레임을 화면에 출력
		*/
		
		/*
		// 9-2예제
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
		*/
		
		/*
		// 9-3예제
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);
		
		setSize(300, 200);
		setVisible(true);
		*/
		
		/*
		// 9-4 예제
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		GridLayout grid = new GridLayout(4, 2); // 4x2 그리드의 GridLayout 배치관리자 생성
		
		grid.setVgap(5); // 그래드 사이의 수직 간격을 5픽셀로 설정
		c.setLayout(grid);
		c.add(new JLabel(" 이름"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField(""));
		
		setSize(300, 200);
		setVisible(true);
		*/
		
		/*
		// 9-5 예제
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null); // 컨텐트팬의 배치관리자 제거
		
		// JLabel 컴포넌트 생성하고 직접 위치와 크기를 지정한다.
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		
		// 9개의 버튼 컴포넌트를 생성하고 모두 동일한 크기로 설정한다.
		// 위치는 서로 다르게 설정
		for(int i=1;i<=9;i++) {
			JButton jb = new JButton(Integer.toString(i));
			jb.setLocation(i*15, i*15); // 버튼의 위치 설정
			jb.setSize(50, 20); // 9개의 버튼의 크기는 동일하게 50x20 크기
			c.add(jb); // 버튼을 컨텐트팬에 부착
		}
		
		setSize(300, 200);
		setVisible(true);
		*/
		
		// 10-1 예제
		setTitle("Null Container Sample");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 버튼 컴포넌트를 생성하고 MouseListener를 단다.
		JButton jb = new JButton("Mouse Event 태스트 버튼");
		jb.setBackground(Color.YELLOW);
		MyMouseListener listener = new MyMouseListener();
		jb.addMouseListener(listener);
		
		// 버튼을 컨텐트팬에 단다.
		add(jb);
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Main_L();
	}
	
}

// MouseListener을 상속받아 Mouse 리스너를 작성한다.
// MouseListener의 5개의 메서드를 모두 구현한다.
class MyMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) { // 마우스가 버튼에 올라올 때 호출
		// TODO Auto-generated method stub
		JButton jb = (JButton)e.getSource(); // 마우스가 올라간 버튼의 주소를 알아낸다.
		jb.setBackground(Color.RED); // 버튼의 배경색을 빨간색으로 변경
	}

	@Override
	public void mouseExited(MouseEvent e) { // 마우스가 버튼에서 내려갈 때 호출
		// TODO Auto-generated method stub
		JButton jb = (JButton)e.getSource();
		jb.setBackground(Color.YELLOW);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
