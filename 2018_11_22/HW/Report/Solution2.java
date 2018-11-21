import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Solution2 extends JFrame {
	public Solution2() {
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel label = new JLabel("Love Java");

		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {

					JLabel la = (JLabel)e.getSource();

					String text  = la.getText();
					String a = text.substring(0,1);
					String b = text.substring(1);

					la.setText(b.concat(a));
				}
			}
		});

		c.add(label);

		setSize(250,100);
		setVisible(true);

		label.requestFocus();
	}

	public static void main(String[] args) {
		new Solution2();
	}

}
