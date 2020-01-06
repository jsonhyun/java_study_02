package kr.or.yi.java_study_02.ch07.exam11;

public interface PhoneNumManagementInterface {
	
	public boolean insertNum(Phone phone);
	
	public void deleteNum(Phone phone);
	
	public Phone searchNum(Phone phone);
	
	public void prnList(Phone phone);
}
