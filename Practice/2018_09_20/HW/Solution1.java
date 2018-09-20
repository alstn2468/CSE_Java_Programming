import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        int won;

        Scanner scanner = new Scanner(System.in);

        System.out.print("원화를 입력하세요(단위 : 원) >> ");
        won = scanner.nextInt();

        System.out.println(won + "원은 $" + (double)won / 1100 + "입니다.");

        scanner.close();
    }

}
