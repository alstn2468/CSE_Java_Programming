
import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };

		Scanner scanner = new Scanner(System.in);

		do
		{
			int check = 0;

			System.out.print("과목 이름 >> ");
			String sub = scanner.next();

			if (sub.equals("그만"))
				break;

			for (int i = 0; i < course.length; i++) {
				if (sub.equals(course[i])) {
					System.out.println(sub + "의 점수는 " + score[i]);
					check = 1;
					break;
				}
			}

			if (check == 0)
				System.out.println("없는 과목입니다.");

		} while(true);

		scanner.close();
	}

}
