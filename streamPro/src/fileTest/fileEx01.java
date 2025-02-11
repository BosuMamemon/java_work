package fileTest;

import java.io.File;

public class fileEx01 {
	
	public static void main(String[] args) {
		
		File f1 = new File("C:\\Users\\HighTech\\eclipse-workspace\\test01.txt");
		File f2 = new File("C:\\Users\\HighTech\\eclipse-workspace", "test02.txt");
		File f0 = new File("C:\\\\Users\\\\HighTech\\\\eclipse-workspace\"");
		File f3 = new File(f0, "test01.txt");
	}

}
