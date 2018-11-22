import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Solution1 extends JFrame {
	private JLabel la = new JLabel("Love Java");

	public Solution1() {
		setTitle("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		MyMouseListener listener = new MyMouseListener();
		la.addMouseListener(listener);

		c.add(la);

		setSize(300, 200);
		setVisible(true);
	}

	class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseEntered(MouseEvent e) {
			la.setText("Love Java");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			la.setText("사랑해");
		}
	}

	public static void main(String[] args) {
		new Solution1();
	}

}
