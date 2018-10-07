/**
 * 문제
 * 배열과 반복문을 이용하여 프로그램을 작성해보자.
 * 키보드에서 정수로 된 돈의 액수를 입력받아 오만 원권, 만 원권,
 * 천 원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전,
 * 1원짜리 동전이 각 몇 개로 변환되는지 예시와 같이 출력하라.
 * 이때 반드시 배열을 이용하고 반복문으로 작성하라.
 *
 * Input
 * 금액을 입력하시오 >> 65123
 *
 * Output
 * 50000원 짜리 : 1개
 * 10000원 짜리 : 1개
 * 1000원 짜리 : 5개
 * 100원 짜리 : 1개
 * 10원 짜리 : 2개
 * 1원 짜리 : 3개
 */

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("금액을 입력하시오 >> ");
		int money = scanner.nextInt();

		scanner.close();

		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		int[] count = new int[unit.length];

		for (int i = 0; i < unit.length; i++) {
			count[i] = money / unit[i];
			money %= unit[i];

			if(count[i] == 0)
				continue;

			else
				System.out.println(unit[i] + "원 짜리 : " + count[i] + "개");
		}

	}

}
