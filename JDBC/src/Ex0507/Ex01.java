package Ex0507;

import java.sql.Connection;
import java.sql.DriverManager;

public class Ex01 {

	public static void main(String[] args) {

		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String pw = "hr";

			// DB 동적 로딩 --> 회사 찾기
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 연결

			Connection conn = 
					DriverManager.getConnection(url, user, pw);
			
			if(conn != null) {
				System.out.println("connected success!");
			} else {
				System.out.println("connected failed!");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
