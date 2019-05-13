package T01;

import java.util.ArrayList;

public class ContactMN {

	ArrayList<ContactVO> allNumber;

	// ������ �ȿ��� �ʱ�ȭ�ϴ°� ����.
	// (��������)ArrayList<ContactVO> allNumber = new ArrayList<ContactVo>();
	// (�ǰ� ����) ������ ������ ����.
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
