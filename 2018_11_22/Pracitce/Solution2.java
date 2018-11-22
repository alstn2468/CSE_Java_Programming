import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Solution2 extends JFrame {
	public Solution2() {
		setTitle("Left 키로 문자열 교체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel label = new JLabel("Love Java");

		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {

					JLabel la = (JLabel)e.getSource();
					StringBuffer strbuf = new StringBuffer();
					strbuf.append(la.getText());
					strbuf.reverse();

					la.setText(strbuf.toString());
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
