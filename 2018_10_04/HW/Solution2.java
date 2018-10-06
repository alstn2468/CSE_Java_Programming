
public class Solution2 {

	public static boolean isInteger(String input) {
		try {

			Integer.parseInt(input);
			return true;

		} catch (NumberFormatException e) {

			return false;

		}
	}

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < args.length; i++) {
			if (isInteger(args[i]))
				sum +=  Integer.parseInt(args[i]);
		}

		System.out.println(sum);

	}

}
