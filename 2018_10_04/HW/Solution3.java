/**
 * 문제
 * 다음 코드와 같이 과목과 점수가 짝을 이루도록 2개의 배열을 작성하라.
 * 그리고 다음 예시와 같이 과목 이름을 입력받아 점수를 출력하는
 * 프로그램을 작성하라. "그만"을 입력받으면 종료한다.
 *
 * Input
 * 과목이름 >> Jaba
 * 과목이름 >> Java
 * 과목이름 >> 안드로이드
 * 과목이름 >> 그만
 *
 * Output
 * 없는 과목입니다.
 * Java점수는 95
 * 안드로이드의 점수는 55
 */

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };

		Scanner scanner = new Scanner(System.in);

		do
		{
			int check = 0;

			System.out.print("과목 이름 >> ");
			String sub = scanner.next();

			if (sub.equals("그만"))
				break;

			for (int i = 0; i < course.length; i++) {
				if (sub.equals(course[i])) {
					System.out.println(sub + "의 점수는 " + score[i]);
					check = 1;
					break;
				}
			}

			if (check == 0)
				System.out.println("없는 과목입니다.");

		} while(true);

		scanner.close();
	}

}
