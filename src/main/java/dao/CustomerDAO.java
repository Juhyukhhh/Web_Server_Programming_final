package dao;

import java.sql.*;
import dto.CustomerDTO;

public class CustomerDAO extends BaseDAO {
	// 회원가입 할 때 사용
	public void insert(CustomerDTO user) throws Exception, SQLException {
		Connection conn = open();
		
		String sql = "INSERT INTO CUSTOMER values(?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		try(conn; pstmt;) {
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getEmail());
			pstmt.executeUpdate();
		}
	}
	
	// 회원가입 시 아이디 체크, 동일한 아이디 있을시 true 리턴
	public boolean idCheck(String id) throws Exception, SQLException {
		Connection conn = open();
		
		boolean check;
		
		String sql = "SELECT * FROM CUSTOMER WHERE ID = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		check = rs.next();
		return check;
	}
	
	// 로그인 할 떄 사용
	public CustomerDTO login(String id, String password) throws Exception, SQLException {
		Connection conn = open();
		
		CustomerDTO user = null;
		
		String sql = "SELECT * FROM CUSTOMER WHERE ID = ? AND PASSWORD =?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		
		try(conn; pstmt; rs;) {
			user = new CustomerDTO();
			user.setId(rs.getString("id"));
			user.setPassword(rs.getString("password"));
			user.setName(rs.getString("name"));
			user.setEmail(rs.getString("email"));
		}
		
		return user;
	}
} 
