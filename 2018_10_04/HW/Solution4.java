/**
 * 문제
 * 컴퓨터와 독자 사이의 가위 바위 보 게임을 만들어보자.
 * 예시는 다음 그림과 같다. 독자부터 먼저 시작한다.
 * 독자가 가위 바위 보 중 하나를 입력하고 <Enter>키를 치면,
 * 프로그램은 가위 바위 보 중에서 랜덤하게 하나를 선택하고
 * 컴퓨터가 낸 것으로 한다. 독자가 입력한 값과 랜덤하게
 * 선택한 값을 비교하여 누가 이겼는지 판단한다.
 * 독자가 가위 바위 보 대신 "그만"을 입력하면 게임을 끝낸다.
 *
 * Input
 * 가위 바위 보! >>  바위
 * 가위 바위 보! >> 가위
 * 가위 바위 보! >> 보
 * 가위 바위 보! >> 그만
 *
 * Output
 * 사용자 = 바위, 컴퓨터 = 가위, 사용자가 이겼습니다.
 * 사용자 = 가위, 컴퓨터 = 가위, 비겼습니다.
 * 게임을 종료하니다...
 */

import java.util.Scanner;

public class Solution4 {
	static String str[] = { "가위", "바위", "보" };

	public static void display(int result, String oper, int com) {

		if (result == 0) {

			System.out.println("사용자 = " + oper + " , 컴퓨터 = " + str[com] +
								", 비겼습니다.");

		} else if (result == 1) {

			System.out.println("사용자 = " + oper +" , 컴퓨터 = " + str[com] +
								", 사용자가 이겼습니다.");

		} else if (result == 2) {

			System.out.println("사용자 = " + oper + " , 컴퓨터 = " + str[com] +
								", 사용자가 졌습니다.");

		}
	}

	public static int game(String oper, int com) {
		switch(com)
		{
		case 0 :
			if (oper.equals("가위")) return 0;

			else if (oper.equals("바위")) return 1;

			else return 2;

		case 1 :
			if (oper.equals("가위")) return 2;


			else if (oper.equals("바위")) return 0;

			else return 1;

		case 2 :
			if (oper.equals("가위")) return 1;

			else if (oper.equals("바위")) return 2;

			else return 0;

		default :
			return -1;
		}
	}

	public static void main(String[] args) {
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

		Scanner scanner = new Scanner(System.in);

		do
		{
			System.out.print("가위 바위 보! >> ");
			String oper = scanner.nextLine();

			if (oper.equals("그만"))
				break;

			int com = (int)(Math.random() * 3);

			display(game(oper, com), oper, com);

		} while(true);

		System.out.println("게임을 종료합니다...");

		scanner.close();
	}

}
