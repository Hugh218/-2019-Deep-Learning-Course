package Ex0508;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex05_Program {
	static PreparedStatement pst;
	static Connection conn;
	static ResultSet rs;

	public static void main(String[] args) {
		MemberDAO mdao = new MemberDAO();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("===== 회원 관리 프로그램 =====");
			System.out.println("[1]회원가입 [2]회원정보수정[3]회원삭제 [4]회원정보보기 [5]종료");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.print("id를 입력하세요 :");
				String id = sc.next();
				System.out.print("pw를 입력하세요");
				String pw = sc.next();
				System.out.print("name를 입력하세요");
				String name = sc.next();
				System.out.print("tel를 입력하세요");
				String tel = sc.next();

				int cnt = mdao.insert(id, pw, name, tel);

				if (cnt != 0) {
					System.out.println("INSERT SUCCESS!");
				} else {
					System.out.println("INSERT FAIL...");
				}

			} else if (choice == 2) {
				System.out.println("수정할 id를 입력하세요");
				String updateId = sc.next();
				System.out.println("수정할 name를 입력하세요");
				String updateName = sc.next();

				int cnt = mdao.update(updateName, updateId);
				if (cnt > 0) {
					System.out.println("update success");
				} else {
					System.out.println("update fail");
				}

			} else if (choice == 3) {
				System.out.println("삭제할 id를 입력하세요.");
				String delId = sc.next();
				int cnt = mdao.delete(delId);

				if (cnt > 0) {
					System.out.println("delete success");
				} else {
					System.out.println("delete fail");
				}

			} else if (choice == 4) { //

				ArrayList<MemberDTO> list = mdao.show();

				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.toString());

				}

			}
		}
	}

}
