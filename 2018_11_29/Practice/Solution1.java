import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 메인 프레임 클래스
 * @author 김민수
 */
public class Solution1 extends JFrame {

	/**
     * 메인 프레임 생성자 클래스
     */
	public Solution1() {
		setTitle("CheckBox Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		c.setLayout(new FlowLayout());

		JCheckBox active = new JCheckBox("버튼 비활성화");
		JCheckBox show = new JCheckBox("버튼 감추기");
		JButton btn = new JButton("test button");

		/* 체크 박스에 익명 ItemListener 삽입 */
		active.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int selected = (e.getStateChange() == ItemEvent.SELECTED) ? 1 : -1;
                // 선택되었을 경우 1 그렇지 않을 경우 -1

				btn.setEnabled(selected == -1);
                // <selected :  1> <selected  == -1 : false> <비활성화>
                // <selected : -1> < selected == -1 :  true> < 활성화>
			}
		});

		/* 체크 박스에 익명 ItemListener 삽입 */
        show.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int selected = (e.getStateChange() == ItemEvent.SELECTED) ? 1 : -1;
                // 선택되었을 경우 1 그렇지 않을 경우 -1

				btn.setVisible(selected == -1);
                // <selected :  1> <selected  == -1 : false> <숨기기>
                // <selected : -1> < selected == -1 :  true> <보이기>
			}
		});

		// active.addItemListener((e) -> {
        //     int selected = e.getStateChange() == ItemEvent.SELECTED ? 1 : -1;
        //     btn.setEnabled(selected == -1);
        // });
		//
        // show.addItemListener((e) -> {
        //     int selected = e.getStateChange() == ItemEvent.SELECTED ? 1 : -1;
        //     btn.setVisible(selected == -1);
        // });

		/* 프레임에 컴포넌트 삽입 */
        c.add(active);
        c.add(show);
        c.add(btn);

        setSize(250, 150);
        setVisible(true);
    }

	public static void main(String[] args) {
		new Solution1();
	}
}
