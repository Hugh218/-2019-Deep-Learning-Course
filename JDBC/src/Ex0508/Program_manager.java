package Ex0508;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class Program_manager {
	private static String sql;
	private static PreparedStatement pst;
	private static Connection conn;

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
				System.out.println("Delete실행 성공!!");
			} else {
				System.out.println("Delete실행 실패..");
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
				System.out.println("update실행 성공!!");
			} else {
				System.out.println("update실행 실패..");
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
				System.out.println("연결 셩공!");
			} else {
				System.out.println("연결 실패.. ");
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
				System.out.println("insert실행 성공!!");
			} else {
				System.out.println("insert실행 실패..");
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
