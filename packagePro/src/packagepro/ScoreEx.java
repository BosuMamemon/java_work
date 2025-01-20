package packagepro;

class Score {
	
//	필드
	private int sno;
	private String name;
	private String dept;
	private int[] scores;
	private double avg;
	private int rank;
//	생성자
	public Score(int sno, String name, String dept, int[] scores) {
		super();
		this.sno = sno;
		this.name = name;
		this.dept = dept;
		this.scores = scores;
	}
//	setter, getter
	public double getAvg() {
		return avg;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
//	메소드
	public void total_avg() {
		int total = 0;
		for(int i = 0; i < scores.length; i++) { total += scores[i]; }
		avg = total / scores.length;
	}
	public void display() {
		System.out.printf("%d, %s, %s, ", sno, name, dept);
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("%d, ", scores[i]);
		}
		System.out.printf("%5.2f, %d%n", avg, rank);
	}
	
}

public class ScoreEx {
	
	public static void main(String[] args) {
//		객체 배열 생성
		Score[] arrScore = new Score[3];
		int[] scores1 = { 75, 80, 85 };
		int[] scores2 = { 64, 67, 43 };
		int[] scores3 = { 97, 67, 44 };
//		객체 생성
		arrScore[0] = new Score(1, "김", "컴퓨터공학", scores1);
		arrScore[1] = new Score(1, "이", "컴퓨터공학", scores2);
		arrScore[2] = new Score(1, "박", "컴퓨터공학", scores3);
//		평균 점수 계산 및 출력
		arrScore[0].total_avg();
		arrScore[1].total_avg();
		arrScore[2].total_avg();
		arrScore[0].display();
		arrScore[1].display();
		arrScore[2].display();
		
		System.out.println();
		
		for(int i = 0; i < arrScore.length; i++) {
			int rank = 1;
			for(int j = 0; j < arrScore.length; j++) {
				if(arrScore[i].getAvg() < arrScore[j].getAvg()) { rank++; }
			}
			arrScore[i].setRank(rank);
		}
		
		for(int i = 0; i < arrScore.length; i++) {
			arrScore[i].display();
		}
	}
	
}

