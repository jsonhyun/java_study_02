package kr.or.yi.java_study_02.ch07.exam07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exam07Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Double> scoreMap = new HashMap<String, Double>();
		
		System.out.println("미래장학금관리시스템입니다.");
		for(int i=0; i<5; i++) {
			System.out.print("이름과 학점 >> ");
			scoreMap.put(sc.next(), sc.nextDouble());
		}
		
		Set<String> keys = scoreMap.keySet();
		Iterator<String> it = keys.iterator();
		
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double standard = sc.nextDouble();
		
		while(it.hasNext()) {
			String key = it.next();
			Double value = scoreMap.get(key);
			if(value > standard) {
				System.out.print(key + " ");
			}	
		}
		sc.close();
	}
}
