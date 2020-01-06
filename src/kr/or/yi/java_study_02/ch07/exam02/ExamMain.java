package kr.or.yi.java_study_02.ch07.exam02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExamMain {
 
	public static void main(String[] args) {
		/*
		1. 학생정보를 관리하는 프로그램을 작성하세요.
		2. 학생클래스를 정의(번호, 성명, 국어, 영어, 수학) 
		3. 학생관리클래스정의(StudentManagement) StdManagerInterface를 구현한
		4. 메뉴작성(1. 학생목록, 2. 학생추가, 3. 학생 수정, 4. 학생 삭제, 5. 학생 검색,  6. 종료)
		*/

		StudentManagement sm = new StudentManagement();
		sm.setStudentList(initStdList());
		
		Scanner sc = new Scanner(System.in);
		int res;
		do {
			System.out.println("1. 학생목록, 2. 학생추가, 3. 학생 수정, 4. 학생 삭제, 5. 학생검색, 6. 학번순 정렬, 7. 총점순 정렬, 8. 종료");
			System.out.print("메뉴를 선택하세요 >> ");
			res = sc.nextInt();
			switch(res) {
				case 1:
					System.out.println("1. 학생목록");
					prnStudents(sm.listStudent());
					break;
				case 2:
					System.out.println("2. 학생추가");
					Student insertStd = getStudent();//추가할 학생정보
					sm.insertStudent(insertStd);
					break;
				case 3:
					System.out.println("3. 학생 수정");//성적만 수정할 것.
					Student findStd01 = searchStd();
					Student student = sm.searchStudent(findStd01);
					if(student == null) {
						break;
					}
					Student updateStd = updateScore(student);
					sm.updateStudent(updateStd);
					break;
				case 4:
					System.out.println("4. 학생 삭제");
					Student findStd02 = searchStd();
					Student student01 = sm.searchStudent(findStd02);
					if(student01 == null) {
						break;
					}
					Student deleteStd = deleteStudent(student01);
					sm.deleteStudent(deleteStd);
					break;
				case 5:
					System.out.println("5. 학생 검색(학생번호)");
					Student findStd = searchStd();
					sm.searchStudent(findStd);
					break;
				case 6:
					System.out.println("6. 학번순 정렬");
					compareStdNoSort(sm.listStudent());
					break;
				case 7:
					System.out.println("7. 총점순 정렬");
					totalScoreSort(sm.listStudent());
					break;
			}
		} while(res < 8);
		System.out.println("학생관리 프로그램을 종료합니다.");
		sc.close();
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

	private static void prnStudents(ArrayList<Student> listStudent) {
		for(Student std : listStudent) {
			System.out.println(std);
		}
	}
	
	private static Student getStudent() {
		String res = JOptionPane.showInputDialog("학생정보 : 번호, 성명, 국어, 수학, 영어 ex)1,이상원,90,90,90");
		String[] resArr = res.split(",");
		int stdNo = Integer.parseInt(resArr[0].trim());
		String stdName = resArr[1].trim();
		int kor = Integer.parseInt(resArr[2].trim());
		int math = Integer.parseInt(resArr[3].trim());
		int eng = Integer.parseInt(resArr[4].trim());
		return new Student(stdNo, stdName, kor, math, eng);
	}
	
	private static Student updateScore(Student student) {
		System.out.println("위 학생의 성적을 수정하시겠습니까? 1)예, 2)아니요  >> ");
		return yesOrNo(student);
	}
	
	private static Student deleteStudent(Student student01) {
		System.out.println("위 학생의 성적을 삭제하시겠습니까? 1)예, 2)아니요  >> ");
		return yesOrNo(student01);
	}
	
	private static Student yesOrNo(Student student01) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		if(a == 1) {
			return student01;
		}
		return null;
	}
	
	private static Student searchStd() {
		String res = JOptionPane.showInputDialog("검색하고자 하는 학생의 번호를 입력해주세요.");
		int stdNo = Integer.parseInt(res);
		return new Student(stdNo);
	}
	
	private static void compareStdNoSort(ArrayList<Student> listStudent) {

		Comparator<Student> stdNoComp = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				if(o2 == null) {
					return o1.getStdNo();
				}
				if(o1 == null) {
					return o2.getStdNo();
				}
				return o1.getStdNo()-o2.getStdNo();
			}
		};
		listStudent.sort(stdNoComp);
		for(Student std : listStudent) {
			System.out.println(std);
		}	
	}
	
	private static void totalScoreSort(ArrayList<Student> listStudent) {
		Comparator<Student> totalComp = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o2 == null) {
					return o1.total();
				}
				if(o1 == null) {
					return o2.total();
				}
//				if(o1 == null && o2 == null) {
//					return 
//				}
				return o1.total()-o2.total();
			}
		};
		listStudent.sort(totalComp);
		for(Student std : listStudent) {
			System.out.println(std);
		}	
	}	
}
