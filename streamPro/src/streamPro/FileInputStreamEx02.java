package streamPro;

import java.io.FileInputStream;

public class FileInputStreamEx02 {
	
	public static void main(String[] args) {
		
		FileInputStream fIn;
		
		try {
			fIn = new FileInputStream("C:\\JHM\\Java\\Java_work\\text05.out");
			int c;
			while((c = fIn.read()) != -1) {
				System.out.println((char)c);
			}
		} catch (Exception e) {
			System.out.println("오류");
			e.printStackTrace();
		}		
		
	}

}
