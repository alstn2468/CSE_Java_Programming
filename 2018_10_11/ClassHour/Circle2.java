
public class Circle2 {
	int radius;
	String name;

    public Circle2(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

	public static void main(String[] args) {
        Circle2 pizza = new Circle2(10);
        System.out.println(pizza.getArea());

	}

}
