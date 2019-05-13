package Ex0507;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex03_delete {

	public static void main(String[] args) {

		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection(url, user, password);
			if(conn != null) {
				System.out.println("SUCCESS!!!");
			} else { 
				System.out.println("FAIL....");
			}

			String sql = "delete from member where id ='1'";

			PreparedStatement pst = conn.prepareStatement(sql);
			
			//int cnt = pst.executeUpdate();
			
			if(pst.executeUpdate()> 0 ) {
				System.out.println("DELETE SUCCESS!!");
			} else {
				System.out.println("DELETE FAIL...");
			}
			

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
