package Ex0509;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Ex0508.MemberDTO;

public class Phone_DAO {

	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	private final String url = "jdbc:oracle:thin:@192.168.0.20:1521:xe";
	private final String user = "hr";
	private final String password = "hr";

	public void conn() {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("connect success!");
			} else {
				System.out.println("connect fail...");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int insert(String name, int age, String tel) {
		try {
			conn();
			String sql = "insert into phone values (?,?,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			pst.setInt(2, age);
			pst.setString(3, tel);
			int cnt = pst.executeUpdate();
			return cnt;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int delete(String delName) {
		try {
			conn();
			String sql = "delete from phone where name = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, delName);
			int cnt = pst.executeUpdate();

			return cnt;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	public ArrayList<Phone_DTO> allShow() {
		try {
			conn();
			String sql = "select * from phone";
			ArrayList<Phone_DTO> list = new ArrayList<Phone_DTO>();

			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				String selectName = rs.getString(1);
				int selectAge = rs.getInt(2);
				String selectTel = rs.getString(3);

				Phone_DTO dto = new Phone_DTO(selectName, selectAge, selectTel);
				list.add(dto);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Phone_DTO> select(String searchName) {
		try {
			conn();
			String sql = "select * from phone where name = ?";
			pst = conn.prepareStatement(sql);
			ArrayList<Phone_DTO> list = new ArrayList<Phone_DTO>();
			pst.setString(1, searchName);
			rs = pst.executeQuery();

			while (rs.next()) {
				String selectName = rs.getString(1);
				int selectAge = rs.getInt(2);
				String selectTel = rs.getString(3);

				Phone_DTO dto = new Phone_DTO(selectName, selectAge, selectTel);
				list.add(dto);

			}
			return list;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return null;
	}

	public void close() {
		if (rs != null) {
			try {
				rs.close();
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
