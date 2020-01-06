package kr.or.yi.java_study_02.ch07.exam11;

public class Phone {
	private String name;
	private String address;
	private String phoneNumber;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}
	
	public Phone(String name) {
		this.name = name;
	}

	public Phone(String address, String phoneNumber) {
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public Phone(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return String.format("성명 : %s, 주소 : %s, 전화번호 : %s", name, address, phoneNumber);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Phone other = (Phone) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
