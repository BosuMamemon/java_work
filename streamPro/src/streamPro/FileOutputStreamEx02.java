package streamPro;

import java.io.FileOutputStream;

public class FileOutputStreamEx02 {

	public static void main(String[] args) {
		
		char[] ch = {'1', '2', 'A', 'B', 'C', 'D', '가', '나', '다', '라'};
		
		try {
			FileOutputStream fOut = new FileOutputStream("C:\\JHM\\Java\\Java_work\\text05.out");
			for(int i = 0; i < ch.length; i++)
				fOut.write((byte)ch[i]);
			fOut.close();
		} catch (Exception e) {
			System.out.println("오류");
			e.printStackTrace();
		}
		
	}
	
}
