import java.util.Scanner;

abstract class Calc {
	int a, b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	abstract int calculate();
}

class Add extends Calc {

	public Add(int a, int b) {
		setValue(a, b);
	}

	@Override
	public int calculate() {
		return a + b;
	}
}

class Sub extends Calc {

	public Sub(int a, int b) {
		setValue(a, b);
	}

	@Override
	public int calculate() {
		return a - b;
	}
}

class Mul extends Calc {

	public Mul(int a, int b) {
		setValue(a, b);
	}

	@Override
	public int calculate() {
		return a * b;
	}
}

class Div extends Calc {

	public Div(int a, int b) {
		setValue(a, b);
	}

	@Override
	public int calculate() {
		try {

			return a / b;

		} catch (ArithmeticException e) {

			System.out.println(e);
			return 0;

		}
	}
}

class Calculator {
	int a, b;
	char oper;

	public Calculator(int a, int b, char oper) {
		this.a = a;
		this.b = b;
		this.oper = oper;
	}

	public int getValue() {
		switch(oper)
		{
		case '+' :
			Add add = new Add(a, b);

			return add.calculate();

		case '-' :
			Sub sub = new Sub(a, b);

			return sub.calculate();

		case '*' :
			Mul mul = new Mul(a, b);

			return mul.calculate();

		case '/' :
			Div div = new Div(a, b);

			return div.calculate();
			
		default :
			System.out.println("Operation Error!");

			return 0;

		}
	}
}

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char oper = scanner.next().charAt(0);

		scanner.close();

		Calculator calculator = new Calculator(a, b, oper);

		System.out.println(calculator.getValue());
	}

}
