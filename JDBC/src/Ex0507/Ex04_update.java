package Ex0507;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex04_update {

	public static void main(String[] args) {

		try {

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
			if (conn != null) {
				System.out.println("conn success!!");
			} else {
				System.out.println("conn fail...");
			}

			String sql = "update member set pw = '12345' where id='dnjsgh'";

			PreparedStatement pst = conn.prepareStatement(sql);
			System.out.println(pst);
			
			//select문은 execute를 사용하지 않음. 
			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				System.out.println("sql success!!");
			} else {
				System.out.println("sql fail..");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
