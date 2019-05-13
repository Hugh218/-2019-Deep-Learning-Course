package Ex0509;

import java.util.ArrayList;
import java.util.Scanner;

public class Phone_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone_DAO dao = new Phone_DAO();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("============전화번호부============");
			System.out.println("[1]추가 [2]삭제 [3]검색 [4]선택검색 [5]종료");

			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("NAME을 입력하세요 ");
				String name = sc.next();
				System.out.println("AGE을 입력하세요 ");
				int age = sc.nextInt();
				System.out.println("TEL을 입력하세요 ");
				String tel = sc.next();

				int cnt = dao.insert(name, age, tel);
				if (cnt > 0) {
					System.out.println("insert success!! ");
				} else {
					System.out.println("insert fail...");
				}

			} else if (choice == 2) {
				System.out.println("삭제할 Name을 입력하세요");
				String delName = sc.next();

				int cnt = dao.delete(delName);
				if (cnt > 0) {
					System.out.println("delete success!! ");
				} else {
					System.out.println("delete fail...");
				}

			} else if (choice == 3) {

				ArrayList<Phone_DTO> list = dao.allShow();

				System.out.println(list.toString());
			} else if (choice == 4) {
				System.out.println("누구의 정보가 궁금하세요?");
				String searchName = sc.next();

				ArrayList<Phone_DTO> list = dao.select(searchName);
				System.out.println(list.toString());

			} else if (choice == 5) {
				System.out.println("시스템종료");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}

		}
	}

}
