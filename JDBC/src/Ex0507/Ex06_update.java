package Ex0507;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex06_update {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ȸ�� ���� ���α׷� =====");
		System.out.print("������ id�� �Է��ϼ��� : ");
		String updateId = sc.next();
		System.out.println("������ �����͸� �Է��ϼ��� : ");
		System.out.println("[1]pw [2]name [3]tel");
		int updateDate = sc.nextInt();
		System.out.print("������ ������ �Է��ϼ��� : ");
		String input = sc.next();
		String sql = null;
		if (updateDate == 1) {
			sql = "update member set pw=? where id = ?";
		} else if (updateDate == 2) {
			sql = "update member set name=? where id = ?";
		} else if (updateDate == 3) {
			sql = "update member set tel=? where id = ?";
		}

		// �� �ش� ��ȣ�� �°� �����ϴ� ������ �ۼ��ϰ�
		// jdbc�� �����Ͽ� �������ּ���.

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
