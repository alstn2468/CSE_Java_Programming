import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculateActionListener implements ActionListener {
	JTextField inputField;
	JTextField outputField;
	JButton button;

	public CalculateActionListener(JTextField inputField, JTextField outputField, JButton button) {
		this.inputField = inputField;
		this.outputField = outputField;
		this.button = button;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = inputField.getText();
		String [] strings = str.split("");
		String temp = "";
		String op = "";

		int f = 0, s = 0;
		double result = 0.0;

		boolean check = false;

		for (int i = 0; i < strings.length; i++) {

			if (check) {
				temp += strings[i];
				s = Integer.parseInt(temp);
			}

			if (strings[i].equals("+") || strings[i].equals("-")
					|| strings[i].equals("x") || strings[i].equals("/")) {

				op = strings[i];

				for (int j = 0; j < i; j++) {
					temp += strings[j];
					f = Integer.parseInt(temp);
				}

				check = true;
				temp = "";
			}

		}


		switch (op) {

		case "+":
			result = f + s;
			break;

		case "-":
			result = f - s;
			break;

		case "x":
			result = f * s;
			break;

		case "/":
			if (s == 0)
				break;

			else
				result = (double) f / (double) s;
		}

		outputField.setText(Double.toString(result));
	}

}

class CEActionListener implements ActionListener {
	JTextField inputField;

	public CEActionListener(JTextField inputField) {
		this.inputField = inputField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		inputField.setText("");
	}

}

class NumberActionListener implements ActionListener {
	JTextField inputField;
	JButton button;

	public NumberActionListener(JTextField inputField, JButton button) {
		this.inputField = inputField;
		this.button = button;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		inputField.setText(inputField.getText() + button.getText());
	}

}

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
				buttons[i].setBackground(Color.CYAN);
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

		for (int i = 0; i < buttons.length; i++) {
			if (i == 10) {

				ActionListener listener = new CEActionListener(inputField);
				buttons[i].addActionListener(listener);

			} else if (i == 11) {

				ActionListener listener = new CalculateActionListener(inputField, outputField, buttons[i]);
				buttons[i].addActionListener(listener);

			} else {

				ActionListener listener = new NumberActionListener(inputField, buttons[i]);
				buttons[i].addActionListener(listener);

			}
		}

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Solution2();
	}

}
