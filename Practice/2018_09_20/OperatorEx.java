public class OperatorEx {

    public static void main(String[] args) {
        int a = 3;
        a %= 2;

        System.out.println("a = " + a);

        int b = 3;
        a = b++;

        System.out.println("a = " + a + ", b = " + b);

        a = ++b;

        System.out.println("a = " + a + ", b = " + b);

        System.out.println(3 != 2);
        System.out.println((3 > 2) && (3 > 4));
        System.out.println((3 != 2) || (-1 > 0));
        System.out.println("두 수의 차는 " + ((a > b) ? (a - b) : (b - a)));

        byte c = 20;
        byte d = -8;

        System.out.println(c << 2);
        System.out.println(d >> 2);
    }
}
