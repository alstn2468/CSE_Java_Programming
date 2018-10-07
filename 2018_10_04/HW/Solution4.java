
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
