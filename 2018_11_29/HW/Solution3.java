import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * 메인 프레임 클래스
 * @author 김민수
 */
public class Solution3 extends JFrame {
    JSlider slider;
    JLabel label;

    /**
     * 메인 프레임 생성자 클래스
     */
    public Solution3() {
        setTitle("JSlider Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        label = new JLabel("I Love Java");
        slider = new Slider();

        /* 슬라이더에 ChangeListener 삽입 */
        slider.addChangeListener(new SliderEvent(slider, label));

        /* 텍스트 레이블을 포함할 패널 생성 */
        JPanel p = new JPanel();

        /* 패널 레이아웃 설정 및 레이블 삽입 */
        p.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 75));
        p.add(label);

        /* 프레임의 상단에 슬라이더 가운데에 패널 삽입 */
        c.add(slider, BorderLayout.NORTH);
        c.add(p, BorderLayout.CENTER);

        setSize(500, 300);
        setVisible(true);
    }

    /**
     * JSlider를 상속받아 Slider클래스 구현
     * @author 김민수
     */
    class Slider extends JSlider {

        /**
         * Slider 클래스 생성자
         */
        public Slider() {
            slider = new JSlider(JSlider.HORIZONTAL);

            /* 슬라이더의 속성 설정 */
            this.setMinimum(1);
            this.setMaximum(100);
            this.setValue(label.getFont().getSize());
            this.setPaintTicks(true);
            this.setMajorTickSpacing(20);
            this.setMinorTickSpacing(5);
            this.setPaintLabels(true);
        }
    }

    /**
     * 슬라이더 체인지 리스너 클래스 구현
     * @author 김민수
     */
    class SliderEvent implements ChangeListener {
        JSlider slider;
        JLabel label;

        /**
         * 슬라이더 이벤트 생성자 클래스
         * @param slider 메인 클래스 슬라이더
         * @param label  메인 클래스 레이블
         */
        public SliderEvent(JSlider slider, JLabel label) {
            this.slider = slider;
            this.label = label;
        }

        /**
         * 슬라이더의 상태가 변하면 폰트 사이즈를 바꿔주는 클래스
         */
        @Override
        public void stateChanged(ChangeEvent e) {
            label.setFont(new Font("Arial", Font.PLAIN, slider.getValue()));
        }
    }

    public static void main(String[] args) {
        new Solution3();
    }
}
