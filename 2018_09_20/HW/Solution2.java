/**
 * 문제
 * 369게임을 간단히 작성해보자. 1~99까지의 정수를 입력받고
 * 정수에 3, 6, 9가 있는 경우는 "박수짝"을 출력하고 두 개 있는 경우는
 * "박수짝짝"을 출력하는 프로그램을 작성하라. 예를 들면, 키보드로 입력된 수가
 * 13인 경우 "박수짝"을 36인 경우 "박수짝짝"을 출력하면 된다.
 *
 * Input
 * 1~99 사이의 정수를 입력하시오 >> 36
 *
 * Output
 * 박수짝짝
 */

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("1~99 사이의 정수를 입력하시오 >> ");

		int n = scanner.nextInt();

		scanner.close();

		if (n > 10) {

			int tenDigit = n / 10;
			int unitDigit = n % 10;

			if (tenDigit == 3 || tenDigit == 6 || tenDigit == 9) {

				if (unitDigit == 3 || unitDigit == 6 ||unitDigit == 9) {
					System.out.println("박수짝짝");
				} else {
					System.out.println("박수짝");
				}

			} else {

				if (unitDigit == 3 || unitDigit == 6 || unitDigit == 9) {
					System.out.println("박수짝");
				}

			}

		} else {

			if (n == 3 || n == 6 || n == 9) {
				System.out.println("박수짝");
			}

		}
	}

}
