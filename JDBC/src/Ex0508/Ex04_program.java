package Ex0508;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04_program {
	static Connection conn = null;
	static PreparedStatement pst = null;
	static String sql = null;

	static String id = null;
	static String pw = null;
	static String name = null;
	static String tel = null;
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("===== ȸ�� ���� ���α׷� =====");
			System.out.println("[1]ȸ������ [2]ȸ���������� [3]ȸ������ [4]ȸ��������ȸ [5]����");
			int choice = sc.nextInt();
			
			if (choice == 1) {
				getconn();
				System.out.println("=====ȸ�������Է�=====");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("��ȭ��ȣ : ");
				String tel = sc.next();

				getpst(id, pw, name, tel);
			} else if (choice == 2) {
				getconn();
				System.out.print("������ id�� �Է��ϼ��� : ");
				String updateId = sc.next();
				System.out.println("������ ������ �Է��ϼ���");
				System.out.println("[1]pw [2]name [3]tel");
				int updateDate = sc.nextInt();
				System.out.println("������ ������ �Է��ϼ���");
				String input = sc.next();
				update(updateDate, input, updateId);

			} else if (choice == 3) {
				getconn();
				System.out.println("������ ID�� �Է��ϼ���");
				String delId = sc.next();
				delete(delId);
			} else if (choice == 4) {
				getconn();
				search();
			} else if (choice == 5) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			} else {
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}

	}

	private static void search() {
		sql = "select * from member";
		try {
			pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);

				System.out.println("id : " + id);
				System.out.println("pw : " + pw);
				System.out.println("name : " + name);
				System.out.println("tel : " + tel);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void delete(String delId) {
		sql = "delete from member where id =?";

		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, delId);
			int cnt = pst.executeUpdate();
			if (cnt > 0) {
				System.out.println("Delete���� ����!!");
			} else {
				System.out.println("Delete���� ����..");
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	private static void update(int updateDate, String input, String updateid) {
		if (updateDate == 1) {
			sql = "update member set pw=? where id = ?";
		} else if (updateDate == 2) {
			sql = "update member set name=? where id = ?";
		} else if (updateDate == 3) {
			sql = "update member set tel=? where id = ?";
		}

		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, input);
			pst.setString(2, updateid);

			int cnt = pst.executeUpdate();
			if (cnt > 0) {
				System.out.println("update���� ����!!");
			} else {
				System.out.println("update���� ����..");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void getconn() {
		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";

			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("���� �Ͱ�!");
			} else {
				System.out.println("���� ����.. ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getpst(String id2, String pw2, String name2, String tel2) {
		try {
			sql = "insert into member values (?,?,?,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, id2);
			pst.setString(2, pw2);
			pst.setString(3, name2);
			pst.setString(4, tel2);

			int cnt = pst.executeUpdate();
			if (cnt > 0) {
				System.out.println("insert���� ����!!");
			} else {
				System.out.println("insert���� ����..");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getfinally() {
		if (pst != null) {
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
