import java.io.*;
import java.util.*;

public class Solution4 {

	public static void main(String[] args) {
		String fileName = "c:\\temp\\phone.txt";
		// 파일의 경로를 저장할 문자열 변수 선언 및 초기화
		HashMap<String, String> phoneMap = new HashMap<String, String>();
		// Key : String, Val : String인 해시맵 생성

		/* 파일 입출력 예외 처리 블록 */
		try {
			Scanner fScanner = new Scanner(new FileReader(new File(fileName)));
			// 데이터를 입력받을 스캐너를 연다.

			/* 데이터의 끝까지 반복 */
			while (fScanner.hasNext()) {
				String name = fScanner.next();
				// 데이터중 이름 값 저장
				String tel = fScanner.next();
				// 데이터중 전화번호 값 저장
				phoneMap.put(name, tel);
				// put매서드 호출로 해시맵에 삽입
			}

			fScanner.close();
			// 열어준 Scanner를 닫아준다.
		}
		catch (IOException e) {
			e.printStackTrace();
			// 예외 메세지 출력
		}

		System.out.println("총 " + phoneMap.size() + "개의 전화번호를 읽었습니다.");

		Scanner scanner = new Scanner(System.in);
		// Scanner 클래스 선언 및 객체 생성

		/* "그만"이 입력될 때 까지 반복 */
		while (true) {
			System.out.print("이름>> ");
			String name = scanner.next();
			// 사용자에게 입력을 받아 저장

			/* 무한 루프 탈출 조건 */
			if (name.equals("그만"))
				break;

			String tel = phoneMap.get(name);
			// get매서드 호출로 해시맵에서 name을 key값으로 데이터 탐색 후 저장

			/* 가져온 값이 null일 경우 */
			if (tel == null) {
				System.out.println("찾는 이름이 없습니다.");
			}
			/* null이 아닌 경우 */
			else {
				System.out.println(tel);
			}
		}
		scanner.close();
		// 열어준 Scanner를 닫아준다.
	}
}
