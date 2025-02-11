package streamPro;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteIOEx {
	
	public static void main(String[] args) {
		
		FileInputStream fIn;
		FileOutputStream fOut;
		byte[] buffer = new byte[100];
		
		try {
			fIn = new FileInputStream("C:\\JHM\\Java\\바탕화면.png");
			fOut = new FileOutputStream("C:\\JHM\\Java\\바탕화면2.png");
			int c;
			while((c = fIn.read(buffer)) != -1) {
				fOut.write(buffer, 0, c);
			}
		} catch (Exception e) {
			System.out.println("오류");
			e.printStackTrace();
		}
		
	}

}
