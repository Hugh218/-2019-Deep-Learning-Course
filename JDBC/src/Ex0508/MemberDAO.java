package Ex0508;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();

	public void getconn() {
		try {

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";

			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("연결 성공!!");
			} else {
				System.out.println("연결 실패.. ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int insert(String id, String pw, String name, String tel) {
		try {
			getconn();
			String sql = "insert into member values (?,?,?,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, pw);
			pst.setString(3, name);
			pst.setString(4, tel);

			int cnt = pst.executeUpdate();
			return cnt;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		finally {
			close();
		}
		return 0;
	}

	public void close() {
		try {
			if(pst!=null) {
				pst.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(conn!=null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int update(String updateName, String updateId) {

		try {
			getconn();
			String sql = "update member set name =? where id=?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, updateName);
			pst.setString(2, updateId);
			int cnt = pst.executeUpdate();
			return cnt;
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return 0;
	}

	public int delete(String delId) {

		try {
			getconn();
			String sql = "delete from member where id = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, delId);
			int cnt = pst.executeUpdate();
			return cnt;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			close();
		}
		return 0;
	}

	public ArrayList<MemberDTO> show() {

		try {
			getconn();
			String sql = "select * from member";

			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				String selectId = rs.getString(1);
				String selectPw = rs.getString(2);
				String selectName = rs.getString(3);
				String selectTel = rs.getString(4);

				MemberDTO dto = new MemberDTO(selectId, selectPw, selectName, selectTel);
				list.add(dto);

			}
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		finally {
			close();
		}
		return null;
	}
	
	public ArrayList<String> selectID() {
		getconn();
		ArrayList<String>list = new ArrayList<String>();
		String sql = "select id from member";
		
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) { 
				String id = rs.getString(1);
				list.add(id);
				
			}
			return list;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
