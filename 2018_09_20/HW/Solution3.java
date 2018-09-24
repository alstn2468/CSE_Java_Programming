/**
 * 문제
 * 원의 정보를 받기 위해 키보드로부터 원의 중심을 나타내는
 * 한 점과 한 반지름을 입력받는다. 두 개의 원을 입력받고
 * 두 원이 서로 겹치는지 판단하여 출력하여라.
 *
 * Input
 * 첫번째 원의 중심과 반지름 입력 >> 10 10 3
 * 두번째 원의 중심과 반지름 입력 >> 12 12 2
 *
 * Output
 * 두 원은 서로 겹친다.
 */

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫번째 원의 중심과 반지름 입력 >> ");

		double x1 = scanner.nextInt();
		double y1 = scanner.nextInt();
		double r1 = scanner.nextInt();

		System.out.print("두번째 원의 중심과 반지름 입력 >> ");

		double x2 = scanner.nextInt();
		double y2 = scanner.nextInt();
		double r2 = scanner.nextInt();

		scanner.close();

		double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		if (r1 + r2 >= distance) {
			System.out.println("두 원은 서로 겹친다.");
		} else {
			System.out.println("두 원은 서로 안겹친다.");
		}

	}

}
