import java.io.*;
import java.util.*;

public class Solution4 {

	public static void main(String[] args) {
		String fileName = "c:\\temp\\phone.txt";
		HashMap<String, String> phoneMap = new HashMap<String, String>();

		try {
			Scanner fScanner = new Scanner(new FileReader(new File(fileName)));

			while(fScanner.hasNext()) {
				String name = fScanner.next();
				String tel = fScanner.next();
				phoneMap.put(name, tel);
			}

			fScanner.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("총 " + phoneMap.size() + "개의 전화번호를 읽었습니다.");

		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.print("이름>> ");
			String name = scanner.next();

			if(name.equals("그만"))
				break;

			String tel = phoneMap.get(name);

			if(tel == null) {
				System.out.println("찾는 이름이 없습니다.");
			}
			else{
				System.out.println(tel);
			}
		}
		scanner.close();
	}
}
