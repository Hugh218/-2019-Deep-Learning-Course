import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		String[][] member = new String[5][2];
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String id = "";
		String pw = "";
		while (true) {
			System.out.print("[1]로그인 [2]회원가입 [3]종료 >>");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("=====로그인=====");
				System.out.print("ID 입력 : ");
				id = sc.next();
				System.out.print("PW 입력 : ");
				pw = sc.next();

				int loc = 0;
				for (int i = 0; i < cnt; i++) {
					if (member[i][0].equals(id) && member[i][1].equals(pw)) {
						loc++;
					}
				}
				if (loc == 1) {
					System.out.println("로그인 성공!!");
				} else {
					System.out.println("아이디 및 비밀번호를 다시 확인해주세요.");
				}

			} else if (input == 2) {
				System.out.println("=====회원가입=====");
				if (cnt < 5) {
					System.out.print("ID 입력 : ");
					id = sc.next();
					System.out.print("PW 입력 : ");
					pw = sc.next();
					member[cnt][0] = id;
					member[cnt][1] = pw;
					cnt++;
				} else {
					System.out.println("더 이상 등록이 불가능합니다.");
				}

			} else if (input == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("정확한 숫자를 다시 입력해주세요.");
			}
		}

	}

}
