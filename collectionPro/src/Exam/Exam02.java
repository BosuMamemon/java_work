package Exam;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> grade = new ArrayList<>();
		grade.add("A");
		grade.add("B");
		grade.add("C");
		grade.add("D");
		grade.add("F");
		ArrayList<Double> score = new ArrayList<>();
		score.add(4.0);
		score.add(3.0);
		score.add(2.0);
		score.add(1.0);
		score.add(0.0);
		
		System.out.println("빈 칸으로 분리하여 5개의 학점을 입력(A / B / C / D / F)");
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		
		while(st.hasMoreTokens()) {
			System.out.print(score.get(grade.indexOf(st.nextToken())) + " ");			
		}
		
		sc.close();
		
	}

}
