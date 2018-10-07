/**
 * 문제
 * 다음과 같이 작동하는 Add.java를 작성하라.
 * 명령행 인자 중에서 정수 만을 골라 합을 구하라.
 * 다음 화면은 Add.class 파일을 C:\Temp 디렉터리에 복사한 뒤
 * 실행한 경우이다. 원본 Add.class 파일은 이클립스 프로젝트 폴더
 * 밑에 bin 폴더에 있다.
 *
 * Input
 * 2 3 aa 5 6.5
 *
 * Output
 * 10
 */

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
