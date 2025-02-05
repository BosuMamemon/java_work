package Exam;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Exam04 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Vector<Double> heights = new Vector<>();
		
		System.out.println("2000~2009년까지 1년 단위로 키(cm)를 입력");
		String input = scanner.nextLine();
		
		StringTokenizer st = new StringTokenizer(input, " ");
		while(st.hasMoreTokens()) {
			heights.add(Double.parseDouble(st.nextToken()));
		}
		
		double maxGap = 0.0;
		int maxYear = 0;
		for(int i = 0; i < heights.size() - 1; i++) {
			double gap = heights.get(i + 1) - heights.get(i);
			int year = 2000 + i;
			if(maxGap < gap) {
				maxGap = gap;
				maxYear = year;
			}
		}
		
		System.out.println("가장 키가 많이 자란 년도는 " + maxYear + " " + maxGap+ "cm");
		
		scanner.close();
		
	}

}
