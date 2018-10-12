/**
 * 문제
 * Grade 클래스를 작성해보자.
 * 3과목의 점수를 입력받아 Grade 객체를 생성하고
 * 성적 평균을 출력하는 main()과 실행예시는 다음과 같다.
 *
 * Input
 * 수학, 과학, 영어 순으로 3개의 점수 입력 >> 90 88 96
 *
 * Output
 * 평균은 91
 */

import java.util.Scanner;

class Grade {
	private int math, science, english;

	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	double average() {
		int sum = this.math + this.english + this.science;

		return sum / 3;
	}

}

public class Solution1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();

		Grade me = new Grade(math, science, english);

		System.out.println("평균은 " + me.average());

		scanner.close();

	}

}
