package kr.or.yi.java_study_02.ch07.exam07;

import java.util.HashMap;
import java.util.Set;

public class Scholarship {
	private String title;
	
	private HashMap<String, Double> scores;

	public Scholarship(String title) {
		this.title = title;
		scores = new HashMap<String, Double>();
		System.out.println(this.title + "관리시스템입니다.");
	}
	
	public void insertStudent(String name, Double score) {
		scores.put(name, score);
	}
	
	public void select(double cutLine) {
		System.out.println("장학생 명단");
		Set<String> names = scores.keySet();
		
		for(String name : names) {
			if (scores.get(name) > cutLine) {
				System.out.println(name + ":" + scores.get(name));
			}
		}
	}
}
