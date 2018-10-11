
import java.util.Scanner;

class Phone {
	String name, tel;

	public Phone() {

	}

	void getName(String name) {
		this.name = name;
	}

	void getTel(String tel) {
		this.tel = tel;
	}

	void Show() {
		System.out.println("이름 : " + this.name + " 전화번호 : " + this.tel);
	}

}

public class Solution3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("인원수 >> ");
		int n = scanner.nextInt();

		Phone [] phone = new Phone[n];

		for (int i = 0; i < n; i++) {

			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) >> ");
			phone[i] = new Phone();
			phone[i].getName(scanner.next());
			phone[i].getTel(scanner.next());

		}

		scanner.close();

		System.out.println("저장되었습니다...\n");
		System.out.println("- 저장된 데이터 - ");

		for (int i = 0; i < n; i++)
			phone[i].Show();

	}

}
