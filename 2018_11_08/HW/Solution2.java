import javax.swing.*;
import java.awt.*;

public class Solution2 extends JFrame {
	public Solution2() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		c.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(300, 300));

		JPanel panelNorth = new JPanel();
		JLabel input = new JLabel("수식입력");
		JTextField inputField = new JTextField(10);

		panelNorth.add(input);
		panelNorth.add(inputField);
		panelNorth.setBackground(Color.GRAY);

		c.add(panelNorth, BorderLayout.NORTH);

		JButton [] buttons = new JButton[16];

		for (int i = 0; i < 10; i++)
			buttons[i] = new JButton(Integer.toString(i));

		buttons[10] = new JButton("CE");
		buttons[11] = new JButton("계산");
		buttons[12] = new JButton("+");
		buttons[13] = new JButton("-");
		buttons[14] = new JButton("x");
		buttons[15] = new JButton("/");

		JPanel panelCenter = new JPanel();
		GridLayout grid = new GridLayout(4, 4, 5, 5);

		panelCenter.setLayout(grid);
		panelCenter.setSize(new Dimension(30, 30));

		for (int i = 0; i < buttons.length; i++) {

			if (i >= 12) {
				buttons[i].setBackground(Color.BLUE);
			}

			panelCenter.add(buttons[i]);
		}

		c.add(panelCenter, BorderLayout.CENTER);

		JPanel panelSouth = new JPanel();
		JLabel output = new JLabel("계산 결과");
		JTextField outputField = new JTextField(10);

		panelSouth.add(output);
		panelSouth.add(outputField);
		panelSouth.setBackground(Color.YELLOW);

		c.add(panelSouth, BorderLayout.SOUTH);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Solution2();
	}

}
