import javax.swing.*;
import java.awt.*;

public class Solution1 extends JFrame {
	public Solution1() {
		setTitle("BorderLayOut Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		c.add(new JLabel("라벨 입력테스트"), BorderLayout.NORTH);
		c.add(new JTextField("텍스트 필드"), BorderLayout.CENTER);
		c.add(new JButton("버튼1"), BorderLayout.WEST);
		c.add(new JButton("버튼2"), BorderLayout.EAST);
		c.add(new JButton("버튼3"), BorderLayout.SOUTH);

		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Solution1();
	}

}
