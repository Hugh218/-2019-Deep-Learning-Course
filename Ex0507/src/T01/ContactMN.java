package T01;

import java.util.ArrayList;

public class ContactMN {

	ArrayList<ContactVO> allNumber;

	// 생성자 안에서 초기화하는게 좋음.
	// (기존형태)ArrayList<ContactVO> allNumber = new ArrayList<ContactVo>();
	// (권고 형태) 별도로 생성문 만듬.
	ContactMN() {
		allNumber = new ArrayList<ContactVO>();
	}

	public void addNumber(String name, int age, String number) {
		allNumber.add(new ContactVO(name, age, number));
	}

	public ArrayList<ContactVO> getAllNumber() {
		return allNumber;
	}

	public ContactVO search(String name) {
		for (int i = 0; i < allNumber.size(); i++) {
			if(allNumber.get(i).getName().equals(name)) {
				return allNumber.get(i);
			}
		}
		return null;
	}

}
