package kr.or.yi.java_study_02.ch07.exam11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class PhoneNumManagement implements PhoneNumManagementInterface {
	
	private HashMap<String, Phone> pmMap = new HashMap<>();

	public PhoneNumManagement() {
		// TODO Auto-generated constructor stub
	}

	public PhoneNumManagement(HashMap<String, Phone> pmMap) {
		this.pmMap = pmMap;
	}

	public void setPmMap(HashMap<String, Phone> pmMap) {
		this.pmMap = pmMap;
	}

	
	@Override
	public boolean insertNum(Phone phone) {
		if(pmMap.put(phone.getName(),phone) == null) {
			pmMap.put(phone.getName(), phone);
			return true;
		}
		return false;
	}

	@Override
	public void deleteNum(Phone phone) {
		pmMap.remove(phone.getName());
	}

	@Override
	public Phone searchNum(Phone phone) {
		if(pmMap.containsKey(phone.getName())==false) {
			return null;
		}
		return pmMap.get(phone.getName());
	}

	public void prnList(Phone phone) {
		Set<String> keys = pmMap.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Phone value = pmMap.get(key);
			System.out.println(value);
		}
	}
}
