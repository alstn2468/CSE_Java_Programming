// 5 - 12
import java.util.Scanner;

abstract class Shape {
	private Shape next;
	public Shape() { next = null; }
	public void setNext(Shape obj) { next = obj; }
	public Shape getNext() { return next; }
	public abstract void draw();
}

class Line extends Shape {
	@Override
	public void draw() { System.out.println("Line"); }
}

class Rect extends Shape {
	@Override
	public void draw() { System.out.println("Rect"); }
}

class Circle extends Shape {
	@Override
	public void draw() { System.out.println("Circle"); }
}

class GraphicEditor {
	private String name;
	private Scanner scanner = new Scanner(System.in);
	private Shape start=null, end=null;

	public GraphicEditor(String name) { this.name = name; }

	public void run() {
		System.out.println("그래픽 에디터 " + name + "을 실행합니다.");
		int choice = 0;

		while (choice != 4) {
			int type, index;

			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1 :

				System.out.print("Line(1), Rect(2), Circle(3) >> ");
				type = scanner.nextInt();

				if (type < 1 || type > 3) {
					System.out.println("잘못 선택하셨습니다.");
					break;
				}

				insert(type);
				break;

			case 2 :
				System.out.print("삭제할 도형의 위치 >> ");
				index = scanner.nextInt();

				if (!delete(index))
					System.out.println("삭제할 수 없습니다.");

				break;

			case 3 :
				Shape p = start;

				while(p != null) {
					p.draw();
					p = p.getNext();
				}
				break;

			case 4 :
				break;

			default :
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		System.out.println(name + "을 종료합니다.");

	}

	private boolean delete(int index) {
		Shape current = start, previous = start;

		if (start == null)
			return false;

		for (int i = 0; i < index; i++) {
			previous = current;
			current = current.getNext();

			if (current == null)
				return false;
		}

		if (start == end) {
			start = end = null;
			return true;
		}

		if (current == start) {

			start = start.getNext();

		} else if (current == end) {

			end = previous;
			end.setNext(null);

		} else {

			previous.setNext(current.getNext());

		}

		return true;
	}

	private void insert(int choice) {
		Shape obj = null;

		switch (choice) {
		case 1 :
			obj = new Line();
			break;

		case 2:
			obj = new Rect();
			break;

		case 3:
			obj = new Circle();
		}

		if (start == null) {

	         start = end = obj;

		} else {
			end.setNext(obj);
			end = obj;
		}
	}
}

public class Solution1 {

	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor("beauty");
		ge.run();

	}

}
