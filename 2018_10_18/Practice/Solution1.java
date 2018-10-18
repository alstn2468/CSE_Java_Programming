class ArrayUtil {
	public static int[] concat(int[] a, int[]b ) {
		int[] res = new int[a.length + b.length];
		int count = 0;

		for (int i = 0; i < a.length; i++)
			res[count++] = a[i];

		for (int i = 0; i < b.length; i++)
			res[count++] = b[i];

		return res;
	}

	public static void print(int[] a) {
		System.out.print("[ ");

		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		System.out.println("]");
	}
}

public class Solution1 {

    public static void main(String[] args) {
    	int[] array1 = { 1, 5, 7, 9 };
    	int[] array2 = { 3, 6, -1, 100, 77 };
    	int[] array3 = ArrayUtil.concat(array1, array2);
    	ArrayUtil.print(array3);

    }
}
