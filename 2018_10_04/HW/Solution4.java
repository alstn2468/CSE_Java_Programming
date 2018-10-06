
import java.util.Scanner;

public class Solution4 {

	public static void game(String oper, int com) {
		String str[] = { "가위", "바위", "보" };

		switch(com)
		{
		case 0 :
			if (oper.equals("가위"))
				System.out.println("사용자 = " + oper + " , 컴퓨터 = " + str[com] +
									", 비겼습니다.");

			else if (oper.equals("바위"))
				System.out.println("사용자 = " + oper +" , 컴퓨터 = " + str[com] +
									", 사용자가 이겼습니다.");
			else
				System.out.println("사용자 = " + oper + " , 컴퓨터 = " + str[com] +
									", 사용자가 졌습니다.");
			break;

		case 1 :
			if (oper.equals("가위"))
				System.out.println("사용자 = " + oper + " , 컴퓨터 = " + str[com] +
									", 사용자가 졌습니다.");

			else if (oper.equals("바위"))
				System.out.println("사용자 = " + oper +" , 컴퓨터 = " + str[com] +
									", 비겼습니다.");
			else
				System.out.println("사용자 = " + oper + " , 컴퓨터 = " + str[com] +
									", 사용자가 이겼습니다.");
			break;

		case 2 :
			if (oper.equals("가위"))
				System.out.println("사용자 = " + oper + " , 컴퓨터 = " + str[com] +
									", 사용자가 이겼습니다.");

			else if (oper.equals("바위"))
				System.out.println("사용자 = " + oper +" , 컴퓨터 = " + str[com] +
									", 사용자가 졌습니다.");
			else
				System.out.println("사용자 = " + oper + " , 컴퓨터 = " + str[com] +
									", 비겼습니다.");
			break;
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

			game(oper, com);

		} while(true);

		System.out.println("게임을 종료합니다...");

		scanner.close();
	}

}
