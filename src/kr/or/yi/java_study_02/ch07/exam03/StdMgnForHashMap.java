package kr.or.yi.java_study_02.ch07.exam03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import kr.or.yi.java_study_02.ch07.exam02.StdManagerInterface;
import kr.or.yi.java_study_02.ch07.exam02.Student;

public class StdMgnForHashMap implements StdManagerInterface {
	private HashMap<Integer, Student> stdMap;
	
	
	public StdMgnForHashMap() {
		this.stdMap = new HashMap<Integer, Student>();
	}

	@Override
	public boolean insertStudent(Student student) {
		Student res = stdMap.put(student.getStdNo(), student);
		return res==null; //put 중복일 경우 value값 리턴, 추가된 경우 null리턴
		
//		if (!stdMap.containsKey(student.getStdNo())) {
//			stdMap.put(student.getStdNo(), student);
//			return true;
//		}
//		return false;
	}

	@Override
	public boolean deleteStudent(Student student) {
		return stdMap.remove(student.getStdNo()) != null;
	}

	@Override
	public ArrayList<Student> listStudent() {
		ArrayList<Student> stdlist = new ArrayList<Student>();
		Set<Integer> keys = stdMap.keySet();
		for(Integer stdNo : keys) {
			stdlist.add(stdMap.get(stdNo));
		}
		return stdlist;
	}

	@Override
	public boolean updateStudent(Student student) {
		return stdMap.put(student.getStdNo(), student) != null;
	}

	@Override
	public Student searchStudent(Student student) {
		return stdMap.get(student.getStdNo());
	}

}
