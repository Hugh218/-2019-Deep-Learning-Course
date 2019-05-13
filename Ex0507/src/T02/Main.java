package T02;

import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContactMN mn = new ContactMN();

		while (true) {
			System.out.println("==========MemberSystem==========");
			System.out.println("[1]JOIN [2]LOGIN");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("ID :");
				String id = sc.next();
				System.out.print("PW :");
				String pw = sc.next();
				System.out.print("BIRTH(2019-05-07) :");
				String birth = sc.next();

				mn.addJoin(id, pw, birth);

				break;
			case 2:
				System.out.print("ID :");
				String search_id = sc.next();
				System.out.print("PW :");
				String search_pw = sc.next();

				boolean b = mn.search(search_id, search_pw);

				while (b) {
					System.out.println("[1]Information [2]ModifyPW [3]Logout");
					int choice2 = sc.nextInt();
					switch (choice2) {
					case 1:
						mn.getMyInfo();
						break;
					case 2:
						System.out.print("변경할 비밀번호를 입력하세요 : ");
						String str = sc.next();
						mn.changePW(str);
						break;

					case 3:

						break;
					}
					if (choice2 == 3) {
						break;
					}
				}
				if (b == false) {
					System.out.println("Not Found! Please Join!");
					break;
				}
			}
		}

	}

}
