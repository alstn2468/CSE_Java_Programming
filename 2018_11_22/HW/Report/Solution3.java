import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Solution3 extends JFrame {
	public Solution3() {
		setTitle("+,- 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel label = new JLabel("Love Java");
		label.setFont(new Font("Arial", Font.PLAIN, 10));
		System.out.println(label.getFont().getSize());

		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int size = label.getFont().getSize();

				if(e.getKeyCode() == KeyEvent.VK_EQUALS) {
					label.setFont(new Font("Arial", Font.PLAIN, size + 5));
				} else if (e.getKeyCode() == KeyEvent.VK_MINUS) {
					if(size == 5) {
					} else {
						label.setFont(new Font("Arial", Font.PLAIN, size - 5));
					}
				}
				System.out.println(label.getFont().getSize());
			}
		});

		c.add(label);

		setSize(250,100);
		setVisible(true);

		label.requestFocus();
	}

	public static void main(String[] args) {
		new Solution3();
	}

}
