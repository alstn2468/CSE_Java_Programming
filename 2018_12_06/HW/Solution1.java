import java.util.*;

public class Solution1 {

	public static void main(String [] args) {
		String title = "미래장학금";
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Double> scoreMap = new HashMap<String, Double>();

		System.out.println(title + "관리시스템입니다.");

		for (int i = 0; i < 5; i++) {
			System.out.print("이름과 학점>> ");

			String name = scanner.next();
			double score = scanner.nextDouble();

			scoreMap.put(name, score);
		}

		System.out.print("장학생 선발 학점 기준 입력>> ");
		double cutline = scanner.nextDouble();

		scanner.close();

		System.out.print("장학생 명단 : ");
		Set<String> nameSet = scoreMap.keySet();
		Iterator<String> it = nameSet.iterator();

		while (it.hasNext()) {
			String name = it.next();
			double score = scoreMap.get(name);

			if (score > cutline)
				System.out.print(name + " ");
		}
		System.out.println();
	}
}
