import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Solution1 extends JFrame {
	public Solution1() {
		setTitle("드래깅동안 YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		c.setBackground(Color.GREEN);

		c.addMouseMotionListener(new DraggedMouse());

		setSize(300, 200);
		setVisible(true);
	}

	class DraggedMouse implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.GREEN);
		}
	}

	public static void main(String[] args) {
		new Solution1();
	}

}
