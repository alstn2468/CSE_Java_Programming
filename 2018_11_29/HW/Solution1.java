import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 메인 프레임 클래스
 * @author 김민수
 */
public class Solution1 extends JFrame {
    JLabel la;
    JButton leftButton, rightButton;

    /* 이미지 파일의 경로 문자열 */
    String [] imageFilesLocation =
    {
        "./images/image0.jpg",
        "./images/image1.jpg",
        "./images/image2.jpg",
        "./images/image3.jpg"
    };

    /* 이미지 파일 현재 번호 */
    int n = 0;

    /**
     * 메인 프레임 생성자 클래스
     */
    public Solution1() {
        setTitle("Open Challenge 11");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        /* 라벨 초기 이미지 아이콘 설정 */
        la = new JLabel(new ImageIcon(imageFilesLocation[n]));

        /* 버튼을 삽입할 패널 생성 */
        JPanel p = new JPanel();

        /* 버튼 이미지 아이콘 삽입 */
        leftButton = new JButton(new ImageIcon("./images/left.png"));
        rightButton = new JButton(new ImageIcon("./images/right.png"));

        /* 버튼 마우스 리스터 삽입 */
        leftButton.addMouseListener(new LeftButtonEvent());
        rightButton.addMouseListener(new RightButtonEvent());

        /* 버튼 패널 설정 */
        p.setLayout(new FlowLayout());
        p.setBackground(Color.LIGHT_GRAY);

        /* 버튼 패널에 버튼 삽입 */
        p.add(leftButton);
        p.add(rightButton);

        /* 프레임에 라벨과 패널 삽입 */
        c.add(la, BorderLayout.CENTER);
        c.add(p, BorderLayout.SOUTH);

        setSize(400, 400);
        setVisible(true);
    }

    /**
     * 오른쪽 버튼 마우스 액션 리스너
     * @author 김민수
     */
    class RightButtonEvent extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
                n = (n + 1) % imageFilesLocation.length;
                // 제산 함수 이용 다음 이미지 번호 저장
                la.setIcon(new ImageIcon(imageFilesLocation[n]));
                // 라벨 다음 이미지 아이콘 설정
        }
    }

    /**
     * 왼쪽 버튼 마우스 액션 리스너
     * @author 김민수
     */
    class LeftButtonEvent extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
                n = (n - 1) + imageFilesLocation.length;
                n %= imageFilesLocation.length;
                // 이전 이미지 번호 저장
                la.setIcon(new ImageIcon(imageFilesLocation[n]));
                // 라벨 이전 이미지 아이콘 설정
        }
    }

    public static void main(String[] args) {
        new Solution1();
    }
}
