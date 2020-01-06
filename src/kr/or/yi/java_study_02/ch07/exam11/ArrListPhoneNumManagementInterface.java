package kr.or.yi.java_study_02.ch07.exam11;

import java.util.ArrayList;

public interface ArrListPhoneNumManagementInterface {
	
	public void insertNumber(ArrayList<Phone> initNum);
	
	public boolean insertNum(Phone phone);
	
	public void deleteNum(Phone phone);
	
	public Phone searchNum(Phone phone);
	
	public void prnList(Phone phone);
}
