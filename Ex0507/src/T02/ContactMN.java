package T02;

import java.util.ArrayList;

public class ContactMN {
	int curIndex = 0;

	ArrayList<ContactVO> AllInfo;

	public ContactMN() {
		AllInfo = new ArrayList<ContactVO>();
	}

	public void addJoin(String id, String pw, String birth) {
		AllInfo.add(new ContactVO(id, pw, birth));

	}

	public boolean search(String id, String pw) {

		// AllInfo의 크기가 증가하지않음 현재 0임.
		// for문 접근 안됨. for문 조건 수정할것 .(2019.05.07.15:02)
		for (int i = 0; i < AllInfo.size(); i++) {

			if (AllInfo.get(i).getId().equals(id) && AllInfo.get(i).getPw().equals(pw)) {
				curIndex = i;
				
				System.out.println("Hello! " + AllInfo.get(i).getId());
				return true;
			}
		}
		return false;
	}

	public void getMyInfo() {
		System.out.println("ID : " + AllInfo.get(curIndex).getId());
		System.out.println("PW : " + AllInfo.get(curIndex).getPw());
		System.out.println("BirthDay : " + AllInfo.get(curIndex).getBirth());
	}

	public void changePW(String str) {

		AllInfo.get(curIndex).setPw(str);
		System.out.println("변경되었습니다.");
	}

}
