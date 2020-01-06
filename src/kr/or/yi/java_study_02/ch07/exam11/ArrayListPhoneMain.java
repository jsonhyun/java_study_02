package kr.or.yi.java_study_02.ch07.exam11;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPhoneMain {

	public static void main(String[] args) {
		ArrListPhoneNumManagement apnm = new ArrListPhoneNumManagement();
		apnm.insertNumber(initNum());
		
		Scanner sc = new Scanner(System.in);
		int res;
		do {
			System.out.print("1. 전화번호 정보입력, 2. 전화번호 정보삭제, 3. 전화번호 정보검색, 4. 전화번호 전체목록, 5. 종료 >> ");
			res = sc.nextInt();
			switch(res) {
				case 1:
					if(apnm.insertNum(insertNum(sc))) {
						System.out.println("정보가 입력되었습니다.");
						break;
					}
					System.out.println("중복입력하셨습니다.");					
					break;
				case 2:
					Phone person1 = apnm.searchNum(findNum(sc));
					if(person1 == null) {
						System.out.println("삭제하고자 하는 사람이 없습니다.");
						break;
					}
					apnm.deleteNum(person1);
					System.out.println("정보가 삭제되었습니다.");
					break;
				case 3:
					Phone person2 = apnm.searchNum(findNum(sc));
					if(person2 == null) {
						System.out.println("검색하고자 하는 사람이 없습니다.");
						break;
					}
					System.out.println(person2);
					break;
				case 4:
					apnm.prnList(new Phone());
					break;
			}
		}while(res < 5);
		System.out.println("프로그램을 종료합니다.");
		
		sc.close();

	}

	private static ArrayList<Phone> initNum() {
		String [] name = {"정아름","권수진","장현서","황태원","현재승","박인선","이상원","유경진","황하나","이동주"};
		String [] address = {"성서","칠곡","두류","칠곡","남구","동구","성서","서구","대구","중구"};
		String [] num = {"010-4252-3245","010-3399-8254","010-4334-4321","010-4245-3825",
						 "010-4785-6253","010-4175-3675","010-4580-0788","010-6411-0190",
						 "010-2651-9818","010-5766-4465"};
		ArrayList<Phone> phone = new ArrayList<Phone>();
		for(int i=0; i<name.length;i++) {
			Phone arList = new Phone(name[i], address[i], num[i]);
			phone.add(arList);
		}
		return phone;
	}

	private static Phone findNum(Scanner sc) {
		System.out.print("검색하고자 하는 사람의 이름을 입력하세요. >> ");
		String name = sc.next();
		return new Phone(name);
	}

	private static Phone insertNum(Scanner sc) {
		System.out.print("정보를 입력해주세요. 예)이름 주소 전화번호 >> ");
		String name = sc.next();
		String address = sc.next();
		String num = sc.next();
		return new Phone(name, address, num);
	}
}
