import java.awt.*;

import javax.swing.*;

/*
 * ��ǰ Java Programming 9�� �ڹ� GUI ����
 * �����߽����� �ڵ� �ۼ��� ����
 */

public class Main_L extends JFrame {
	
	Main_L() {
		/*
		//9-1����
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
		//9-2����
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
		
		//9-3����
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
	}
	
	public static void main(String[] args) {
		new Main_L();
	}
	
}
