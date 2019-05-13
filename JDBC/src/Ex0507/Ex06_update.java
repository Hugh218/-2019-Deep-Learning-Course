package Ex0507;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex06_update {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 회원 수정 프로그램 =====");
		System.out.print("수정할 id를 입력하세요 : ");
		String updateId = sc.next();
		System.out.println("수정할 데이터를 입력하세요 : ");
		System.out.println("[1]pw [2]name [3]tel");
		int updateDate = sc.nextInt();
		System.out.print("수정할 내용을 입력하세요 : ");
		String input = sc.next();
		String sql = null;
		if (updateDate == 1) {
			sql = "update member set pw=? where id = ?";
		} else if (updateDate == 2) {
			sql = "update member set name=? where id = ?";
		} else if (updateDate == 3) {
			sql = "update member set tel=? where id = ?";
		}

		// 각 해당 번호에 맞게 수정하는 문장을 작성하고
		// jdbc를 연동하여 수정해주세요.

		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("conn success!!");
			} else {
				System.out.println("conn fail..");
			}

			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, input);
			pst.setString(2, updateId);

			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				System.out.println("sql success!!");
			} else {
				System.out.println("sql fail...");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
