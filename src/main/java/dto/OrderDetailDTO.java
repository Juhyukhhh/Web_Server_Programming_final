package dto;

public class OrderDetailDTO {
	private int order_detail_num;
	private int order_num;
	private int product_num;
	private int product_count;
	private int product_price;
	
	public OrderDetailDTO(int order_detail_num, int order_num, int product_num, int product_count, int product_price) {
		this.order_detail_num = order_detail_num;
		this.order_num = order_num;
		this.product_num = product_num;
		this.product_count = product_count;
		this.product_price = product_price;
	}
	
	public int getOrder_detail_num() {
		return order_detail_num;
	}
	public void setOrder_detail_num(int order_detail_num) {
		this.order_detail_num = order_detail_num;
	}
	public int getOrder_num() {
		return order_num;
	}
	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}
	public int getProduct_num() {
		return product_num;
	}
	public void setProduct_num(int product_num) {
		this.product_num = product_num;
	}
	public int getProduct_count() {
		return product_count;
	}
	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	
}
