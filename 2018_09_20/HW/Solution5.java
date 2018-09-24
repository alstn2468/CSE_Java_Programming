/**
 * 문제
 * Scanner를 이용하여 소문자 알파벳을 하나 입력받고
 * 다음과 같이 출력하는 프로그램을 작성하라.
 * 다음은 e를 입력받았을 경우이다.
 *
 * Input
 * 소문자 알파벳 하나를 입력하시오 >> e
 *
 * Output
 * abcde
 * abcd
 * abc
 * ab
 * a
 */

import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("소문자 알파벳 하나를 입력하시오 >> ");

		char alp = scanner.next().charAt(0);

		scanner.close();

		for(int i = alp; i >= 'a'; i--) {

			for(int j = 'a'; j <= i; j++) {
				System.out.print((char)j);
			}

			System.out.println();
		}

	}

}
