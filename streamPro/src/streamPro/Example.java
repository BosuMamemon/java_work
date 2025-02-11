package streamPro;

import java.io.FileReader;
import java.io.FileWriter;

public class Example {
	
	public static void main(String[] args) {
		
		FileReader fr;
		FileWriter fw;
		char[] ch = new char[1000];
		
		try {
			fr = new FileReader("C:\\Windows\\system.ini");
			fw = new FileWriter("C:\\Users\\HighTech\\eclipse-workspace\\system.txt");
			int c;
			while((c = fr.read(ch)) != -1)
				fw.write(ch, 0, c);
			fr.close();
			fw.close();
		} catch (Exception e) {
			System.out.println("오류");
			e.printStackTrace();
		}
		
	}

}
