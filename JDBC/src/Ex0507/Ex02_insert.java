package Ex0507;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex02_insert {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pst = null;

		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String pw = "hr";

			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, user, pw);

			if (conn != null) {
				System.out.println("SUCCESS!!");
			} else {
				System.out.println("FAIL...");
			}

			String sql = "insert into member values ('1','1','1','1')";

			pst = conn.prepareStatement(sql);

			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				System.out.println("insert success!!");
			} else {
				System.out.println("insert fail...");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pst != null) {

				try {
					pst.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

}
