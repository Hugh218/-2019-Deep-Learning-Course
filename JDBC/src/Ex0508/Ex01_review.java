package Ex0508;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex01_review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pst = null;
		// 동적 로딩
		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";

			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 연결
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("conn sucess!");
			} else
				System.out.println("conn fail..");
			String sql = "insert into member values(?,?,?,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, "qkr");
			pst.setString(2, "1234");
			pst.setString(3, "hi");
			pst.setString(4, "0000");

			int cnt = pst.executeUpdate();
			if (cnt > 0) {
				System.out.println("sql success!!");
			} else {
				System.out.println("sql fail..");
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
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

}
