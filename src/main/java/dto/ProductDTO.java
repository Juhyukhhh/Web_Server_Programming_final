package dto;

public class ProductDTO {
	private int product_num;
	private String product_name;
	private int product_price;
	private String product_img;
	private String content;
	
	public ProductDTO(int product_num, String product_name, int product_price, String product_img, String content) {
		this.product_num = product_num;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_img = product_img;
		this.content = content;
	}
	
	public int getProduct_num() {
		return product_num;
	}
	public void setProduct_num(int product_num) {
		this.product_num = product_num;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public String getProduct_img() {
		return product_img;
	}
	public void setProduct_img(String product_img) {
		this.product_img = product_img;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
