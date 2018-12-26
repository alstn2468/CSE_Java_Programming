import java.util.*;

public class Solution1 {

	public static void main(String [] args) {
		String title = "미래장학금";
		Scanner scanner = new Scanner(System.in);
		// Scanner 선언 및 생성자 호출
		HashMap<String, Double> scoreMap = new HashMap<String, Double>();
		// Key : String, Val : Double 형인 해시맵 선언 및 생성

		System.out.println(title + "관리시스템입니다.");

		/* 사용자에게 입력을 5번 받는다. */
		for (int i = 0; i < 5; i++) {
			System.out.print("이름과 학점>> ");

			String name = scanner.next();
			double score = scanner.nextDouble();

			scoreMap.put(name, score);
			// put 매서드 호출로 해시맵에 데이터 삽입
		}

		System.out.print("장학생 선발 학점 기준 입력>> ");
		double cutline = scanner.nextDouble();
		// 장학생 선발 기준을 입력 받는다.

		scanner.close();
		// 열어준 Scanner를 닫아준다.

		System.out.print("장학생 명단 : ");
		Set<String> nameSet = scoreMap.keySet();
		// 해시맵의 키값의 집합을 저장한다.
		Iterator<String> it = nameSet.iterator();
		// 반복에 사용하기 위해 키값 집합 iterator선언 및 생성

		/* iterator의 끝까지 반복 */
		while (it.hasNext()) {
			String name = it.next();
			// iterator의 다음 데이터 저장
			double score = scoreMap.get(name);
			// 해시맵에서 해당 이름의 점수값 탐색해 저장

			/* 장학금 기준에 맞는 경우 */
			if (score > cutline)
				System.out.print(name + " ");
				// 이름 출력
		}
		System.out.println();
	}
}
