package kr.or.yi.java_study_02.ch07.exam03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

import kr.or.yi.java_study_02.ch07.exam02.Student;

public class ExamMain {
 
	public static void main(String[] args) {
		StdMgnForHashMap sm = new StdMgnForHashMap();
		
		for(Student std : initStdList()) {
			sm.insertStudent(std);
		}
		
		Scanner sc = new Scanner(System.in);
		int res;
		do {
			System.out.println("1. 학생목록, 2. 학생추가, 3. 학생 수정, 4. 학생 삭제, 5. 학생검색, 6. 종료");
			res = sc.nextInt();
			switch(res) {
			case 1:
				prnStudents(sm.listStudent());
				break;
			case 2:
				System.out.printf("%s%n", "학생추가");
				Student insertStd = getStudent();
				sm.insertStudent(insertStd);
				break;
			case 3:
				System.out.printf("%s%n", "학생 수정");
				Student updateStd = getFindStudent("수정하고자 하는 학생의 번호를 입력하세요.");
				Student upStd = getUpdateStudent(sm.searchStudent(updateStd));
				if(sm.updateStudent(upStd)) {
					JOptionPane.showMessageDialog(null, "수정하였습니다.");
				};
				break;
			case 4:
				System.out.printf("%s%n", "학생 삭제");
				Student delStd = getFindStudent("삭제하고자 하는 학생의 번호를 입력하세요.");
				if(sm.deleteStudent(sm.searchStudent(delStd))) {
					JOptionPane.showMessageDialog(null, "삭제하였습니다.");
				};
				break;
			case 5:
				System.out.printf("%s%n", "학생 검색");
				Student findStd = sm.searchStudent(getFindStudent("검색하고자 하는 학생의 번호를 입력하세요."));
				if(findStd == null) {
					JOptionPane.showMessageDialog(null, "해당 학생이 존재하지 않습니다.");
				}else {
					JOptionPane.showMessageDialog(null, findStd);
				}
				break;
			}
		}while(res < 6);
		System.out.println("학생관리 프로그램을 종료합니다.");
		sc.close();
	}

	private static Student getUpdateStudent(Student searchStudent) {
		String res = JOptionPane.showInputDialog("수정할 학생정보 : 국어,영어,수학(예:90,90,90)을 입력하세요.");
		String[] resArr = res.split(",");
		
		searchStudent.setKor(Integer.parseInt(resArr[0]));
		searchStudent.setEng(Integer.parseInt(resArr[1]));
		searchStudent.setMath(Integer.parseInt(resArr[2]));
		
		return searchStudent;
	}

	private static Student getFindStudent(String text) {
		String res = JOptionPane.showInputDialog(text);
		int findNum = Integer.parseInt(res);
		return new Student(findNum);
	}

	private static Student getStudent() {
		String res = JOptionPane.showInputDialog("학생정보 : 번호,성명,국어,영어,수학(예:1,홍길동,90,90,90)을 입력하세요.");
		String[] resArr = res.split(",");
		
		int stdNo = Integer.parseInt(resArr[0].trim());
		String stdName = resArr[1].trim();
		int kor = Integer.parseInt(resArr[2].trim());
		int eng = Integer.parseInt(resArr[3].trim());
		int math = Integer.parseInt(resArr[4].trim());
		
		return new Student(stdNo, stdName, kor, math, eng);
	}

	private static void prnStudents(ArrayList<Student> listStudent) {
		for(Student std : listStudent) {
			System.out.println(std);
		}
	}
	
	private static ArrayList<Student> initStdList() {
		ArrayList<Student> arList = new ArrayList<>();
		Random rnd = new Random();
		String[] names = {"권수진", "정아름", "장현서", "황태원", 
				"배진우", "현재승", "이동주", "황하나", "유경진", "이상원", "박인선"};
		for(int i=0; i<names.length; i++) {
			arList.add(new Student(i+1, names[i], 
					rnd.nextInt(60)+41, 
					rnd.nextInt(60)+41, 
					rnd.nextInt(60)+41));
		}
		
		return arList;
	}

}
