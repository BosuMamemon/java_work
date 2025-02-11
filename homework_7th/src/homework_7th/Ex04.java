package homework_7th;
//	영어 단어의 뜻 맞추기 게임을 만들어 보자.
//	영어 단어와 한글 단어로 구성되는 Word 클래스를 작성하고,
//	프로그램 내에서 미리 여러 개의 Word 객체를 Vector<Word> 컬렉션에 삽입해둔다.
//	그리고 다음 결과와 같이 랜덤하게 사용자에게 문제를 던진다.
//	벡터 내에 정답이 아닌 단어를 랜덤하게 3개 선택하고 정답과 함께 4개의 보기를 출력한다.

import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

class Word {
	
//	필드
	private String eng, kor;
	
//	생성자
	public Word() {}
	public Word(String eng, String kor) {
		super();
		this.eng = eng;
		this.kor = kor;
	}
	
//	getters, setters
	public String getEng() {
		return eng;
	}
	public String getKor() {
		return kor;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public void setKor(String kor) {
		this.kor = kor;
	}
	
}

public class Ex04 {
	
	public static void main(String[] args) {
		
//		객체 등 선언 및 생성
		Scanner scanner = new Scanner(System.in);
		Vector<Word> words = new Vector<>();
		Random random = new Random();
		
//		벡터 값 삽입
		words.add(new Word("dark", "어두운"));
		words.add(new Word("knot", "매듭"));
		words.add(new Word("mordant", "신랄한"));
		words.add(new Word("mentally", "정신적으로"));
		words.add(new Word("dedicated", "전념하는"));
		words.add(new Word("occur", "일어나다"));
		words.add(new Word("curly", "곱슬곱슬한"));
		words.add(new Word("three", "셋"));
		words.add(new Word("clean", "깨끗한"));
		words.add(new Word("value", "가치"));
		words.add(new Word("diverse", "다양한"));
		words.add(new Word("enormous", "거대한"));
		words.add(new Word("interval", "(시간적)간격"));
		words.add(new Word("patent", "특허"));
		words.add(new Word("term", "용어"));
		words.add(new Word("exceed", "넘다"));
		words.add(new Word("practice", "연습"));
		words.add(new Word("deny", "부정하다"));
		words.add(new Word("imagine", "상상하다"));
		words.add(new Word("quit", "떠나다"));
		words.add(new Word("dislike", "싫어함"));
		words.add(new Word("expect", "기대하다"));
		words.add(new Word("decide", "결정하다"));
		words.add(new Word("painting", "그림"));
		words.add(new Word("bear", "곰"));
		words.add(new Word("eye", "눈"));
		words.add(new Word("animal", "동물"));
		words.add(new Word("flag", "깃발"));
		words.add(new Word("friend", "친구"));
		words.add(new Word("computer", "결정하다"));
		
//		영어 단어 테스트 프로그램 시작
		System.out.println("***** 영어 단어 테스트 프로그램 *****");

		while(true) {
			int input  = 0;
			try {
				while(true) {
					System.out.println("\n현재 " + words.size() + "개의 단어가 들어있습니다.");
					System.out.print("1. 단어 테스트 / 2. 단어 삽입 / 3. 종료 >> ");
					input = scanner.nextInt();
					
//			단어 테스트
					if(input == 1) {
						System.out.println("'-1'을 입력하면 테스트를 종료합니다.");
						while(true) {
//					정답 세팅
							int answerIndex = random.nextInt(words.size());
							Word answerWord = words.get(answerIndex);
//					랜덤 선택지 HashSet 만들기(중복값 방지를 위함)
							System.out.println(answerWord.getEng() + "?");
							HashSet<Word> optionSet = new HashSet<>();
							optionSet.add(answerWord);
							while(optionSet.size() < 4) {
								optionSet.add(words.get(random.nextInt(words.size())));
							}
//					선택지 Vector로 바꾸고 무작위 출력하기
							Vector<Word> options = new Vector<>(optionSet);
							Collections.shuffle(options);
							for(int i = 0; i < 4; i++)
								System.out.print("(" + (i + 1) + ") " + options.get(i).getKor() + " ");
							System.out.print(" >> ");
							int userAnswer = scanner.nextInt();
//					정답 대조
							if(userAnswer == -1) {
								System.out.println("영어단어 테스트를 종료합니다.\n");
								break;
							} else if(options.get(userAnswer - 1).getEng().equals(answerWord.getEng()))
								System.out.println("Excellent!!\n");
							else
								System.out.println("No!!\n");
						}
//						단어삽입
					}else if(input == 2) {
						System.out.println("\n영어 단어에 '그만'을 입력하면 입력을 종료합니다.");
						while(true) {
							System.out.print("영단어 한글단어 입력 >> ");
							String putter = scanner.next();
							if(putter.equals("그만")) break;
							String putterKor = scanner.next();
							words.add(new Word(putter, putterKor));
						}
					}else if(input == 3) break;
					else continue;
				}
				
				System.out.println("영어 단어 테스트 프로그램을 종료합니다...");
				scanner.close();
				
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				input = 0;
				continue;
			}
		}
		
	}

}
