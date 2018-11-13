import javax.swing.*;
import java.awt.*;

public class Solution3 extends JFrame {
	public Solution3() {
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		JPanel northPanel = new JPanel();

		JButton openB = new JButton("열기");
		JButton closeB = new JButton("닫기");
		JButton exitB = new JButton("나가기");

		northPanel.add(openB);
		northPanel.add(closeB);
		northPanel.add(exitB);
		northPanel.setBackground(Color.GRAY);

		c.add(northPanel, BorderLayout.NORTH);

		JPanel centerPanel = new JPanel();

		centerPanel.setLayout(null);
		centerPanel.setBackground(Color.WHITE);

		JLabel [] la = new JLabel[10];

		for (int i = 0; i < la.length; i++) {
			la[i] = new JLabel("*");

			int x = (int) (Math.random() * 300) + 100;
			int y = (int) (Math.random() * 300) + 100;

			la[i].setForeground(Color.RED);
			la[i].setBounds(x, y, 10, 10);

			centerPanel.add(la[i]);
		}

		c.add(centerPanel, BorderLayout.CENTER);

		JPanel southPanel = new JPanel();

		southPanel.setBackground(Color.YELLOW);
		JButton inputB = new JButton("Word Input");
		JTextField inputT = new JTextField(20);

		southPanel.add(inputB);
		southPanel.add(inputT);

		c.add(southPanel, BorderLayout.SOUTH);

		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Solution3();
	}

}
