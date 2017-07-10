import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * ��ǰ Java Programming 9�� �ڹ� GUI ����
 * �����߽����� �ڵ� �ۼ��� ����
 */

public class Main_L extends JFrame {
	
	Main_L() {
		//9-1����
		setTitle("ContentPane�� JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Main_L();
	}
	
}
