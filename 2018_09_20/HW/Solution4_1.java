/**
 * 문제
 * 사칙 연산을 입력받아 계산하는 프로그램을 작성하고자 한다.
 * 연산자는 +, -, *, /의 네 가지로 하고 피연산자는 모두 실수로 한다.
 * 피연산자와 연산자는 실행 사례와 같이 빈 칸으로 분리하여 입력한다.
 * 0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료한다.
 *
 * Input
 * 연산 >> 2 + 4
 *
 * Output
 * 2 + 4의 계산 결과는 6
 */

import java.util.Scanner;

public class Solution4_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("연산 >> ");

		double num1 = scanner.nextDouble();
		char oper = scanner.next().charAt(0);
		double num2 = scanner.nextDouble();

		scanner.close();

		if (oper == '+') {
			System.out.println(String.format("%f %c %f의 계산 결과는 %f",
								num1, oper, num2, num1 + num2));

		} else if (oper == '-') {
			System.out.println(String.format("%f %c %f의 계산 결과는 %f",
								num1, oper, num2, num1 - num2));

		} else if (oper == '*') {
			System.out.println(String.format("%f %c %f의 계산 결과는 %f",
								num1, oper, num2, num1 * num2));

		} else if (oper == '/') {

			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			} else {
				System.out.println(String.format("%f %c %f의 계산 결과는 %f",
									num1, oper, num2, num1 / num2));
			}

		} else {
			System.out.println("연산자 오류입니다.");
		}

	}

}
