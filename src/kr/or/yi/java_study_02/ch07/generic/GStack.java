package kr.or.yi.java_study_02.ch07.generic;

import java.util.ArrayList;

public class GStack<T> {//제네릭으로 타입<T>을 범용(String, Integer 등)으로 사용할 수 있음
	private int top;
	private ArrayList<T> stack;
	private int size;
	
	public GStack() {
		top = -1;
		size = 5;
		stack = new ArrayList<>(); 
	}
	
	public boolean isFull() {
		return top == size-1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void push(T item) {
		if(!isFull()) {
			stack.add(++top, item);
		}
	}
	
	public T pop() {
		if(!isEmpty()) {
			return stack.get(top--);
		}
		return null;
	}
	
	
	
	
	
}
