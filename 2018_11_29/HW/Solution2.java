import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 메인 프레임 클래스
 * @author 김민수
 */
public class Solution2 extends JFrame {

	/**
	 * 메인 프레임 생성자 클래스
	 */
	public Solution2() {
		setTitle("JTextField and JComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JComboBox<String> combo = new JComboBox<String>();
		JTextField text = new JTextField(20);

		/* 텍스트 필드에 익명 ActionListener 삽입 */
		text.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				combo.addItem(t.getText());
				t.setText("");
			}
		});

        /*콤보 박스의 초기 표기값 사이즈 설정 */
		combo.setPrototypeDisplayValue("XXXXXXXXXX");

        /* 프레임에 텍스트 필드와 콤보 박스 삽입 */
		c.add(text);
		c.add(combo);

		setSize(450, 300);
		setVisible(true);
     }

	public static void main(String[] args) {
		new Solution2();
	}
}
