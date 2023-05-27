package customer;

import java.sql.*;
import util.SQL_Connect;

public class CustomerDAO {
	// 회원가입 할 때 사용
	public int insert(CustomerDTO user) {
		Connection conn = SQL_Connect.open();

		String sql = "INSERT INTO customer(customer_id, password, name, email, phone, address) VALUES(?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5, user.getPhone());
			pstmt.setString(6, user.getAddress());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			SQL_Connect.close(conn, pstmt);
		}
		return -1;
	}

	// 회원가입 시 아이디 체크, 동일한 아이디 있을시 false 리턴
	public boolean idCheck(String id) {
		Connection conn = SQL_Connect.open();

		boolean check;

		String sql = "SELECT * FROM customer WHERE customer_id = ?";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			check = rs.next();
			return !check;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			SQL_Connect.close(conn, pstmt);
		}
		return false;
	}

	// 로그인 할 떄 사용
	public CustomerDTO login(String id, String password) {
		Connection conn = SQL_Connect.open();

		String sql = "SELECT customer_id, name FROM customer WHERE customer_id = ? AND password =?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				CustomerDTO customer = CustomerDTO.builder()
						.id(rs.getString("customer_id"))
						.name(rs.getString("name"))
						.build();
				return customer;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			SQL_Connect.close(conn, pstmt, rs);
		}
		return null;
	}
}
