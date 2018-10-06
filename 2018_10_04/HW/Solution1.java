
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
