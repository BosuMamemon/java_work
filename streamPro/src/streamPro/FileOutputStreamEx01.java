package streamPro;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamEx01 {
	
	public static void main(String[] args) {
		
		byte b[] = {7, 51, 3, 4, -1, 24};
		byte b2[] = new byte[10];
		
		try {
//			배열 b를 바이트스트림으로 text04.out으로 저장
			FileOutputStream fOut = new FileOutputStream("C:\\JHM\\Java\\Java_work\\text04.out");
			for(int i = 0; i < b.length; i++)
				fOut.write(b[i]);
			fOut.close();
			System.out.println();
			
			FileInputStream fIn = new FileInputStream("C:\\JHM\\Java\\Java_work\\text04.out");
			int n = 0;
			int c;
			while((c = fIn.read()) != -1) {
				b2[n] = (byte)c;
				n++;
			}
//			FileInputStream이 test04.out에서 읽은 배열을 출력
			for(int i = 0; i < n; i++)
				System.out.print(b2[i] + " ");
			System.out.println();
		} catch (Exception e) {
			System.out.println("오류");
			e.printStackTrace();
		}
		
	}

}
