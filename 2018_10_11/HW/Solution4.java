/**
 * 문제
 * 
 *
 * Input
 *
 * Output
 *
 */

import java.util.Scanner;

class Add {
	private int a, b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calcuate() {
		return this.a + this.b;
	}
}

class Sub {
	private int a, b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calcuate() {
		return this.a - this.b;
	}
}

class Mul {
	private int a, b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calcuate() {
		return this.a * this.b;
	}
}

class Div {
	private int a, b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calcuate() {
		try {

			return this.a / this.b;

		} catch(ArithmeticException e) {

			System.out.println("0으로 나눌 수 없습니다.");
			return 0;

		}
	}
}

public class Solution4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char oper = scanner.next().charAt(0);

		switch(oper)
		{
		case '+' :
			Add add = new Add();

			add.setValue(a, b);
			System.out.println(add.calcuate());

			break;

		case '-' :
			Sub sub = new Sub();

			sub.setValue(a, b);
			System.out.println(sub.calcuate());

			break;

		case '/' :
			Div div = new Div();

			div.setValue(a, b);
			System.out.println(div.calcuate());

			break;

		case '*' :
			Mul mul = new Mul();

			mul.setValue(a, b);
			System.out.println(mul.calcuate());

			break;

		default :
			System.out.println("OPERATION INPUT ERROR!");
		}

		scanner.close();

	}

}
