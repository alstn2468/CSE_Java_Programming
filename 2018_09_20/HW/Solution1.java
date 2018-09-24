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
