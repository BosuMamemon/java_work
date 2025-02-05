package Exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Exam05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<>();
		
		System.out.println("나라 이름과 인구를 5개 입력하세요. (예. Korea 5000)");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("나라 이름, 인구 >> ");
			String input = scanner.nextLine();	
			StringTokenizer st = new StringTokenizer(input, " ");
			nations.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		
		Set<Entry<String, Integer>> entries = nations.entrySet();
		Iterator<Entry<String, Integer>> entriesIt = entries.iterator();
		
		String maxKey = "";
		int maxValue = 0;
		while(entriesIt.hasNext()) {
			Entry<String, Integer> curEntry = entriesIt.next();
			if(maxValue < curEntry.getValue()) {
				maxValue = curEntry.getValue();
				maxKey = curEntry.getKey();
			}
		}
		
		System.out.println("제일 인구가 많은 나라는 (" + maxKey + ", " + maxValue + ")");
		
		scanner.close();
	}
	
}
