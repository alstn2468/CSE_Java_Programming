/**
 * 문제
 * Converter 클래스를 상속받아 Km를 mile(마일)로 변환하는
 * Km2Mile 클래스를 작성하라. main() 메소드와 실행결과는 다음과 같다.
 *
 * Input
 * Km을 입력하세요 >> 30
 *
 * Output
 * 변환 결과 : 18.75mile입니다.
 */

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();

	protected double ratio;

	public void run() {
		Scanner scanner = new Scanner(System.in);

		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");

		System.out.print(getSrcString() + "을 입력하세요 >> ");
		double val = scanner.nextDouble();
		double res = convert(val);

		System.out.println("변환 결과 : " + res + getDestString() + "입니다.");

		scanner.close();
	}
}

class Km2Mile extends Converter {
	double mile;

	public Km2Mile(double mile) {
		this.mile = mile;
	}

	@Override
	protected double convert(double src) {
		return src / this.mile;
	}

	@Override
	protected String getSrcString() {
		return "km";
	}

	@Override
	protected String getDestString() {
		return "mile";
	}
}

public class Solution1 {

    public static void main(String[] args) {
    	Km2Mile toMile = new Km2Mile(1.6);
    	toMile.run();

    }
}
