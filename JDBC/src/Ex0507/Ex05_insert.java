package Ex0507;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex05_insert {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("=================== 회원가입 프로그램 ===================");

		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("전화번호 : ");
		String tel = sc.next();

		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr"; 
			String password = "hr";
			
			
			Connection conn = DriverManager.getConnection(url, user, password);
			if(conn != null) {
				System.out.println("conn success!!");
			} else {
				System.out.println("conn fail...");
			}
			
			String sql="insert into member values (?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, pw);
			pst.setString(3, name);
			pst.setString(4, tel);
			
			int cnt = pst.executeUpdate();
			if(cnt > 0 ) {
				System.out.println("insert success!!");
			} else {
				System.out.println("insert fail...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
