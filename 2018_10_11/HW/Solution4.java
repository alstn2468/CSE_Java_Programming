/**
 * 문제
 * 다수의 클래스를 만들고 활용하는 연습을 해보자.
 * 더하기(+), 빼기(-), 곱하기(*), 나누기(/)를 수행하는
 * 각 클래스 Add, Sub, Mul, Div를 만들어라.
 * 이들은 모두 다음 필드와 메소드를 가진다.
 * - int 타입의 a, b 필드 : 2개의 피연산자
 * - void setValue(int a, int b) : 피 연산자 값을 객체 내에 저장한다.
 * - int calcuate() : 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.
 * main() 메소드에서는 다음 실행 사례와 같이 두 정수와 연산자를 입력받고
 * Add, Sub, Mul, Div 중에서 이 연산을 실행할 수 있는 객체를 생성하고
 * setValue()와 calcuate()를 호출하여 결과를 출력하도록 작성하라.
 *
 * Input
 * 두 정수와 연산자를 입력하시오 >> 5 7 *
 *
 * Output
 * 35
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
