import java.io.*;
import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		FileWriter fileWriter;
		File temp = new File("c:\\temp\\phone.txt");

		try {
			Scanner scanner = new Scanner(System.in);
			fileWriter = new FileWriter(temp);

			System.out.println("전화번호 입력 프로그램입니다.");

			while (true) {
				System.out.print("이름 전화번호 >> ");
				String line = scanner.nextLine();

				if(line.equals("그만"))
					break;

				fileWriter.write(line+"\r\n");
			}

			System.out.println(temp.getPath()+"에 저장하였습니다.");

			fileWriter.close();
			scanner.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
