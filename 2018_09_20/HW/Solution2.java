import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("1~99사이의 정수를 입력하시오 >> ");

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
