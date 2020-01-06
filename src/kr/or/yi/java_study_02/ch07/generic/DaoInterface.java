package kr.or.yi.java_study_02.ch07.generic;

import java.util.ArrayList;

public interface DaoInterface<T> {
	
	public boolean insertitem(T item);
	
	public boolean deleteitem(T item);
	
	public ArrayList<T> listitem();
	
	public boolean updateitem(T item);
	
	public T searchitem(T item);
	
}
