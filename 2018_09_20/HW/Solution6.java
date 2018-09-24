/**
 * 문제
 * 반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우를 순서대
 * 화면에 출력해보자. 1부터 시작하며 99까지만 한다.
 * 실행 사례는 다음과 같다.
 *
 * Input
 *
 * Output
 * 3 박수짝
 * 6 박수짝
 * 9 박수짝
 * 13 박수짝
 * ...
 */

public class Solution6 {

	public static void main(String[] args) {
		for(int i = 1; i <= 99; i++) {

			if (i < 10) {

				if (i == 3 || i == 6 || i == 9) {
					System.out.println(String.format("%d 박수짝", i));
				}

			} else {

				int tenDigit = i / 10;
				int unitDigit = i % 10;

				if (tenDigit == 3 || tenDigit == 6 ||
						tenDigit == 9 || unitDigit == 3 ||
							unitDigit == 6 || unitDigit == 9) {

					System.out.println(String.format("%d 박수짝", i));
				}

			}

		}

	}

}
