import java.io.*;

public class Solution3 {

	public static void main(String[] args) {
        FileInputStream fin = null;
		// FileInputStream 클래스 선언
        FileOutputStream fout = null;
		// FileOutputStream 클래스 선언

		/* 파일 입출력 예외처리 블록 */
        try {
            fin = new FileInputStream("\\a.jpg");
			// FileInputStream 객체 생성
            fout = new FileOutputStream("\\b.jpg");
			// FileOutputStream 객체 생성
            int c;
			// 데이터 하나를 저장할 변수 선언
            int total = fin.available();
			// FileInputStream의 총 크기 저장할 변수 선언 및 초기화
            int count = 0;
			// 현재 진행 상태 저장할 변수 선언 및 초기화

			/* 파일의 끝까지 반복하며 하나씩 읽어온다. */
            while ((c = fin.read()) != -1) {
				/* 10퍼센트 진행된 경우(10으로 나누어 지는 경우) */
                if (count == total / 10) {
                    System.out.print("*");
					// 별 출력
                    count = 0;
					// count 0으로 초기화
                }
                fout.write(c);
				// 가져온 데이터 FileOutputStream으로 출력
                count++;
				// 진행 상태 증가
            }

            fin.close();
			// 열어준 FileInputStream을 닫아준다.
            fout.close();
			// 열어준 FileOutputStream을 닫아준다.
        }
        catch (IOException e) {
            System.out.println("파일 입출력 오류");
			// 파일 입출력 예외 메세지 출력
        }
	}
}
