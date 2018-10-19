/**
 * 문제
 * Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라.
 * 다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.
 *
 * Input
 *
 * Output
 * BLACK색의 (0,0)의 점입니다.
 * RED색의 (5,5)의 점입니다.
 */

class Point {
	public int x, y;

	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint extends Point {
	String color;

	public ColorPoint() {
		super();
		this.color = "BLACK";
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setXY(int x, int y) {
		move(x, y);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return this.color + "색의 " + "( " + this.x +
				", " + this.y + " )의 점";

	}
}

public class Solution3 {

    public static void main(String[] args) {
    	ColorPoint zeroPoint = new ColorPoint();
    	System.out.println(zeroPoint.toString() + "입니다.");

    	ColorPoint cp = new ColorPoint(5, 5, "Yellow");
    	cp.setXY(5, 5);
    	cp.setColor("RED");

    	String str = cp.toString();

    	System.out.println(str + "입니다.");

    }
}
