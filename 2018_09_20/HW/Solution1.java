/**
 * 문제
 * Scanner를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고
 * 이 3개의 수로 삼각형을 만들 수 있는지 판별하라.
 * 삼각형이 되려면 두변의 합이 다른 한 변의 합보다 커야한다.
 *
 * Input
 * 정수 3개를 입력하시오 >> 4 3 5
 * 
 * Output
 * 삼각형이 됩니다.
 */

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수 3개를 입력하시오 >> ");

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		scanner.close();

		int max;

		if (a < b) {

			max = b;

			if (max < c) {
				max = c;
			}

		} else {

			max = a;

			if (max < c) {
				max = c;
			}

		}

		if (a == max) {

			if (b + c > max) {
				System.out.println("삼각형이 됩니다.");
			} else {
				System.out.println("삼각형이 안됩니다.");
			}

		} else if (b == max) {

			if (a + c > max) {
				System.out.println("삼각형이 됩니다.");
			} else {
				System.out.println("삼각형이 안됩니다.");
			}

		} else if (c == max) {

			if (a + b > max) {
				System.out.println("삼각형이 됩니다.");
			} else {
				System.out.println("삼각형이 안됩니다.");
			}

		}
	}

}
