/**
 * 문제
 * 다음 설명대로 Circle 클래스와 CircleManager 클래스를 환성하라.
 * 다음 실행 결과와 같이 3개의 Circle 객체 배열을 만들고
 * x, y, radius 값을 읽어 3개의 Circle 객체를 만들고
 * show()를 이용하여 이들을 모두 출력하라.
 *
 * Input
 * x, y, radius >> 3.0 3.0 5
 * x, y, radius >> 2.5 2.7 6
 * x, y, radius >> 5.0 2.0 4
 *
 * Output
 * (3.0,3.0) 5
 * (2.5,2.7) 6
 * (5.0,2.0) 4
 */

import java.util.Scanner;

class Circle {
	private double x, y;
	private int radius;

	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.println("(" + this.x + "," + this.y + ") " + this.radius);
	}
}

public class Solution3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle [] c = new Circle[3];

		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();

			c[i] = new Circle(x, y, radius);
		}

		for (int i = 0; i < c.length; i++)
			c[i].show();

		scanner.close();

	}

}
