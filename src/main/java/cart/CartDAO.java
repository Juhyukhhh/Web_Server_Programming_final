package cart;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import util.SQL_Connect;

public class CartDAO {
	public List<CartDTO> findWithId(String userId) {
		Connection conn = SQL_Connect.open();
		
		String sql = "SELECT cart.id, cart.product_id, product.name, product.price "
				+ "FROM cart INNER JOIN product ON cart.product_id = product.id WHERE customer_id = ?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<CartDTO> result = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				CartDTO cart = CartDTO.builder()
						.id(rs.getInt("cart.id"))
						.product_id(rs.getInt("cart.product_id"))
						.product_name(rs.getString("product.name"))
						.product_price(rs.getInt("product.price"))
						.build();
				result.add(cart);
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SQL_Connect.close(conn, pstmt, rs);
		}
		return null;
	}
	
	public boolean isCart(String userId, int prodId) {
		Connection conn = SQL_Connect.open();
		
		String sql = "SELECT * FROM cart WHERE customer_id = ? AND product_id = ?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setInt(2, prodId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SQL_Connect.close(conn, pstmt, rs);
		}
		
		return false;
	}
	
	public int addCart(String userId, int prodId) {
		Connection conn = SQL_Connect.open();
		
		String sql = "INSERT INTO cart(customer_id, product_id) VALUES(?, ?)";
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setInt(2, prodId);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SQL_Connect.close(conn, pstmt);
		}
		return -1;
	}
	
	public int rmvCart(String userId, int prodId) {
		Connection conn = SQL_Connect.open();
		
		String sql = "DELETE FROM cart WHERE userId = ? AND productId = ?";
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setInt(2, prodId);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SQL_Connect.close(conn, pstmt);
		}
		return -1;
	}
}
