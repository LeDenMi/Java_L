import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

/*
 * ��ǰ Java Programming 9�� �ڹ� GUI ����
 * �����߽����� �ڵ� �ۼ��� ����
 */

public class Main_L extends JFrame {
	
	Main_L() {
		/*
		// 9-1����
		setTitle("ContentPane�� JFrame"); // �������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����
		
		Container c = getContentPane();
		c.setBackground(Color.ORANGE);
		c.setLayout(new FlowLayout()); // ����Ʈ�ҿ� FlowLayout ��ġ������ ����
		c.add(new JButton("Ok"));
		c.add(new JButton("Cancle"));
		c.add(new JButton("Ignore"));
		
		setSize(300, 150); // ������ ũ�� 300X200 ����
		setVisible(true); // �������� ȭ�鿡 ���
		*/
		
		/*
		// 9-2����
		setTitle("FlowLayout Sample"); // �������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); // ����Ʈ�ҿ� FlowLayout ��ġ������ ����
		
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300, 200); // ������ ũ�� 300X200 ����
		setVisible(true); // �������� ȭ�鿡 ���
		*/
		
		/*
		// 9-3����
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
		// 9-4 ����
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		GridLayout grid = new GridLayout(4, 2); // 4x2 �׸����� GridLayout ��ġ������ ����
		
		grid.setVgap(5); // �׷��� ������ ���� ������ 5�ȼ��� ����
		c.setLayout(grid);
		c.add(new JLabel(" �̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �й�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �а�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" ����"));
		c.add(new JTextField(""));
		
		setSize(300, 200);
		setVisible(true);
		*/
		
		/*
		// 9-5 ����
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null); // ����Ʈ���� ��ġ������ ����
		
		// JLabel ������Ʈ �����ϰ� ���� ��ġ�� ũ�⸦ �����Ѵ�.
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		
		// 9���� ��ư ������Ʈ�� �����ϰ� ��� ������ ũ��� �����Ѵ�.
		// ��ġ�� ���� �ٸ��� ����
		for(int i=1;i<=9;i++) {
			JButton jb = new JButton(Integer.toString(i));
			jb.setLocation(i*15, i*15); // ��ư�� ��ġ ����
			jb.setSize(50, 20); // 9���� ��ư�� ũ��� �����ϰ� 50x20 ũ��
			c.add(jb); // ��ư�� ����Ʈ�ҿ� ����
		}
		
		setSize(300, 200);
		setVisible(true);
		*/
		
		// 10-1 ����
		setTitle("Null Container Sample");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ��ư ������Ʈ�� �����ϰ� MouseListener�� �ܴ�.
		JButton jb = new JButton("Mouse Event �½�Ʈ ��ư");
		jb.setBackground(Color.YELLOW);
		MyMouseListener listener = new MyMouseListener();
		jb.addMouseListener(listener);
		
		// ��ư�� ����Ʈ�ҿ� �ܴ�.
		add(jb);
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Main_L();
	}
	
}

// MouseListener�� ��ӹ޾� Mouse �����ʸ� �ۼ��Ѵ�.
// MouseListener�� 5���� �޼��带 ��� �����Ѵ�.
class MyMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) { // ���콺�� ��ư�� �ö�� �� ȣ��
		// TODO Auto-generated method stub
		JButton jb = (JButton)e.getSource(); // ���콺�� �ö� ��ư�� �ּҸ� �˾Ƴ���.
		jb.setBackground(Color.RED); // ��ư�� ������ ���������� ����
	}

	@Override
	public void mouseExited(MouseEvent e) { // ���콺�� ��ư���� ������ �� ȣ��
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
