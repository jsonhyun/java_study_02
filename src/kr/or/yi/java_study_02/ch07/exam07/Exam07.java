package kr.or.yi.java_study_02.ch07.exam07;

public class Exam07 {
	public static void main(String[] args) {
		Scholarship ss = new Scholarship("미래장학금");
		
		String[] names = {"적당히", "나탈락", "최고조", "상당히", "고득점"};
		double[] scores = {3.1, 2.4, 4.3, 3.9, 4.0};
		
		for(int i=0; i<names.length; i++) {
			ss.insertStudent(names[i], scores[i]);
		}
		
		ss.select(3.2);
	}
}
