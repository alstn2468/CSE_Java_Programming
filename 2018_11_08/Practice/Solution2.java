import javax.swing.*;
import java.awt.*;

public class Solution2 extends JFrame {
	public Solution2() {
		Color [] color = { Color.RED, Color.ORANGE,
						   Color.YELLOW, Color.GREEN,
						   Color.CYAN, Color.BLUE,
						   Color.MAGENTA, Color.GRAY,
						   Color.pink, Color.DARK_GRAY };

		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridLayout grid = new GridLayout(1, 10);
		setLayout(grid);

		JButton [] btn = new JButton[10];

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(Integer.toString(i));
			btn[i].setBackground(color[i]);
			add(btn[i]);
		}

		setSize(600, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Solution2();
	}

}
