package kr.or.yi.java_study_02.ch07.exam11;

import java.util.ArrayList;

public class Ex11_01 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		ArrayList<Integer> kyo = new ArrayList<Integer>();
		
		ArrayList<Integer> cha = new ArrayList<Integer>();
		
		ArrayList<Integer> hap = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		ArrayList<Integer> list1_cha = new ArrayList<Integer>();
		ArrayList<Integer> list1_kyo = new ArrayList<Integer>();
		
		//차집합
		list1_cha.addAll(list1);
		list1_cha.addAll(list2);
		list1_cha.removeAll(list2);
		cha.addAll(list1_cha);
		
		//교집합
		list1_kyo.addAll(list1);
		list1_kyo.retainAll(list2);
		kyo.addAll(list1_kyo);
		
		//합집합
		hap.addAll(cha);
		hap.addAll(list2);
					
		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);
		System.out.println("kyo=" + kyo);
		System.out.println("cha=" + cha);
		System.out.println("hap=" + hap);

	}
}
