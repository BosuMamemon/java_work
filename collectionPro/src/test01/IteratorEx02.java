package test01;

import java.util.Iterator;
import java.util.Vector;
import collectionPro.Student;

public class IteratorEx02 {
	
	public static void main(String[] args) {
		
		Vector<Student> v = new Vector<>();
		
		v.add(new Student(1, "홍길동", "컴공", 75));
		v.add(new Student(2, "김길동", "컴공", 80));
		v.add(new Student(3, "이길동", "정보통신", 90));
		v.add(new Student(4, "박길동", "정보통신", 65));
		v.add(new Student(5, "최길동", "멀티미디어", 55));
		
		for(int i = 0; i < v.size(); i++)
			System.out.println(v.get(i));
		
		System.out.println();
		
//		점수가 가장 높은 Student를 Iterator로 뽑아내기
		Iterator<Student> it = v.iterator();
		Student maxS = it.next();
		while(it.hasNext()) {
			Student s = it.next();
			if(maxS.getScore() < s.getScore()) {
				maxS = s;
			}
		}
		System.out.println(maxS);
		
	}

}
