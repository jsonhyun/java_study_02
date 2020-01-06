package kr.or.yi.java_study_02.ch07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList(); // <- 나쁜 예, ArrayList<Object> arr = new ArrayList<>();와 동일함
		
		
		List<Integer> arList = new ArrayList<>();
		arList.add(5);
		arList.add(3);
		arList.add(4);
		arList.add(1);
		
		for(int i=0;i<arList.size();i++) {
			System.out.println(arList.get(i));
		}
		
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("이상원");
		strList.add("황태원");
		strList.add("권수진");
		strList.add("이상원");
		
		String[] a = new String[strList.size()];
		System.out.println(Arrays.toString(a));
		strList.toArray(a);
		System.out.println(Arrays.toString(a));
		
		
		/*for(String name:strList) {
			System.out.println(name);
		}
		
		if(strList.contains("황태원")) {
			System.out.println("포함");
		}else {
			System.out.println("미포함");
		}
		
		int findIdx = strList.lastIndexOf("이상원");
		System.out.println(findIdx);
		
		System.out.println(strList.isEmpty());
		
//		strList.clear();
		System.out.println(strList);
		
		System.out.println(strList.isEmpty());
		
		strList.remove("권수진");
		System.out.println(strList);
		
		
		
//		addList(arList);
				
//		for(int i=0; i<arList.size();i++) {
//			int a = arList.get(i);
//			System.out.println(a);
//		}*/
	}

	private static void addList(List<Integer> arList) {
		System.out.println("arList.size() : "+arList.size());
		
		//추가
		arList.add(5);
		System.out.println("arList.size() : "+arList.size());
		for(int i=0;i<10;i++) {
			arList.add(i);
		}
		System.out.println("arList.size() : "+arList.size());
		System.out.println(arList);
		arList.add(1, 10);
		System.out.println(arList);
		
		ArrayList<Integer> subList = new ArrayList<Integer>();
		subList.add(20);
		subList.add(21);
		subList.add(22);
		
		arList.addAll(subList);
		System.out.println(arList);
	}

}
