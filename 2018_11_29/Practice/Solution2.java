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
		int [] unit =
		{
			50000, 10000, 5000,
			1000, 500, 100,
			50, 10, 1
		}; // 환산할 돈의 종류

		String [] text =
		{
			"오만원", "만원", "오천원",
			"천원",  "500원", "100원",
			"50원", "10원", "1원"
		}; // 환산할 돈의 이름. 레이블로 출력됨

		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		/* 메인 프레임 레이아웃 설정 */
		c.setBackground(Color.PINK);
		c.setLayout(null);

		/* 금액 레이블 */
		JLabel la = new JLabel("금액");
		la.setHorizontalAlignment(JLabel.RIGHT);
		la.setSize(50, 20);
		la.setLocation(20, 20);

		/* 금액을 입력하는 JTextField */
		JTextField source = new JTextField(30);
		source.setSize(100, 20);
		source.setLocation(100, 20);

		/* 계산 버튼 */
		JButton calcBtn = new JButton("계산");
		calcBtn.setSize(70, 20);
		calcBtn.setLocation(210, 20);

		/* 프레임에 컨테이너 삽입 */
		c.add(la);
		c.add(source);
		c.add(calcBtn);

		/* 환산된 돈의 개수가 출력될 텍스트필드 */
		JTextField [] tf = new JTextField [unit.length];

		/* 계산된 액수별 돈의 갯수 */
		for (int i = 0; i < text.length; i++) {
			la = new JLabel(text[i]);
			la.setHorizontalAlignment(JLabel.RIGHT);
			la.setSize(50, 20);
			la.setLocation(50, 50 + i * 20);

			c.add(la); // 프레임에 레이블 삽입

			tf[i] = new JTextField(30);
			tf[i].setHorizontalAlignment(JTextField.CENTER);
			tf[i].setSize(70, 20);
			tf[i].setLocation(120, 50 + i * 20);

			c.add(tf[i]); // 프레임에 텍스트 필드 삽입
		}

		/* 계산 버튼의 익명 ActionListener 삽입 */
		calcBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = source.getText();

				if (str.length() == 0)
					return;

				int money = Integer.parseInt(str);
				int res;

				for (int i = 0; i < unit.length; i++) {
					res = money / unit[i];
					tf[i].setText(Integer.toString(res));

					if (res > 0)
						money = money % unit[i];
				}
			}
		});

		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Solution2();
	}
}
