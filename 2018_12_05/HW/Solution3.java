import java.io.*;

public class Solution3 {

	public static void main(String[] args) {
        FileInputStream fin = null;
        FileOutputStream fout =null;

        try {
            fin = new FileInputStream("\\a.jpg");
            fout = new FileOutputStream("\\b.jpg");
            int c;
            int total = fin.available();
            int count = 0;

            while((c = fin.read()) != -1) {
                if(count == total / 10) {
                    System.out.print("*");
                    count = 0;
                }
                fout.write(c);
                count++;
            }

            fin.close();
            fout.close();
        }
        catch(IOException e) {
            System.out.println("파일 입출력 오류");
        }
	}
}
