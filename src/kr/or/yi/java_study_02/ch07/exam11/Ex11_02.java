package kr.or.yi.java_study_02.ch07.exam11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Ex11_02 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		HashSet<Integer> set = new HashSet<Integer>(list); // set은 중복 허용 안됨, HashSet 자료 중 랜덤값으로 입력
		TreeSet<Integer> tset = new TreeSet<Integer>(set); // set은 중복 허용 안됨, 오름차순 정렬된 상태로 입력
		Stack<Integer> stack = new Stack<Integer>();
		stack.addAll(tset);
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		

	}

}
