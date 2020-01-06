package kr.or.yi.java_study_02.ch07.exam11;

import java.util.ArrayList;

public class ArrListPhoneNumManagement implements ArrListPhoneNumManagementInterface {
	
	private ArrayList<Phone> pmArList = new ArrayList<Phone>();
	
	public void insertNumber(ArrayList<Phone> initNum) {
		pmArList.addAll(initNum);
	}
	
	@Override
	public boolean insertNum(Phone phone) {
		if(!pmArList.contains(phone)) {
			pmArList.add(phone);
			return true;
		}
		return false;
	}

	@Override
	public void deleteNum(Phone phone) {
		int indexNum = pmArList.indexOf(phone);
		pmArList.remove(indexNum);
	}

	@Override
	public Phone searchNum(Phone phone) {
		int indexNum = pmArList.indexOf(phone);
		if(indexNum == -1) {
			return null;
		}
		return pmArList.get(indexNum);
	}

	public void prnList(Phone phone) {
		for(int i =0; i<pmArList.size();i++) {
			System.out.println(pmArList.get(i));
		}
	}
}
