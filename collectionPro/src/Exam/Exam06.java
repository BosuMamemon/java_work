package Exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Exam06 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> points = new HashMap<>();
		
		System.out.println("** 포인트 관리 프로그램입니다 **");
		
//		입력 반복문
		while(true) {
			System.out.print("\n이름과 포인트 입력 >> ");
			String input = scanner.nextLine();
			
//			입력 반복문 exit
			if(input.equals("exit")) break;
			
//			해쉬맵에 값 삽입
			StringTokenizer st = new StringTokenizer(input, " ");
			String name = st.nextToken();
			int point = Integer.parseInt(st.nextToken());
			if(points.containsKey(name)) {
				points.replace(name, points.get(name) + point);
			} else {
				points.put(name, point);
			}
			
//			전체 해쉬맵 출력
			Set<Entry<String, Integer>> entries = points.entrySet();
			Iterator<Entry<String, Integer>> entriesIt = entries.iterator();
			while(entriesIt.hasNext()) {
				Entry<String, Integer> curEntry = entriesIt.next();
				System.out.print("(" + curEntry.getKey()
						+ ", " + curEntry.getValue() + ") ");
			}
		}
		
		System.out.println("프로그램을 종료합니다...");
		scanner.close();
		
	}

}
