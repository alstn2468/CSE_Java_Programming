
public class Solution1 {

	static int usingFor() {
		int sum = 0;

		for (int i = 0; i < 100; i ++) {

			if (i % 2 == 0) {
				sum += i;
			}

		}

		return sum;
	}

	static int usingWhile() {
		int sum = 0;
		int i = 0;

		while(i < 100) {

			if (i % 2 == 0)
				sum += i;

			i++;

		}

		return sum;
	}

	static int usingDoWhile() {
		int sum = 0;
		int i = 0;

		do
		{

			if (i % 2 == 0)
				sum += i;

			i++;

		} while(i < 100);

		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Using For Loop : " + usingFor());
		System.out.println("Using While Loop : " + usingWhile());
		System.out.println("Using Do-While Loop : " + usingDoWhile());

	}

}
