import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Solution1 extends JFrame {
	public Solution1() {
		setTitle("4X4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridLayout grid = new GridLayout(4, 3);

		Container c = getContentPane();
		c.setLayout(grid);

		Color [] color = { Color.RED, Color.BLACK, Color.CYAN,
						   Color.GREEN, Color.GRAY, Color.MAGENTA,
						   Color.BLUE, Color.LIGHT_GRAY, Color.PINK,
						   Color.WHITE, Color.YELLOW, Color.ORANGE };

		JLabel [] la = new JLabel[16];

		for (int i = 0; i < la.length; i++) {
			la[i] = new JLabel(Integer.toString(i));
			Random rand = new Random();

			int r = rand.nextInt(color.length - 1);

			la[i].setOpaque(true);
			la[i].setBackground(color[r]);

			c.add(la[i]);
		}

		setSize(800, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Solution1();
	}

}
