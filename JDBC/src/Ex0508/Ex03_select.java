package Ex0508;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex03_select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}
			String sql = "select * from member";
			PreparedStatement pst = conn.prepareStatement(sql);

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				//String id = rs.getString(1);
				//String pw = rs.getString(2);
				String name = rs.getString(3);
				//String tel = rs.getString(4);

				//System.out.println("id : " + id);
				//System.out.println("pw : " + pw);
				System.out.println("name : " + name);
				//System.out.println("tel : " + tel);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
