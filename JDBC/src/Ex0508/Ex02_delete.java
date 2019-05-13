package Ex0508;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02_delete {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("===== ȸ�� ���� ���α׷� =====");
		System.out.println("������ ���̵� �Է�");
		String delId = sc.next();
		
		//jdbc�� �̿��Ͽ� �Է¹��� id�� �������ּ���. 
		Connection conn = null;
		PreparedStatement pst = null;
		String sql = null;
		try {
			String url ="jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("conn success!");
			} else {
				System.out.println("conn fail..");
			}
			sql = "delete from member where id = ? ";
			
			pst = conn.prepareStatement(sql);
			pst.setString(1, delId);
			
			int cnt = pst.executeUpdate();
			
			if(cnt > 0 ) {
				System.out.println("sql success!");
			} else {
				System.out.println("sql fail...");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
			 if(conn != null) {
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
