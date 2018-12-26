import java.io.*;

public class Solution2 {

	public static void main(String[] args) {
		FileReader fin = null;
		// FileReader 클래스 선언

		// 파일 입출력 예외처리
		try {
			fin = new FileReader("C:\\temp\\phone.txt");
			// 생성자에 파일의 경로를 넣어 객체 생성
			int c;
			// 데이터를 하나 저장할 변수 선언

			/* 파일의 끝까지 반복 */
			while ((c = fin.read()) != -1) {
				System.out.print((char)c);
				// 가져온 데이터를 문자로 바꿔서 출력
			}

			fin.close();
			// 열어준 FileReader 클래스를 닫아준다.
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
			// 입출력 예외 출력
		}
	}
}
