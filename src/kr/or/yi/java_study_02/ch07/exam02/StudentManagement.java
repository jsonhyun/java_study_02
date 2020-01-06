package kr.or.yi.java_study_02.ch07.exam02;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement implements StdManagerInterface {
	private ArrayList<Student> stdList;
	
	
	public StudentManagement() {
		this.stdList = new ArrayList<Student>();
	}

	@Override
	public boolean insertStudent(Student student) {
		return stdList.add(student);
	}

	@Override
	public boolean deleteStudent(Student student) {
		int i = student.getStdNo();
		stdList.remove(i-1);
		stdList.add(i-1, null);
//		for(int j=i-1;j<stdList.size();j++) {
//			stdList.get(j).setStdNo(j+1);
//		}
		System.out.println("해당 학생이 삭제되었습니다.");
		return false;
	}

	@Override
	public ArrayList<Student> listStudent() {
		return this.stdList ;
	}

	@Override
	public boolean updateStudent(Student student) {
		System.out.print("국어, 수학, 영어 순서대로 성적을 입력해주세요. >> ");
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int eng = sc.nextInt();
		student.setKor(kor);
		student.setMath(math);
		student.setEng(eng);
		System.out.println(student);
		sc.close();
		return true;
	}

	@Override
	public Student searchStudent(Student student) {
		int i = student.getStdNo();
		if(i>stdList.size()) {
			System.out.println("검색하고자 하는 학생이 없습니다.");
			return null;
		}
		Student std = stdList.get(i-1);	
		System.out.println(std);
		return std;
	}

	public void setStudentList(ArrayList<Student> initStdList) {
		this.stdList = initStdList;
	}
}
