package Ex0511;

import java.sql.Connection;
import java.sql.DriverManager;

public class Student_DAO {
	Connection conn;
	final String url = "jdbc:oracel:thin:@127.0.0.1:1521:xe";
	final String user = "hr";
	final String password  = "hr";
	
	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 
			conn = DriverManager.getConnection(url, user, password);
			if(conn !=null) {
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void insert(String name, String num, int javaScore, int webScore, int dbScore) {
		// TODO Auto-generated method stub
		
		
		
	}

}
