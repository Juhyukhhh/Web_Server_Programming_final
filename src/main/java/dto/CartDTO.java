package dto;

public class CartDTO {
	private int cart_num;
	private String id;
	private int product_num;
	private int product_count;
	
	public CartDTO(int cart_num, String id, int product_num, int product_count) {
		this.cart_num = cart_num;
		this.id = id;
		this.product_num = product_num;
		this.product_count = product_count;
	}
	
	public int getcart_num() {
		return cart_num;
	}
	public void setcart_num(int cart_num) {
		this.cart_num = cart_num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getproduct_num() {
		return product_num;
	}
	public void setproduct_num(int product_num) {
		this.product_num = product_num;
	}
	public int getProduct_count() {
		return product_count;
	}
	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}
}
