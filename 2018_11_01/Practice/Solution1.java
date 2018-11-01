import java.util.Scanner;

interface Stack {
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

class StackApp implements Stack {
	private int max;
	private int top;
	private String[] arr;

	public StackApp(int max) {
		top = -1;
		this.max = max;
		arr = new String[max];
	}

	public boolean is_empty() {
		return top == -1;
	}

	public boolean is_full() {
		return top == (max - 1);
	}

	@Override
	public int length() {
		return top + 1;
	}

	@Override
	public int capacity() {
		return max - top - 1;
	}

	@Override
	public boolean push(String val) {
		if(this.is_full()) {

			return false;

		} else {

			arr[++top] = val;

			return true;
		}

	}

	@Override
	public String pop() {
		return arr[top--];
	}
}

public class Solution1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		StackApp s;

		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int max = scanner.nextInt();

		s = new StackApp(max);

		while (true) {
			System.out.print("문자열 입력 >> ");
			String string = scanner.next();

			if (string.equals("exit")) {
				System.out.print("스택에 저장된 모든 문자열 팝 : ");

				while(s.length() != 0) {
					System.out.print(s.pop() + " ");
				}

				break;
			}

			if (!s.push(string))
				System.out.println("스택이 꽉차서 푸시 불가!");

		}

		scanner.close();

	}

}
